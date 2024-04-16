package com.appiumtesting.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumUtils {
	
	public AppiumDriverLocalService service;
	
	
	public AppiumDriverLocalService startAppiumServer(String ipAddress, int port) {
		
		
		//get ipAddress and port as a parameter from configuration class
		service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//SUMAHALI//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress(ipAddress).usingPort(port).build();
		
		service.start();
		
		return service;
	}
	
	public List<HashMap<String, String>> getJsonData(String jsonFilePath) throws IOException{
		
		String jsonContent = FileUtils.readFileToString(new File(jsonFilePath),StandardCharsets.UTF_8);
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper
				.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>(){
		
		});
		
		return data;
		
	}
	
	//pass test name and driver as a argument
	public String getScreenshot(String testCaseName, AndroidDriver driver) throws IOException {
		
		// Create a date object with current date and time
	    Date date = new Date(0);
	    // Create a SimpleDateFormat object with the desired date format
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
	    // Use the formatter to format the date object
	    String dateString = formatter.format(date);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		String destination = "C://Users//SUMAHALI//eclipse-workspace//AppiumFramework//Screenshots//"+ testCaseName +" "+ dateString +".png";
		
		FileUtils.copyFile(src, new File(destination));
		
		return destination;
	}
	

}
