package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

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
	private Vente vente;

	@ManyToOne(fetch = FetchType.LAZY)
	private Produit produit;

	private Short quantite;

	@Transient
	private Float total;



}
