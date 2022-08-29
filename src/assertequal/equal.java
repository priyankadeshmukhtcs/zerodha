package assertequal;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class equal {
	@Test
public void tc1() {
Reporter.log("running tc1",true);
String exptR="HELLO GUYS";
String actR="HELLO GUYS";
Assert.assertEquals(exptR,actR);

}
}
