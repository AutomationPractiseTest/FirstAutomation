package com.cleartrip.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cleartrip.pages.FacebookLoginUtils;
import com.cleartrip.utils.FrontEnd;
import com.cleartrip.utils.SeleniumUtils;

public class FacebookLoginScripts extends FrontEnd{

	/*
	 * We are maintaining scripts using @test for test 
	 */

	public SeleniumUtils seleniumUtil;
	public FacebookLoginUtils loginUtils;

	/**
	 * Class instantiation Before class.
	 */
	@BeforeClass
	public void loading_Objects_Classes() {
		seleniumUtil=PageFactory.initElements(driver, SeleniumUtils.class);
		loginUtils=PageFactory.initElements(driver, FacebookLoginUtils.class);
	}


	@Test
	public void gmailLogin() throws InterruptedException{
		loginUtils.applicationLogin(prob.getProperty("username"), prob.getProperty("password"));
		
	}

}
