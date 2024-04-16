package com.appiumtesting.baseclass;

import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.appiumtesting.utils.AppiumUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Configurations extends AppiumUtils {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass(alwaysRun = true)
	public void appiumSetUp() throws URISyntaxException, IOException {

		//give the path of properties file
		FileInputStream fis = new FileInputStream("C://Users//SUMAHALI//eclipse-workspace//AppiumFramework//src//main//java//com//appiumtesting//resources//data.properties");

		//create object for properties class to use the global properties we created
		Properties prop = new Properties();
		
		//pass the object of file input stream
		prop.load(fis);
		
		
		//it will check in maven while running in CLI. if we give the ipAddress in CLI, it take otherwise it will take from properties
		String ipAddress = System.getProperty("ipAddress")!=null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");

		
		
		
		//prop.getProperty("ipAddress") -- get ipAddress from global properties file
//		String ipAddress = prop.getProperty("ipAddress");
		
		//prop.getProperty("port") -- get port from global properties file
		String port = prop.getProperty("port");

		//call the startAppiumServer method from AppiumUtils class and pass the ipAddress and port as a parameter
		//Integer.parseInt(port) -- convert string into integer
		service=startAppiumServer(ipAddress, Integer.parseInt(port));

		//Capabilities -- set the device informations
		UiAutomator2Options options = new UiAutomator2Options();

		// prop.getProperty("AndroidDeviceName") -- get device name from properties file
		options.setDeviceName(prop.getProperty("AndroidDeviceName"));

		// give the path of the APP you want to test
		options.setApp("C://Users//SUMAHALI//eclipse-workspace//Appium//src//test//java//Resource//General-Store.apk");

		//chrome driver set up 
		options.setChromedriverExecutable("C://Users//SUMAHALI//eclipse-workspace//Appium//src//test//java//Resource//chromedriver.exe");

		options.setCapability("ADB_EXEC_TIMEOUT_OPTION", 60000);
		// Appium driver setup
		//"http://192.168.1.101:4723" -- Appium Server Url
		driver = new AndroidDriver(service.getUrl(),options );

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws InterruptedException {

		//closs the app
		driver.quit();

		// stop the appium server
		service.stop();

		Thread.sleep(2000);
	}

}
