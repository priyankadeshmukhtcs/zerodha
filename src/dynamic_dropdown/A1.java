package dynamic_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kgf");
		Thread.sleep(3000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		Thread.sleep(3000);

		for(WebElement oneoption:alloptions) {
			String text = oneoption.getText();
			System.out.println(text);
		if(text.contains("kgf 2 full movie")) {
			oneoption.click();
			break;
		}
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("KGF");
		//Thread.sleep(3000);
		//List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		//Thread.sleep(3000);
		//for(WebElement oneoption:alloptions) {
			//String text = oneoption.getText();
			//System.out.println(text);
			//if(text.contains("kgf full form")) {
				//oneoption.click();
				//break;
			//}
//}
	}
}
}