package Lab02.Bai01;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunMathFunc {
	public static void main(String[] args) throws Exception {
		JUnitCore jUnitCore = new JUnitCore();
		jUnitCore.run(TestMathFunc.class);
		Result result = JUnitCore.runClasses(TestMathFunc.class);
		System.out.println("Số lần chạy thất bại:"+result.getFailureCount());
		System.out.println("Số lần chạy:"+result.getRunCount());
		System.out.println("Số lần bỏ qua:"+result.getIgnoreCount());
		System.out.println("Kết quả cuối cùng:"+result.wasSuccessful());
	}
}
