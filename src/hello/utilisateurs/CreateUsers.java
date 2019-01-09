/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		((Loueur)loueur)
			.addBook(livre); //on doit caster le loueur en tant que loueur, car pour l'instant loueur était utilisateur
		((Loueur)loueur)
			.addBook(livre);
		
		System.out.println(((Loueur)loueur).booksNumber());
		System.out.println(((Loueur)loueur).listBooks());
		
		
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
