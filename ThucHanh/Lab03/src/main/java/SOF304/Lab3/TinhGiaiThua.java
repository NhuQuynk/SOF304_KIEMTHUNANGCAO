package SOF304.Lab3;

public class TinhGiaiThua {
	int sonhap;

	public int getSoNhap() {
		return sonhap;
	}

	public long GiaiThua(int sotinh) {
		if (sotinh < 0 || sotinh >= 21)
			throw new IllegalArgumentException("Số nhập vào không được âm và trong khoảng 0...20");
		if (sotinh == 0)
			return 1;

		long ketquagiaithua = 1;

		for (int i = 1; i <= sotinh; i++) {
			ketquagiaithua = ketquagiaithua * i;
		}
		return ketquagiaithua;
	}

	public long plus(int a, int b) {
		return a + b;
	}

}
