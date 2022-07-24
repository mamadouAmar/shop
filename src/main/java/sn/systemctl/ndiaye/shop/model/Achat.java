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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateenregistrement")
	private Date dateEnregistrement;

	private Float frais;

	private Float coutTotal;
	
	@OneToMany(mappedBy = "achat")
	private Set<LigneAchat> achats = new HashSet<>();

	public Long getIdAchat() {
		return idAchat;
	}

	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}

	public Float getFrais() {
		return frais;
	}

	public Set<LigneAchat> getAchats() {
		return achats;
	}

	public void setIdAchat(Long idAchat) {
		this.idAchat = idAchat;
	}

	public void setFrais(Float frais) {
		this.frais = frais;
	}

	public void setCoutTotal(Float coutTotal){
		this.coutTotal = coutTotal;
	}

	public Float getCoutTotal(){
		return this.coutTotal;
	}

	public void setAchats(Set<LigneAchat> achats) {
		this.achats = achats;
	}
	
}
