package sn.systemctl.ndiaye.shop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.dto.AchatDTO;
import sn.systemctl.ndiaye.shop.mappers.AchatMapper;
import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.model.LigneAchat;
import sn.systemctl.ndiaye.shop.repository.AchatRepository;
import sn.systemctl.ndiaye.shop.repository.LigneAchatRepository;

@Service
public class AchatService {

	private final AchatRepository achatRepository;
	private final LigneAchatRepository ligneAchatRepository;
	private final AchatMapper mapper;
	
	

	public AchatService(AchatRepository achatRepository, LigneAchatRepository ligneAchatRepository, @Qualifier("achatMapper") AchatMapper mapper) {
		this.achatRepository = achatRepository;
		this.ligneAchatRepository = ligneAchatRepository;
		this.mapper = mapper;
	}

	public Page<AchatDTO> get(Pageable pageable){
		return achatRepository.findAll(pageable).map(mapper::asDTO);
	}

	public Optional<Achat> get(Long id){
		return achatRepository.findById(id);
	}

	public Achat post(Achat achat) {
		Achat savedAchat = achatRepository.save(achat);
		for (LigneAchat ligneAchat: achat.getAchats()) {
			ligneAchat.setAchat(savedAchat);
			ligneAchatRepository.save(ligneAchat);
		}
		return savedAchat;
	}
}
