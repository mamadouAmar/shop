package sn.systemctl.ndiaye.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.model.LigneVente;
import sn.systemctl.ndiaye.shop.model.Vente;

@Repository
public interface LigneVenteRepository extends JpaRepository<LigneVente, Integer> {
	
	public List<LigneVente> findByVente(Vente v);
}
