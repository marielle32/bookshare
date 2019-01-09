/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;
import hello.utilisateurs.interfaces.emprunteurInterface;

/**
 * @author Dell
 *
 */
public class EmprunteurLoueur extends Utilisateur implements emprunteurInterface, LoueurInterface {

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#addBook(hello.livre.Livre)
	 */
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#loan(hello.livre.Livre)
	 */
	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#calculeCotisation()
	 */
	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

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
	public Utilisateur returnBookk(Loueur loueur, Livre livre) {
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
