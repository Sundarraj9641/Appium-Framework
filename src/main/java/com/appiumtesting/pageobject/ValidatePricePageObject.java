package com.appiumtesting.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ValidatePricePageObject {

	AndroidDriver driver;

	public ValidatePricePageObject(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="com.androidsample.generalstore:id/productAddCart")
	private List<WebElement> products;

	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement addToCartButton;

	@AndroidFindBy(id="com.androidsample.generalstore:id/productPrice")
	private List<WebElement> productPrice;

	@AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
	private WebElement totalPrice;

	public void pickProducts() throws InterruptedException {
		Thread.sleep(2000);
		products.get(0).click();
		products.get(1).click();
	}

	public void verifyPrice() throws InterruptedException {
		addToCartButton.click();
		Thread.sleep(3000);

		int count = productPrice.size();
		double sum =0;

		for (int i=0; i<count; i++) {
			
			String text = productPrice.get(i).getText();

			double amount = Double.parseDouble(text.substring(1));

			sum = sum + amount;
		}

		String strTotal = totalPrice.getText();

		double total = Double.parseDouble(strTotal.substring(1));

		Assert.assertEquals(sum, total);
		System.out.println("Total price is equals to sum of individual product price: "+ total);
	}



}
