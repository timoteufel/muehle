package net.teufel.muehle;

public class Field {
	
	private int x;
	private int y;
	private int zustand;
	
	public Field(int x, int y, int zustand) {
		this.x = x;
		this.y = y;
		this.zustand = zustand;
	}
	
	public void setPositon(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int gety() {
		return y;
	}
	public int getx() {
		return x;
	}
	
	public void setZustand(int zustand) {
		this.zustand = zustand;
	}
	
	public int getZustand() {
		return zustand;
	}
	
	@Override
	public String toString() {
		String zustandText = "FREI";
		if (this.zustand==CoordinateSystem.SCHWARZ) {
			zustandText = "SCHWARZ";
		}
		if (this.zustand==CoordinateSystem.WEISS) {
			zustandText = "WEISS";
		}		
		return "Position: " + x + "," + y + " Zustand: " + zustandText;
	}
	
	public boolean istFeldBesetzt() {
		
		if (this.zustand != CoordinateSystem.NICHT_BESETZT)
			return true;
		return false;
		
	}
	
}