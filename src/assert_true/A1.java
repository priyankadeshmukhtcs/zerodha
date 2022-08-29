package assert_true;

import org.testng.Assert;
import org.testng.Reporter;

public class A1 {
public void tc3() {
	Reporter.log("running tc3",true);
	boolean actr=true;
	Assert.assertTrue(actr);
}
}
