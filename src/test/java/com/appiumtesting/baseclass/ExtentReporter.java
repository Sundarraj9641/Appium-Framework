package com.appiumtesting.baseclass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	static ExtentReports extent;
	
	public static ExtentReports getExtentReport() {
		
		//path of extent report to generate 
		String path = "C://Users//SUMAHALI//eclipse-workspace//AppiumFramework//Reports//index.html";
		
		//ExtentSparkReporter -- helping class to generate extent report
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		//set repoet name
		reporter.config().setReportName("Appium Automation Report");
		
		//set title name
		reporter.config().setDocumentTitle("Test Report");
		
		//object of extent report
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		//set tester info
		extent.setSystemInfo("Tester", "Sundarraj");
		
		return extent;
		
	}

}
