package review;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
@Override
    public void onTestFailure(ITestResult result) {
        System.out.println("i have failed" + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("i have passed : " + result.getName());
    }

    }

