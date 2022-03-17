package Lab02.Bai01;

public class MathFunc {
	public MathFunc() {
		
	}
	public int factorial(int number) {
		int giaiThua = 1;
		if(number == 0) {
			giaiThua = 0;
		} else if (number == 1) {
			giaiThua = 1;
		} else if(number > 1) {
			for(int i =1; i <= number; i++) {
				giaiThua = giaiThua * i;
			}
		}
		return giaiThua;
	}
	public int plus(int a, int b) {
		return a + b;
	}
}
