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
	
	public void setZustand(int zustand) {
		this.zustand = zustand;
	}
	
	public int getZustand() {
		return zustand;
	}
	
	@Override
	public String toString() {
		return "Position: " + x + "," + y;
	}
	
	public boolean istFeldBesetzt() {
		
		if (this.zustand != CoordinateSystem.NICHT_BESETZT)
			return true;
		return false;
		
	}
	
}