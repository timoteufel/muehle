package net.teufel.muehle;

import java.util.ArrayList;
import java.util.List;

public class CoordinateSystem {
	private List <Field> field = new ArrayList<Field>();

	public List<Field> getField() {
		return field;
	}

	public void setField(List<Field> field) {
		this.field = field;
	}
	
}
