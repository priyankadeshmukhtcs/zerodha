package salenium_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method{ 
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
Thread.sleep(3000);
driver.navigate().to("https://www.google.com/");
Thread.sleep(4000);
driver.close();

}
}
 