package unibe.edu.ec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PracticaTest {

	private Practica p1;
	
	@Before
	
	public void Before() {
		this.p1 = new Practica(7, 3);
	}
	@Test
	public void sumaNumeros() {
		assertEquals(10, this.p1.sumaNumeros());
	}

}
