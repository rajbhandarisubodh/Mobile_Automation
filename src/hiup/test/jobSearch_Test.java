/**
 * 
 */
package hiup.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hiup.pages.jobSearchPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author subodh
 * 25 april, 2018 
 * this class test all function of job search
 *
 */
public class jobSearch_Test {
	
	AppiumDriver<MobileElement> driver;
	jobSearchPage objJobSearch;
	
@BeforeMethod	
		public void setUp() {
			
	System.out.println("Session creating......");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("platform", "Android");
	cap.setCapability("platformVersion", "8.0");
	cap.setCapability("deviceName", "S8");
	
	cap.setCapability("appPackage", "co.olivemedia.hihoandroidwebapp");
	cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
	cap.setCapability("autoGrantPermissions", "true");
	cap.setCapability("noReset", "true");
	
	try {
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println("Session cre6ated.");
	
		}
@AfterMethod
		public void tearDown() {
			driver.quit();
		}
@Test		
public void testJobSearch() throws InterruptedException {
		
	objJobSearch = new jobSearchPage(driver);
	
	//objWallet.loginMain("qatest1@hiup.com", "test12345");
	
	objJobSearch.jobSearchMain("Dublin");
	}


}
