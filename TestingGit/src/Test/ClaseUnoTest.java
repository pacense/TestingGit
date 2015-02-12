package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import Clases.ClaseUno;


public class ClaseUnoTest {

	@Test
	public void testSetPropiedadUno() {
		ClaseUno instancia = new ClaseUno();
		instancia.setPropiedadUno(7);
		assertEquals(7, instancia.getPropiedadUno());
	}

}
