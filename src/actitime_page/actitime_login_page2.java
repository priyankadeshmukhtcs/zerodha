package actitime_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime_login_page2 {
@FindBy(xpath="//title[text()='actiTIME -  Enter Time-Track']")private WebElement TITLE;
public actitime_login_page2( WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public void verifyTitle() {
	String exptd="Enter Time-Track	";
	String actd=TITLE.getText();
	if(actd.equals(exptd)) {
		System.out.println("tc case pass");
	}
	else {
		System.out.println("tc case is fail");
	}
}
}
