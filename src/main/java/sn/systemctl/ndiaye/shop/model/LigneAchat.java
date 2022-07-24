package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import sn.systemctl.ndiaye.shop.model.Produit;

@Entity
public class LigneAchat implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneAchat;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JsonIgnore
	private Achat achat;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private Produit produit;

	private Short quantite;

	private double coutUnitaire;

	public void setCoutTotal(double coutTotal) {
		this.coutTotal = coutTotal;
	}

	@Column(nullable = true)
	private double coutTotal;

	private double prixVente;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getIdLigneAchat() {
		return idLigneAchat;
	}

	public Achat getAchat() {
		return achat;
	}

	public Produit getProduit() {
		return produit;
	}

	public Short getQuantite() {
		return quantite;
	}

	public double getCoutUnitaire() {
		return coutUnitaire;
	}

	public double getCoutTotal() {
		return coutTotal;
	}

	public double getPrixVente() {
		return prixVente;
	}

	public void setIdLigneAchat(Long idLigneAchat) {
		this.idLigneAchat = idLigneAchat;
	}

	public void setAchat(Achat achat) {
		this.achat = achat;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public void setQuantite(Short quantite) {
		this.quantite = quantite;
	}

	public void setCoutUnitaire(double coutUnitaire) {
		this.coutUnitaire = coutUnitaire;
	}

	public void setCoutTotal() {
		this.coutTotal = coutUnitaire*quantite;
	}

	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}

}
