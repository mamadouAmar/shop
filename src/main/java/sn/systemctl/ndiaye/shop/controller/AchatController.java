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

import sn.systemctl.ndiaye.shop.dto.AchatDTO;
import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.service.AchatService;

@RestController
@RequestMapping("/api/shop/achat")
public class AchatController {

	@Autowired
	private AchatService achatService;

	@GetMapping
	public ResponseEntity<Page<AchatDTO>> get(@PageableDefault Pageable page){
		Page<AchatDTO> result = achatService.get(page);
		return ResponseEntity.ok().body(result);
	}

	@GetMapping("/{id}")
	public Optional<Achat> get(@PathVariable Long id){
		return achatService.get(id);
	}

	@PostMapping
	public Achat post(@RequestBody Achat a) {
		return achatService.post(a);
	}

}
