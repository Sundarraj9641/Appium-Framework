package com.appiumtesting;

import org.testng.annotations.Test;

import com.appiumtesting.baseclass.Configurations;
import com.appiumtesting.pageobject.FormPageObject;
import com.appiumtesting.pageobject.ValidatePricePageObject;

public class ValidatePrice extends Configurations {

	@Test
	public void validateTotalPrice() throws InterruptedException {
		FormPageObject fpo = new FormPageObject(driver);
		
		fpo.countrySetUp("India");
		fpo.setName("Sundarraj");
		fpo.setGender();
		fpo.shopNow();
		
		ValidatePricePageObject vppo = new ValidatePricePageObject(driver);
		
		vppo.pickProducts();
		vppo.verifyPrice();
		
		
		
	}
	
}
