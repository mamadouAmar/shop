package sn.systemctl.ndiaye.shop.dto;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class AchatDTO {
	
	private Long idAchat;

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private double coutTotal;

	public Long getIdAchat() {
		return idAchat;
	}

	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}

	public double getCoutTotal() {
		return coutTotal;
	}

	public void setIdAchat(Long idAchat) {
		this.idAchat = idAchat;
	}

	public void setCoutTotal(double coutTotal) {
		this.coutTotal = coutTotal;
	}
	
	
}
