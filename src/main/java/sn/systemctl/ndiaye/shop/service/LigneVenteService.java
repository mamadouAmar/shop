package sn.systemctl.ndiaye.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.model.LigneVente;
import sn.systemctl.ndiaye.shop.repository.LigneVenteRepository;

@Service
public class LigneVenteService {
	
	private LigneVenteRepository ligneVenteRepository;
	
	public Optional<LigneVente> getLigneVente(Integer id){
		return ligneVenteRepository.findById(id);
	}
	
	public List<LigneVente> postLigneVente(List<LigneVente> liste) {
		return ligneVenteRepository.saveAll(liste);
	}
}
