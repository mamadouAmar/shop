package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
public class Vente implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVente;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente;

//	@Transient
	private Float totalVente;

	@OneToMany(mappedBy = "vente", fetch = FetchType.LAZY)
	private List<LigneVente> ventes;

}
