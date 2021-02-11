package com.sr.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.sr.genericlib.BaseClass;
import com.sr.pompages.Facebook;
import com.sr.pompages.Login;
import com.sr.pompages.Skillrary;
import com.sr.pompages.Testing;

public class LikeFb extends BaseClass {
	@Test
	public void tc2() throws EncryptedDocumentException, InvalidFormatException, IOException {
		Skillrary s=new Skillrary(driver);
		s.gerasButton();
		s.skillrarydemoapptab();
		
		u.switchingtab(driver);
		
		Login l=new Login(driver);
		u.dropDown(l.getCoursedd(),p.getPropertyData("data"));
		
		Testing t=new Testing(driver);
		t.facebookbtn();
		
		Facebook f=new Facebook(driver);
		f.likebtn();
		
		
		
		
		
		
		
	}

}
