package actitime_page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime_test_case {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	actitime_login_page login=new actitime_login_page(driver);
	login.enterUN();
	login.enterPWD();
	login.clickLOGINBTN();
	actitime_login_page2 login1=new actitime_login_page2(driver);
	login1.verifyTitle();
	driver.close();
}
}
