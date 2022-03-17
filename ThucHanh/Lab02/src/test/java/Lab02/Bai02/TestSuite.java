package Lab02.Bai02;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Lab02.Bai01.TestMathFunc;

@RunWith(Suite.class)
@SuiteClasses({ TestCase.class, TestMathFunc.class })
public class TestSuite {

}
