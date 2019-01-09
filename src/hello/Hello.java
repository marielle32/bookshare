/**
 * 
 */
package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Cotisation;
import hello.livre.Livre;

/**
 * @author Dell
 *
 */
public class Hello {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		Utilisateur moi = new Loueur();
		moi.setNom("Tartampion");
		moi.setPrenom("Jules");
		moi.setNumAdherent("5722001");
		
		System.out.println("Utilisateur : " + moi.getNom());
		
		Utilisateur lui = new Loueur("Bond", "James", "007");
		
		System.out.println("My name is : " + lui.getNom());
		
		Cotisation cotisation = new Cotisation();
		
		
		Utilisateur alien = new Loueur();
		alien
			.nom("ET")
			.prenom("Dvorak")
			.numAdherent("777888999");
			((Loueur)alien).setNbLivres(35);
			((Loueur)alien).setCotisation(cotisation);
			
		
			System.out.println("retour maison : " + alien.getNom() + " " + alien.getPrenom() + " La cotisation est: " + ((Loueur)alien).getCotisation());
	
			
			Utilisateur alien2 = new Emprunteur();
			alien2
				.nom("ET")
				.prenom("Dvorak")
				.numAdherent("777888999");
				((Emprunteur)alien2).setDuree(10);
				((Emprunteur)alien2).setNbLivres(5);
				((Emprunteur)alien2).setPrixTotal(null);
			
				System.out.println("retour maison : " + alien.getNom() + " " + alien.getPrenom() + " Le prix total est: " + ((Emprunteur)alien2).getPrixTotal());
		
			//Création d'un bouquin
			
		Livre lesMiserables = new Livre();
		lesMiserables
			.titre("Les Miserables")
			.resume("trop long à lire")
			.nbPages(3000);
		
		Livre fondation = new Livre("Fondation", "bof bof", 54);
		
		
		System.out.println("ce livre est : " + lesMiserables.titre() + ", "+ "le resume est : " + lesMiserables.resume() + " " + "il y a " + lesMiserables.nbPages() + " pages");						
		System.out.println("Livre : " + fondation.titre() + " : " + fondation.resume());
		
		//Créer un auteur
		@SuppressWarnings("deprecation")
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("1802-01-02");
		Auteur hugo = Auteur.getAuteur("Hugo", "Victor", date);
		if (hugo == null) {
			System.out.println("impossible d'instancier  hugo");
		} else {
			System.out.println("Auteur " + hugo.getNom() + hugo.getNaissance());
			
	}
	
		
		
	}
}
