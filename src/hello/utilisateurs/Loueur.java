/**
 * 
 */
package hello.utilisateurs;

import java.util.HashMap;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */

//interface fonctionnelle
interface GetSize {// getsize devient une fonction
	public int getSize(HashMap<Livre, Integer> livres, boolean getStock);
}

public class Loueur extends Utilisateur implements LoueurInterface{
	//private Livre[] books;
	
	//public Loueur () {
		//this.books = new Livre[30];
	//} La structure tableau Java ne convient pas pour ce que l'on veut faire ici, un tableau est figé, il nous faut quelque chose de dynamique
	
	//private ArrayList<Livre> books;	//<> = type de données que l'on pourra collecter dans cette structure, c'est un spécifieur
	// ArrayList est une classe, il faut donc l'instancier, d'où le new 2 lignes plus tard
	
	private HashMap<Livre, Integer> books; //definit les entrées du tableau : livre et un entier
	
	
	public Loueur () {
		//this.books = new ArrayList<Livre>();
		this.books = new HashMap<Livre, Integer>();//Instancie l'objet HashMap
	}
	
	public String booksNumber() {
		String message = "Nombre de livres : ";
		message += this.books.size();
		
		return message;
	}
		
	public int getCollectionSize(boolean asStock) {
		
		GetSize size = (collection, getStock) -> {
			if (!getStock) {
				return collection.size();
			} else {
				int stock = 0;
				for (Livre livre : collection.keySet()) {
					stock += collection.get(livre);
				}
				return stock;
			}
			
		};
		return size.getSize(this.books, asStock);
	}
	
	public String listBooks() {
		String message = "Livre de la collection de " + this.nom + "\n"; //\n : retour à la ligne
		// boucle sur la collection de livres
		for (HashMap.Entry<Livre, Integer> livre: this.books.entrySet()) { //~for each. le for va parcourir cq element de this.books et va ranger cet element dans livre
            //sortira de la ligne qd il n'y aura plus d'element
				message += livre.getKey().titre() + " quantité en stock ("+ livre.getValue() +")\n";
		}
			return message;
	}
	
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		if (this.books.containsKey(livre)) {
			Integer oldValue = this.books.get(livre);
			oldValue = oldValue + 1;
			this.books.replace(livre, oldValue);
		} else {
			this.books.put(livre, 1);
		}
		
		
		//if (!this.books.contains(livre)) {// ! retourne la phrase en négatif, càd, ici, si la collection ne contient pas le livre, alors ajoute le, 
			//sinon, si le livre y etait deja, dans le cas d'un doublon, ça le rentrerait deux fois
			//this.books.add(livre);	
		//}
		
		return this;
		
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		if (this.books.containsKey(livre) && this.books.get(livre)>0) {
			
			Integer oldValue = this.books.get(livre);
			oldValue = oldValue -1;
			this.books.replace(livre, oldValue);
		} 		
		
		return this;
	}

	public String loan(Livre livre, boolean toto) {
		// TODO Auto-generated method stub
		if (this.books.containsKey(livre) && this.books.get(livre)>0) {
			
			Integer oldValue = this.books.get(livre);
			oldValue = oldValue -1;
			this.books.replace(livre, oldValue);
			return "Bad boy";
		} 		
		
		return "";
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
