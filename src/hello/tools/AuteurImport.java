/**
 * 
 */
package hello.tools;

import java.io.File;//permet de manipuler des fichiers
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class AuteurImport {
	private File auteurFile;
	
	private static final String FIELD_SEP = ";";
	
	private ArrayList<String[]> auteurs;//je declare un attrbut privé dans ma classe; de type arraylist. 
	//On utilise un 'specifieur' dans lequel on ne pourra rentrer qu'un tableau de chaine. 
	//comme arraylist est une classe, il faut l'instancer, fait plus bas
	
	//TODO Ajouter le moyen de définir si oui ou non il y a une ligen d'entête
	
	public AuteurImport() {
		
		//instancier un arrayList
		this.auteurs = new ArrayList<String[]>();//initialise en mémoire l'araylist
		
		//Instancier la classe File donc...créer l'objet auteurFile
		this.auteurFile = new File("C:\\Users\\Dell\\eclipse-workspace\\Hello\\auteurs.txt");
		if (this.auteurFile.exists()) {
			if(auteurFile.canRead()) {
			this.process();
			} else {
				System.out.println("le fichier n'est pas lisible");
			}
		} else {
			System.out.println("C'est bon, on peut bosser avec le fichier");
			
		}
	}
	public ArrayList<String[]> getAuteurs() {
		return this.auteurs;
	}
	/**
	 * @todo trouver un moyen de compter le nombre de colonnes
	 * pour chaque ligne...
	 */
	private void process() {
		// TODO compter le nombre de colonnes dans une ligne lue
		try {
			Scanner fileScanner = new Scanner(this.auteurFile); //filescanner lit globalement, si gros fichier, utiliser plutot filereader, mais ne s'utilise pas de la même façon
			
			int rowCount = 0;
			while(fileScanner.hasNext()) {//hasnext : itérateur, parcourt le fichier tant qu'il y a des lignes
				String row = fileScanner.nextLine();//nextligne recupere la ligne courante du fichier lu
				if (rowCount>0) {//pour lui exclure la premiere ligne qui contient l'entete
					// on doit parser row...
					String[] cols = row.split(AuteurImport.FIELD_SEP);//dans une variale qui s'appelle cols, de type tableau de chaine, on découpe de ce qu'il va lire sur le ';'
					// et le range dans le tableau AuteurImport
					// on doit ranger le tableau dans un arraylist
					this.auteurs.add(cols);	
					
					//servait à verifier que le split avait bien marché
					/**String message = " ";
					for (int i=0; i < cols.length; i++ ) {
						message += cols[i] + " ";
					}
					message += "\n";
				System.out.println(message);*/
			}
				rowCount++;
			}	
		} catch(IOException ioe) {
			///Your logic here
		}
	}
}
