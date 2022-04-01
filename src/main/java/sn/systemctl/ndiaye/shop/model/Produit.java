package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


//@Data
@Entity
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdProduit() {
		return idProduit;
	}

	public String getLibelle() {
		return libelle;
	}

	public String getCategorie() {
		return categorie;
	}

	public String getTypeProduit() {
		return typeProduit;
	}

	public Short getStock() {
		return stock;
	}

	public Short getCoutUnitaire() {
		return coutUnitaire;
	}

	public Short getPrixVente() {
		return prixVente;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public void setTypeProduit(String typeProduit) {
		this.typeProduit = typeProduit;
	}

	public void setStock(Short stock) {
		this.stock = stock;
	}

	public void setCoutUnitaire(Short coutUnitaire) {
		this.coutUnitaire = coutUnitaire;
	}

	public void setPrixVente(Short prixVente) {
		this.prixVente = prixVente;
	}
	
}
