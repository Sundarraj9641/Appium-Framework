package com.appiumtesting;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.appiumtesting.baseclass.Configurations;
import com.appiumtesting.pageobject.FormPageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
public class DataFromJson extends Configurations{

	AndroidDriver driver;

	@Test(dataProvider="getData")
	public void formPageUsingDataProvider(HashMap<String,String> input) {
		FormPageObject fpo = new FormPageObject(driver);

		fpo.countrySetUp(input.get("country"));
		fpo.setName(input.get("name"));
		fpo.setGender();
		fpo.shopNow();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}



	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonData("C://Users//SUMAHALI//eclipse-workspace//AppiumFramework//src//main//java//Resources//datafromjson.json");
		
		return new Object[][] { {data.get(0)},{data.get(1)}  };

	}

}
