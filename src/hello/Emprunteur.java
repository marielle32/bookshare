/**
 * 
 */
package hello;

import hello.livre.Cotisation;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Utilisateur {

	

	private int nbLivres;
	private int duree;
	private Double prixTotal;
	
	public int getDuree() {
		return duree;
	}
	public Emprunteur setDuree(int duree) {
		this.duree = duree;
		return this;
	}
	public int getNbLivres() {
		return nbLivres;
	}
	public Emprunteur setNbLivres(int nbLivres) {
		this.nbLivres = nbLivres;
		return this;
	}
	public Double getPrixTotal() {
		return prixTotal;
	}
	public Emprunteur setPrixTotal(Double prixTotal) {
		this.prixTotal = (nbLivres * duree * Cotisation.COUT_LOCATION);
		return this;
	}
	
	
		
	
	
}
