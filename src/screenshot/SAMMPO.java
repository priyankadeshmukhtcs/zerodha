package screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SAMMPO {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ocwindia.com/");
	TakesScreenshot ocw=(TakesScreenshot)driver;
	File scrs = ocw.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\JPTL\\Desktop\\screenshot folder\\ocwindia.jpg");
		Files.copy(scrs,dest);	
}
}
