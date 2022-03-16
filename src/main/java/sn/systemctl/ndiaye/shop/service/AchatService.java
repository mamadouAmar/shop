package sn.systemctl.ndiaye.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.repository.AchatRepository;

@Service
public class AchatService {
	
	@Autowired
	private AchatRepository achatRepository;
	
	public List<Achat> getAllAchats(){
		return achatRepository.getAllAchats();
	}
	
	public Optional<Achat> getAchat(Long id){
		return achatRepository.findById(id);
	}
	
	public Achat postAchat(Achat achat) {
		return achatRepository.save(achat);
	}
}
