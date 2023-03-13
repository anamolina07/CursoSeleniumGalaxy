package com.demo.nopcommerce.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.BasePage;

public class HomePage extends BasePage{
	
	//Elementos de la página Home
	
	By link_register = By.className("ico-register");
	By link_logIn = By.className("ico-login");

	//By link_register = By.linkText("Register");
	//By link_logIn = By.linkText("Log in");
	
	String url_base = "https://demo.nopcommerce.com/";
	

	public HomePage(WebDriver driver2) {
		super(driver2);
		//loadUrl(url_base);

	}
	
	public HomePage(WebDriver driver2, int timeoutSec) {
		this(driver2);
		setTimeoutSec(timeoutSec);
	}
	
	public void goToHome() {
		loadUrl(url_base);
		assertTrue(isDisplayed(link_register));
		assertTrue(isDisplayed(link_logIn));
	}
	
	public void goToRegister() { 
		click(link_register);	
	}
	
	public void goToLogin () {
		click(link_logIn);
	}
	
	
	

}
