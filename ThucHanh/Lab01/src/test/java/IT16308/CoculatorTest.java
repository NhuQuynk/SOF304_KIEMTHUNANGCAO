package IT16308;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoculatorTest {
	Coculator call ;
	public CoculatorTest() {
		call = new Coculator();
	}

	@Test
	public void testAdd() {
//		int c = call.add(15, 5);
//		int expected = 20;
//		assertEquals(expected, c);
		assertEquals(20, call.add(15, 5));
	}

	@Test
	public void testSub() {
//		int c = call.sub(15, 5);
//		int expected = 10;
//		assertEquals(expected, c);
		assertEquals(10, call.sub(15, 5));
	}

	@Test
	public void testMul() {
//		int c = call.mul(4, 5);
//		int expected = 20;
//		assertEquals(expected, c);
		assertEquals(20, call.mul(4, 5));
	}

	@Test
	public void testDiv() {
//		int c = call.div(15, 5);
//		int expected = 3;
//		assertEquals(expected, c);
		assertEquals(3, call.div(15, 5));
	}
}
