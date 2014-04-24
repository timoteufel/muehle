package net.teufel.muehle.tests;

import static org.junit.Assert.*;
import net.teufel.muehle.CoordinateSystem;
import net.teufel.muehle.CoordinateUtil;
import net.teufel.muehle.Field;

import org.junit.Test;

public class CoordinatesTests {

	@Test 
	public void erzeugeSpielfeldTest() {
		
		CoordinateSystem spielfeld = CoordinateUtil.erzeugeSpiel();
		Field feld = new Field(2, 2, 0);
		assertEquals(24, spielfeld.getFields().size());
		assertEquals(feld.getZustand(), spielfeld.getField(2, 2).getZustand());	//Objekt
		assertEquals(feld.getx(), spielfeld.getField(2, 2).getx());
		assertEquals(feld.gety(), spielfeld.getField(2, 2).gety());
		
		
	}
	@Test
	public void test() {
		assertEquals("links unten Ring 1", CoordinateUtil.checkCoordinate(1, 1));
	}
	
	@Test
	public void test2() {
		assertEquals("links mitte Ring 1", CoordinateUtil.checkCoordinate(1, 4));
	}

	
	
}
