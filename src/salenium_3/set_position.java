package salenium_3;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class set_position {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
Point p=new Point(300, 400);

}
}
