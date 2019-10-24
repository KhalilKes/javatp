package Root;

public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		
	}
	
	// instance ???
	public Personne(Personne P) {
		this.nom = P.nom;
		this.prenom = P.prenom;
		this.age = P.age;
	}
	
	//getters
	public String getLastName() {
		return nom;		
	}
	public String getFirstName() {
		return prenom;	
	}
	public int getAge() {
		return age;
	}
	
	
	//setters
	public int setAge(int age) {
		this.age = age;
		return age;
	}
	public String setLastName(String nom) {
		this.nom = nom;
		return nom;
	}
	public String setFirstName(String prenom) {
		this.prenom = prenom;
		return prenom;
	}
	
	
	//Object displayer
	
	public String objectDisplay() {
		return getLastName() +"\n" + getFirstName() + "\n" + getAge() + " ans\n";
	}
	
	public String toString() {
		return getLastName() +"\n" + getFirstName() + "\n" + getAge() + "ans";	
	}
	
	
	// year of birth
	public int birthYear() {
		return 2019 - getAge();
	}

}
