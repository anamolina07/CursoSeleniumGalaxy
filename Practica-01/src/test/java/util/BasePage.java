package util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	

	WebDriver driver;
	WebDriverWait wait;
	int timeoutSec = 10;
	
	public BasePage(WebDriver driver2) {
		this.driver = driver2;
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSec));// explicit wait
	}
	
	public void setTimeoutSec(int timeoutSec) {
		this.timeoutSec = timeoutSec;
	}
	
	public void loadUrl(String url) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutSec)); // implicit wait
		driver.get(url);
	}
	
	public WebElement find(By element) { //metodo para buscar elementos dentro del DOM
		return driver.findElement(element);
	}
	
	public void click(By element) { //metodo para clickear algun elemento dentro del DOM
		find(element).click(); // uso el metodo para buscar un elemento del DOM, le paso el elemento y doy click
	}
	
	public void type(By element,String text) {
		find(element).sendKeys(text);
	}
	
	public boolean isDisplayed(By element) {
		
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	

}
