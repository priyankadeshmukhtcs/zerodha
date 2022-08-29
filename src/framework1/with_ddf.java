package framework1;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_ddf {
public static void main(String[] args) throws Throwable {
FileInputStream file=new FileInputStream("C:\\Users\\JPTL\\Documents\\class.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("class");
System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();
//enter user name
String un = sh.getRow(0).getCell(0).getStringCellValue();
driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
	//enter the password
String pwd = sh.getRow(0).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
//enter the click on button
driver.findElement(By.xpath("//button[text()='Login ']")).click();
//enter the pin
String pin = sh.getRow(0).getCell(2).getStringCellValue();
driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
//click on continue
driver.findElement(By.xpath("//button[text()='Continue ']")).click();
//result check
String exptd="DPG458";
String actd = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
if(exptd.equals(actd)) {
	System.out.println("both are same test case is pass");
}
else {
	System.out.println("both are not same test case is fail");
}
}
}
