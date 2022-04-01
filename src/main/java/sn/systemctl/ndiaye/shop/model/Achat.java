package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class Achat implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAchat;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAchat;

	private Float frais;

//	@Transient
	private Float totalAchat;

	@OneToMany(mappedBy = "achat")
	private List<LigneAchat> achats;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getIdAchat() {
		return idAchat;
	}

	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public Float getFrais() {
		return frais;
	}

	public Float getTotalAchat() {
		return totalAchat;
	}

	public List<LigneAchat> getAchats() {
		return achats;
	}

	public void setIdAchat(Long idAchat) {
		this.idAchat = idAchat;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public void setFrais(Float frais) {
		this.frais = frais;
	}

	public void setTotalAchat(Float totalAchat) {
		this.totalAchat = totalAchat;
	}

	public void setAchats(List<LigneAchat> achats) {
		this.achats = achats;
	}
	
}
