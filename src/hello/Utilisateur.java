/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
abstract public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;
	
	/**
	 * Constructeur d'une classe Java
	 * poste le nom de la classe
	 */
	public Utilisateur() {
		System.out.println("Je suis le constructeur Utilisateur");
	}
	//Aussi un constructeur, meme nom mais pas memes parametres
	public Utilisateur(String nom, String prenom, String numAdherent) {
		this.nom = nom;
		this.prenom = prenom;
		this.numAdherent = numAdherent;
	}
	
	
	public String getNom() {
		return nom;
	}
	public final Utilisateur setNom(String nom) {
		this.nom = nom;
		return this;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumAdherent() {
		return numAdherent;
	}
	public void setNumAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
	}
	
	//Setter
	public String nom() {
		return this.nom;
	}
	public String prenom() {
		return this.prenom;
	}
	public String numAdherent() {
		return this.numAdherent;
	}
	
	
	
	//Getteur
	public  Utilisateur nom(String nom) {
		this.nom = nom;
		return this;
	}
	public Utilisateur prenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	public Utilisateur numAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
		return this;
	}
	
	//protected abstract Loueur setNbLivres(int i);	
	//protected abstract int getNbLivres();
	//protected abstract Double getCotisation();
	
	
	
}
