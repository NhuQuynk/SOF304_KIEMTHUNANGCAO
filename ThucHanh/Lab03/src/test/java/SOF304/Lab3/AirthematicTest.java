package SOF304.Lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AirthematicTest {
	public String message = "Fpoly exception";

	JUnitMessage junitMessage = new JUnitMessage(message);

	@Test(expected = ArithmeticException.class)
	public void testJUnitMessage() throws Exception {
		System.out.println("Poly JUnit message exception is printing");
		junitMessage.printMessage();
	}

	@Test
	public void testJUnitHiMessage() {
		message = "Hi: " + message;
		System.out.println("Fpoly JUnit Message is printing");
		assertEquals(message, junitMessage.printHiMessage());
	}

}
