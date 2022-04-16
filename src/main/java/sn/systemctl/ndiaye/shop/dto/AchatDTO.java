package sn.systemctl.ndiaye.shop.dto;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class AchatDTO {
	
	private Long idAchat;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAchat;

	private Float total;

	public Long getIdAchat() {
		return idAchat;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public Float getTotal() {
		return total;
	}

	public void setIdAchat(Long idAchat) {
		this.idAchat = idAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public void setTotal(Float total) {
		this.total = total;
	}
	
	
}
