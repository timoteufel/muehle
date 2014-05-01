package net.teufel.muehle;

import java.util.ArrayList;
import java.util.List;

public class CoordinateUtil {

	public static Muehlefeld erzeugeSpiel() {
		
		int x = 1;
		int y = 1;
		int adder = 3;
		boolean flag = true;
		Muehlefeld spiel = new Muehlefeld();
		for (int i = 0; i < 24; i++) {
			flag = true;
			spiel.addField(new Field(x, y, Muehlefeld.NICHT_BESETZT));

			if (x == 7 && y == 1) {
				x = 2;
				y = 2;
				adder = 2;
				flag = false;
			}
			if (x == 6 && y == 2) {
				x = 3;
				y = 3;
				adder = 1;
				flag = false;
			}
			if (x == 5 && y == 3) {
				x = 3;
				y = 5;
				adder = 1;
				flag = false;
			}
			if (x == 5 && y == 5) {
				x = 2;
				y = 6;
				adder = 2;
				flag = false;
			}
			if (x == 6 && y == 6) {
				x = 1;
				y = 7;
				adder = 3;
				flag = false;
			}
			if (x == 7 && y == 7) {
				x = 1;
				y = 4;
				adder = 1;
				flag = false;
			}
			if (x == 3 && y == 4) {
				x = 5;
				y = 4;
				adder = 1;
				flag = false;
			}
			if (flag) {
				x = x + adder;
			}
		}

		return spiel;
	}

	public static String checkCoordinate(int x, int y) {
		String ret = "";
		if (x > 4)
			ret = "rechts";
		if (x < 4)
			ret = "links";
		if (x == 4)
			ret = "mitte";
		if (x > 7)
			return ret = " Falsche Eingabe";
		if (x < 1)
			return ret = " Falsche Eingabe";
		if (y > 4)
			ret = ret + " oben";
		if (y < 4)
			ret = ret + " unten";
		if (y == 4)
			ret = ret + " mitte";
		if (y > 7)
			return ret = " Falsche Eingabe";
		if (y < 1)
			return ret = " Falsche Eingabe";
		if (x == 1)
			return ret = ret + " Ring 1";
		if (x == 2)
			return ret = ret + " Ring 2";
		if (x == 3)
			return ret = ret + " Ring 3";
		if (x == 5)
			return ret = ret + " Ring 3";
		if (x == 6)
			return ret = ret + " Ring 2";
		if (x == 7)
			return ret = ret + " Ring 1";
		if (y == 1)
			return ret = ret + " Ring 1";
		if (y == 2)
			return ret = ret + " Ring 2";
		if (y == 3)
			return ret = ret + " Ring 3";
		if (y == 5)
			return ret = ret + " Ring 3";
		if (y == 6)
			return ret = ret + " Ring 2";
		if (y == 7)
			return ret = ret + " Ring 1";

		return ret;
	}

