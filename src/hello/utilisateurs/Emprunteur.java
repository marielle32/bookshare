/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.emprunteurInterface;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Utilisateur implements emprunteurInterface {

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.emprunteurInterface#facturation()
	 */
	@Override
	public Utilisateur facturation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.emprunteurInterface#createBookBorrowing(hello.utilisateurs.Loueur, hello.livre.Livre)
	 */
	@Override
	public Utilisateur createBookBorrowing(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.emprunteurInterface#returnBookk(hello.utilisateurs.Loueur, hello.livre.Livre)
	 */
	@Override
	public Utilisateur returnBook(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

}
