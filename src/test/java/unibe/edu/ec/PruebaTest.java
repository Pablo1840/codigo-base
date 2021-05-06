package unibe.edu.ec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PruebaTest {
		
	private Prueba p1;
	
	@	Before
	public void Before() {
		this.p1 = new Prueba("pablo");
	}
	@Test
	public void tamanoFrase() {
		assertEquals(5, this.p1.tamanoFrase());
	}

}
