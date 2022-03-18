package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Produit implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduit;

	private String libelle;

	private String categorie;

	private String typeProduit;

	private Short stock;

	private Short coutUnitaire;

	private Short prixVente;

}
