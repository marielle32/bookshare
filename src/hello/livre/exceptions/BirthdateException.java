/**
 * 
 */
package hello.livre.exceptions;

/**
 * @author Dell
 *
 */
public class BirthdateException extends Exception {
	
	public String getMessage() {
		return "la date de naissance ne peut pas être supérieure à la date du jour";
	}
}
