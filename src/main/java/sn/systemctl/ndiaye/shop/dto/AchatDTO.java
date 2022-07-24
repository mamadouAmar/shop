package sn.systemctl.ndiaye.shop.dto;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class AchatDTO {
	
	private Long idAchat;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private Float total;

	public Long getIdAchat() {
		return idAchat;
	}

	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}

	public Float getTotal() {
		return total;
	}

	public void setIdAchat(Long idAchat) {
		this.idAchat = idAchat;
	}

	public void setTotal(Float total) {
		this.total = total;
	}
	
	
}
