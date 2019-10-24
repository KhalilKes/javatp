package P2;
import Root.Personne;

public class Etudiant extends Personne {
	private int cne;
	
	public Etudiant(String nom, String prenom, int age, int cne) {
		
		super(nom, prenom, age);
		this.cne = cne;
	}
	
	//getter
	public int getCne() {
		return cne;	
	}
	
	public String toto() {
		  return super.objectDisplay() + cne;
		
		//System.out.println("CNE est " + cne);
	}
	
	@Override
	public String toString() {
		return super.objectDisplay() + cne;
		
	}

}
