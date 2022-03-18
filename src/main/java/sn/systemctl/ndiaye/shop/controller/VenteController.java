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

import sn.systemctl.ndiaye.shop.model.Vente;
import sn.systemctl.ndiaye.shop.service.VenteService;

@RestController
@RequestMapping("/api/shop/vente")
public class VenteController {

	@Autowired
	private VenteService venteService;

	@GetMapping
	public List<Vente> get(){
		return venteService.get();
	}

	@GetMapping("/{id}")
	public Optional<Vente> get(@PathVariable Long id){
		return venteService.get(id);
	}

	@PostMapping
	public Vente post(@RequestBody Vente v) {
		return venteService.post(v);
	}

}
