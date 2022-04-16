package sn.systemctl.ndiaye.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.dto.VenteDTO;
import sn.systemctl.ndiaye.shop.model.Vente;


@Repository
public interface VenteRepository extends JpaRepository<Vente, Long> {

//	@Query(value="select v.id_Vente, v.date_Vente, v.total_Vente "
//			+ "from Vente v", nativeQuery = true)
//	public List<ReductedVente> get();
}
