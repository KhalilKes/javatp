package Point;

import java.util.Scanner;

public class Repere {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Create a point in the landmark !!");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		try {
			Point A = new Point(x,y);
			System.out.println("move your Point in the landmark using z s q or d");
			while(true) {
				String move = sc.next();
				switch(move) {
					case "d" :
						A.moveR();
						System.out.println( "(" + A.getX() +  "," + A.getY() + ")" );
						break;
					case "q":
						A.moveL();
						System.out.println( "(" + A.getX() +  "," + A.getY() + ")" );
						break;
					case "z":
						A.moveU();
						System.out.println( "(" + A.getX() +  "," + A.getY() + ")" );
						break;
					case "s":
						A.moveB();
						System.out.println( "(" + A.getX() +  "," + A.getY() + ")" );
						break;
					default:
						System.out.println("enter a valid input plz");
									
				}
					
						
			}
		}catch(PointException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
