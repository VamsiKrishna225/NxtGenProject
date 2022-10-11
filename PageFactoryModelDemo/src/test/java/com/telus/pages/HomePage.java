package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;
	Actions action;
	@FindBy(how = How.XPATH, using = "//*[text()='QA Automation']")
	@CacheLookup
	WebElement qaAutomationXpath;

	@FindBy(how = How.XPATH, using = "//*[text()='Practice Automation']")
	@CacheLookup
	WebElement practiceAutomationXpath;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Demo Site – Registration Form')]")
	@CacheLookup
	WebElement registerForDemoPageXpath;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnQaQutomation() {
		// Creating a actions class object.
		action = new Actions(driver);
		action.moveToElement(qaAutomationXpath).perform();
	}

	public void clickPracticalAutomation() {
		action = new Actions(driver);
		action.moveToElement(practiceAutomationXpath).perform();
	}

	public void clickRegistrationForm() {
		action = new Actions(driver);
		registerForDemoPageXpath.click();

	}
}
