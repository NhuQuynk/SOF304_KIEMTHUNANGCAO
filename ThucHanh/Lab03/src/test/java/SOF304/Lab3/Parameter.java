package SOF304.Lab3;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import SOF304.Lab3.TinhGiaiThua;


@RunWith(Parameterized.class)
public class Parameter {
	int so;
	long ketquagiaithua;
	TinhGiaiThua giaiThua;
	TinhGiaiThua giaithua;

	@Before
	public void setup() {

		giaithua = new TinhGiaiThua();
	}

	public Parameter(int sotinh, long ketqua) {

		this.so = sotinh;
		this.ketquagiaithua = ketqua;
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays
				.asList(new Object[][] { 
					{ 1, 1 },
					{ 2, 2 }, 
					{ 3, 6 }, 
					{ 4, 24 }, 
					{ 6, 120 }, 
					{ 6, 120 }, 
					{ 7, 840 } });
	}

	@Test
	public void kiemtragiaithuavoinhieuthamso() {
		System.out.println("Tham số: thực ");
		long ketqua = giaithua.GiaiThua(so);
		assertEquals(ketquagiaithua, ketqua);
	}

}
