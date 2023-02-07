package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("test case is fail....plese check", true);
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("test case is pass....", true);
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("test case is skipped plese check....", true);
		
	}

}
