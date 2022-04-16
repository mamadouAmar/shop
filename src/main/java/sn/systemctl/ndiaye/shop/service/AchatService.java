package sn.systemctl.ndiaye.shop.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.dto.AchatDTO;
import sn.systemctl.ndiaye.shop.mappers.AchatMapper;
import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.repository.AchatRepository;

@Service
public class AchatService {

	private final AchatRepository achatRepository;
	
	private final AchatMapper mapper;
	
	

	public AchatService(AchatRepository achatRepository, AchatMapper mapper) {
		this.achatRepository = achatRepository;
		this.mapper = mapper;
	}

	public Page<AchatDTO> get(Pageable pageable){
		return achatRepository.findAll(pageable).map(mapper::asDTO);
	}

	public Optional<Achat> get(Long id){
		return achatRepository.findById(id);
	}

	public Achat post(Achat achat) {
		return achatRepository.save(achat);
	}
}
