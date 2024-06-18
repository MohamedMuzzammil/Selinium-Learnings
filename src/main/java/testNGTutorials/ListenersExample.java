package testNGTutorials;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.IListenersAnnotation;
import org.testng.internal.annotations.IListeners;

public class ListenersExample implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
        System.out.println("The test case is going to execute");		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The test case is Passed");		

		
		}
		
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The test case is failed");		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test case is Skipped");			
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The test case is passed");			
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Before complie");			
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("After complie");				
	}

	
	
		
	}

