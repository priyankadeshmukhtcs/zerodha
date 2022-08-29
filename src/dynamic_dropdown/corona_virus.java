package dynamic_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class corona_virus {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/country/uk");
		String recover = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[3]")).getText();
	System.out.println(recover);
		Thread.sleep(3000);
	String cases = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[1]")).getText();
	System.out.println(cases);
	Thread.sleep(2000);
	String deths = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[2]")).getText();
	System.out.println(deths);
	
	}

}
