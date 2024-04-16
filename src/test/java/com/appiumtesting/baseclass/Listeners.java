package com.appiumtesting.baseclass;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;

import com.appiumtesting.utils.AppiumUtils;

public class Listeners extends AppiumUtils implements ITestListener{

	//call the getExtentReport() from ExtentReporter class
	ExtentReports extent = ExtentReporter.getExtentReport();

	ExtentTest test;

	AndroidDriver driver;

	//before start the test
	@Override
	public void onTestStart(ITestResult result) {

		//create the test report
		//result.getMethod().getMethodName() -- test name is same as method name
		test = extent.createTest(result.getMethod().getMethodName());
	}


	//if test passes
	@Override
	public void onTestSuccess(ITestResult result) {

		//log with status:Test Passed 
		test.log(Status.PASS, "Test Passed");
	}

	//if test failed
	@Override
	public void onTestFailure(ITestResult result) {

		//log the reason for test fail
		test.fail(result.getThrowable());

		try {
			driver = (AndroidDriver) result.getTestClass().getRealClass().getField("driver")
					.get(result.getInstance());


		} catch (Exception e1) {
			e1.printStackTrace();
		} 

		try {
			
			//call the screenshot method
			//getScreenshot(result.getMethod().getMethodName() -- test case name
			test.addScreenCaptureFromPath(getScreenshot(result.getMethod().getMethodName(), driver), result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {

		//erase any previous data on the report and create a new report
		extent.flush();
	}


}
