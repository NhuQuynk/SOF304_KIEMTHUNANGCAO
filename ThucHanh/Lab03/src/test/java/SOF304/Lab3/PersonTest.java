package SOF304.Lab3;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonTest {

	// bắt ngoại lệ theo quy tắc Rule
	@Rule
	public ExpectedException ngoaile = ExpectedException.none();

	@Test
	public void testPS() {
		ngoaile.expect(IllegalArgumentException.class);
		new Person("Quỳnh", 17);
		new Person("Quỳnh", 18);
		new Person("Quỳnh", 65);
		new Person("Quỳnh", 66);
	}

	// bắt ngoại lệ với chú thích test
	@Test(expected = IllegalArgumentException.class)
	public void testPS1() throws Exception {
		new Person("Quỳnh", 17);
		new Person("Quỳnh", 18);
		new Person("Quỳnh", 65);
		new Person("Quỳnh", 66);

	}

	// bắt ngoại lệ với trycatch
	@Test
	public void testPS2() throws Exception {

		try {
			new Person("Quỳnh", 17);

			fail("không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals(" Tuổi nhân viên trong khoảng 18-->65", e.getMessage());
		}
	}

}
