package relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
Thread.sleep(3000);
driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
Thread.sleep(3000);
driver.findElement(By.xpath("(//div)[13]")).click();
Thread.sleep(3000);
String actT="actiTIME - Enter Time-Track";
Thread.sleep(3000);
String expT = driver.getTitle();
if(actT.equals(expT)) {
	System.out.println("HOME PAGE OPEN TC PASS");
	
}
else {
	
	System.out.println("home page is not open tc is fail");
}
}
}
