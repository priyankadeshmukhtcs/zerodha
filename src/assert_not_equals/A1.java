package assert_not_equals;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A1 {
	@Test
public void tc2() {
	Reporter.log("runnind tc2",true);
	String expt="hello";
	String act="hiii";
	Assert.assertNotEquals(expt, act);
}
}