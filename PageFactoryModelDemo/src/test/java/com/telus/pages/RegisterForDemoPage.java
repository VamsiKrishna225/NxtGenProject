package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class RegisterForDemoPage {
	WebDriver driver;

	// Declare the locators values in string variables

	@FindBy(how = How.XPATH, using = "//input[@id = 'vfb-5']")
	@CacheLookup
	WebElement firstNameXpath;
	@FindBy(how = How.XPATH, using = "//input[@id = 'vfb-7']")
	@CacheLookup
	WebElement lastNameXpath;
	@FindBy(how = How.XPATH, using = "//input[@id = 'vfb-8-1']")
	@CacheLookup
	WebElement genderMaleBtnXpath;
	@FindBy(how = How.XPATH, using = "//input[@name='vfb-13[address]']")
	@CacheLookup
	WebElement streetAddressXpath;
	@FindBy(how = How.XPATH, using = "//input[@name='vfb-13[address-2]']")
	@CacheLookup
	WebElement apparmentAddressXpath;
	@FindBy(how = How.XPATH, using = "//input[@name='vfb-13[city]']")
	@CacheLookup
	WebElement cityNameXpath;
	@FindBy(how = How.XPATH, using = "//input[@name='vfb-13[state]']")
	@CacheLookup
	WebElement stateNameXpath;
	@FindBy(how = How.XPATH, using = "//select[@id = 'vfb-13-country']")
	@CacheLookup
	WebElement countryDropdownXpath;
	@FindBy(how = How.XPATH, using = "//input[@name='vfb-13[zip]']")
	@CacheLookup
	WebElement postalcodeXpath;
	@FindBy(how = How.XPATH, using = "//input[@id='vfb-14']")
	@CacheLookup
	WebElement emailAddressXpath;
	@FindBy(how = How.XPATH, using = "//input[@id='vfb-18']")
	@CacheLookup
	WebElement dateOfDemoXpath;
	@FindBy(how = How.XPATH, using = "//select[@id='vfb-16-hour']")
	@CacheLookup
	WebElement hoursDropdownXpath;
	@FindBy(how = How.XPATH, using = "//select[@id='vfb-16-min']")
	@CacheLookup
	WebElement minDropdownXpath;
	@FindBy(how = How.XPATH, using = "//input[@id='vfb-19']")
	@CacheLookup
	WebElement mobileNumberXpath;
	@FindBy(how = How.XPATH, using = "//input[@id='vfb-20-0']")
	@CacheLookup
	WebElement seleniumCourseXpath;
	@FindBy(how = How.XPATH, using = "//input[@id='vfb-20-1']")
	@CacheLookup
	WebElement uftCourseXpath;
	@FindBy(how = How.XPATH, using = "//input[@id='vfb-20-2']")
	@CacheLookup
	WebElement testNgCourseXpath;
	@FindBy(how = How.XPATH, using = "//textarea[@id='vfb-23']")
	@CacheLookup
	WebElement enterQueryXpath;
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Example: 99']")
	@CacheLookup
	WebElement exampleCodeXpath;
	@FindBy(how = How.XPATH, using = "//input[@id='vfb-3']")
	@CacheLookup
	WebElement verificationCodeXpath;
	@FindBy(how = How.XPATH, using = "//input[@id='vfb-4']")
	@CacheLookup
	WebElement submitBtnXpath;
	@FindBy(xpath = "//*[contains(text(),'Registration Form is Successfully Submitted')]")
	@CacheLookup
	WebElement validationOutput;

	// Creating the constructor and passing the perameter as driver instance
	public RegisterForDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	// Creating the method for set the first name
	public void setFirstName(String firstName) {
		if (firstNameXpath.isDisplayed()) {
			firstNameXpath.sendKeys(firstName);
			Reporter.log("FirstName is displayed successfully as : " + firstName);
			Reporter.log("FirstName is displayed successfully");
		} else {
			Reporter.log("FirstName is not displayed successfully");
		}
		if (firstNameXpath.isEnabled()) {
			Reporter.log("Firstname is enabled successfully");
		} else {
			Reporter.log("FirstName is not enabled successfully");
		}
	}

	// Creating the method for set the last name
	public void setLastName(String lastName) {
		if (lastNameXpath.isDisplayed()) {
			lastNameXpath.sendKeys(lastName);
			Reporter.log("LastName is displayed successfully as : " + lastName);
			Reporter.log("LastName is displayed successfully");
		}
		if (lastNameXpath.isEnabled()) {
			Reporter.log("LastName is successfully enabled");
		} else {
			Reporter.log("LastName is not enabled successfully");
		}
	}

	// Creating the method for Selecting the gender
	public void selectMaleRadioBtn() {
		if (genderMaleBtnXpath.isDisplayed()) {
			genderMaleBtnXpath.click();
			Reporter.log("Male radio button is selected successfully");
			Reporter.log("Male radio button is displayed successfully");
		} else {
			Reporter.log("Male radio button is not displayed successfully");
		}
		if (genderMaleBtnXpath.isSelected()) {
			Reporter.log("Male radio button is selected successfully");
		} else {
			Reporter.log("Male radio button is not selected succesfully");
			genderMaleBtnXpath.click();
		}
	}

	// Creating the method for Street Address
	public void setStreetName(String streetName) {
		if (streetAddressXpath.isDisplayed()) {
			streetAddressXpath.sendKeys(streetName);
			Reporter.log("StreetName is displayed successfully as : " + streetName);
			Reporter.log("StreetName is displayed successfully");
		} else {
			Reporter.log("StreetName is not displayed successfully");
		}
		// Street name is enabled or not
		if (streetAddressXpath.isEnabled()) {
			Reporter.log("Streetname is enabled successfully");
		} else {
			Reporter.log("Streetname is not enabled successfully");
		}
	}

	// Creating the method for Appartment Address
	public void setAppartmentName(String appartmenmtName) {
		if (apparmentAddressXpath.isDisplayed()) {
			apparmentAddressXpath.sendKeys(appartmenmtName);
			Reporter.log("Appartment name is displayed successfully as : " + appartmenmtName);
			Reporter.log("Appartment name is displayed successfully");
		} else {
			Reporter.log("Appartment name is not displayed successfully");
		}
		// Verify Appartment field is enabled or not.
		if (apparmentAddressXpath.isEnabled()) {
			Reporter.log("The appartmentname is enabled successfully");
		} else {
			Reporter.log("The appartmentname is not enabled successfully");

		}
	}

	// Creating the method for City Name address
	public void setCityName(String cityName) {
		if (cityNameXpath.isDisplayed()) {
			cityNameXpath.sendKeys(cityName);
			Reporter.log("CityName is displayed successfully as :" + "" + cityName);
			Reporter.log("CityName is displayed successfully");
		} else {
			Reporter.log("CityName is not displayed successfully");
		}
		// verify the cityname is enabled or not
		if (cityNameXpath.isEnabled()) {
			Reporter.log("The city name is enabled successfully");
		} else {
			Reporter.log("The Cityname is not enabled successfully");
		}
	}

	// Creating the method for State Name address
	public void setStateName(String stateName) {
		if (stateNameXpath.isDisplayed()) {
			stateNameXpath.sendKeys(stateName);
			Reporter.log("StateName is displayed successfully as : " + stateName);
			Reporter.log("StateName is displayed successfully");
		} else {
			Reporter.log("StateName is displayed not successfully");
		}
		// Verify the statename is enabled or not.
		if (stateNameXpath.isEnabled()) {
			Reporter.log("The Statename is enabled successfully");
		} else {
			Reporter.log("The Statename is not enabled successfully");
		}
	}

	// Creating the method for Postal code
	public void setPostalCode(String postalCode) {
		if (postalcodeXpath.isDisplayed()) {
			postalcodeXpath.sendKeys(postalCode);
			Reporter.log("Postal code is displayed successfully as : " + postalCode);
			Reporter.log("Postal code is displayed successfully");
		} else {
			Reporter.log("Postal code is not displayed successfully");
		}
		if (postalcodeXpath.isEnabled()) {
			Reporter.log("The Postal code is enabled successfully");
		} else {
			Reporter.log("The Postalcode is not enabled successfully");
		}
	}

	// Creating the method for country Name dropdown
	public void selectCountryName(String countryName) {
		if (countryDropdownXpath.isEnabled()) {
			Select selectCountry = new Select(countryDropdownXpath);
			selectCountry.selectByValue(countryName);
			Reporter.log("CountryName is selected successfully as :" + countryName);
			Reporter.log("CountryName is enabled successfully");
		} else {
			Reporter.log("CountryName is not enabled successfully");
		}
		if (countryDropdownXpath.isDisplayed()) {
			Reporter.log("CountryName is displayed successfully");
		} else {
			Reporter.log("CountryName is not displayed successfully");
		}
	}

	// Creating the method for Email address
	public void setEmailId(String email) {
		if (emailAddressXpath.isDisplayed()) {
			emailAddressXpath.sendKeys(email);
			Reporter.log("Email Id is displayed successfully as : " + email);
			Reporter.log("Email Id is displayed successfully");
		} else {
			Reporter.log("Email Id is not displayed successfully");
		}
		// Verify the Email field is enabled or not.
		if (emailAddressXpath.isEnabled()) {
			Reporter.log("The Email Id is enabled successfully");
		} else {
			Reporter.log("The Email Id is not enabled successfully");
		}
	}

	// Creating the method for Date of demo
	public void SetDateOfDemo(String dateOfDemo) {
		if (dateOfDemoXpath.isDisplayed()) {
			dateOfDemoXpath.sendKeys(dateOfDemo);
			Reporter.log("Date of demo is displayed successfully as :" + dateOfDemo);
			Reporter.log("Date of demo is displayed successfully");
		} else {
			Reporter.log("Date of demo is not displayed successfully");
		}
		if (dateOfDemoXpath.isEnabled()) {
			Reporter.log("The Date of demo is enabled successfully");
		} else {
			Reporter.log("The Date of demo  is not enabled successfully");
		}
	}

	// Creating the methods for Hours dropdown value
	public void SelectHourDropdown(String hours) {
		if (hoursDropdownXpath.isEnabled()) {
			Select hourSelectValue = new Select(hoursDropdownXpath);
			hourSelectValue.selectByValue(hours);
			Reporter.log("The Hour dropdown is seleced successfully as " + hours);
			Reporter.log("The Hour dropdown is enabled successfully");
		} else {
			Reporter.log("The Hour dropdown is not enabled successfully");
		}
		// Hours dorpdown is displayed or not
		if (hoursDropdownXpath.isDisplayed()) {
			Reporter.log("The Hour dropdown is displayed successfully");
		} else {
			Reporter.log("The Hour dropdown is not displayed successfully");
		}
	}

	// Creating the method for minutes dropdown value
	public void selectMinDropdownValue(String minutes) {
		if (minDropdownXpath.isEnabled()) {
			Select minSelect = new Select(minDropdownXpath);
			minSelect.selectByValue(minutes);
			Reporter.log("The Minute dropdown is selected successfully as : " + minutes);
			Reporter.log("The Minute dropdown is enabled successfully");
		} else {
			Reporter.log("The Minute dropdown is not enabled successfully");
		}
		// Minute dorpdown is displayed or not
		if (minDropdownXpath.isDisplayed()) {
			Reporter.log("The Minute dropdown is displayed successfully");
		} else {
			Reporter.log("The Minute dropdown is not displayed successfully");
		}
	}

	// Creating the method for mobile number
	public void setMobileNumber(String mobileNum) {
		if (mobileNumberXpath.isDisplayed()) {
			mobileNumberXpath.sendKeys(mobileNum);
			Reporter.log("The Mobile number is displayed successfully as :" + mobileNum);
			Reporter.log("The Mobile number is displayed successfully");
		} else {
			Reporter.log("The Mobile number is not displayed successfully");
		}
		if (mobileNumberXpath.isEnabled()) {
			Reporter.log("The Minute dropdown is enabled successfully");
		} else {
			Reporter.log("The Minute dropdown is not enabled successfully");
		}
	}

	// Creating the method for Selenium check box
	public void clickSeleniumCourse() {
		if (seleniumCourseXpath.isSelected()) {
			seleniumCourseXpath.click();
			Reporter.log("Selenium course is selected successfully");
		} else {
			Reporter.log("Selenium course is not selected successfully");

		}
		if (seleniumCourseXpath.isEnabled()) {
			Reporter.log("Selenium course is enabled successfully");
		} else {
			Reporter.log("Selenium course is not enabled successfully");
		}
	}

	// Creating the method for UFT check box
	public void clickUFTCourse() {
		if (uftCourseXpath.isSelected()) {
			uftCourseXpath.click();
			Reporter.log("UFT course is selected successfully");
		} else {
			Reporter.log("UFT course is not selected successfully");
		}
		if (uftCourseXpath.isEnabled()) {
			Reporter.log("UFT course is enabled successfully");
		} else {
			Reporter.log("UFT course is not enabled successfully");
		}
	}

	// Creating the method for TestNg check box
	public void clickTestNGCourse() {
		if (testNgCourseXpath.isSelected()) {
			testNgCourseXpath.click();
			Reporter.log("TestNG course is selected successfully");
		} else {
			Reporter.log("TestNG course is not selected successfully");
		}
		if (testNgCourseXpath.isEnabled()) {
			Reporter.log("TestNG course is enabled successfully");
		} else {
			Reporter.log("TestNG course is not enabled successfully");
		}
	}

	// Creating the method for Query box
	public void setQueryInput(String query) {
		if (enterQueryXpath.isDisplayed()) {
			enterQueryXpath.sendKeys(query);
			Reporter.log("The Query is displayed as : " + query);
			Reporter.log("The Query is displayed successfully");
		} else {
			Reporter.log("The Query is not displayed successfully");
		}
		if (enterQueryXpath.isEnabled()) {
			Reporter.log("The Query is enabled successfully");
		} else {
			Reporter.log("The Query is not enabled successfully");
		}
	}

	// Creating the method for Two digits verification code
	public void setTwoDigitExampleCode() {
		if (exampleCodeXpath.isDisplayed()) {
			System.out.println("The Verification code is displayed successfully");
			String verifyValue = exampleCodeXpath.getText();
			String getValue[] = verifyValue.split(":");
			String finalOutput = getValue[1].trim();
			verificationCodeXpath.sendKeys(finalOutput);
			System.out.println("The displayed two digits value is : " + finalOutput);
			Reporter.log("The two digits verification code is displayed as : " + finalOutput);
			Reporter.log("The two digits verification code is displayed successfully");
		} else {
			Reporter.log("The two digits verification code is not displayed successfully");
		}
		if (verificationCodeXpath.isEnabled()) {
			Reporter.log("The two digits verification code is enabled successfully");
		} else {
			Reporter.log("The two digits verification code is not enabled successfully");

		}
	}

	// Creating the method for submit button
	public void clickSubmitButton() {
		if (submitBtnXpath.isSelected()) {
			Reporter.log("The Submit button is selected successfully");

		} else {
			Reporter.log("The Submit button is not selected successfully");
		}
		submitBtnXpath.click();
		Reporter.log("The registration details are validated successfully");
	}
}
