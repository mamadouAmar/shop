package sn.systemctl.ndiaye.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.systemctl.ndiaye.shop.service.VenteService;

@RestController
@RequestMapping
public class VenteController {
	
	@Autowired
	private VenteService venteService;
	
}
