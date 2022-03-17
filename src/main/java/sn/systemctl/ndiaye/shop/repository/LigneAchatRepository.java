package sn.systemctl.ndiaye.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.model.Achat;
import sn.systemctl.ndiaye.shop.model.LigneAchat;


@Repository
public interface LigneAchatRepository extends JpaRepository<LigneAchat, Integer> {
	
	public List<LigneAchat> findByAchat(Achat a);
}
