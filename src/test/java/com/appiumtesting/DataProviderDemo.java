package com.appiumtesting;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.appiumtesting.baseclass.Configurations;
import com.appiumtesting.pageobject.FormPageObject;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;




public class DataProviderDemo extends Configurations{

	
	@Test(dataProvider="getData")
	public void formPageUsingDataProvider(String country, String name) {
		FormPageObject fpo = new FormPageObject(driver);

		fpo.countrySetUp(country);
		fpo.setName(name);
		fpo.setGender();
		fpo.shopNow();
	}
	
	@AfterMethod
	public void backToForm() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	

	@DataProvider
	public Object[][] getData() {

		return new Object[][] {
			{"India", "Sundar"},
			{"Benin", "Raj"}
		};

	}

}
