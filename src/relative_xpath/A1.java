package relative_xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9921235991");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9730454634");
	Thread.sleep(3000);
	String actT="Facebook � log in or sign up";
	Thread.sleep(3000);
	String expT = driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("TEST CASE PASS");
		
	}
	else {
		System.out.println("test case fail");
	}
	
	
}
}
