package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
    private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement serachtab;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	public  Skillrary (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gerasButton() {
		gerasbtn.click();
	}
	
	public void skillrarydemoapptab() {
		skillrarydemoapp.click();
	}
	
	public void serachtb(String course) {
		serachtab.sendKeys(course);	
	}
	
	public void go() {
		gobtn.click();
	}
	
}
