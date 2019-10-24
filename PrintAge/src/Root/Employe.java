package Root;

public class Employe extends Personne {
	
	private String salaire;
	
	public Employe (String nom, String prenom, int age, String salaire) {
		
		super(nom, prenom, age);
		this.salaire = salaire;	
	}
	
	//getter
	public String getEmployer() {
		return super.objectDisplay() + salaire;
	}
	
	

}
