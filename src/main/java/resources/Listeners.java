package resources;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;

public class Listeners implements ITestListener {
	
	base b = new base();
	public void onTestFailure(ITestResult result) {
		
		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
