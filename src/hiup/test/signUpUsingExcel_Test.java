/**
 * 
 */
package hiup.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hiup.pages.signUpUsingExcelPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author subodh
 * 14 march, 2018
 *
 */
public class signUpUsingExcel_Test {

	/**
	 * @param sign up user using excel file
	 */
	
	AppiumDriver<MobileElement> driver;
	
	signUpUsingExcelPage objSignUpPage;
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static int i;

	
	

@BeforeMethod

	public void setUp() {
	System.out.println("Session creating......");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0");
		cap.setCapability("deviceName", "Samsung");
		
		cap.setCapability("appPackage", "co.olivemedia.hihoandroidwebapp");
		cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
		cap.setCapability("noReset", "true");
		cap.setCapability("autoGrantPermission", "true");
	
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Session created");

	}

@AfterMethod
	
	public void tearDown() {
		driver.quit();
		System.out.println("Session Ended");
	}
@Test(priority=0)
	public void loadSignUpScreen() {
	
		objSignUpPage = new signUpUsingExcelPage(driver);
			objSignUpPage.loadSignUpScreen();
	
	
}
	
@Test(priority=1)
	public void userSignUp() throws InterruptedException {
	
	
	// Read excel file
			File src = new File("E:\\eclipse-java-oxygen-M5-NEW\\Workspace-Training\\Hiup_Automation\\Excel_Files\\Hiup SignUp data.xlsx");
			
			try {
				FileInputStream fis = new FileInputStream(src);
					workbook = new XSSFWorkbook(fis);
						sheet = workbook.getSheetAt(0); // 1st sheet is called sheet 0
							System.out.println("Excel file is Loaded");
			} catch (IOException e) {
				System.out.println("Excel file not found. Please try again.");
					System.out.println(e.getMessage());
			}
			
		
			//P.S: appium1@manualtest.co,....., appiumN@manualtest.co is used for creating user account with direct data
			//         All test used Password, AS IS i.e. test12345

		
	// Define variables to send value to Sign up page function
			String userEmail = null;
			String userConfirmEmail = null;
			String userFname = null;
			String userLname = null;
			String userPassword = null;
			String userConfirmPassword = null;
			
			Integer mobileCC =  null;
			Integer mobileNumber = null;
			Thread.sleep(2000);
			
			for(  i=1; i<=sheet.getLastRowNum(); i++) {
				
				//loop to test email already exist or not
					for(int j = 1; j<=sheet.getLastRowNum();j++) {
					
						String result = sheet.getRow(j).getCell(8).getStringCellValue();
					
							if(result.equalsIgnoreCase("USED")) {
								String email = sheet.getRow(j).getCell(0).getStringCellValue();
									System.out.println("UserEmail: "+email+ " Exist, Retrying next user on list"+'\n');
										i++;
					}
								else {
										break;
									}
				}
					Thread.sleep(2000);
				userEmail = sheet.getRow(i).getCell(0).getStringCellValue();
				
				userConfirmEmail = sheet.getRow(i).getCell(1).getStringCellValue();
				
				userFname = sheet.getRow(i).getCell(2).getStringCellValue();
				
				userLname = sheet.getRow(i).getCell(3).getStringCellValue();
				
				userPassword = sheet.getRow(i).getCell(4).getStringCellValue();
				
				userConfirmPassword = sheet.getRow(i).getCell(5).getStringCellValue();
				
				mobileCC = (int) sheet.getRow(i).getCell(6).getNumericCellValue();
				
				mobileNumber = (int) sheet.getRow(i).getCell(7).getNumericCellValue();
				Thread.sleep(2000);
				 System.out.println("User data row: "+i+'\n'+"Extracted user data for Sign Up:"+'\n'+"Email: "+userEmail+'\n'+"Confirm Email:" +userConfirmEmail+
						 '\n'+"First Name: "+userFname+'\n'+"Last name: "+userLname+'\n'+"Password: "+userPassword+'\n'+"Confirm Password: "+userConfirmPassword+'\n'
						 +"Mobile CC: "+mobileCC+'\n'+"Mobile Number: "+mobileNumber+'\n' );
				
					break;
					
				
			}
			
		// after valid data get then on that cell value PASSED is send to check for next loop
			
		objSignUpPage.signUpMainUsingExcel(userEmail, userConfirmEmail, userFname, userLname, userPassword, userConfirmPassword, mobileCC, mobileNumber);

			try {
				FileOutputStream fos = new FileOutputStream("E:\\eclipse-java-oxygen-M5-NEW\\Workspace-Training\\Hiup_Automation\\Excel_Files\\Hiup SignUp data.xlsx");
				
				sheet.getRow(i).getCell(8).setCellValue("USED");
				workbook.write(fos);
				fos.close();
				System.out.println("Excel file updated and file closed");
				
				
			} catch (Exception e) {
				System.out.println("Excel file not found. Please try again.");
				System.out.println(e.getMessage());
			}
		
		
			System.out.println("Test Passed");
	
	
}



}

