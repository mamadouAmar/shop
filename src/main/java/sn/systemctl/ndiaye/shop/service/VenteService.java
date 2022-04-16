package sn.systemctl.ndiaye.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.dto.VenteDTO;
import sn.systemctl.ndiaye.shop.mappers.VenteMapper;
import sn.systemctl.ndiaye.shop.model.Vente;
import sn.systemctl.ndiaye.shop.repository.VenteRepository;

@Service
public class VenteService {

	@Autowired
	private VenteRepository venteRepository;
	
	@Autowired
	private VenteMapper mapper;
	
	
	public Page<VenteDTO> get(Pageable pageable){
		return venteRepository.findAll(pageable).map(mapper::asDTO);
	}

//	public List<Vente> get(){
//		return venteRepository.findAll();
//	}

	public Optional<Vente> get(Long id){
		return venteRepository.findById(id);
	}

	public Vente post(Vente vente) {
		return venteRepository.save(vente);
	}
}
