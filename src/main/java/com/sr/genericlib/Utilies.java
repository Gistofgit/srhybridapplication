package com.sr.genericlib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author QSP
 *
 */
public class Utilies {
	/**
	 * To Handle the dropdown
	 * @param ele
	 * @param text
	 */
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * To handle the MouseAction
	 * @param driver
	 * @param ele
	 */
	
	public void mouseAction(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	/**
	 * To handle the double click
	 * @param driver
	 * @param target
	 */
	
	public void doubleClick(WebDriver driver,WebElement target) {
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
	}
	/**
	 * To handle the scrollbar
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
}
	/**
	 * To handle the alertpopup
	 * @param driver
	 */
	
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * To wait for the element
	 * @param driver
	 * @param element
	 */
	
	public void elementToclicked(WebDriver driver,WebElement element) {
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void switchingtab(WebDriver driver) {
		 Set<String> child = driver.getWindowHandles();
		
		for( String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	
	public void navigateurl(WebDriver driver,String url) {
		driver.navigate().to(url);
	}

	public void frame(WebDriver driver) {
		driver.switchTo().frame(0);
		
	}
	
	public void switchbackfromframe(WebDriver driver) {
		driver.switchTo().defaultContent();
		
	}
}
