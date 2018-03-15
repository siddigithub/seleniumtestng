package com.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePageTest {

	WebDriver driver;

	@BeforeClass
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "//Users//usachary//Downloads//geckodriver");
		driver = new FirefoxDriver();
	}

	@Test
	public void googleHomeTest() {
		driver.navigate().to("http://www.google.co.uk");
	}

	@AfterClass
	public void afterTest() {
		driver.quit();
	}
}
