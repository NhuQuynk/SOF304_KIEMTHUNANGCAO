package Lab02.Bai03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotation {
	public TestAnnotation() {
		
	}
	ArrayList<String> list;
	@Before
	public void m1() {
		list = new ArrayList<String>();
		System.out.println("@Before thực hiện trước 1 test case");
	}
	@BeforeClass
	public static void m2() {
		System.out.println("@BeforeClass thực hiện trước all test case");
	}
	@After
	public void m3() {
		list.clear();
		System.out.println("@After thực hiện sau 1 test case");
	}
	@AfterClass
	public static void m4() {
		System.out.println("@AfterClass thực hiện sau all test case");
	}
	@Test
	public void m5() {
		list.add("Test 1");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		System.out.println("@Test thực hiện 1 test case");
	}
	@Ignore
	public void m6() {
		System.out.println("@Ignore Bỏ qua 1 test case");
	}
	@Test(timeout = 10)
	public void m7() {
		System.out.println("@Test(timeout = 10) thực hiện 1 test case có timeout là 10s");
	}

}
