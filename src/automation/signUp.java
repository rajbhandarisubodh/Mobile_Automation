/**
 * 
 */
package automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import automation.objectPath;


/**
 * @author Subodh 29 Jan, 2017
 * this is the signUp test of Hiup version 2.2.1 (65)
 *  *
 *


	/**
	 * @param sigup process and validation
	 */
public class signUp {
	
	static AppiumDriver<MobileElement> driver;
	static objectPath path;
	
@BeforeTest
	public void setUp()
	{
		System.out.println("Session Creating......");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android"); 
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("deviceName", "Samsung Galaxy S7");
		//cap.setCapability("udid", "192.168.9.103:5555");
		cap.setCapability("appPackage", "co.olivemedia.hihoandroidwebapp");
		cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
		cap.setCapability("noReset", "True");
		cap.setCapability("autoGrantPermission", "true");
		cap.setCapability("locationContextEnabled", "true");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Session Created!!");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

@Test
	public static void signUpUser() throws InterruptedException {
	
	// go to setting activity through main menu
	
		for(int i = 0; i<=5; i++)
		{
				Thread.sleep(3000);
				MobileElement thumbNav = driver.findElementByXPath(path.thumbNav);
				thumbNav.click();
				
				MobileElement mainMenuBeforeLogin = driver.findElementByXPath(path.thumbNav_mainMenu1);
				mainMenuBeforeLogin.click();
				
				MobileElement settings = driver.findElementByXPath(path.mainMenu_Settings);
				settings.click();
				
				// Setting Activity
				
				MobileElement signInsignOut = driver.findElementByXPath(path.settings_SignIn);
						
				String text = signInsignOut.getText();
				System.out.println(text);
				
		// check status of user sign in
				
				if(text.equals("Sign out"))
				{
					System.out.println("User already login");
					
					signInsignOut.click();
					
					// click yes btn for logout
					
					driver.findElementByXPath(path.signOut_Yes).click();;
					
					thumbNav.click();
					mainMenuBeforeLogin.click();
					settings.click();
					signInsignOut.click();
					MobileElement signUpBtn  = driver.findElementByXPath(path.loginRequired_SignUp);
					signUpBtn.click();
					
				System.out.println("Loop count: "+i);
				i++;
			}
				else {
				signInsignOut.click();
				MobileElement signUpBtn  = driver.findElementByXPath(path.loginRequired_SignUp);
				signUpBtn.click();
				System.out.println("Loop count: "+i);
				i++;
				}
				
		// Sign Up Form Activity
				
				MobileElement signUpEmail = driver.findElementByXPath(path.signUp_Email);
				signUpEmail.sendKeys(path.signUp_EmailData);
				
				MobileElement signUpConfirmEmail = driver.findElementByXPath(path.signUp_ConfirmEmail);
				signUpConfirmEmail.sendKeys(path.signUp_ConfirmEmailData);
				((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
				
				MobileElement signUpFname = driver.findElementByXPath(path.signUp_FirstName);
				signUpFname.sendKeys(path.signUp_FnameData);
				((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
				
				MobileElement signUpLname = driver.findElementByXPath(path.signUp_LastName);
				signUpLname.sendKeys(path.signUp_LnameData);
				((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);

				MobileElement signUpPassword = driver.findElementByXPath(path.signUp_Password);
				signUpPassword.sendKeys(path.signUp_PasswordData);
				((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
				
				MobileElement signUpConfirmPassword = driver.findElementByXPath(path.signUp_ConfirmPassword);
				signUpConfirmPassword.sendKeys(path.signUp_ConfirmPasswordData);
				System.out.println("Passowrds entered");
				driver.hideKeyboard();
				
				verticalScrollUsingSwipe(); // scroll the screen
				
				MobileElement signUpTermsandConditons = driver.findElementByXPath(path.signUp_TermsAndConditions);
				signUpTermsandConditons.click();
				
				Thread.sleep(5000);
				
				driver.navigate().back();
				
				verticalScrollUsingSwipe(); 
				MobileElement signUpAgreeCheckBox = driver.findElementByXPath(path.signUp_AgreeCheckbox);
				signUpAgreeCheckBox.click();
				
				
				
				MobileElement signUpContinueBtn = driver.findElementByXPath(path.signUp_ContinueNextBtn);
				signUpContinueBtn.click();
				
				Thread.sleep(5000);
				
				MobileElement signUpMobileCC = driver.findElementByXPath(path.signUp_MobileCC);
				signUpMobileCC.sendKeys(path.signUp_MobileCCData);
				
				MobileElement signUpMobileNumber = driver.findElementByXPath(path.signUp_MobileNumber);
				signUpMobileNumber.sendKeys(path.signUp_MobileNumberData);
				driver.hideKeyboard();
				
				MobileElement signUpFinishBtn = driver.findElementByXPath(path.signUp_Finish);
				signUpFinishBtn.click();
				
				System.out.println("SignUp successfully");
				
		}
}

public static void verticalScrollUsingSwipe()
{
	Dimension dim = driver.manage().window().getSize();
	
	int height = dim.getHeight();
	int width = dim.getWidth();
	int x = width/2;
	
	int startY = (int)(height*0.8);
	int endY = (int) (height*0.2);
	
	driver.swipe(x, startY, x, endY,500);
	
	
}

// data entered for sign up form
//public static void signUpForm() throws InterruptedException
//{
//	
//	
//}



	
@AfterTest	
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		signUp obj = new signUp();
		obj.setUp();
		signUpUser();
		obj.tearDown();
		
		
	}

}
