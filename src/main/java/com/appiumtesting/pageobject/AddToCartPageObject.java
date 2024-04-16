package com.appiumtesting.pageobject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddToCartPageObject extends AndroidActions {

	AndroidDriver driver;
	WebDriverWait wait;
	String itemName;

	public AddToCartPageObject(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	@AndroidFindBy(id="com.androidsample.generalstore:id/productName")
	private List<WebElement> productList;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productAddCart")
	private List<WebElement> addToCart;

	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement addToCartLogo;

	@AndroidFindBy(id="com.androidsample.generalstore:id/productName")
	private WebElement productName;
	

	public void addTocart(String itemName) {
		this.itemName=itemName;
		AndroidActions aa = new AndroidActions(driver);
		aa.scrollToElement(itemName);

		int count = productList.size();

		for(int i =0; i<count; i++) {

			String product = productList.get(i).getText();

			if(product.equalsIgnoreCase(itemName)) {
				addToCart.get(i).click();
			}
		}

	}
	
	public void verifyProduct() throws InterruptedException {
		
		addToCartLogo.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOfAllElements(productName));
		String product_Name = productName.getText();
		Assert.assertEquals(product_Name, itemName);
	}
}
