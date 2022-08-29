package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser1 {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//click on cancel button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//search for mobile
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
	//click on search button
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_4rR01T'][1]")).click();
	Set<String> allswin = driver.getWindowHandles();//sarve window handles karnar
	ArrayList<String> al=new ArrayList<String>(allswin);//window handle allswin madhe dile apn tr apn ek ek window handle karu shakto
	String cw = al.get(1);//1 dile apn ni tr he child window handle karel
	System.out.println(cw);
	String mainwin = al.get(0);
	System.out.println(mainwin);
	driver.switchTo().window(al.get(0));//for conformation
	String title = driver.getTitle();
	System.out.println(title);
	
}
}
