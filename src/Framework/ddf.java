package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddf {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	String exptd="DPG458";
String actr = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
if(exptd.equals(actr)) {
	System.out.println("test case is pass");
}
else {
	System.out.println("test case fail");
}
}
}
