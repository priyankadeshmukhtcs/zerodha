package ASSERT_FAlse;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A1 {
@Test
public void tc() {
	Reporter.log("runnning tc4",true);
	boolean actr=false;
	Assert.assertFalse(actr);
}
}