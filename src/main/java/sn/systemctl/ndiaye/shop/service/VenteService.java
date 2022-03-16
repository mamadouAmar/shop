package sn.systemctl.ndiaye.shop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.model.Vente;
import sn.systemctl.ndiaye.shop.repository.VenteRepository;

@Service
public class VenteService {
	
	@Autowired
	private VenteRepository venteRepository;
	
	public Optional<Vente> getAchat(Long id){
		return venteRepository.findById(id);
	}
	
	public Vente postAchat(Vente vente) {
		return venteRepository.save(vente);
	}
}