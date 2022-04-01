package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
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
	@JsonBackReference
	private Vente vente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private Produit produit;

	private Short quantite;

	@Transient
	private Float total;

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

	public Float getTotal() {
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

	public void setTotal(Float total) {
		this.total = total;
	}

}
