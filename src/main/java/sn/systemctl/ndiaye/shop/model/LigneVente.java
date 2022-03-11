package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

public class LigneVente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneVente;
	
	@ManyToOne
	private Vente vente;
	
	@ManyToOne
	private Produit produit;
	
	private Short quantite;
	
	@Transient
	private Float total;
	
	

}
