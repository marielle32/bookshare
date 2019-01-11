/**
 * 
 */
package hello.utilisateurs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;
import hello.livre.exceptions.BirthdateException;
import hello.tools.AuteurImport;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws BirthdateException 
	 */
	public static ArrayList<Auteur> ListeAuteurs;
	public static void main(String[] args) throws ParseException, BirthdateException {
		// TODO Auto-generated method stub
		Utilisateur loueur = CreateUsers.createLoueur();//'CreateUsers' pas obligé de le mettre car on est deja dans cette classe
		Utilisateur emprunteur = CreateUsers.createEmprunteur();
		Utilisateur emprunteurLoueur = createEmprunteurLoueur();
		
		if (loueur instanceof Loueur) {
			System.out.println(loueur.nom() + " est un loueur");
		}
		
		if (emprunteur instanceof Loueur) {
			System.out.println(loueur.nom() + " est un loueur");
	} else {
			System.out.println(emprunteur.nom() + " n'est pas un loueur");
	}
		if (emprunteurLoueur instanceof EmprunteurLoueur) {
			System.out.println(emprunteurLoueur.nom() + " est un loueur et un emprunteur");
		}
		
		// créer un livre
		Livre livre = new Livre();
		livre.titre("Les Miserables")
			.resume("bla bla bla")
			.nbPages(520);
		((Loueur)loueur) //on doit caster le loueur en tant que loueur, car pour l'instant loueur était utilisateur
			.addBook(livre);
		((Loueur)loueur)
			.addBook(livre);
		((Loueur)loueur)
			.addBook(livre);
		((Loueur)loueur)
			.addBook(livre);
		((Loueur)loueur)
			.loan(livre);
		String message = ((Loueur)loueur)
			.loan(livre, false);
		
		System.out.println(((Loueur)loueur).booksNumber());
		System.out.println(((Loueur)loueur).listBooks());
		
		// création d'un auteur
		//use case 1 : à la main
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("1802-01-02");
		Auteur hugo = Auteur.getAuteur("Hugo", "Victor", date);
		
	
	/**	//use case 2 : par la ligne de commande
		try {//essaie de faire quelque chose
			Auteur asimov = Auteur.getAuteur();
			System.out.println(asimov.getNom());
		} catch(ParseException parseException) {//si une exception est levée, le catch va l'intercepter
			System.out.println("La date de naissance est incorrecte");	
			System.out.println(parseException.getLocalizedMessage());
		}	catch(BirthdateException naissance) {	
			System.out.println(naissance.getMessage());
		}
		*/
		
		//Auteur asimov = Auteur.getAuteur();
		
		//créer la liste des auteurs à partir d'un fichier délimité
		AuteurImport auteurs = new AuteurImport ();//instance de la classe qui importe les auteurs
		//récupère la liste des auteurs
		ArrayList<String[]> lesAuteursImportes = auteurs.getAuteurs();//auteurs.getAuteurs() = resultat de l'importation. 
		                   //A chaque fois qu'il récupère quelque chose, le ranger dans auteurs importes
		//Boucler sur la liste des auteurs
		for (String[] unAuteur : lesAuteursImportes) {//unAuteur est un tableau de chaine, lesAuteursImportés est sur ce sur quoi on va boucler
			try {
				SimpleDateFormat leFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date laDate = format.parse(unAuteur[2]);
				ListeAuteurs.add(Auteur.getAuteur(unAuteur[0], unAuteur[1], laDate));//la methode get.Auteur crée une instance de Auteur
				//un getteur attend un return quelque chose, il récupère quelque chose, si il n'y a pas de return, c'est un setteur
			} catch(Exception e) {
				//NOOP
			}
		}
		 
		
	}
	private static Utilisateur createLoueur() { //private car on ne veut créer des loueur que dans cette classe, 
		//on ne pourrait pas l'importer
		// static car pas d'instance dans cette classe CreateUsers; Utilisateur car doit retourner une instance de  utilisateur
		return new Loueur()//retourne une instance de la classe Loueur
				.nom("Aubert")
				.prenom("Jean-Luc")
				.numAdherent("000111555");
	}
	
	
	private static Utilisateur createEmprunteur() {
		return new Emprunteur()
				.nom("Talaron")
				.prenom("Delphine")
				.numAdherent("000555666");
	}
	
	private static Utilisateur createEmprunteurLoueur() {
		return new EmprunteurLoueur()
				.nom("Niscotch")
				.prenom("Nicole")
				.numAdherent("123456789");
	}
	

	
	
}
