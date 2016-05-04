package cl.ubb.ejemplo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	private  Stack fb;
	
	@Before
	public void setup(){
		fb = new Stack();
	}
	
	@Test
	public void canConvertOne(){
		assertEquals("1",fb.convertTo(1));
	}
	


	
}
