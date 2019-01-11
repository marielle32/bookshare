/**
 * 
 */
package hello.livre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hello.livre.exceptions.BirthdateException;

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
	
	public static Auteur getAuteur(String nom, String prenom, Date naissance) throws ParseException, BirthdateException {
		Date today = new Date();
		if (naissance.after(today)) {
			throw new BirthdateException();
			
		}
		Auteur auteur = new Auteur(nom, prenom, naissance);
		return auteur;
	}
	
	public static Auteur getAuteur()  throws ParseException, BirthdateException{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nom de l'auteur : ");
		String nom = scanner.nextLine();//recup les données rentrées au clavier
		scanner.nextLine();//réinitialise le buffer (= memoire tampon) d'entrée
		
		System.out.println("prenom de l'auteur : ");
		String prenom = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Date de naissance : ");
		String naissance = scanner.nextLine();
		scanner.nextLine();
		
		
		//convertir une chaine en date
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(naissance);
		
		scanner.nextLine();	
		scanner.close();//ferme l'ecoute des saisies clavier
		
		// on peut instancier un nouvel Auteur à partir des informations 
		return getAuteur(nom, prenom, date);
		
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
