package Root;

public class Voiture {
	private String marque;
	private static int nbr;
	
	public Voiture(String marque) {
		this.marque = marque;
		this.nbr++;
		
	}
	
	//getter
	public static int iteration() {
		return nbr;
	}
	public String carMod() {
		return marque;
	}

}
