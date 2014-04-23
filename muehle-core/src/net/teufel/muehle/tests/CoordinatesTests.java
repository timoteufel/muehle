package net.teufel.muehle.tests;

import static org.junit.Assert.*;
import net.teufel.muehle.CoordinateSystem;
import net.teufel.muehle.CoordinateUtil;

import org.junit.Test;

public class CoordinatesTests {

	@Test 
	public void erzeugeSpielfeldTest() {
		
		CoordinateSystem spielfeld = CoordinateUtil.erzeugeSpiel();
		
		assertEquals(24, spielfeld.getFields().size());
		
		
		
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
