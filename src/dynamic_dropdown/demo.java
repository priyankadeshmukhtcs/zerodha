package dynamic_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile above 50000",Keys.ENTER);
	Thread.sleep(3000);
	String reveiw = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
	System.out.println(reveiw);
	Thread.sleep(3000);
String rating = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[2]")).getText();
System.out.println(rating);




}
}
