package com.appiumtesting;

import org.testng.annotations.Test;

import com.appiumtesting.baseclass.Configurations;
import com.appiumtesting.pageobject.AddToCartPageObject;
import com.appiumtesting.pageobject.FormPageObject;

public class AddToCart extends Configurations{

	@Test
	public void addTheProductToCart() throws InterruptedException {
		FormPageObject fpo = new FormPageObject(driver);
		AddToCartPageObject atco = new AddToCartPageObject(driver);
		
		fpo.countrySetUp("India");
		fpo.setName("Sundarraj");
		fpo.setGender();
		fpo.shopNow();
		
		atco.addTocart("PG 3");
		atco.verifyProduct();


	}
}
