package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("priya");
	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("deshmukh");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
