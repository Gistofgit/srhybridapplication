package com.sr.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author QSP
 *
 */
public class BaseClass implements AutoConstant{
	/**
	 * Open tha application
	 */
	public WebDriver driver;
	public Propertyfile p;
	public ExcelData d=new ExcelData();
	public Photo p1;
	public Utilies u=new Utilies();
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		p=new Propertyfile();
		driver.get(p.getPropertyData("srurl"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	/**
	 * Close the application and take the photo
	 * @param r
	 * @throws IOException
	 */
	
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		if(status==2) {
			p1=new Photo();
			p1.getphoto(name, driver);
		}
		
		
		driver.quit();
	}

}
