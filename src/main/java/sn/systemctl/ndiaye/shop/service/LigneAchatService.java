package sn.systemctl.ndiaye.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.model.LigneAchat;
import sn.systemctl.ndiaye.shop.repository.LigneAchatRepository;

@Service
public class LigneAchatService {
	
private LigneAchatRepository ligneAchatRepository;
	
	public Optional<LigneAchat> getLigneAchat(Integer id){
		return ligneAchatRepository.findById(id);
	}
	
	public List<LigneAchat> postLigneVente(List<LigneAchat> liste) {
		return ligneAchatRepository.saveAll(liste);
	}
}
