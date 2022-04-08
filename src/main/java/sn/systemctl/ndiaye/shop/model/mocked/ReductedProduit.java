package sn.systemctl.ndiaye.shop.model.mocked;


public class ReductedProduit {

	private Integer idProduit;

	private String libelle;

	private String categorie;

	private Short stock;

	private Short coutUnitaire;

	private Short prixVente;

	public Integer getIdProduit() {
		return idProduit;
	}

	public String getLibelle() {
		return libelle;
	}

	public String getCategorie() {
		return categorie;
	}

	public Short getStock() {
		return stock;
	}

	public Short getCoutUnitaire() {
		return coutUnitaire;
	}

	public Short getPrixVente() {
		return prixVente;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public void setStock(Short stock) {
		this.stock = stock;
	}

	public void setCoutUnitaire(Short coutUnitaire) {
		this.coutUnitaire = coutUnitaire;
	}

	public void setPrixVente(Short prixVente) {
		this.prixVente = prixVente;
	}
	
	
}
