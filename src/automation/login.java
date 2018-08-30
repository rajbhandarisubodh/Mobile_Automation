/**
 * 
 */
package automation;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import automation.objectPath; // import from class objectPath


/**
 * @author Subodh, 24 jan 2018
 *
 */
public class login {

	/**
	 * @param user login using data from excel
	 * 
	 * MobileElement is accessed from class objectPath
	 */

	static AppiumDriver<MobileElement> driver;
	static objectPath path; // public access
	static XSSFWorkbook wb;
	static XSSFSheet sh1;
	
@BeforeTest
	public void setUp() {	
		System.out.println("Session creating......");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("deviceName", "Samsung");
		
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

@Test
		public static void loginUser() throws InterruptedException // public access to access data from class objectPath
		{
	
	// file location
			File src = new File("E:\\eclipse-java-oxygen-M5-NEW\\Workspace-Training\\Hiup_Automation\\Excel_Files\\Hiup Login Emails.xlsx");
			try {
		// load file
			FileInputStream fis = new FileInputStream(src);
		// load workbook
			 wb = new XSSFWorkbook(fis);
		//load sheet
			sh1 = wb.getSheetAt(0);
			
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			

				String useremail = sh1.getRow(1).getCell(1).getStringCellValue();
				System.out.println("User Email: "+useremail );
				
				String userpassword = sh1.getRow(1).getCell(2).getStringCellValue();
				System.out.println("User Password: "+userpassword );
			
		// go to setting activity through main menu
	
			Thread.sleep(3000);
			MobileElement thumbNav = driver.findElementById("co.olivemedia.hihoandroidwebapp:id/control_hint");
			thumbNav.click();
		
		// mainMenu1 is before login and mainMenu2 is after login as xpath changes
			MobileElement mainMenu1 = driver.findElementByXPath(path.thumbNav_mainMenu1);
			mainMenu1.click();
			
			MobileElement settings = driver.findElementByXPath(path.mainMenu_Settings);
			settings.click();
			
			// Setting Activity
			
			MobileElement signInsignOut = driver.findElementByXPath(path.settings_SignIn);
			
			String text = signInsignOut.getText();
			System.out.println("SignIn SignOut Button current Status: " +text);
			
				if(text.equals("Sign out"))
				{
					System.out.println("User already login");
					signInsignOut.click();
				//sign out login user
					
					driver.findElementByXPath(path.signOut_Yes).click();;
					
					System.out.println("User Logout successfully");
					
					thumbNav.click();
					 
					MobileElement mainMenu2 = driver.findElementByXPath(path.thumbNav_mainMenu2);
					mainMenu2.click(); // after user get logout mainmenu xpath changes
					
					settings.click();
					
				}
	
	// setting activity 
				
			signInsignOut.click();
			
			MobileElement dialogueLoginBtn = driver.findElementByXPath(path.loginRequired_Login);
			dialogueLoginBtn.click();
			
			MobileElement email = driver.findElementByXPath(path.signIn_Email);
			email.sendKeys(useremail);
			
					
			MobileElement password = driver.findElementByXPath(path.signIn_Password);
			password.sendKeys(userpassword);

			driver.hideKeyboard();
			
			MobileElement signInBtn = driver.findElementByXPath(path.singIn_SignInBtn);
			signInBtn.click();
			
			Thread.sleep(2000);
			System.out.println("User login successfully");

			
			thumbNav.click();
		

			MobileElement jobFeed2 = driver.findElementByXPath(path.thumbNav_JobFeed2);
			jobFeed2.click();
			
			Thread.sleep(4000);
		
			System.out.println("Test Cases End");

		}



@AfterTest
	public void tearDown()
		{
			driver.quit();
		}

		public static void main(String[] args) throws InterruptedException
			{
			   
				//objectPath pathObj = new objectPath();
				login obj = new login();
				obj.setUp();
				loginUser();
				obj.tearDown();
				
			}


}
