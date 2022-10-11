package com.telus.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.telus.pages.HomePage;
import com.telus.pages.RegisterForDemoPage;
import com.telus.pages.SuccessfulValidationPage;

public class RegisterUserInfo {
	public WebDriver driver;

	@Test(priority = 1)
	public void launchApplicationUrl() {
		// Set the system properties for the chromedriver.
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// Creating the driver instance to the webdriver interface.
		driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/";
		// launching url application.
		driver.get(url);
		// maximing the webpage.
		driver.manage().window().maximize();
		Reporter.log("Application is launched successfully");
	}

	@Test(priority = 2)
	public void navigationRegPage() {
		HomePage homePageObj = PageFactory.initElements(driver, HomePage.class);
		homePageObj.clickOnQaQutomation();
		homePageObj.clickPracticalAutomation();
		homePageObj.clickRegistrationForm();
	}

	@Test(priority = 3)
	public void registerUser() throws InterruptedException {
		RegisterForDemoPage regDemoPage = PageFactory.initElements(driver, RegisterForDemoPage.class);
		regDemoPage.setFirstName("Krishna");
		regDemoPage.setLastName("Kodipalli");
		regDemoPage.selectMaleRadioBtn();
		regDemoPage.setStreetName("DwarakaNagar");
		regDemoPage.setAppartmentName("Brundavanam");
		regDemoPage.setCityName("Singarayakonda");
		regDemoPage.setStateName("AndhraPradesh");
		regDemoPage.setPostalCode("523101");
		regDemoPage.selectCountryName("India");
		regDemoPage.setEmailId("krish9999@gmail.com");
		regDemoPage.SetDateOfDemo("09-08-2022");
		regDemoPage.SelectHourDropdown("05");
		regDemoPage.selectMinDropdownValue("40");
		regDemoPage.setMobileNumber("9234567322");
		regDemoPage.clickSeleniumCourse();
		regDemoPage.clickUFTCourse();
		regDemoPage.clickTestNGCourse();
		regDemoPage.setQueryInput("This course is available for ofline learning ");
		regDemoPage.setTwoDigitExampleCode();
		regDemoPage.clickSubmitButton();
	}

	@Test(priority = 4)

	public void successfullConformMsg() {
		SuccessfulValidationPage successValidMsg = PageFactory.initElements(driver, SuccessfulValidationPage.class);
		successValidMsg.validationSuccessfulMessage();
		Reporter.log("Successfull validation message is done successfully");
	}

	@Test(priority = 5)
	public void closeApplication() {
		driver.close();
		Reporter.log("Application is closed successfully");
	}
}
