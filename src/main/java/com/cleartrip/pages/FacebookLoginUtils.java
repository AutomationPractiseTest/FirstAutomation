package com.cleartrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.objects.FacebookLoginObjects;
import com.cleartrip.utils.FrontEnd;
import com.cleartrip.utils.SeleniumUtils;


public class FacebookLoginUtils extends FrontEnd{

	/*
	 * We are maintaining scripts using @test for test 
	 */

	public SeleniumUtils seleniumUtil;
	public FacebookLoginObjects loginObjects;

	/**
	 * Class instantiation Before class.
	 */
	public FacebookLoginUtils(WebDriver driver) {
		seleniumUtil=PageFactory.initElements(driver, SeleniumUtils.class);
		loginObjects=PageFactory.initElements(driver, FacebookLoginObjects.class);
	}

	public void applicationLogin(String username,String password) throws InterruptedException{
		seleniumUtil.enterText(loginObjects.username, username);
		Thread.sleep(1000);
		seleniumUtil.enterText(loginObjects.password, password);
		Thread.sleep(1000);
		seleniumUtil.clickOnElement(loginObjects.loginButton);
	}

	
}
