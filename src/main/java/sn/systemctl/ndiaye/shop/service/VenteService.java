package sn.systemctl.ndiaye.shop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import sn.systemctl.ndiaye.shop.dto.VenteDTO;
import sn.systemctl.ndiaye.shop.mappers.VenteMapper;
import sn.systemctl.ndiaye.shop.model.LigneVente;
import sn.systemctl.ndiaye.shop.model.Vente;
import sn.systemctl.ndiaye.shop.repository.LigneVenteRepository;
import sn.systemctl.ndiaye.shop.repository.VenteRepository;

@Service
public class VenteService {

	private final VenteRepository venteRepository;
	private final LigneVenteRepository ligneVenteRepository;

	private final VenteMapper mapper;
	
	public VenteService(VenteRepository venteRepository, LigneVenteRepository ligneVenteRepository, @Qualifier("venteMapper") VenteMapper mapper) {
		this.venteRepository = venteRepository;
		this.ligneVenteRepository = ligneVenteRepository;
		this.mapper = mapper;
	}

	public Page<VenteDTO> get(Pageable pageable){
		return venteRepository.findAll(pageable).map(mapper::asDTO);
	}

	public Optional<Vente> get(Long id){
		return venteRepository.findById(id);
	}

	public Vente post(Vente vente) {

		Vente savedVente = venteRepository.save(vente);
		for (LigneVente ligneVente : vente.getVentes()
			 ) {
			ligneVente.setVente(savedVente);
			ligneVenteRepository.save(ligneVente);
		}
		return savedVente;
	}
}
