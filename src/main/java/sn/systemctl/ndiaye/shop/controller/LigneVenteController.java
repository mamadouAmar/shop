package sn.systemctl.ndiaye.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.systemctl.ndiaye.shop.service.LigneVenteService;

@RestController
@RequestMapping("/api/shop/ligne-vente")
public class LigneVenteController {

	@Autowired
	private LigneVenteService ligneVenteService;
	
	
	
}
