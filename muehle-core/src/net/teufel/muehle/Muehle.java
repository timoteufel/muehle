package net.teufel.muehle;

import java.util.Scanner;

public class Muehle {

	public static void main(String[] args){


		Muehlefeld spielfeld = CoordinateUtil.erzeugeSpiel();
	
		for (Field field : spielfeld.getFields()) {
			System.out.println(field.toString());
		}
		
		int x;
		int y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben sie die X-koordinate ein:");
		x = scan.nextInt();
		System.out.println("Geben sie die Y-koordinate ein:");
		y = scan.nextInt();
		scan.close();
			
		System.out.println(CoordinateUtil.checkCoordinate(x,y));
		System.out.println(CoordinateUtil.nextCoordinates(x,y));
	
	
	}

	
}
