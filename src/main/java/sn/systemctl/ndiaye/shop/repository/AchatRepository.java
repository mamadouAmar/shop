package sn.systemctl.ndiaye.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.model.Achat;


@Repository
public interface AchatRepository extends JpaRepository<Achat, Long> {

}
