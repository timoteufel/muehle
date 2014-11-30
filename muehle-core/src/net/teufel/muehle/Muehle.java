package net.teufel.muehle;

import java.util.Scanner;

public class Muehle {

	public static void main(String[] args) {
		int z = 1;
		int zahl = 0;
		boolean run = true;
		int zaehler = 0;
		Muehlefeld spielfeld = CoordinateUtil.erzeugeSpiel();

		// for (Field field : spielfeld.getFields()) {
		// System.out.println(field.toString());
		// }

		// int x;
		// int y;
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Geben sie die X-koordinate ein:");
		// x = scan.nextInt();
		// System.out.println("Geben sie die Y-koordinate ein:");
		// y = scan.nextInt();
		// scan.close();

		// System.out.println(CoordinateUtil.checkCoordinate(x,y));
		// System.out.println(CoordinateUtil.nextCoordinates(x,y));
		CoordinateUtil.anzeige(spielfeld);
		while (run) {
			boolean aktiv = true;
			boolean korrekt = true;
			int x1 = 0;
			int y1 = 0;
			int x2 = 0;
			int y2 = 0;
			Scanner scan = new Scanner(System.in);

			if (zaehler != 18) {

				while (aktiv) {
					System.out.println("Feldx:");
					x1 = scan.nextInt();
					if(x1 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						zaehler = zaehler - 1;
						break;
					}
					System.out.println("Feldy:");
					y1 = scan.nextInt();
					if(y1 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						zaehler = zaehler - 1;
						break;
					}
					if (CoordinateUtil.bewegung1bestaetigung(x1, y1, spielfeld)) {
						aktiv = false;
						spielfeld.getField(x1, y1).setZustand(z);
						CoordinateUtil.anzeige(spielfeld);
					} else {
						System.out.println("Nicht moeglich");
					}
				}
					spielfeld = CoordinateUtil.muehle(spielfeld, z);
				
				zaehler = zaehler + 1;
			}

			if (spielfeld.countField(z) == 3 && zaehler == 18) {
				while (aktiv) {
					System.out.println("Feldx1:");
					x1 = scan.nextInt();
					if(x1 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						break;
					}
					System.out.println("Feldy1:");
					y1 = scan.nextInt();
					if(y1 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						break;
					}
					System.out.println("Feldx2:");
					x2 = scan.nextInt();
					if(x2 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						break;
					}
					System.out.println("Feldy2:");
					y2 = scan.nextInt();
					if(y2 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						break;
					}
					if (CoordinateUtil.bewegung3bestaetigung(x1, y1, x2, y2,
							spielfeld, z)) {
						aktiv = false;
						spielfeld.getField(x1, y1).setZustand(0);
						spielfeld.getField(x1, y1).setWarMuehle(false);
						spielfeld.getField(x2, y2).setZustand(z);
						CoordinateUtil.anzeige(spielfeld);
					} else {
						System.out.println("Nicht moeglich");
					}
				}
					spielfeld = CoordinateUtil.muehle(spielfeld, z);
		
			}

			if (spielfeld.countField(z) > 3 && zaehler == 18) {
				while (aktiv) {
					System.out.println("Feldx1:");
					x1 = scan.nextInt();
					if(x1 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						break;
					}
					System.out.println("Feldy1:");
					y1 = scan.nextInt();
					if(y1 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						break;
					}
					System.out.println("Feldx2:");
					x2 = scan.nextInt();
					if(x2 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						break;
					}
					System.out.println("Feldy2:");
					y2 = scan.nextInt();
					if(y2 == 666) {
						System.out.println(7);
						System.out.println(6);
						System.out.println(5);
						System.out.println(4);
						System.out.println(3);
						System.out.println(2);
						System.out.println("1 2 3 4 5 6 7");
						korrekt = false;
						break;
					}
					if (CoordinateUtil.nextCoordinates(x1, y1, x2, y2,
							spielfeld, z)) {
						aktiv = false;
						spielfeld.getField(x1, y1).setZustand(0);
						spielfeld.getField(x1, y1).setWarMuehle(false);
						spielfeld.getField(x2, y2).setZustand(z);
						CoordinateUtil.anzeige(spielfeld);
					} else {
						System.out.println("Nicht moeglich");
					}
				}
					spielfeld = CoordinateUtil.muehle(spielfeld, z);
					zahl++;
					if(zahl == 3){
						x1 = 0;		
					}
						
			}

			if (z == 1 && korrekt) {
				z = 2;
				korrekt = false;
			}

			if (z == 2 && korrekt) {
				z = 1;
				korrekt = false;
			}
			if (zaehler == 18) {
				if (spielfeld.countField(1) < 3) {
					run = false;
					System.out.println("Spieler 2 hat gewonnen");
				}
				if (spielfeld.countField(2) < 3) {
					run = false;
					System.out.println("Spieler 1 hat gewonnen");
				}
			}
		}
	}

}
