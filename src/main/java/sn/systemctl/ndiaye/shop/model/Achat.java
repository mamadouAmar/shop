package sn.systemctl.ndiaye.shop.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;

//@Data
@Entity
public class Achat implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idachat")
	private Long idAchat;

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateenregistrement")
	@CreatedDate
	private  Date dateEnregistrement;

	private double frais;
	@Column(nullable = true)
	private double totalAchats;

	public void setTotalAchats(double totalAchats) {
		this.totalAchats = totalAchats;
	}

	public void setCoutTotal(double coutTotal) {
		this.coutTotal = coutTotal;
	}

	@Column(nullable = true)
	private double coutTotal;

	public double getTotalAchats() {
		return totalAchats;
	}

	public void setTotalAchats() {
		this.totalAchats = 0.0;
		for (LigneAchat a:
			 achats) {
			this.totalAchats += a.getCoutTotal();
		}
	}
	
	@OneToMany(mappedBy = "achat")
	private Set<LigneAchat> achats = new HashSet<>();

	public Long getIdAchat() {
		return idAchat;
	}

	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}

	public double getFrais() {
		return frais;
	}

	public Set<LigneAchat> getAchats() {
		return achats;
	}

	public void setIdAchat(Long idAchat) {
		this.idAchat = idAchat;
	}

	public void setFrais(double frais) {
		this.frais = frais;
	}

	public void setCoutTotal(){
		this.coutTotal = this.frais+this.totalAchats;
	}

	public double getCoutTotal(){
		return this.coutTotal;
	}

	public void setAchats(Set<LigneAchat> achats) {
		this.achats = achats;
	}
	
}
