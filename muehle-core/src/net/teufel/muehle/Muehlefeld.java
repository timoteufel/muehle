package net.teufel.muehle;

import java.util.ArrayList;
import java.util.List;

public class Muehlefeld {
	
	public final static int NICHT_BESETZT = 0;
	public final static int WEISS = 1;
	public final static int SCHWARZ = 2;
	
	private List <Field> fields = new ArrayList<Field>();

	public List<Field> getFields() {
		return fields;
	}

	public void addField(Field field) {
		this.fields.add(field);
	}
	public Field getField(int x, int y){
		Field feld = null;
		for (Field field : fields) {
			if(x == field.getx() && y == field.gety()){
			feld = field;
			}
		}
		return feld;
	}
	
}
