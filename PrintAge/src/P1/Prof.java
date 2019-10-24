package P1;
import Root.Employe;

public class Prof extends Employe {
	
	private String codeMatiere;
	
	public Prof (String nom, String prenom, int age, String salaire, String codeMatiere) {
		super(nom, prenom, age, salaire);
		this.codeMatiere = codeMatiere;
	}
	
	public String getProf() {
		return super.getEmployer() + "\n" + codeMatiere;
	}
	public String toString() {
		return super.getEmployer() + "\n" + codeMatiere;
		
	}
	

}
