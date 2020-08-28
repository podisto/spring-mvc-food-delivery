/**
 * 
 */
package sn.uvs.courses.model;

import java.util.Date;

/**
 * @author podisto
 * La classe {@link Commande} est notre modele de données
 *
 */
public class Commande {
	
	private int quantite;
	private String addresse;
	private String telephone;
	private Date dateCreation;
	private String plat;
	private int prix;
	private String nom;
	private String prenom;
	private boolean aPaye; // JVM les booleans sont true par defaut catastrophe
	private boolean estLivre;
	
	private int total;

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		if (quantite <= 0) {
			throw new IllegalArgumentException("la quantite saisie n'est pas correcte");
		}
		this.quantite = quantite;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getPlat() {
		return plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prixSaisie) {
		if (prixSaisie <= 500) {
			throw new IllegalArgumentException("Ah non le prix est incorrect");
		}
		this.prix = prixSaisie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isaPaye() {
		return aPaye;
	}

	public void setaPaye(boolean aPaye) {
		this.aPaye = aPaye;
	}

	public boolean isEstLivre() {
		return estLivre;
	}

	public void setEstLivre(boolean estLivre) {
		this.estLivre = estLivre;
	}

	public int getTotal() {
		System.out.println("quantite= " +this.quantite+ " prix=" +this.prix);
		this.total = quantite * prix;
		return total;
	}

	@Override
	public String toString() {
		return "Commande [quantite=" + quantite + ", addresse=" + addresse + ", telephone=" + telephone
				+ ", dateCreation=" + dateCreation + ", plat=" + plat + ", prix=" + prix + ", nom=" + nom + ", prenom="
				+ prenom + ", aPaye=" + aPaye + ", estLivre=" + estLivre + ", total=" + total + "]";
	}
}
