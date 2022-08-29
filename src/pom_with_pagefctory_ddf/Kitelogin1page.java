package pom_with_pagefctory_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin1page {
//step1
	@FindBy(xpath ="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath ="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath ="//button[@class='button-orange wide']")private WebElement LOGINBTN;
	//STEP2
	public  Kitelogin1page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//UTILIZATION
	public void enterUN(String username) {
		UN.sendKeys(username);
}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLOGINBTN() {
		LOGINBTN.click();
	}
}