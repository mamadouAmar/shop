package sn.systemctl.ndiaye.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.model.mocked.ReductedAchat;


@Repository
public interface AchatRepository extends JpaRepository<Achat, Long> {

	@Query(value="select a.id_Achat, a.date_Achat, a.total_Achat "
			+ "from Achat a", nativeQuery = true)
	public List<ReductedAchat> get();

}
