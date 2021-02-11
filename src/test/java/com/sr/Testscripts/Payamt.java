package com.sr.Testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sr.genericlib.BaseClass;
import com.sr.pompages.Corejavaseleniumtrainig;
import com.sr.pompages.Pay;
import com.sr.pompages.Selenium;
import com.sr.pompages.Skillrary;

public class Payamt extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException {
	Skillrary s=new Skillrary(driver);
	s.serachtb(p.getPropertyData("serach"));
	s.go();
	
	Selenium s1=new Selenium(driver);
	s1.coursetab();
	
	Corejavaseleniumtrainig c=new Corejavaseleniumtrainig(driver);
	u.frame(driver);
	c.playButton();
	Thread.sleep(10000);
	c.pausebutton();
	u.switchbackfromframe(driver);
	Thread.sleep(2000);
	c.takecourse();
	
	
	
	

	

}
}