package smoke_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	String expT="actiTIME - Login";
	WebDriver driver=new ChromeDriver();
	
driver.get("https://demo.actitime.com/login.do");
String actT=driver.getTitle();
if(expT.equals(actT)) {
	System.out.println("TEST CASE IS PASS");
}
else {
	System.out.println("test case is fail");
}
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
Thread.sleep(2000);

driver.findElement(By.xpath("//div[text()='Login ']")).click();
String expTh="actiTIME - Enter Time-Track";
Thread.sleep(2000);
String actTh=driver.getTitle();
if(expTh.equals(actTh)) {
	System.out.println("test case is pass");
	
}
else {
	System.out.println("test case is fail");
}
driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("PRIYA");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).clear();

}

}
