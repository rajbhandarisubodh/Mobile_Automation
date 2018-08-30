package hiup.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hiup.pages.forgotPasswordPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class forgetPassword_Test {
	
	
	AndroidDriver<MobileElement> driver;
	
	forgotPasswordPage objForgetPassword;
	
	long startTime = System.currentTimeMillis();


@BeforeMethod

	public void setUp() {
		
	
		System.out.println("Session creating....");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1");
		cap.setCapability("deviceName", "Samsung s7");
		cap.setCapability("appPackage", "co.olivemedia.hihoandroidwebapp");
		
		cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
		cap.setCapability("autoGrantPermissions", "true");
		cap.setCapability("locationContextEnabled", "true");
		cap.setCapability("noReset", "true");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Session Created");
		
	}
@Test	
	public void userForgetPassword() throws InterruptedException {
		
		objForgetPassword = new forgotPasswordPage(driver);
		
		objForgetPassword.forgotPasswordMain("test1@hiup.com");
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total execution time:"+((endTime-startTime)/100));
	}

@AfterMethod


	public void tearDown() {
		System.out.println("Session Exiting...");
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		forgetPassword_Test obj = new forgetPassword_Test();
		
		obj.setUp();
		obj.userForgetPassword();
		obj.tearDown();
		

	}

}
