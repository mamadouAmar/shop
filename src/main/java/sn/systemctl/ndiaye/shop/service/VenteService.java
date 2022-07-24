package sn.systemctl.ndiaye.shop.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import sn.systemctl.ndiaye.shop.dto.VenteDTO;
import sn.systemctl.ndiaye.shop.mappers.VenteMapper;
import sn.systemctl.ndiaye.shop.model.LigneVente;
import sn.systemctl.ndiaye.shop.model.Produit;
import sn.systemctl.ndiaye.shop.model.Vente;
import sn.systemctl.ndiaye.shop.repository.LigneVenteRepository;
import sn.systemctl.ndiaye.shop.repository.ProduitRepository;
import sn.systemctl.ndiaye.shop.repository.VenteRepository;

@Service
public class VenteService {

	private final VenteRepository venteRepository;
	private final LigneVenteRepository ligneVenteRepository;
	private final ProduitRepository produitRepository;
	private final VenteMapper mapper;
	
	public VenteService(VenteRepository venteRepository, LigneVenteRepository ligneVenteRepository, ProduitRepository produitRepository, VenteMapper mapper) {
		this.venteRepository = venteRepository;
		this.ligneVenteRepository = ligneVenteRepository;
		this.produitRepository = produitRepository;
		this.mapper = mapper;
	}

	public Page<VenteDTO> get(Pageable pageable){
		return venteRepository.findAll(pageable).map(mapper::asDTO);
	}

	public Optional<Vente> get(Long id){
		return venteRepository.findById(id);
	}

	@Transactional
	public Vente post(Vente vente) {
		vente.setTotalVente();
		Vente savedVente = venteRepository.save(vente);
		for (LigneVente ligneVente : vente.getVentes())
		{
			Integer id = ligneVente.getProduit().getIdProduit();
			Produit p = produitRepository.getById(id);
//			Produit p = ligneVente.getProduit();
			p.setStock((short) (p.getStock()-ligneVente.getQuantite()));
			p = produitRepository.save(p);
			ligneVente.setTotal();
			ligneVente.setPrixVente(p.getPrixVente());
			LigneVente lv = ligneVenteRepository.save(ligneVente);
			lv.setVente(savedVente);
			lv.setProduit(p);
		}
		return savedVente;
	}
}
