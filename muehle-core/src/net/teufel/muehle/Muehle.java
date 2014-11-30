package net.teufel.muehle;

import java.util.Scanner;

public class Muehle {

	public static void main(String[] args) {
		int z = 1;
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

			if (zaehler != 6) {

				while (aktiv) {
					System.out.println("Feldx:");
					x1 = scan.nextInt();
					System.out.println("Feldy:");
					y1 = scan.nextInt();
					if (CoordinateUtil.bewegung1bestaetigung(x1, y1, spielfeld)) {
						aktiv = false;
						spielfeld.getField(x1, y1).setZustand(z);
						CoordinateUtil.anzeige(spielfeld);
					} else {
						System.out.println("Nicht m�glich");
					}
				}
				if (spielfeld != CoordinateUtil.muehle(spielfeld, z)) {
					aktiv = true;
					spielfeld = CoordinateUtil.muehle(spielfeld, z);
					while (aktiv) {
						System.out.println("Feldx1:");
						x1 = scan.nextInt();
						System.out.println("Feldy1:");
						y1 = scan.nextInt();
						if (spielfeld.checkField(x1, y1)) {
							if (spielfeld.getField(x1, y1).getZustand() != 0
									&& spielfeld.getField(x1, y1).getZustand() != z) {

								spielfeld.getField(x1, y1).setZustand(0);
								CoordinateUtil.anzeige(spielfeld);
							}
						}
					}
				}
				zaehler = zaehler + 1;
			}

			if (spielfeld.countField(z) == 3) {
				while (aktiv) {
					System.out.println("Feldx1:");
					x1 = scan.nextInt();
					System.out.println("Feldy1:");
					y1 = scan.nextInt();
					System.out.println("Feldx2:");
					x1 = scan.nextInt();
					System.out.println("Feldy2:");
					y1 = scan.nextInt();
					if (CoordinateUtil.bewegung3bestaetigung(x1, y1, x2, y2,
							spielfeld, z)) {
						aktiv = false;
						spielfeld.getField(x1, y1).setZustand(0);
						spielfeld.getField(x2, y2).setZustand(z);
						CoordinateUtil.anzeige(spielfeld);
					} else {
						System.out.println("Nicht m�glich");
					}
				}
				if (spielfeld != CoordinateUtil.muehle(spielfeld, z)) {
					aktiv = true;
					spielfeld = CoordinateUtil.muehle(spielfeld, z);
					while (aktiv) {
						System.out.println("Feldx1:");
						x1 = scan.nextInt();
						System.out.println("Feldy1:");
						y1 = scan.nextInt();
						if (spielfeld.checkField(x1, y1)) {
							if (spielfeld.getField(x1, y1).getZustand() != 0
									&& spielfeld.getField(x1, y1).getZustand() != z) {

								spielfeld.getField(x1, y1).setZustand(0);
								CoordinateUtil.anzeige(spielfeld);
							}
						}
					}
				}
			}

			if (spielfeld.countField(z) > 3) {
				while (aktiv) {
					System.out.println("Feldx1:");
					x1 = scan.nextInt();
					System.out.println("Feldy1:");
					y1 = scan.nextInt();
					System.out.println("Feldx2:");
					x1 = scan.nextInt();
					System.out.println("Feldy2:");
					y1 = scan.nextInt();
					if (CoordinateUtil.nextCoordinates(x1, y1, x2, y2,
							spielfeld, z)) {
						aktiv = false;
						spielfeld.getField(x1, y1).setZustand(0);
						spielfeld.getField(x2, y2).setZustand(z);
						CoordinateUtil.anzeige(spielfeld);
					} else {
						System.out.println("Nicht m�glich");
					}
				}
				if (spielfeld != CoordinateUtil.muehle(spielfeld, z)) {
					aktiv = true;
					spielfeld = CoordinateUtil.muehle(spielfeld, z);
					while (aktiv) {
						System.out.println("Feldx1:");
						x1 = scan.nextInt();
						System.out.println("Feldy1:");
						y1 = scan.nextInt();
						if (spielfeld.checkField(x1, y1)) {
							if (spielfeld.getField(x1, y1).getZustand() != 0
									&& spielfeld.getField(x1, y1).getZustand() != z) {

								spielfeld.getField(x1, y1).setZustand(0);
								CoordinateUtil.anzeige(spielfeld);
							}
						}
					}
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
