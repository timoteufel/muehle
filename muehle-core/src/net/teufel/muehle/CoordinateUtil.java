package net.teufel.muehle;

public class CoordinateUtil {

	
	public static CoordinateSystem erzeugeSpiel() {
		
		CoordinateSystem spiel = new CoordinateSystem();
		
		spiel.addField(new Field (1,1, CoordinateSystem.NICHT_BESETZT) );
		
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
	public static String nextCoordinates(int x,int y){
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
		
		if(x > 4)
			Coordinate1 = (x - zO) + "/" + y;
		if(x < 4)
			Coordinate1 = (x + zO) + "/" + y;
		if(y > 4)
			Coordinate2 = x + "/" + (y - zO);
		if(y < 4)
			Coordinate2 = x + "/" + (y + zO);	//Berechnung fuer Ecken
		
		if(x == 4 & y == 1)
			{
			Coordinate1 = "7/1";
			Coordinate2 = "1/1";
			Coordinate3 = "4/1";
			}
		if(x == 4 & y == 2)
			{
			Coordinate1 = "6/2";
			Coordinate2 = "2/2";
			Coordinate3 = "4/1";
			Coordinate4 = "4/3";
			}
		if(x == 4 & y == 3)
			{
			Coordinate1 = "5/3";
			Coordinate2 = "3/3";
			Coordinate3 = "4/2";
			}
		if(x == 4 & y == 5)
			{
			Coordinate1 = "3/5";
			Coordinate2 = "5/5";
			Coordinate3 = "4/6";
			}
		if(x == 4 & y == 6)
			{
			Coordinate1 = "6/6";
			Coordinate2 = "2/6";
			Coordinate3 = "4/5";
			Coordinate4 = "4/7";
			}
		if(x == 4 & y == 7)
			{
			Coordinate1 = "7/7";
			Coordinate2 = "1/7";
			Coordinate3 = "4/6";
			}
		if(y == 4 & x == 1)
			{
			Coordinate1 = "1/1";
			Coordinate2 = "1/7";
			Coordinate3 = "2/4";
			}
		if(y == 4 & x == 2)
			{
			Coordinate1 = "2/6";
			Coordinate2 = "2/2";
			Coordinate3 = "3/4";
			Coordinate4 = "1/4";
			}
		if(y == 4 & x == 3)
			{
			Coordinate1 = "3/3";
			Coordinate2 = "3/5";
			Coordinate3 = "2/4";
			}
		if(y == 4 & x == 5)
			{
			Coordinate1 = "5/5";
			Coordinate2 = "5/3";
			Coordinate3 = "6/4";
			}
		if(y == 4 & x == 6)
			{
			Coordinate1 = "6/2";
			Coordinate2 = "6/6";
			Coordinate3 = "5/4";
			Coordinate4 = "7/4";
			}
		if(y == 4 & x == 7)
			{
			Coordinate1 = "7/7";
			Coordinate2 = "7/1";
			Coordinate3 = "6/4";
			}

		nextCoordinats = Coordinate1 + "," + Coordinate2 + "," + Coordinate3 + "," +Coordinate4;
		return nextCoordinats;
	}
}
