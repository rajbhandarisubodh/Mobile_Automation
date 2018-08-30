/**
 * 
 */
package automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author subodh 6 dec, 2017 
 *
 */
public class loginLogout {

	/**
	 * @param just basic automation of login and logout
	 */
	AppiumDriver<MobileElement> driver;
@BeforeTest
	public void setUp()
	{
		System.out.println("Session Creating......");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("deviceName", "Samsung Galaxy S7");
		//cap.setCapability("udid", "192.168.9.101:5555");
		cap.setCapability("appPackage", "co.olivemedia.hihoandroidwebapp");
		cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.JobOpeningsActivity");
		//cap.setCapability("appActivity", "")
		cap.setCapability("noReset", "True");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Session Created!!");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterTest	
	public void tearDown()

	{
		driver.quit();
	}
	
@Test
	public void login() throws InterruptedException
	{
		//user login through setting screen
		MobileElement thumbNav = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.Button");
		thumbNav.click();
	
		
		MobileElement mainMenu = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout[4]/android.widget.ImageView");
		mainMenu.click();
		
		MobileElement setting = driver.findElementByXPath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[9]/android.widget.CheckedTextView");
		setting.click();
		
		
		MobileElement signInsignOut = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]");
		signInsignOut.click();
		
		
		MobileElement login = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
		login.click();
		
		
		MobileElement email = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.EditText[1]");
		email.sendKeys("tester5@hiup.com");
		
				
		MobileElement password = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.EditText[2]");
		password.sendKeys("test12345");
		
		Thread.sleep(5000);
		
		MobileElement signInBtn = driver.findElementByXPath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.Button[2]");
		signInBtn.click();
		
		Thread.sleep(8000);
		
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		loginLogout obj = new loginLogout();
		obj.setUp();
		obj.login();
		obj.tearDown();
	}

}
