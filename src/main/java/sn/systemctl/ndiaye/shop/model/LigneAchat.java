package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
public class LigneAchat implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneAchat;

	@ManyToOne
	private Achat achat;

	@ManyToOne
	private Produit produit;

	private Short quantite;

	private Float coutUnitaire;

	@Transient
	private Float coutTotal;

	private Float prixVente;

}
