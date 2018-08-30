/**
 * 
 */
package hiup.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hiup.pages.applicationPage;
import hiup.pages.loginPage;
import hiup.pages.trainingPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Subodh
 * May 5, 2018
 * Training test case scenarios
 *
 */
public class training_Test {
	AppiumDriver<MobileElement> driver;

	loginPage objLogin = null;
	trainingPage objTraining = null;

	@BeforeTest
	public void setUp()
	{
		System.out.println("Session Creating...");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1");
		cap.setCapability("deviceName", "s8");
		cap.setCapability("appPackage","co.olivemedia.hihoandroidwebapp");
		cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
		cap.setCapability("autoGrantPermissions","true");
		cap.setCapability("noReset", "true");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void testTraining() throws InterruptedException
	{
		objTraining = new trainingPage(driver);
		objTraining.testTrainingMain();
	}

}
