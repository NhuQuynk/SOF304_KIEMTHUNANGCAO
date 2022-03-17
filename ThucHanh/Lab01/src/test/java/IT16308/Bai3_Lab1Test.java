package IT16308;


import org.junit.Test;
import junit.framework.TestCase;

public class Bai3_Lab1Test extends TestCase {
	public Bai3_Lab1Test(String testName) {
		super(testName);
	}
	public void testApp() {
		assertTrue(true);
	}
	

	@Test
	public void testIsEventNumber2() {
		Bai3_Lab1 number = new Bai3_Lab1();
		boolean result = number.isEven(2);
		
		assertTrue(result);
		

	}
	@Test
	public void testIsEventNumber4() {
		Bai3_Lab1 number = new Bai3_Lab1();
		boolean result = number.isEven(4);
		
		assertTrue(result);
		
		
	}
}
