package find_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://filpkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
List<WebElement> ele = driver.findElements(By.xpath("//div"));
for(WebElement k:ele) {
String hy = k.getText();
System.out.println(hy);
}

}
}

