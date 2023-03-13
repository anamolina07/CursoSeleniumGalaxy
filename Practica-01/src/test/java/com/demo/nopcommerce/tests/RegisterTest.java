package com.demo.nopcommerce.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import util.BaseTest;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegisterTest extends BaseTest {
	@Test
	public void createAccount() {
		homePage.goToHome();
		homePage.goToRegister();
		registerPage.createNewAccount();
	}
}
