package sn.systemctl.ndiaye.shop.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.systemctl.ndiaye.shop.dto.ProduitDTO;
import sn.systemctl.ndiaye.shop.model.Produit;
import sn.systemctl.ndiaye.shop.model.Vente;
import sn.systemctl.ndiaye.shop.service.ProduitService;

@RestController
@RequestMapping("/api/shop/produit")
public class ProduitController {

	@Autowired
	private ProduitService produitService;

	@GetMapping
	public ResponseEntity<Page<ProduitDTO>> get(@PageableDefault Pageable page){
		Page<ProduitDTO> result = produitService.get(page);
		return ResponseEntity.ok().body(result);
	}

	@GetMapping("/{id}")
	public Optional<Produit> get(@PathVariable Integer id){
		return produitService.get(id);
	}

	@PostMapping
	public Produit post(@RequestBody Produit p) {
		return produitService.post(p);
	}

}
