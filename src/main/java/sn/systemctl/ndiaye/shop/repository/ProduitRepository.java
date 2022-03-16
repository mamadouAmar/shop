package sn.systemctl.ndiaye.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.model.Produit;


@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {
	
	@Query("select p.idProduit, p.libelle, p.stock, p.coutUnitaire, "
			+ "p.prixVente from Produit p ")
	List<Produit> getAllProduit();
}
