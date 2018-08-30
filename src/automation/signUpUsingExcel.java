/**
 * 
 */
package automation;

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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import automation.objectPath;

/**
 * @author Subodh
 * this test case create user through data provided from excel and using testng
 *
 */
public class signUpUsingExcel {
	
	static AppiumDriver<MobileElement> driver;
	static objectPath path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static int i;

@BeforeTest
	public void setUp(){
		System.out.println("Session Creating......");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Andorid");
		cap.setCapability("platformVersion", "7.1.1");
		cap.setCapability("deviceName", "Samsung Galaxy S7");
		cap.setCapability("appPackage", "co.olivemedia.hihoandroidwebapp");
		cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
		
		cap.setCapability("autoGrantPermission", "true");
		cap.setCapability("noReset", "true");
		
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
	public static void signUpUser() throws  InterruptedException {
	
	// Read excel file
		File src = new File("E:\\eclipse-java-oxygen-M5-NEW\\Workspace-Training\\Hiup_Automation\\Excel_Files\\Hiup SignUp data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			System.out.println("File Read");
		} 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			 System.out.println(e.getMessage());	
		}
		
	
		
		//System.out.println("");
			//initilize variable for accessing outside for loop
			String userEmail = null;
			String confirmEmail = null;
			String fName = null;
			String lName = null;
			String password = null;
			String confirmPassword = null;
			
			Object mobileCC = null;
			
			Object mobileNumber = null;
			 
		// loop for checking test user email is already used or not
		for(i=1;i<=sheet.getLastRowNum(); i++) {
			
			for(int j=1; j<=sheet.getLastRowNum(); j++) {
				
				String result = sheet.getRow(j).getCell(8).getStringCellValue();
			
				if(result.equals("USED"))
				{
					System.out.println("UserEmail:"+i+ " Exist, Retrying next user on list"+'\n');
					i++;
				}
				else {
					break;
				}
				
			}	
			 userEmail = sheet.getRow(i).getCell(0).getStringCellValue();
			
			 confirmEmail = sheet.getRow(i).getCell(1).getStringCellValue();
			
			 fName = sheet.getRow(i).getCell(2).getStringCellValue();
			
			 lName = sheet.getRow(i).getCell(3).getStringCellValue();
			
			 password = sheet.getRow(i).getCell(4).getStringCellValue();
			
			 confirmPassword = sheet.getRow(i).getCell(5).getStringCellValue();
			
			 mobileCC = (int) sheet.getRow(i).getCell(6).getNumericCellValue();
			
			 mobileNumber = (int) sheet.getRow(i).getCell(7).getNumericCellValue();
			 
			 System.out.println("USER number: "+i+'\n'+userEmail+'\n'+confirmEmail+'\n'+fName+'\n'+lName+'\n'+password+'\n'+confirmPassword+'\n'+mobileCC+'\n'+mobileNumber+'\n' );
			
			 
			 break;
		}
		
				//aba data send garna vaki
		
		Thread.sleep(2000);
	// App excecution
		
		MobileElement thumbNav = driver.findElementById(path.thumbNav);
		thumbNav.click();
		
		MobileElement mainMenu1 = driver.findElementByXPath(path.thumbNav_mainMenu1);
		mainMenu1.click();
		
		MobileElement settings = driver.findElementByXPath(path.mainMenu_Settings);
		settings.click();
		
		// Setting Activity
		
		MobileElement signInsignOut = driver.findElementByXPath(path.settings_SignIn);
				
		String text = signInsignOut.getText();
		System.out.println("Current button status: " +text);
		
// check status of user sign in
		
		if(text.equals("Sign out"))
		{
			System.out.println("User already login");
			
			signInsignOut.click();
			
			// click yes btn for logout
			
			driver.findElementByXPath(path.signOut_Yes).click();;
			
			thumbNav.click();
			MobileElement mainMenu2 = driver.findElementByXPath(path.thumbNav_mainMenu2);
			mainMenu2.click();
			settings.click();
			signInsignOut.click();
			
			MobileElement signUpBtn  = driver.findElementByXPath(path.loginRequired_SignUp);
			signUpBtn.click();
			System.out.println('\n'+"User Logout sucessfully");
	}
		else {
		signInsignOut.click();
		MobileElement signUpBtn  = driver.findElementByXPath(path.loginRequired_SignUp);
		signUpBtn.click();

		}
		
// Sign Up Form Activity
		System.out.println('\n'+"Sign Up form open");
		MobileElement signUpEmail = driver.findElementByXPath(path.signUp_Email);
		signUpEmail.sendKeys(userEmail);
		
		
		MobileElement signUpConfirmEmail = driver.findElementByXPath(path.signUp_ConfirmEmail);
		signUpConfirmEmail.sendKeys(confirmEmail);
		((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		
		MobileElement signUpFname = driver.findElementByXPath(path.signUp_FirstName);
		signUpFname.sendKeys(fName);
		((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		
		MobileElement signUpLname = driver.findElementByXPath(path.signUp_LastName);
		signUpLname.sendKeys(lName);
		((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);

		MobileElement signUpPassword = driver.findElementByXPath(path.signUp_Password);
		signUpPassword.sendKeys(password);
		((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		
		MobileElement signUpConfirmPassword = driver.findElementByXPath(path.signUp_ConfirmPassword);
		signUpConfirmPassword.sendKeys(confirmPassword);
		System.out.println("Passowrd entered");
		driver.hideKeyboard();
		
		verticalScrollUsingSwipe(); // scroll the screen
		
		MobileElement signUpTermsandConditons = driver.findElementByXPath(path.signUp_TermsAndConditions);
		signUpTermsandConditons.click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
 
		verticalScrollUsingSwipe(); 
		Thread.sleep(1000);
		
		MobileElement signUpAgreeCheckBox = driver.findElementByXPath(path.signUp_AgreeCheckbox);
		signUpAgreeCheckBox.click();
		
		// continue for next step
		
		MobileElement signUpContinueBtn = driver.findElementByXPath(path.signUp_ContinueNextBtn);
		signUpContinueBtn.click();
		
		
		Thread.sleep(5000);
		// write on excel file
		
		MobileElement signUpMobileCC = driver.findElementByXPath(path.signUp_MobileCC);
		signUpMobileCC.sendKeys(String.valueOf(mobileNumber));
		
		try {
			FileOutputStream fos = new FileOutputStream("E:\\\\eclipse-java-oxygen-M5-NEW\\\\Workspace-Training\\\\Hiup_Automation\\\\Excel_Files\\\\Hiup SignUp data.xlsx");
			
			sheet.getRow(i).createCell(8).setCellValue("USED");
			workbook.write(fos);
			fos.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		MobileElement signUpMobileNumber = driver.findElementByXPath(path.signUp_MobileNumber);
		signUpMobileNumber.sendKeys(String.valueOf(mobileNumber));  //since the value is integer so String.valueof(number) is used
		driver.hideKeyboard();
		
		MobileElement signUpFinishBtn = driver.findElementByXPath(path.signUp_Finish);
		signUpFinishBtn.click();
		
		System.out.println("SignUp successfully");
		
		
		
		Thread.sleep(10000);

}
	
public static void verticalScrollUsingSwipe() {
	Dimension dim= driver.manage().window().getSize();
	
	int height = dim.getHeight();
	int width = dim.getWidth();
	
	int x = width/2;
	
	int startY = (int) (height*0.8);
	int endY = (int) (height*0.2);
	
	driver.swipe(x, startY, x, endY, 500);
}


@AfterTest
public void tearDown() {
	driver.quit();
}
	

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	signUpUsingExcel obj = new signUpUsingExcel();
	obj.setUp();
	signUpUser();
	obj.tearDown();
	
	
}
}
