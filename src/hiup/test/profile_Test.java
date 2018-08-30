/**
 * 
 */
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

import hiup.pages.profilePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author subodh 
 * Profile page test
 *
 */
public class profile_Test {

	AppiumDriver<MobileElement>	driver;
	profilePage objProfile;
	
@BeforeTest

	public void setUp() {	
		System.out.println("Session creating......");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("deviceName", "Samsung S8");
		
		
		//cap.setCapability("app", System.getProperty("user.dir")+"//app//ApiDemos.apk");	
		//cap.setCapability("udid", "10160a5273cd3302");
		
	//For real device first we need lunch activity
		cap.setCapability("appPackage","co.olivemedia.hihoandroidwebapp");
		cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
		cap.setCapability("autoGrantPermissions","true");
	
		cap.setCapability("gpsEnabled", "true");
		cap.setCapability("locationContextEnabled", "true");
		cap.setCapability("noReset", "True");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Session Created");

	}
	

@AfterTest

	public void tearDown() {
		driver.quit();
	}

@Test(priority=0)

	public void userLogin() throws InterruptedException {
	
	objProfile = new profilePage(driver);
	
	objProfile.loginMain("subodh@hiup.com", "test12345");
}

@Test(priority=1)

	public void profileMain() throws InterruptedException {
	
	objProfile.profileMain("MR", "Subodh", "QA edited", "112", "0123456789", "This profile is edited by automation.");
}




}
