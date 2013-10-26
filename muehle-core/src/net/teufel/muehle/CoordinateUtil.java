package net.teufel.muehle;

public class CoordinateUtil {
	
	public static String checkCoordinate(int x, int y) {
		String ret = "";
		if(x > 4)
			ret = " rechts";
		if(x < 4)
			ret = " links";
		if(x == 4)
			ret = " mitte";
		if(y > 4)
			ret = ret + " oben";
		if(y < 4)
			ret = ret + " unten";
		if(y == 4)
			ret = ret + " mitte";
		return ret;
	}
	
}
