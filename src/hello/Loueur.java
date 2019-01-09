/**
 * 
 */
package hello;

import hello.livre.Cotisation;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur {

	/**
	 * 
	 */
	private int nbLivres;
	private Double cotisation;
	
	public Loueur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	public Loueur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	}

	public int getNbLivres() {
		return nbLivres;
	}

	public Loueur setNbLivres(int nbLivres) {
		this.nbLivres = nbLivres;
		return this;
	}

	public Double getCotisation() {
		return cotisation;
	}

	public Loueur setCotisation(Cotisation cotisation) {
		Double cot = 0.;
		cot = cotisation.getCoutHT();
		System.out.println(cot);
		
		if (this.nbLivres >= cotisation.getNbMin()) {
			cot =  (cot - (cotisation.getRemise() * 0.01*cot));
			System.out.println(cot);
		}
		cot = cot + (cot * cotisation.getTva()*0.01);
		System.out.println(cot);
		this.cotisation = cot;
		return this;
	}


	
	
	
	
	
			
	
}
