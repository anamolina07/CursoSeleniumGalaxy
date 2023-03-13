package com.demo.nopcommerce.tests;

import org.testng.annotations.Test;
import util.BaseTest;


public class HomeTest extends BaseTest{
	
	@Test
	public void validaPaginaCorrecta() {
		homePage.goToHome();
	}
	

}
