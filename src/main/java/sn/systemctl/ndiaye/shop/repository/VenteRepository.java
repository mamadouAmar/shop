package sn.systemctl.ndiaye.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.model.Vente;


@Repository
public interface VenteRepository extends JpaRepository<Vente, Long> {
	
	@Query("select v.idVente, v.dateVente, a.totalVente "
			+ "from Vente v")
	public List<Achat> getAllVente();
}
