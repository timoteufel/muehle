package net.teufel.muehle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

	public static Boolean bewegung1bestaetigung(int x, int y,
			Muehlefeld muehlefeld) {
		boolean ret = false;
		if (muehlefeld.checkField(x, y)) {
			if (muehlefeld.getField(x, y).getZustand() == 0) {
				ret = true;
			}
		}
		return ret;
	}

	public static Boolean nextCoordinates(int x1, int y1, int x2, int y2,
			Muehlefeld muehlefeld, int s) {
		String Coordinate1 = "";
		String Coordinate2 = "";
		String Coordinate3 = "-1";
		String Coordinate4 = "-1";
		boolean ret = false;
		int zO = 0;
		if (muehlefeld.checkField(x1, y1)) {
			if (muehlefeld.checkField(x2, y2)) {
				if (muehlefeld.getField(x1, y1).getZustand() == s) {
					if (muehlefeld.getField(x2, y2).getZustand() == 0) {

						if (x1 == 1)
							zO = 3;
						if (x1 == 2)
							zO = 2;
						if (x1 == 3)
							zO = 1;
						if (x1 == 5)
							zO = 1;
						if (x1 == 6)
							zO = 2;
						if (x1 == 7)
							zO = 3;
						if (y1 == 1)
							zO = 3;
						if (y1 == 2)
							zO = 2;
						if (y1 == 3)
							zO = 1;
						if (y1 == 5)
							zO = 1;
						if (y1 == 6)
							zO = 2;
						if (y1 == 7)
							zO = 3;

						if (x1 > 4)
							Coordinate1 = (x1 - zO) + "/" + y1;
						if (x1 < 4)
							Coordinate1 = (x1 + zO) + "/" + y1;
						if (y1 > 4)
							Coordinate2 = x1 + "/" + (y1 - zO);
						if (y1 < 4)
							Coordinate2 = x1 + "/" + (y1 + zO); // Berechnung
																// fuer Ecken

						if (x1 == 4 & y1 == 1) {
							Coordinate1 = "7/1";
							Coordinate2 = "1/1";
							Coordinate3 = "4/2";
						}
						if (x1 == 4 & y1 == 2) {
							Coordinate1 = "6/2";
							Coordinate2 = "2/2";
							Coordinate3 = "4/1";
							Coordinate4 = "4/3";
						}
						if (x1 == 4 & y1 == 3) {
							Coordinate1 = "5/3";
							Coordinate2 = "3/3";
							Coordinate3 = "4/2";
						}
						if (x1 == 4 & y1 == 5) {
							Coordinate1 = "3/5";
							Coordinate2 = "5/5";
							Coordinate3 = "4/6";
						}
						if (x1 == 4 & y1 == 6) {
							Coordinate1 = "6/6";
							Coordinate2 = "2/6";
							Coordinate3 = "4/5";
							Coordinate4 = "4/7";
						}
						if (x1 == 4 & y1 == 7) {
							Coordinate1 = "7/7";
							Coordinate2 = "1/7";
							Coordinate3 = "4/6";
						}
						if (y1 == 4 & x1 == 1) {
							Coordinate1 = "1/1";
							Coordinate2 = "1/7";
							Coordinate3 = "2/4";
						}
						if (y1 == 4 & x1 == 2) {
							Coordinate1 = "2/6";
							Coordinate2 = "2/2";
							Coordinate3 = "3/4";
							Coordinate4 = "1/4";
						}
						if (y1 == 4 & x1 == 3) {
							Coordinate1 = "3/3";
							Coordinate2 = "3/5";
							Coordinate3 = "2/4";
						}
						if (y1 == 4 & x1 == 5) {
							Coordinate1 = "5/5";
							Coordinate2 = "5/3";
							Coordinate3 = "6/4";
						}
						if (y1 == 4 & x1 == 6) {
							Coordinate1 = "6/2";
							Coordinate2 = "6/6";
							Coordinate3 = "5/4";
							Coordinate4 = "7/4";
						}
						if (y1 == 4 & x1 == 7) {
							Coordinate1 = "7/7";
							Coordinate2 = "7/1";
							Coordinate3 = "6/4";
						}
						if (Coordinate1.equals(x2 + "/" + y2)) {
							ret = true;
						}
						if (Coordinate2.equals(x2 + "/" + y2)) {
							ret = true;
						}
						if (Coordinate3.equals(x2 + "/" + y2)) {
							ret = true;
						}
						if (Coordinate4.equals(x2 + "/" + y2)) {
							ret = true;
						}
					}
				}
			}
		}
		return ret;
	}

	public static Boolean bewegung3bestaetigung(int x1, int y1, int x2, int y2,
			Muehlefeld muehlefeld, int s) {
		boolean ret = false;
		if (muehlefeld.checkField(x1, y1)) {
			if (muehlefeld.checkField(x2, y2)) {
				if (muehlefeld.getField(x1, y1).getZustand() == s) {
					if (muehlefeld.getField(x2, y2).getZustand() == 0) {
						ret = true;
					}
				}
			}
		}
		return ret;
	}

	public static Muehlefeld muehle(Muehlefeld muehlefeld, int z) {
		Field feld1 = new Field(1, 1, Muehlefeld.NICHT_BESETZT);
		Field feld2 = new Field(1, 1, Muehlefeld.NICHT_BESETZT);
		Field feld3 = new Field(1, 1, Muehlefeld.NICHT_BESETZT);
		int x = 1;
		int y = 1;
		int adder = 3;
		int zaehler = 1;
		boolean coor1 = false;
		boolean coor2 = false;
		boolean coor3 = false;
		boolean flag = true;
		boolean eins = true;
		boolean korrekt = false;
		int x1 = 0;
		int y1 = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 48; i++) {
			if (eins) {
				flag = true;
				if (zaehler == 1 && muehlefeld.getField(x, y).getZustand() == z) {
					coor1 = true;
					feld1 = muehlefeld.getField(x, y);
				}
				if (zaehler == 2 && muehlefeld.getField(x, y).getZustand() == z) {
					coor2 = true;
					feld2 = muehlefeld.getField(x, y);
				}
				if (zaehler == 3 && muehlefeld.getField(x, y).getZustand() == z) {
					coor3 = true;
					feld3 = muehlefeld.getField(x, y);
				}
				if (x == 7 && y == 1) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								x = x - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 2;
					y = 2;
					adder = 2;
					zaehler = 1;
					flag = false;
				}

				if (x == 6 && y == 2) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								x = x - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 3;
					y = 3;
					adder = 1;
					zaehler = 1;
					flag = false;
				}
				if (x == 5 && y == 3) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								x = x - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 3;
					y = 5;
					adder = 1;
					zaehler = 1;
					flag = false;
				}
				if (x == 5 && y == 5) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								x = x - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 2;
					y = 6;
					adder = 2;
					zaehler = 1;
					flag = false;
				}
				if (x == 6 && y == 6) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								x = x - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 1;
					y = 7;
					adder = 3;
					zaehler = 1;
					flag = false;
				}
				if (x == 7 && y == 7) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								x = x - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 1;
					y = 4;
					adder = 1;
					zaehler = 1;
					flag = false;
				}
				if (x == 3 && y == 4) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								x = x - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}

						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 5;
					y = 4;
					adder = 1;
					zaehler = 1;
					flag = false;
				}
				if (x == 7 && y == 4) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								x = x - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 1;
					y = 1;
					adder = 3;
					zaehler = 1;
					flag = false;
					eins = false;
				}
				if (flag) {
					x = x + adder;
					zaehler = zaehler + 1;
				}
			} else {
				flag = true;
				if (zaehler == 1 && muehlefeld.getField(x, y).getZustand() == z) {
					coor1 = true;
					feld1 = muehlefeld.getField(x, y);
				}
				if (zaehler == 2 && muehlefeld.getField(x, y).getZustand() == z) {
					coor2 = true;
					feld2 = muehlefeld.getField(x, y);
				}
				if (zaehler == 3 && muehlefeld.getField(x, y).getZustand() == z) {
					coor3 = true;
					feld3 = muehlefeld.getField(x, y);
				}
				if (x == 1 && y == 7) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								y = y - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 2;
					y = 2;
					adder = 2;
					zaehler = 1;
					flag = false;
				}

				if (x == 2 && y == 6) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								y = y - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 3;
					y = 3;
					adder = 1;
					zaehler = 1;
					flag = false;
				}
				if (x == 3 && y == 5) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								y = y - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 5;
					y = 3;
					adder = 1;
					zaehler = 1;
					flag = false;
				}
				if (x == 5 && y == 5) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								y = y - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 6;
					y = 2;
					adder = 2;
					zaehler = 1;
					flag = false;
				}
				if (x == 6 && y == 6) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								y = y - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 7;
					y = 1;
					adder = 3;
					zaehler = 1;
					flag = false;
				}
				if (x == 7 && y == 7) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								y = y - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 4;
					y = 1;
					adder = 1;
					zaehler = 1;
					flag = false;
				}
				if (x == 4 && y == 3) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								y = y - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
					coor1 = false;
					coor2 = false;
					coor3 = false;
					x = 4;
					y = 5;
					adder = 1;
					zaehler = 1;
					flag = false;
				}
				if (x == 4 && y == 7) {
					if (coor1 && coor2 && coor3) {
						if (feld1.isWarMuehle() && feld2.isWarMuehle()
								&& feld3.isWarMuehle()) {

						} else {
							for (int j = 0; j < 2; j++) {
								muehlefeld.getField(x, y).setWarMuehle(true);
								y = y - adder;
							}
							System.out.println("Spieler" + z
									+ "hat eine Muehle");
							korrekt = true;
							while (korrekt) {
								System.out.println("Feldx1:");
								x1 = scan.nextInt();
								System.out.println("Feldy1:");
								y1 = scan.nextInt();
								if (muehlefeld.checkField(x1, y1)) {
									if (muehlefeld.getField(x1, y1).getZustand() != 0
											&& muehlefeld.getField(x1, y1).getZustand() != z) {
										korrekt = false;
										muehlefeld.getField(x1, y1).setZustand(0);
										CoordinateUtil.anzeige(muehlefeld);
									}
								}
							}
						}
					}
				}
				if (flag) {
					y = y + adder;
					zaehler = zaehler + 1;
				}
			}
		}
		return muehlefeld;
	}

	public static void anzeige(Muehlefeld muehlefeld) {
		String position1 = "";
		String position2 = "";
		String position3 = "";
		String position4 = "";
		String position5 = "";
		String position6 = "";
		int zustand;
		for (int i = 0; i < 7; i++) {
			if (i == 0) {
				zustand = muehlefeld.getField(1, 7).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position1 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position1 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position1 = "O";
				}
				zustand = muehlefeld.getField(4, 7).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position2 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position2 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position2 = "O";
				}
				zustand = muehlefeld.getField(7, 7).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position3 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position3 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position3 = "O";
				}
				System.out.println(position1 + "--------" + position2
						+ "--------" + position3);
				System.out.println("I        I        I");
			}
			if (i == 1) {
				zustand = muehlefeld.getField(2, 6).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position1 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position1 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position1 = "O";
				}
				zustand = muehlefeld.getField(4, 6).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position2 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position2 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position2 = "O";
				}
				zustand = muehlefeld.getField(6, 6).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position3 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position3 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position3 = "O";
				}
				System.out.println("I  " + position1 + "-----" + position2
						+ "-----" + position3 + "  I");
				System.out.println("I  I     I     I  I");
			}
			if (i == 2) {
				zustand = muehlefeld.getField(3, 5).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position1 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position1 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position1 = "O";
				}
				zustand = muehlefeld.getField(4, 5).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position2 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position2 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position2 = "O";
				}
				zustand = muehlefeld.getField(5, 5).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position3 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position3 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position3 = "O";
				}
				System.out.println("I  I  " + position1 + "--" + position2
						+ "--" + position3 + "  I  I");
				System.out.println("I  I  I     I  I  I");
			}
			if (i == 3) {
				zustand = muehlefeld.getField(1, 4).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position1 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position1 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position1 = "O";
				}
				zustand = muehlefeld.getField(2, 4).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position2 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position2 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position2 = "O";
				}
				zustand = muehlefeld.getField(3, 4).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position3 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position3 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position3 = "O";
				}
				zustand = muehlefeld.getField(5, 4).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position4 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position4 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position4 = "O";
				}
				zustand = muehlefeld.getField(6, 4).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position5 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position5 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position5 = "O";
				}
				zustand = muehlefeld.getField(7, 4).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position6 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position6 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position6 = "O";
				}
				System.out.println(position1 + "--" + position2 + "--"
						+ position3 + "     " + position4 + "--" + position5
						+ "--" + position6);
				System.out.println("I  I  I     I  I  I");
			}
			if (i == 4) {
				zustand = muehlefeld.getField(3, 3).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position1 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position1 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position1 = "O";
				}
				zustand = muehlefeld.getField(4, 3).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position2 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position2 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position2 = "O";
				}
				zustand = muehlefeld.getField(5, 3).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position3 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position3 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position3 = "O";
				}
				System.out.println("I  I  " + position1 + "--" + position2
						+ "--" + position3 + "  I  I");
				System.out.println("I  I     I     I  I");
			}
			if (i == 5) {
				zustand = muehlefeld.getField(2, 2).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position1 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position1 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position1 = "O";
				}
				zustand = muehlefeld.getField(4, 2).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position2 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position2 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position2 = "O";
				}
				zustand = muehlefeld.getField(6, 2).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position3 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position3 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position3 = "O";
				}
				System.out.println("I  " + position1 + "-----" + position2
						+ "-----" + position3 + "  I");
				System.out.println("I        I        I");
			}
			if (i == 6) {
				zustand = muehlefeld.getField(1, 1).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position1 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position1 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position1 = "O";
				}
				zustand = muehlefeld.getField(4, 1).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position2 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position2 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position2 = "O";
				}
				zustand = muehlefeld.getField(7, 1).getZustand();
				if (zustand == Muehlefeld.WEISS) {
					position3 = "W";
				}
				if (zustand == Muehlefeld.SCHWARZ) {
					position3 = "S";
				}
				if (zustand == Muehlefeld.NICHT_BESETZT) {
					position3 = "O";
				}
				System.out.println(position1 + "--------" + position2
						+ "--------" + position3);
			}

		}
	}
}
