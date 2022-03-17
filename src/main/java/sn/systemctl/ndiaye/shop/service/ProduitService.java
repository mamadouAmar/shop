package sn.systemctl.ndiaye.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.model.Produit;
import sn.systemctl.ndiaye.shop.repository.ProduitRepository;

@Service
public class ProduitService {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	public List<Produit> get() {
		return produitRepository.getAllProduit();
	}
	
	public Optional<Produit> get(Integer id) {
		return produitRepository.findById(id);
	}
	
	public Produit post(Produit produit) {
		return produitRepository.save(produit);
	}
}
