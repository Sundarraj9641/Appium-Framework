package com.appiumtesting;

import org.testng.annotations.Test;

import com.appiumtesting.baseclass.Configurations;
import com.appiumtesting.pageobject.FormPageObject;

public class Form extends Configurations{
	
	@Test(groups= {"Smoke"})
	public void formPage() {
		FormPageObject fpo = new FormPageObject(driver);
		
		fpo.countrySetUp("India");
		fpo.setName("Sundarraj");
		fpo.setGender();
		fpo.shopNow();
	}

}
