import java.util.Scanner;

import Root.Personne;


public class PrintAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println(" ****choisissez entre les 4 opérations**** \n **tapez 1 pour addition \n **tapez 2 pour soustraction \n **tapez 3 pour multiplication \n **tapez 4 pour la division !!");
		int op = sc.nextInt();
		
		if(op == 1) {
			System.out.println("vous avez choisi l'addition, tapez 2 nombres");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + "+" + b  + "=" + a + b);
		}
		
		else if(op == 2) {
			System.out.println("vous avez choisi la soustraction, tapez 2 nombres");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a - b);
			
		}
		else if(op == 3) {
			System.out.println("vous avez choisi la multiplication, tapez 2 nombres");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a * b);
			
		}
		else {
			System.out.println("vous avez choisi la multiplication, tapez 2 nombres");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a / b);
		}*/
		Personne P1 = new Personne("Kessa", "Khalil", 25);
		Personne ya = new Personne(P1);
		
		ya.setFirstName("yassine");
		ya.setLastName("lfqih");
		ya.setAge(20);
		
		System.out.println(ya.objectDisplay());
		System.out.println(ya.birthYear());
		
	}

}
