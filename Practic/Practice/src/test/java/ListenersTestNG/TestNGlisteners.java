package ListenersTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlisteners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("****Test started******  " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("****Test Success******  " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("****Test Failure******  " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("****Test Skipped******  " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Optional: You can handle this if needed (e.g., partial success scenarios).
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // Optional: Handle timeout scenarios if needed.
    }

    @Override
    public void onStart(ITestContext context) {
        // You can add setup code here, like logging the start of the test suite.
        System.out.println("****Test Suite Started******  " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Log when the test suite finishes.
        System.out.println("****Test Suite Finished******  " + context.getName());
    }
}
