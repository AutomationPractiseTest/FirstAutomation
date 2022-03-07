package com.cleartrip.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginObjects {

	/*
	 * here we are maintaining all module wise object 
	 */

	@FindBy(id="email")
	public WebElement username;

	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginButton;


}
