package salenium_3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_current_url {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
 driver.get("https://www.google.com/");
 //set size of browser
  Dimension d= new Dimension(100,200);
  driver.manage().window().setSize(d);
  Thread.sleep(3000);
driver.close();
  
  
}

}
