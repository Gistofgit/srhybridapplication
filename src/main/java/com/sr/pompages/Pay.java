package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay {
	@FindBy(xpath="(//input[@type='submit'])[3]")
	private WebElement pay;
	
	public Pay(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void paybtn() {
		pay.click();
	}
	
	

}
