package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

//@Data
@Entity
public class LigneAchat implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneAchat;

	@ManyToOne
	@JsonBackReference
	private Achat achat;

	@ManyToOne
	@JsonBackReference
	private Produit produit;

	private Short quantite;

	private Float coutUnitaire;

	@Transient
	private Float coutTotal;

	private Float prixVente;

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

	public Float getCoutUnitaire() {
		return coutUnitaire;
	}

	public Float getCoutTotal() {
		return coutTotal;
	}

	public Float getPrixVente() {
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

	public void setCoutUnitaire(Float coutUnitaire) {
		this.coutUnitaire = coutUnitaire;
	}

	public void setCoutTotal(Float coutTotal) {
		this.coutTotal = coutTotal;
	}

	public void setPrixVente(Float prixVente) {
		this.prixVente = prixVente;
	}
	
	

}
