package popups;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//click on cancel button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//search for mobile
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
	//click on search button
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	//click on first mobile it will open that window
	driver.findElement(By.xpath("//div[@class='_4rR01T'][1]")).click();
//by default our control is main webpage we have to move our cursor to child window
	Set<String> allws = driver.getWindowHandles();
	for(String singlewin:allws) {
		driver.switchTo().window(singlewin);//now our cursor is main window to child window
		
	}
	//get text of our child window
	Thread.sleep(3000);
	
	String exptT="realme C21 (Cross Blue, 32 GB)  (3 GB RAM)";
	String actT = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	System.out.println(actT);
	if(actT.equals(exptT)) {
		System.out.println("TEST CASE PASS");
	}
	else {
		System.out.println("test case is fail");
	}
	
	
}
}