package net.teufel.muehle;

import java.util.ArrayList;
import java.util.List;

public class CoordinateSystem {
	
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
	
	
}
