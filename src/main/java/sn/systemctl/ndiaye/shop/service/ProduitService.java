package sn.systemctl.ndiaye.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.systemctl.ndiaye.shop.dto.ProduitDTO;
import sn.systemctl.ndiaye.shop.mappers.ProduitMapper;
import sn.systemctl.ndiaye.shop.mappers.ProduitMapperImpl;
import sn.systemctl.ndiaye.shop.model.Produit;
import sn.systemctl.ndiaye.shop.repository.ProduitRepository;

@Service
public class ProduitService {
	private final ProduitRepository produitRepository;
	
	private final static ProduitMapper mapper = new ProduitMapperImpl();

	public ProduitService(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}

	public List<ProduitDTO> getProduits(){
		List<Produit> produits = produitRepository.findAll();
		return mapper.asDTOList(produits);
	}

	public Page<ProduitDTO> get(Pageable pageable) {
		return produitRepository.findAll(pageable).map(mapper::asDTO);
	}

	public Optional<Produit> get(Integer id) {
		return produitRepository.findById(id);
	}

	public Produit post(Produit produit) {
		return produitRepository.save(produit);
	}
}
