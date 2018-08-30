/**
 * 
 */
package hiup.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import hiup.pages.allActivityPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Subodh, 27 March, 2018
 *
 */
public class allActivity_Test {
	
	AppiumDriver<MobileElement> driver;
	allActivityPage objAllActivity;
	

@BeforeMethod

	public void setUp() {	
		System.out.println("Session creating......");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1");
		cap.setCapability("deviceName", "Samsung S8");
		
		//cap.setCapability("app", System.getProperty("user.dir")+"//app//ApiDemos.apk");	
		//cap.setCapability("udid", "10160a5273cd3302");
		
	//For real device first we need lunch activity
		cap.setCapability("appPackage","co.olivemedia.hihoandroidwebapp");
		cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
		cap.setCapability("autoGrantPermissions","true");
		cap.setCapability("gpsEnabled", "true");
		cap.setCapability("locationContextEnabled", "true");
		cap.setCapability("noReset", "False");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Session Created.");

	}

@Test(priority=1)
public void testAllActivityWithoutLogin() throws InterruptedException {
	
	objAllActivity = new allActivityPage(driver);
	
	objAllActivity.testAllActivityWithoutLogin();
}




@AfterMethod

public void tearDown() {
	driver.quit();
}
	

}