	public static String nextCoordinates(int x, int y) {
		String nextCoordinats = "";
		String Coordinate1 = "";
		String Coordinate2 = "";
		String Coordinate3 = "-1";
		String Coordinate4 = "-1";
		int zO = 0;
		if (x == 1)
			zO = 3;
		if (x == 2)
			zO = 2;
		if (x == 3)
			zO = 1;
		if (x == 5)
			zO = 1;
		if (x == 6)
			zO = 2;
		if (x == 7)
			zO = 3;
		if (y == 1)
			zO = 3;
		if (y == 2)
			zO = 2;
		if (y == 3)
			zO = 1;
		if (y == 5)
			zO = 1;
		if (y == 6)
			zO = 2;
		if (y == 7)
			zO = 3;

		if (x > 4)
			Coordinate1 = (x - zO) + "/" + y;
		if (x < 4)
			Coordinate1 = (x + zO) + "/" + y;
		if (y > 4)
			Coordinate2 = x + "/" + (y - zO);
		if (y < 4)
			Coordinate2 = x + "/" + (y + zO); // Berechnung fuer Ecken

		if (x == 4 & y == 1) {
			Coordinate1 = "7/1";
			Coordinate2 = "1/1";
			Coordinate3 = "4/1";
		}
		if (x == 4 & y == 2) {
			Coordinate1 = "6/2";
			Coordinate2 = "2/2";
			Coordinate3 = "4/1";
			Coordinate4 = "4/3";
		}
		if (x == 4 & y == 3) {
			Coordinate1 = "5/3";
			Coordinate2 = "3/3";
			Coordinate3 = "4/2";
		}
		if (x == 4 & y == 5) {
			Coordinate1 = "3/5";
			Coordinate2 = "5/5";
			Coordinate3 = "4/6";
		}
		if (x == 4 & y == 6) {
			Coordinate1 = "6/6";
			Coordinate2 = "2/6";
			Coordinate3 = "4/5";
			Coordinate4 = "4/7";
		}
		if (x == 4 & y == 7) {
			Coordinate1 = "7/7";
			Coordinate2 = "1/7";
			Coordinate3 = "4/6";
		}
		if (y == 4 & x == 1) {
			Coordinate1 = "1/1";
			Coordinate2 = "1/7";
			Coordinate3 = "2/4";
		}
		if (y == 4 & x == 2) {
			Coordinate1 = "2/6";
			Coordinate2 = "2/2";
			Coordinate3 = "3/4";
			Coordinate4 = "1/4";
		}
		if (y == 4 & x == 3) {
			Coordinate1 = "3/3";
			Coordinate2 = "3/5";
			Coordinate3 = "2/4";
		}
		if (y == 4 & x == 5) {
			Coordinate1 = "5/5";
			Coordinate2 = "5/3";
			Coordinate3 = "6/4";
		}
		if (y == 4 & x == 6) {
			Coordinate1 = "6/2";
			Coordinate2 = "6/6";
			Coordinate3 = "5/4";
			Coordinate4 = "7/4";
		}
		if (y == 4 & x == 7) {
			Coordinate1 = "7/7";
			Coordinate2 = "7/1";
			Coordinate3 = "6/4";
		}

		nextCoordinats = Coordinate1 + "," + Coordinate2 + "," + Coordinate3
				+ "," + Coordinate4;
		return nextCoordinats;
	}
	public static void muehle(Muehlefeld muehlefeld, int z){
		Field feld1 = new Field(1, 1, Muehlefeld.NICHT_BESETZT);
		Field feld2 = new Field(1, 1, Muehlefeld.NICHT_BESETZT);
		Field feld3 = new Field(1, 1, Muehlefeld.NICHT_BESETZT);
		int x = 1;
		int y = 1;
		int adder = 3;
		int zähler = 1;
		boolean coor1 = false;
		boolean coor2 = false;
		boolean coor3 = false;
		boolean flag = true;
		boolean eins = true;
		
	for (int i = 0; i < 48; i++) {
	if(eins){
		flag = true;
		if (zähler == 1 && muehlefeld.getField(x, y).getZustand() == z) {
			coor1 = true;
			feld1 = muehlefeld.getField(x, y);
		}
		if (zähler == 2 && muehlefeld.getField(x, y).getZustand() == z) {
			coor2 = true;
			feld2 = muehlefeld.getField(x, y);
		}
		if (zähler == 3 && muehlefeld.getField(x, y).getZustand() == z) {
			coor3 = true;
			feld3 = muehlefeld.getField(x, y);
		}
		if (x == 7 && y == 1) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						x = x - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 2;
			y = 2;
			adder = 2;
			zähler = 1;
			flag = false;
		}
		
		if (x == 6 && y == 2) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						x = x - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 3;
			y = 3;
			adder = 1;
			zähler = 1;
			flag = false;
		}
		if (x == 5 && y == 3) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						x = x - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 3;
			y = 5;
			adder = 1;
			zähler = 1;
			flag = false;
		}
		if (x == 5 && y == 5) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						x = x - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 2;
			y = 6;
			adder = 2;
			zähler = 1;
			flag = false;
		}
		if (x == 6 && y == 6) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						x = x - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 1;
			y = 7;
			adder = 3;
			zähler = 1;
			flag = false;
		}
		if (x == 7 && y == 7) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						x = x - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 1;
			y = 4;
			adder = 1;
			zähler = 1;
			flag = false;
		}
		if (x == 3 && y == 4) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						x = x - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 5;
			y = 4;
			adder = 1;
			zähler = 1;
			flag = false;
		}	
		if (x == 7 && y == 4) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						x = x - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 1;
			y = 1;
			adder = 3;
			zähler = 1;
			flag = false;
			eins = false;
		}
		if (flag) {
			x = x + adder;
		}
	}
	else {
		flag = true;
		if (zähler == 1 && muehlefeld.getField(x, y).getZustand() == z) {
			coor1 = true;
			feld1 = muehlefeld.getField(x, y);
		}
		if (zähler == 2 && muehlefeld.getField(x, y).getZustand() == z) {
			coor2 = true;
			feld2 = muehlefeld.getField(x, y);
		}
		if (zähler == 3 && muehlefeld.getField(x, y).getZustand() == z) {
			coor3 = true;
			feld3 = muehlefeld.getField(x, y);
		}
		if (x == 1 && y == 7) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						y = y - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 2;
			y = 2;
			adder = 2;
			zähler = 1;
			flag = false;
		}
		
		if (x == 2 && y == 6) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						y = y - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 3;
			y = 3;
			adder = 1;
			zähler = 1;
			flag = false;
		}
		if (x == 3 && y == 5) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						y = y - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 5;
			y = 3;
			adder = 1;
			zähler = 1;
			flag = false;
		}
		if (x == 5 && y == 5) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						y = y - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 6;
			y = 2;
			adder = 2;
			zähler = 1;
			flag = false;
		}
		if (x == 6 && y == 6) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						y = y - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 7;
			y = 1;
			adder = 3;
			zähler = 1;
			flag = false;
		}
		if (x == 7 && y == 7) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						y = y - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 4;
			y = 1;
			adder = 1;
			zähler = 1;
			flag = false;
		}
		if (x == 4 && y == 3) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						y = y - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
			coor1 = false;
			coor2 = false;
			coor3 = false;
			x = 4;
			y = 5;
			adder = 1;
			zähler = 1;
			flag = false;
		}	
		if (x == 7 && y == 4) {
			if(coor1 && coor2 && coor3){
				if (feld1.isWarMuehle() && feld2.isWarMuehle() && feld3.isWarMuehle()) {
					
				} else {
					for (int j = 0; j < 3; j++) {
						muehlefeld.getField(x, y).setWarMuehle(true);
						y = y - adder;
					}
					System.out.println("Spieler" + z + "hat eine Muehle");
					//wegMethode
				}
			}
		}
		if (flag) {
			y = y + adder;
		}
	}
	}
	}
	
}
