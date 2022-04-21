package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

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
	@JoinColumn(unique = true)
//	@JsonBackReference
	private Achat achat;

	@ManyToOne
	@JsonBackReference
	private Produit produit;

	private Short quantite;

	private Float coutUnitaire;

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

	public void setCoutTotal() {
		this.coutTotal = coutUnitaire*quantite;
	}

	public void setPrixVente(Float prixVente) {
		this.prixVente = prixVente;
	}
	
}
