package sn.systemctl.ndiaye.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.model.Achat;


@Repository
public interface AchatRepository extends JpaRepository<Achat, Long> {
	
	@Query("select a.idAchat, a.dateAchat, a.totalAchat "
			+ "from Achat a")
	public List<Achat> getAllAchats();
}
