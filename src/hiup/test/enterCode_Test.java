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

import hiup.pages.enterCodePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Subodh
 * April 24, 2018
 *this class contain the test case of enter code test.
 *Note: Enter Code activity, invalid code submission, valid code submission is only tested
 */
public class enterCode_Test {

	AppiumDriver<MobileElement> driver;
	
	enterCodePage objEnterCode;
	
@BeforeMethod	
	public void setUp() {
	
	System.out.println("Session creating......");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("platform", "Android");
	cap.setCapability("platformVersion", "8.1");
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
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("Session created.");
	}
@AfterMethod	
	public void tearDown() {
		driver.quit();
	}
	
@Test
	public void testEnterCode() throws InterruptedException {
	
	objEnterCode = new enterCodePage(driver);
	
	objEnterCode.enterCodeMain("Nd1iWCX0", "test12345", "test12345");
}


}
