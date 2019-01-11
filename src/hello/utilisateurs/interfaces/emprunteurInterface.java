/**
 * 
 */
package hello.utilisateurs.interfaces;

import hello.livre.Livre;
import hello.utilisateurs.Loueur;
import hello.utilisateurs.Utilisateur;

/**
 * @author Dell
 *
 */
public interface emprunteurInterface {
	public Utilisateur facturation();
	public Utilisateur createBookBorrowing(Loueur loueur, Livre livre);
	public Utilisateur returnBook(Loueur loueur, Livre livre);
}
