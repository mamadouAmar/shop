package sn.systemctl.ndiaye.shop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import sn.systemctl.ndiaye.shop.dto.VenteDTO;
import sn.systemctl.ndiaye.shop.model.Vente;
import sn.systemctl.ndiaye.shop.service.VenteService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path = "/api/shop/vente")
public class VenteController {

	@Autowired
	private VenteService venteService;

	@GetMapping
	public ResponseEntity<Page<VenteDTO>> get(@PageableDefault Pageable page){
		Page<VenteDTO> result = venteService.get(page);
		return ResponseEntity.ok().body(result);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Vente>> get(@PathVariable Long id){
		Optional<Vente> vente = venteService.get(id);
		return ResponseEntity.ok().body(vente);
	}

	@PostMapping()
	public ResponseEntity<Vente> post(@RequestBody Vente v) {
		Vente vente = venteService.post(v);
		return ResponseEntity.ok().body(vente);
	}

}
