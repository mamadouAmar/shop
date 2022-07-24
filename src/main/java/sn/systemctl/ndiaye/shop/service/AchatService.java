package sn.systemctl.ndiaye.shop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import sn.systemctl.ndiaye.shop.dto.AchatDTO;
import sn.systemctl.ndiaye.shop.mappers.AchatMapper;
import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.model.LigneAchat;
import sn.systemctl.ndiaye.shop.model.Produit;
import sn.systemctl.ndiaye.shop.repository.AchatRepository;
import sn.systemctl.ndiaye.shop.repository.LigneAchatRepository;
import sn.systemctl.ndiaye.shop.repository.ProduitRepository;

@Service
public class AchatService {

	private final AchatRepository achatRepository;
	private final LigneAchatRepository ligneAchatRepository;
	private final ProduitRepository produitRepository;
	private final AchatMapper mapper;
	
	
	@Autowired
	public AchatService(AchatRepository achatRepository, LigneAchatRepository ligneAchatRepository, ProduitRepository produitRepository, AchatMapper mapper) {
		this.achatRepository = achatRepository;
		this.ligneAchatRepository = ligneAchatRepository;
		this.produitRepository = produitRepository;
		this.mapper = mapper;
	}

	public Page<AchatDTO> get(Pageable pageable){
		return achatRepository.findAll(pageable).map(mapper::asDTO);
	}

	public Optional<Achat> get(Long id){
		return achatRepository.findById(id);
	}

	@Transactional
	public Achat post(Achat achat) {
		achat.setTotalAchats();
		achat.setCoutTotal();
		Achat savedAchat = achatRepository.save(achat);
		for (LigneAchat ligneAchat: achat.getAchats()) {
			Produit p = ligneAchat.getProduit();
			p.setStock((short) (p.getStock()+ligneAchat.getQuantite()));
			p.setPrixVente((short) ligneAchat.getPrixVente());
			p = produitRepository.save(p);
			ligneAchat.setCoutUnitaire(p.getCoutUnitaire());
			ligneAchat.setCoutTotal();
			LigneAchat la = ligneAchatRepository.save(ligneAchat);
			la.setProduit(p);
			la.setAchat(savedAchat);
		}
		return savedAchat;
	}
}
