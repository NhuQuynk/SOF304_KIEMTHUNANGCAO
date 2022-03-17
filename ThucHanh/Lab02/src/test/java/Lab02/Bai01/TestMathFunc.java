package Lab02.Bai01;


import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import Lab02.Bai01.MathFunc;

public class TestMathFunc {
	MathFunc mathFunc;
	@Before
	public void setUp() {
		mathFunc = new MathFunc();
	}
	@After
	public void tearDown() {
		mathFunc = null;
	}
	@Test
	public void testFactorial() {
		assertTrue(mathFunc.factorial(2)==2);
		assertTrue(mathFunc.factorial(6)==720);
	}
	@Ignore
	@Test
	public void testFactorial1() {
		mathFunc.factorial(-1);
	}

}
