package assert_fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A1 {
@Test
public void tc1() {
	Reporter.log("running tc1",true);
	Assert.fail();
	System.out.println("bosss....i am fail");////verification
	
}
@Test
public void tc2() {
	Reporter.log("i am from tc2");
}
}
