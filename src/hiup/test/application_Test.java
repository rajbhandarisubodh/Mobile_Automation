/**
 * 
 */
package hiup.test;

import java.net.MalformedURLException;
import java.net.URL;import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hiup.pages.applicationPage;
import hiup.pages.loginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author user
 *
 */
public class application_Test {

	AppiumDriver<MobileElement> driver;

	loginPage objLogin = null;
	applicationPage objApplication = null;

	@BeforeTest
	public void setUp()
	{
		System.out.println("Session Creating...");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0");
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

	@Test(priority=1)
	public void userLogin() throws InterruptedException
	{
		objLogin = new loginPage(driver);
		objLogin.loginMain("subodh@hiup.com", "test12345");
	}
	@Test(priority=2)
	public void applicationTest() throws InterruptedException
	{
		objApplication = new applicationPage(driver);
		objApplication.applicationTabTestScenario();
	}

	@Test(priority=3)
	public void interviewTest() throws InterruptedException
	{
		//objApplication = new applicationPage(driver);
		objApplication.interviewTabTestScenarios();
	}

	@Test(priority=4)
	public void offerTest() throws InterruptedException
	{
	//	objApplication = new applicationPage(driver);
		objApplication.offerTabTestScenarios();

	}
}