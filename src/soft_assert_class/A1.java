package soft_assert_class;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A1 {
@Test
public void tc1() {
	Reporter.log("running tc1",true);
	String expt="hi";
	String act="hello";
	SoftAssert s=new SoftAssert();
	s.assertEquals(expt,act);
	System.out.println("i am after failed");
	s.assertAll();
	
}
@Test
public void tc2() {
	Reporter.log("hii hello");
}
}
