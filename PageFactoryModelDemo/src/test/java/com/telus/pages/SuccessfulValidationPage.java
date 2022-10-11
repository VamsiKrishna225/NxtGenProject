package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class SuccessfulValidationPage {
	public WebDriver driver;

	// Creating the constructor
	public SuccessfulValidationPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Registration Form is Successfully Submitted.')]")
	@CacheLookup
	WebElement validationOutput;



	public void validationSuccessfulMessage() {
		// Verify the validation output is displayed or not
		if (validationOutput.isDisplayed()) {
			Reporter.log("The validation output is displayed successfully");
			// Retriewing the text by using gettext();
			String actualValidationCode = validationOutput.getText();
			String validCode[] = actualValidationCode.split("The");
			String expectedValidationCode = validCode[0];
			String validationMsg[] = actualValidationCode.split(":");
			String outputValidation = validationMsg[1].trim();
			// Expected result
			if (actualValidationCode.contains(expectedValidationCode)) {
				Reporter.log("The Registration message of the page is displayed successfully");
				Reporter.log("The Transaction ID is :" + outputValidation);
				Reporter.log("Actual and expected validation codes are same");
			} else {
				Reporter.log("Actual and expected validation codes are not same");
				Reporter.log("The Actual validation code is :" + actualValidationCode);
				Reporter.log("The Expected validation Code is :" + expectedValidationCode);
			}

		} else {
			Reporter.log("The validation output is not displayed successfully");
		}
		Reporter.log("The successfull message is validated successfully");

	}
}
