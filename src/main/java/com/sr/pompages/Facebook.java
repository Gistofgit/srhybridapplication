package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	@FindBy(xpath="//button[text()='Like']")
	private WebElement like;
	
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void likebtn() {
		like.click();
	}
	

}
