package static_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class A1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/JPTL/Documents/gudluckt.html");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='gudluck']"));
		Select s=new Select(dropdown);
		s.selectByIndex(6);
		s.selectByIndex(9);
		s.selectByValue("c");
		s.selectByVisibleText("birayani");
		
	}

}
