package cl.ubb.ejemplo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fb;
	
	@Before
	public void setup(){
		fb = new FizzBuzz();
	}
	
	@Test
	public void canConvertOne(){
		assertEquals("1",fb.convertTo(1));
	}
	
	@Test
	public void twoReturnsTwo(){
		assertEquals("2",fb.convertTo(2));
	}
	
	@Test
	public void threeReturnsFizz(){
		assertEquals("Fizz",fb.convertTo(3));
	}
	@Test
	public void FiveReturnsBuzz(){
		assertEquals("Buzz",fb.convertTo(5));
	}
	@Test
	public void SixReturnsFizz(){
		assertEquals("Fizz",fb.convertTo(6));
	}
	@Test
	public void tenReturnsBuzz(){
		assertEquals("Buzz",fb.convertTo(10));
	}
	@Test
	public void FifteenReturnsBuzz(){
		assertEquals("FizzBuzz",fb.convertTo(15));
	}
	
}
