package Root;


import java.util.ArrayList;
import java.util.Vector;

import P1.Prof;
import P2.Etudiant;

public class Main {

	public static void main(String[] args) {
		
		Etudiant bobo = new Etudiant("abdeljabbar", "elhajji", 16, 7890);
		Prof ot = new Prof("otmane", "sarhabil", 25, "2500dh", "islamiat");	
		Personne meh = new Etudiant("bzikha", "mehdi", 27, 1111);
		
		//Voiture v1 = new Voiture("BMW");
		//System.out.println("la voiture n°" + Voiture.iteration() + " est porte la marque " + v1.carMod());
		//Voiture v2 = new Voiture("Mercedes");
		//System.out.println("la voiture n°" + Voiture.iteration() + " est porte la marque " + v2.carMod());
		//Voiture v3 = new Voiture("Mazerati");
		//System.out.println("la voiture n°" + Voiture.iteration() + " est porte la marque " + v3.carMod());
		
		//Vector<Integer> arr = new Vector<Integer>();
		
		//System.out.print("[");
		
		//for(int i = 0; i < 10; i++) {
			//arr.addElement(i);
			//System.out.print(arr.elementAt(i) + ", ");
			//if(i == 9) {
				//arr.addElement(9);
				//System.out.print(arr.elementAt(9) + "] \n");
				
			//}
		//}

		//System.out.println(arr);
		
		
		// personne vector !!
		
		Vector<Personne> tab = new Vector<Personne>();
		
		Personne p1 = new Personne("bobo", "toto", 111);
		Personne e1 = new Etudiant("jamil", "pshakh", 12, 1234);
		Personne pr1 = new Prof("kruz", "mcstati", 45, "45000$", "Maths");
		
		tab.addElement(p1);
		tab.addElement(e1);
		tab.addElement(pr1);
		for(int i = 0; i < tab.size(); i++) {
			System.out.println(tab.elementAt(i).toString());				
		}
		
		//personne arraylist !!
		
	
		
		
		
		
	
	}

}
