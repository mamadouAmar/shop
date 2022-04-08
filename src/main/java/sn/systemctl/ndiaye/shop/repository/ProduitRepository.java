package sn.systemctl.ndiaye.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sn.systemctl.ndiaye.shop.model.Produit;
import sn.systemctl.ndiaye.shop.model.mocked.ReductedProduit;


@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {

	@Query(value="select p.id_Produit, p.libelle, p.stock, p.cout_Unitaire, p.categorie, "
			+ "p.prix_Vente from Produit p ", nativeQuery = true)
	List<ReductedProduit> get();
}
