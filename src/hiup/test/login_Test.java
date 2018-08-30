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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import hiup.pages.hiupButtonPage;
import hiup.pages.loginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author subodh 8 Feb 2018
 * upddate 26 july, 2018
 *
 */
public class login_Test {
	
	AppiumDriver<MobileElement>	driver;
	hiupButtonPage objNavigationButton;
	loginPage objLogin;
	
	long startTime = System.currentTimeMillis();
	
@BeforeTest
		public void setUp() {	
		System.out.println("Session creating......");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0");
		cap.setCapability("deviceName", "Samsung S7");
		
		//cap.setCapability("app", System.getProperty("user.dir")+"//app//ApiDemos.apk");	
		//cap.setCapability("udid", "10160a5273cd3302");
		
	//For real device first we need lunch activity
		cap.setCapability("appPackage","co.olivemedia.hihoandroidwebapp");
		cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
		cap.setCapability("autoGrantPermissions","true");
	
		cap.setCapability("gpsEnabled", "true");
		cap.setCapability("locationContextEnabled", "true");
		cap.setCapability("noReset", true);
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Session Created");

	}

@Test (priority = 0, description = "user login when login = 0")

	public void userLogin1() throws InterruptedException {
	
		objLogin = new loginPage(driver);
	
		System.out.println("1.Test Case 1"+'\n');
	// login user
	
		objLogin.loginUser1("subodh@hiup.com", "test12345");
		
}

@Test (priority = 1, description = "user login when login = 1")
	public void userLogin2() throws InterruptedException {

	//login user
	System.out.println("2.Test Case 2"+'\n');
		objLogin.loginUser2("subodh@hiup.com", "test12345");

}

@Test (priority = 2, description = "user logout test")	
	public void userLogout() throws InterruptedException {

	//login user
		System.out.println("3.Test Case 3"+'\n');
		objLogin.userLogout();
		long endTime = System.currentTimeMillis();

		System.out.println("Total Execution Time:" + ((endTime - startTime)/100));
}

@AfterTest
	public void tearDown() {
		driver.quit();
}

public static void main(String[] args) throws InterruptedException {
	
	login_Test obj = new login_Test();
	obj.setUp();
	obj.userLogin1();
	//obj.userLogin2();
	//obj.userLogout();
	obj.tearDown();
}
	
}
