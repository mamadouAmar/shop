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

	public Long getIdVente() {
		return idVente;
	}

	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public Float getTotalVente() {
		return totalVente;
	}

	public List<LigneVente> getVentes() {
		return ventes;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public void setTotalVente(Float totalVente) {
		this.totalVente = totalVente;
	}

	public void setVentes(List<LigneVente> ventes) {
		this.ventes = ventes;
	}
	
	

}
