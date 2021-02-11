package com.sr.genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 * 
 * @author QSP
 *
 */

//public class Photo implements AutoConstant {
	public class Photo extends BaseClass {
	
	/**
	 * Take the photo of failed testcases
	 * @param driver
	 * @param name
	 * @throws IOException
	 */
	public void getphoto(String name,WebDriver driver) throws IOException {
		Date d=new Date();
		String date = d.toString().replaceAll(":","-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(photopath+date+name+".png");
		FileUtils.copyFile(src, dest);
		
		
	}

}
