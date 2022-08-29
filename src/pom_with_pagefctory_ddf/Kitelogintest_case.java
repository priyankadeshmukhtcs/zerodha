package pom_with_pagefctory_ddf;

import java.io.FileInputStream;

import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kitelogintest_case {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\JPTL\\Documents\\new.xlsx");
	Sheet sh=WorkbookFactory.create(fis).getSheet("new");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	//maximize
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//call 1st pom class
	 Kitelogin1page login1=new  Kitelogin1page(driver);
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	login1.enterUN(username);
String password = sh.getRow(0).getCell(1).getStringCellValue();
login1.enterPWD(password);
login1.clickLOGINBTN();
//call 2nd pom class
kiteLogin2page login2=new kiteLogin2page(driver);
String pinvalue = sh.getRow(0).getCell(2).getStringCellValue();
login2.enterPIN(pinvalue);
login2.clickBTNCLICK();
//call 3rd pom class
Kitelogin3page login3=new Kitelogin3page(driver);
String exptID = sh.getRow(0).getCell(0).getStringCellValue();
login3.verifyUSERID(exptID);
driver.close();


}
}
