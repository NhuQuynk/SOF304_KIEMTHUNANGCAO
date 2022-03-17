package Lab02.Bai02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	public String message = "Hello word";
	MessageUtil demo = new MessageUtil(message);
	@Test
	public void testPrintMessage() {
		assertEquals(message, demo.printMessage(message));
	}

//	@Test
//	public void testPrintMessageNew() {
//		assertEquals(mesenger, demo1.printMessageNew(mesenger));
//	}

}
