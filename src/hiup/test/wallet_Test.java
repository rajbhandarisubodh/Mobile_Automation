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

import hiup.pages.walletPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author ubodh
 * 24 April, 2018
 * test of wallet activity
 */
public class wallet_Test {
	
	AppiumDriver<MobileElement> driver;
	walletPage objWallet;
	
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
	System.out.println("Session created.");
	
		}
@AfterMethod
		public void tearDown() {
			driver.quit();
		}
@Test (priority=1)		
	public void userLogin() throws InterruptedException {
			
		objWallet = new walletPage(driver);
		
		//objWallet.loginMain("qatest1@hiup.com", "test12345");
		
		objWallet.walletMain();
		}


}
