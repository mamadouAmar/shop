package sn.systemctl.ndiaye.shop.dto;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class VenteDTO {

	private Long idVente;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente;

	private Float totalVente;

	public Long getIdVente() {
		return idVente;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public Float getTotalVente() {
		return totalVente;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public void setTotalVente(Float totalVente) {
		this.totalVente = totalVente;
	}
	
	
}
