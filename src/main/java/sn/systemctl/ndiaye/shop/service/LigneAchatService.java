package sn.systemctl.ndiaye.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.model.LigneAchat;
import sn.systemctl.ndiaye.shop.repository.LigneAchatRepository;

@Service
public class LigneAchatService {
@Autowired
private LigneAchatRepository ligneAchatRepository;

	public Optional<LigneAchat> get(Integer id){
		return ligneAchatRepository.findById(id);
	}

	public List<LigneAchat> post(List<LigneAchat> liste) {
		return ligneAchatRepository.saveAll(liste);
	}

	public List<LigneAchat> get(Achat a){
		return ligneAchatRepository.findByAchat(a);
	}
}
