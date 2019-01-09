/**
 * 
 */
package hello.livre;



/**
 * @author Dell
 *
 */
public class Cotisation {
	private final Double coutHT = 15.;
	private Double tva = 20.;
	private Double remise = 5.;
	private int nbMin = 30;
	public final static Double COUT_LOCATION = 0.05;
	
	public Double getTva() {
		return tva;
	}
	
	public Double getRemise() {
		return remise;
	}
	
	public Double getCoutHT() {
		return coutHT;
	}

	public int getNbMin() {
		return nbMin;
	}

	
	
	
}
