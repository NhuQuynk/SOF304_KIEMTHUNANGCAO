package Lab02.Bai03;

import java.util.Iterator;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunAnnotation {
	public static void main(String[] args) throws Exception {
		JUnitCore junitCore = new JUnitCore();
		Result result = JUnitCore.runClasses(TestAnnotation.class);
		for(Failure fails: result.getFailures()) {
			System.out.println(fails.toString());
		}
		System.out.println("KQ: " + result.wasSuccessful());
	}
	
}
