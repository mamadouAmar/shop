package sn.systemctl.ndiaye.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.systemctl.ndiaye.shop.service.AchatService;

@RestController
@RequestMapping
public class AchatController {

	@Autowired
	private AchatService achatService;
}
