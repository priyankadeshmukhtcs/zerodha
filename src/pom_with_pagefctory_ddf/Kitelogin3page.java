package pom_with_pagefctory_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin3page {
//decleration
	@FindBy(xpath ="//span[@class='user-id']")private WebElement USERID;
	//INTILIZATION
	public  Kitelogin3page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void verifyUSERID(String exptID) {
		String actID=USERID.getText();
		if(actID.equals(exptID)) {
			System.out.println("TC IS PASS");
		}
		else {
			System.out.println("tc is fail");
		}
	}
}
