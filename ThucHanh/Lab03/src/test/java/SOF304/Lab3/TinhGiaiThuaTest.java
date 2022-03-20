package SOF304.Lab3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

@Generated(value = "org.junit-tools-1.1.0")
public class TinhGiaiThuaTest {
	TinhGiaiThua goi;

	@Before
	public void setUp() throws Exception {
		goi = new TinhGiaiThua();
	}

	@After
	public void tearDown() throws Exception {
		goi = null;
	}

	// bắt ngoại lệ với chú thích test
	@Test(expected = IllegalArgumentException.class)
	public void testGiaithualasoam() throws Exception {

		goi.GiaiThua(-1);
		goi.GiaiThua(-2);
		goi.GiaiThua(11);

	}

	// bắt ngoại lệ với trycatch
	@Test
	public void kiemtranhunggiaithuasai() throws Exception {

		try {
			goi.GiaiThua(-1);
			goi.GiaiThua(22);
			goi.GiaiThua(21);

			fail("không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
		}
	}

	// bắt ngoại lệ với trycatch kèm chú thích lỗi ngoại lệ

	@Test
	public void kiemtranhunggiaithuasaivoighichuloi() throws Exception {

		try {
			goi.GiaiThua(-1);
			goi.GiaiThua(22);
			goi.GiaiThua(21);

			fail("không bắt được ngoại lệ");

		} catch (IllegalArgumentException e) {
			assertEquals(" Số nhập vào không được âm và trong khoảng 0..20", e.getMessage());
		}
	}

	// bắt ngoại lệ theo quy tắc Rule
	@Rule
	public ExpectedException ngoaile = ExpectedException.none();

	@Test
	public void kiemtrangoailevoiquytac() throws Exception {
		ngoaile.expect(IllegalArgumentException.class);
		goi.GiaiThua(-1);
		goi.GiaiThua(22);
		goi.GiaiThua(21);

	}
}