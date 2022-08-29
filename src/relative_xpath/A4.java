package relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://coindcx.com/");
driver.findElement(By.xpath("//a[contains(@rel,'noopener noreferrer')]")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//input[contains(name,'email')]")).sendKeys("pravindeshmukh1986@gmail.com");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Tanvi@24");
Thread.sleep(3000);

driver.findElement(By.xpath("//button[contains(@class,'new-cta block')]")).click();
Thread.sleep(3000);


}
}