package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Entity
public class Vente implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVente;

	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date dateVente;

	@Temporal(TemporalType.TIMESTAMP)
	private final Date derniereDateModification = new Date();

	public void setTotalVente(double totalVente) {
		this.totalVente = totalVente;
	}

	private double totalVente;

	@OneToMany(mappedBy = "vente", fetch = FetchType.EAGER)
	private List<LigneVente> ventes;

	public Long getIdVente() {
		return idVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}
	public Date getDateVente() {
		return dateVente;
	}

	public Date getDerniereDateModification() {
		return derniereDateModification;
	}

	public double getTotalVente() {
		return totalVente;
	}

	public List<LigneVente> getVentes() {
		return ventes;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}

	public void setTotalVente() {
		this.totalVente = 0.0;
		for (LigneVente vente : ventes) {
			this.totalVente += vente.getTotal();
		}
	}

	public void setVentes(List<LigneVente> ventes) {
		this.ventes = ventes;
	}
}
