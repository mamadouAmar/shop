package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class LigneVente implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneVente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Vente vente;

	@ManyToOne(fetch = FetchType.EAGER)
	private Produit produit;

	public double getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}

	@Column(nullable = true)
	private double prixVente;

	private Short quantite;

	public void setTotal(double total) {
		this.total = total;
	}

	private double total;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public Vente getVente() {
		return vente;
	}

	public Produit getProduit() {
		return produit;
	}

	public Short getQuantite() {
		return quantite;
	}

	public double getTotal() {
		return total;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public void setQuantite(Short quantite) {
		this.quantite = quantite;
	}

	public void setTotal() {
		this.total = (double) (quantite*produit.getPrixVente());
	}

}
