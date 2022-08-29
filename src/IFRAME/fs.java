package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fs {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	
	driver.switchTo().frame("packageListFrame");
     String pd = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(pd);
	Thread.sleep(3000);

	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	String pdt = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
    System.out.println(pdt);
     Thread.sleep(3000);

    driver.switchTo().defaultContent();
    driver.switchTo().frame("classFrame");
    String pdtp = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
    System.out.println(pdtp);
	
	
}
}
