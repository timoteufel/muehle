package net.teufel.muehle;

public class Stone {
	private String colour = "";
	private String positionS = "";
	public String getColour() {
		return colour;
	}
	public void setColour(int c) {
		if(c == 1)
			this.colour = "White";
		if(c == 2)
			this.colour = "Black";
	}
	
	public String getPosition() {
		return positionS;
	}
	public void setPosition(String position) {
		positionS = position;
	}

}
