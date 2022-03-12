package sn.systemctl.ndiaye.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.model.Vente;


@Repository
public interface VenteRepository extends JpaRepository<Vente, Long> {

}
