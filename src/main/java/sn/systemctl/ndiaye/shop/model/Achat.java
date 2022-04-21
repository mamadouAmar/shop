package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

//@Data
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
	@CreatedDate
	private Date dateEnregistrement;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAchat;

	private Float frais;

	private Float totalAchat;
	
//	@JsonManagedReference
	@OneToMany(mappedBy = "achat",cascade = CascadeType.ALL)
	private Set<LigneAchat> achats = new HashSet<>();

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

	public Set<LigneAchat> getAchats() {
		return achats;
	}

	public void setIdAchat(Long idAchat) {
		this.idAchat = idAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public void setFrais(Float frais) {
		this.frais = frais;
	}

	public void setTotalAchat() {
		this.totalAchat = (float) 0;
		for (LigneAchat achat : achats) {
			this.totalAchat += achat.getCoutTotal();
		}
	}

	public void setAchats(Set<LigneAchat> achats) {
		this.achats = achats;
	}
	
}
