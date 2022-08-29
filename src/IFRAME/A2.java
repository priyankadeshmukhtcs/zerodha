package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	driver.manage().window().maximize();
	//switch to first frame
	driver.switchTo().frame("packageListFrame");
	//take 1st element on first  frame
	String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(text);
	Thread.sleep(3000);
	
	
	//switch to 2nd frame
	driver.switchTo().defaultContent();//it will move control to 1st frame to main webpage
	driver.switchTo().frame("packageFrame");
String text1 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
System.out.println(text1);
Thread.sleep(3000);

//switch to 3rd frame
driver.switchTo().defaultContent();//it will move control to main webpage
driver.switchTo().frame("classFrame");
String text2 = driver.findElement(By.xpath("//a[text()='HasAuthentication']")).getText();
System.out.println(text2);

}
}