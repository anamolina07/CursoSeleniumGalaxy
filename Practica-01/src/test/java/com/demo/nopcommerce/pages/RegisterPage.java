package com.demo.nopcommerce.pages;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import org.testng.AssertJUnit;

import util.BasePage;
import util.BaseTest;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Locale;

public class RegisterPage extends BasePage {

	// Elementos de la página Register

	By radioBtn_female = By.className("female");
	By textField_FirstName = By.id("FirstName");
	By textField_LastName = By.id("LastName");

	By listSelect_birthDay = By.name("DateOfBirthDay");
	By listSelect_birthMonth = By.name("DateOfBirthMonth");
	By listSelect_birthYear = By.name("DateOfBirthYear");

	By textField_email = By.id("Email");

	By chkBox_newsletter = By.id("Newsletter");

	By textField_pw = By.id("Password");
	By textField_confirmPw = By.id("ConfirmPassword");

	By btn_register = By.id("register-button");
	
	By lbl_registerOk = By.className("result");

	public RegisterPage(WebDriver driver2) {
		super(driver2);
	}

	public RegisterPage(WebDriver driver2, int timeoutSec) {
		this(driver2);
		setTimeoutSec(timeoutSec);
	}

	public void createNewAccount() {
		Faker faker = new Faker(new Locale("en-US"));

		String emailFake = faker.internet().emailAddress();
		String pwFake = faker.internet().password();

		String firstNameFake = faker.name().firstName();
		String lastNameFake = faker.name().firstName();

		click(radioBtn_female);
		type(textField_FirstName, firstNameFake);
		type(textField_LastName, lastNameFake);

		/*
		 * Select birthDay = new Select((WebElement) listSelect_birthDay);
		 * birthDay.selectByValue("21");
		 * 
		 * Select birthMonth = new Select((WebElement) listSelect_birthMonth);
		 * birthMonth.selectByVisibleText("March");
		 * 
		 * Select birthYear = new Select((WebElement) listSelect_birthYear);
		 * birthYear.selectByValue("1974");
		 */
		
		/*
		 * if (((WebElement) chkBox_newsletter).isSelected()) { ((WebElement)
		 * chkBox_newsletter).click();
		 * 
		 * }
		 */
		
		type(textField_email, emailFake);
		type(textField_pw, pwFake);
		type(textField_confirmPw, pwFake);
		
		click(btn_register);
		
		assertTrue(isDisplayed(lbl_registerOk));
		
		System.out.println("El mail y pw de la cuenta qque se registró es: "+ emailFake + " " + pwFake);
	}


}
