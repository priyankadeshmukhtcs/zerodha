package screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;




public class demo {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nseindia.com/");
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)driver;
	//use.getscreenshotas()
	 File src = ts.getScreenshotAs(OutputType.FILE);
	//we have to store in particular destination
	 File dest = new File("C:\\Users\\JPTL\\Desktop\\screenshot folder\\NSEINDIA.JPG");
	 Files.copy(src, dest);
}
}
