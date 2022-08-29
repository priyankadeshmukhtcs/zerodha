package actitime_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime_login_page {
	//public static void main(String[] args) {
		
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\JPTL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://demo.actitime.com/login.do");
	//step1
@FindBy(xpath ="//input[@id='username']" )private WebElement UN;
@FindBy(xpath ="//input[@name='pwd']")private WebElement PWD;
@FindBy(xpath ="//div[text()='Login ']")private WebElement LOGINBTN;
//STEP2
public actitime_login_page(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public	void enterUN()
{
	UN.sendKeys("admin");
}
public void enterPWD() {
	PWD.sendKeys("manager");
}
public void clickLOGINBTN() {
LOGINBTN.click();
}
}	

