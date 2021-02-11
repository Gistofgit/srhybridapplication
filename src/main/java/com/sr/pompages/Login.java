package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(id="course")
    private WebElement coursetab;
	
	public WebElement getCoursetab() {
		return coursetab;
	}

	public WebElement getCoursedd() {
		return coursedd;
	}

	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement coursedd;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumtrainigbtn() {
		seleniumtraining.click();
	}
	
}
