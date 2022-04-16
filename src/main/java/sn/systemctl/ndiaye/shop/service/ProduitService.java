package sn.systemctl.ndiaye.shop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.systemctl.ndiaye.shop.model.Produit;
import sn.systemctl.ndiaye.shop.repository.ProduitRepository;

@Service
@Data
public class ProduitService {

	@Autowired
	private ProduitRepository produitRepository;

	public Page<Produit> get(Pageable pageable) {
		return produitRepository.findAll(pageable);
	}

	public Optional<Produit> get(Integer id) {
		return produitRepository.findById(id);
	}

	public Produit post(Produit produit) {
		return produitRepository.save(produit);
	}
}
