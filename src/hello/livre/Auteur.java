/**
 * 
 */
package hello.livre;

import java.util.Date;

/**
 * @author Dell
 *
 */
public class Auteur {
	private String nom;
	private String prenom;
	private Date naissance;

	private Auteur(String nom, String prenom, Date naissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
	}
	
	public static Auteur getAuteur(String nom, String prenom, Date naissance) {
		Date today = new Date();
		if (naissance.after(today)) {
			return null;
		}
		Auteur auteur = new Auteur(nom, prenom, naissance);
		return auteur;
		
	}
	
	public String getNom() {
		return nom;
	}

	public Auteur setNom(String nom) {
		this.nom = nom;
		return this;
	}

	public String getPrenom() {
		return prenom;
	}

	public Auteur setPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	public Date getNaissance() {
		return naissance;
	}

	public Auteur setNaissance(Date naissance) {
		this.naissance = naissance;
		return this;
	}

}
