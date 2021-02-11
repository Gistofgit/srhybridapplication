package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Corejavaseleniumtrainig {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//div[@class='controls enroll_take_course']")
    private WebElement takethiscourse;
	
	public Corejavaseleniumtrainig(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playButton() {
		playbtn.click();
	}
	
	public void pausebutton() {
		pause.click();
	}
	
	
	public void takecourse() {
		takethiscourse.click();
	}
}
