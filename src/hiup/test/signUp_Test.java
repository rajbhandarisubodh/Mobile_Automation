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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hiup.pages.signUpPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

//update 26 july, 2018
public class signUp_Test {

	AppiumDriver<MobileElement> driver;

	signUpPage objSignUpPage;
	
	long startTime = System.currentTimeMillis();

	@BeforeMethod

	public void setUp() {

		System.out.println("Session creating......");
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0.0");
		cap.setCapability("deviceName", "S8");

		//cap.setCapability("app", System.getProperty("user.dir")+"\\app\\Hiup_2.2.2_70.apk");

		cap.setCapability("appPackage", "co.olivemedia.hihoandroidwebapp");
		cap.setCapability("appActivity","co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
		cap.setCapability("noReset", "true");
		cap.setCapability("autoGrantPermission", "true");
		//cap.setCapability("appWaitActivity", "co.olivemedia.hihoandroidwebapp.activities.SettingsActivity");

		cap.setCapability("gpsEnabled", "true");

		try {
			xtch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Session created");
	}

@Test(priority=0, description = "Single user sign up")

	public void loadSignUpScreen() throws InterruptedException { //open signup screen
		objSignUpPage = new signUpPage(driver);

		objSignUpPage.openSignUpScreen();
		objSignUpPage.signUpMainWithoutExcel("test@hiup.com", "Hiup", "Tester", "test12345", "977", "123456789");	
		long endTime = System.currentTimeMillis();

		System.out.println("Total Execution Time:" + ((endTime - startTime)/100));

	}
	//@Test(priority=1, description = "Multiple user sign up on loop")
	public void userSignUp() throws InterruptedException {

		objSignUpPage = new signUpPage(driver);
		Boolean flag = false;

		for(int i =1; i<=5; i++) {

			try { 
		// to test that user sign up successfully by checking the status of screen i.e setting that need to be load after signup
			
				objSignUpPage.openSignUpScreen();
				objSignUpPage.signUpMainWithoutExcel("manual"+i+"@test.co", "Appium", "Manual"+i, "test12345", "44", "123456789");	

				// P.S: manual1@test.co ,....., manualN@test.co is used for creating user account with direct data
				// automate1@test.co ,...., automateN@test.co is used for creating account through data from Hiup SignUp data.xls file locates at
				// ->E:\eclipse-java-oxygen-M5-NEW\Workspace-Training\Hiup_Automation\Excel_Files
				// All test used Password, AS IS i.e. test12345

				Thread.sleep(2000);
				flag = objSignUpPage.settingScreenOpen();
				if(flag = true) { // if settinh screen will open then loop will break considering user if logina
					System.out.println("User Email: "+"manual"+i+"test.co is Created");
					break;
				}

			}
			catch(Exception e)
			{
				System.out.println("User:"+i+" already exist");	
				System.out.println("User Email: "+"manual"+i+"@test.co is already exist"+'\n');

			}

		}

		System.out.println("User SignUp Test Completed"+'\n');
		long endTime = System.currentTimeMillis();

		System.out.println("Total Execution Time:" + ((endTime - startTime)/100)+ " SECS");
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
		System.out.println("Session End");
	}
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		signUp_Test obj = new signUp_Test();

		obj.setUp();
		obj.userSignUp();
		obj.tearDown();

	}

}
