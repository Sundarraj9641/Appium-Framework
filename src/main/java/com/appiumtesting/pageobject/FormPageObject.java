package com.appiumtesting.pageobject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPageObject extends AndroidActions {
	
	AndroidDriver driver;
	
	public FormPageObject(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countryDropDown;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"com.androidsample.generalstore:id/nameField\"]")
	private WebElement nameField;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement gender;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement shopNowButton;
	
	public void countrySetUp(String country) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(countryDropDown));
		countryDropDown.click();
		AndroidActions aa = new AndroidActions(driver);
		aa.scrollAndClick(country);

	}
	

	public void setName(String name) {
		nameField.sendKeys(name);
	}
	
	public void setGender() {
		if(!gender.isSelected()) {
			gender.click();
		}
	}
	
	public void shopNow() {
		shopNowButton.click();
	}
	
}
