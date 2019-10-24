package Square;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("**Programme de racine carré**");
		do{
			System.out.println("Entrez un nombre positif ");
			num = sc.nextInt();

			if(num > 0) {
				double rt = Math.sqrt(num);
				System.out.println("le racine carré est " + rt);
				
			}
			else if(num < 0) {
				System.out.println("entrez un nombre positive baliz");
			}
		}while(num != 0);*/
		
		
		
		
		
		// Arrays
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];
		int sum = 0;
		int sup = 0;
		
		for(int i = 0; i< 5; i++) {
			System.out.println("entrez le nombre");
			ar[i] = sc.nextInt();
			
			sum += ar[i];
		
		}
		
		System.out.println("la moyenne c'est " + sum/5);
		//System.out.println(sup);
		
	}

}
