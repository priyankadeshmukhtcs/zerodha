package salenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\JPTL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("kids dress under 1000");
driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
	
	
	}


		
		
	}


