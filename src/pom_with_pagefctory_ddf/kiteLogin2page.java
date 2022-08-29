package pom_with_pagefctory_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin2page {
//decleation
	@FindBy(xpath= "//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath ="//button[@class='button-orange wide']")private WebElement BTNCLICK;
	//INTILIZATION
	public kiteLogin2page (WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//utilization
	public void enterPIN(String pinvalue) {
		PIN.sendKeys(pinvalue);
	}
	public void clickBTNCLICK() {
		BTNCLICK.click();
	}
}
