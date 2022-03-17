package sn.systemctl.ndiaye.shop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.model.Produit;
import sn.systemctl.ndiaye.shop.service.ProduitService;

@RestController
@RequestMapping("/api/shop/produit")
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@GetMapping
	public List<Produit> get(){
		return produitService.get();
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
