package net.teufel.muehle;

import java.util.Scanner;

public class Muehle {

	public static void main(String[] args){
		boolean run = true;

		Muehlefeld spielfeld = CoordinateUtil.erzeugeSpiel();
	
		//for (Field field : spielfeld.getFields()) {
		//	System.out.println(field.toString());
		//}
		
		//int x;
		//int y;
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Geben sie die X-koordinate ein:");
		//x = scan.nextInt();
		//System.out.println("Geben sie die Y-koordinate ein:");
		//y = scan.nextInt();
		//scan.close();
			
		//System.out.println(CoordinateUtil.checkCoordinate(x,y));
		//System.out.println(CoordinateUtil.nextCoordinates(x,y));
		while(run){
		int x = 0;
		int y = 0;
		int z = 0;
		String eingabe = "";
		Scanner scan = new Scanner(System.in);
		eingabe = scan.next();
		if(eingabe.equals("anzeige")){
		CoordinateUtil.anzeige(spielfeld);
		}
		if (eingabe.equals("setField")) {
			System.out.println("Feldx:");
			x = scan.nextInt();
			System.out.println("Feldy:");
			y = scan.nextInt();
			System.out.println("FeldZustand(0 - 2):");
			z = scan.nextInt();
			spielfeld.getField(x, y).setZustand(z);
		}
		if(eingabe.equals("close")){
			run = false;
		}
		}
	}

	
}
