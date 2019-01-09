/**
 * 
 */
package hello.utilisateurs;

import java.util.ArrayList;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur implements LoueurInterface{
	//private Livre[] books;
	
	//public Loueur () {
		//this.books = new Livre[30];
	//} La structure tableau Java ne convient pas pour ce que l'on veut faire ici, un tableau est figé, il nous faut quelque chose de dynamique
	
	private ArrayList<Livre> books;	//<> = type de données que l'on pourra collecter dans cette structure, c'est un spécifieur
	// ArrayList est une classe, il faut donc l'instancier, d'où le new 2 lignes plus tard
	public Loueur () {
		this.books = new ArrayList<Livre>();
	}
	
	public String booksNumber() {
		String message = "Nombre de livres : ";
		message += this.books.size();
		
		return message;
	}
		
	public String listBooks() {
		String message = "Livre de la collection de " + this.nom + "\n"; //\n : retour à la ligne
		// boucle sur la collection de livres
		for (Livre livre : this.books) {// for parcourt tous les éléments de l'array this.books, et va ranger dans livre
		message += livre.titre() + "\n";
		}
			return message;
	}
	
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		if (!this.books.contains(livre)) {// ! retourne la phrase en négatif, càd, ici, si la collection ne contient pas le livre, alors ajoute le, 
			//sinon, si le livre y etait deja, dans le cas d'un doublon, ça le rentrerait deux fois
			this.books.add(livre);	
		}
		
		return this;
		
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur toEmprunteur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur toEmprunteurLoueur() {
		// TODO Auto-generated method stub
		return null;
	}

}
