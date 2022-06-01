package sn.systemctl.ndiaye.shop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.systemctl.ndiaye.shop.dto.ProduitDTO;
import sn.systemctl.ndiaye.shop.mappers.ProduitMapper;
import sn.systemctl.ndiaye.shop.model.Produit;
import sn.systemctl.ndiaye.shop.repository.ProduitRepository;

@Service
public class ProduitService {
	@Autowired
	private final ProduitRepository produitRepository;
	
	private final ProduitMapper mapper;

	public ProduitService(ProduitRepository produitRepository, ProduitMapper mapper) {
		this.produitRepository = produitRepository;
		this.mapper = mapper;
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
