/**
 * 
 */
package hello.livre;

/**
 * @author Dell
 *
 */
public class Livre {
	private String titre;
	private String resume;
	private int nbPages;
	
	// définition d'une constante de classe
	// le mot clé final interdit la modification de la valeur
	private final int MINIMUM = 4;
	
	public Livre(String titre, String resume, int nbPages) {
		this.titre = titre;
		this.resume = resume;	
		if (nbPages >= this.MINIMUM) {
			this.nbPages = nbPages;
		} else {
			this.nbPages = this.MINIMUM;
		}
	}
	
	//constructeur
	public Livre() {
		// TODO Auto-generated constructor stub
	}
	
	public Livre titre(String titre) {
		this.titre = titre;
		return this;
	}
		public String titre() {
			return this.titre;
		}
	
	public Livre resume(String resume) {
		this.resume = resume;
		return this;
	}
		public String resume() {
			return this.resume;
		}
	
	public Livre nbPages(int nbPages) {
		this.nbPages = nbPages;
		return this;
	}
	public int nbPages() {
		return this.nbPages;
	}
	
	
	
}
