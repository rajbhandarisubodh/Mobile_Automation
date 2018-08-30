/**
 * 
 */
package hiup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidKeyCode;

/**
 * @author Subodh
 *Profile page test of specific user by login out if any user is login then logout
 *currently user is test10@hiup.com
 *10 April, 2018
 */
public class profilePage {

	AppiumDriver<MobileElement> driver;
	
	hiupButtonPage objHiupButton = new hiupButtonPage();
	
	public profilePage(AppiumDriver<MobileElement> driver) {
		this.driver =  driver;
	}
	
	// NOTE: all element are define by By in Class hiupButtonPage
	
	public void clickThumbNavButton() {
		
		driver.findElement(objHiupButton.thumbNavButton).click(); 
	}
	
	public void clickThumbNavMainMenu1() {
		
		driver.findElement(objHiupButton.thumbNav_MainMenu1).click();
	}
	
	public void clickThumbNavMainMenu2() {
		
		driver.findElement(objHiupButton.thumbNav_MainMenu2).click();
	}
	
	public void clickMainMenu_SettingsButton() {
		
		driver.findElement(objHiupButton.mainMenu_Settings).click();
	}
	
	public String getUserLoginStatus() {
		
		return driver.findElement(objHiupButton.settings_SignInSignOutButton).getText();
	}
	
	public void clickSettingsSignOutButton() {
		
		driver.findElement(objHiupButton.settings_SignOutButton).click();
		driver.findElement(objHiupButton.signOut_Yes).click();
	}

	public void clickSettingsSignInButton() {
		
		driver.findElement(objHiupButton.settings_SignInButton).click();
		driver.findElement(objHiupButton.LoginRequired_Login).click();
	}
	
	public String getLoginStatus() {
		return driver.findElement(objHiupButton.LoginRequired_Login).getText();
		
	}
	
	public void clickLoginRequired_Login() {
		driver.findElement(objHiupButton.LoginRequired_Login).click();
	}
	
	public String getBuildVerison() {
		
		return driver.findElement(objHiupButton.signIn_BuildVersion).getText(); // build version of app
	}
	
	public void enterSignIn_UserEmail(String userEmail) {
		 System.out.println("Email: "+userEmail);
	 driver.findElement(objHiupButton.signIn_Email).sendKeys(userEmail);
	}
	
	public void enterSignIn_UserPassword(String userPassword) {
		driver.findElement(objHiupButton.signIn_Password).sendKeys(userPassword);
	}
	
	public void clickSignIn_SignInButton() {
		driver.findElement(objHiupButton.signIn_SignInButton).click();
	}
	public void clickMainMenu_Profile() {
		driver.findElement(objHiupButton.mainMenu_Profile).click();
	}
	
	public void clickEditProfile() {
		driver.findElement(objHiupButton.profile_EditProfile).click();
	}

	public void clickEditProfile_SaveButton() {
		driver.findElement(objHiupButton.editProfile_Save).click();
	}
	
	public void enterProfile_Title(String userTitle) {
		driver.findElement(objHiupButton.editProfile_Title).sendKeys(userTitle);
	}
	
	public void enterProfile_Fname(String userFname) {
		driver.findElement(objHiupButton.editProfile_Fname).sendKeys(userFname);
	}
	
	public void enterProfile_Lname(String userLname) {
		driver.findElement(objHiupButton.editProfile_Lname).sendKeys(userLname);
	}
	
	public void enterProfile_MobileCVV(String userMobileCVV) {
		driver.findElement(objHiupButton.editProfile_MobileCVV).sendKeys(userMobileCVV);
	}
	
	public void enterProfile_MobileNumber(String userMobileNumber) {
		driver.findElement(objHiupButton.editProfile_MobileNumber).sendKeys(userMobileNumber);
	}
	
	public void enterProfile_About(String userAbout) {
		driver.findElement(objHiupButton.editProfile_About).sendKeys(userAbout);
	}
	
	public void clickProfile_ChangePhoto() {
		driver.findElement(objHiupButton.editProfile_ChangePhoto).click();
	}
	
	public void clickProfile_ChangePhotoByCamera() {
		driver.findElement(objHiupButton.editProfile_ChangePhotoByCamera).click();
	}
	
	public void clickProfile_ChangePhotoByCamera_ClickCapture() {
		driver.findElement(objHiupButton.editProfile_ChangePhotoByCamera_ClickCapture).click();
	}
	
	public void clickProfile_ChangePhotoByGallery() {
		driver.findElement(objHiupButton.editProfile_ChangePhotoByGallery).click();
	}
	
	public void loginMain(String userEmail, String userPassword) throws InterruptedException {
		

		this.clickThumbNavButton(); 
		this.clickThumbNavMainMenu1();
		this.clickMainMenu_SettingsButton(); //Settings page
		
//get user login status
		
		String loginStatus = this.getUserLoginStatus();
		
			if(loginStatus.equalsIgnoreCase("Sign out")) { //user sign out if login
				
				System.out.println("User is already login");
				this.clickSettingsSignOutButton();
				System.out.println("User Logout Successfully");
			
			// after logout recall of flow to go to settings page
				this.clickThumbNavButton();
				this.clickThumbNavMainMenu1();
				this.clickMainMenu_SettingsButton();
			}
		
		// User login process
			
		this.clickSettingsSignInButton();
		
		System.out.println("Login Screen Loaded "+'\n');
		
		String BuildVersion =  this.getBuildVerison();
		System.out.println("App. Build version: " + BuildVersion +'\n');
		
		this.enterSignIn_UserEmail(userEmail);
		this.enterSignIn_UserPassword(userPassword);	
		
		driver.hideKeyboard();
		
		this.clickSignIn_SignInButton();

	// wait until login in message to be shown
		WebDriverWait wait =  new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objectPath.settings_SignInSignOut)));
		System.out.println("User Sign In successfully");
		
	}
	
	public void profileMain(String userTitle, String userFname, String userLname, String userMobileCVV
			, String userMobileNumber, String userAbout) throws InterruptedException {
		
		Thread.sleep(1000);
		this.clickThumbNavButton();
		
		this.clickThumbNavMainMenu2();
		
		this.clickMainMenu_Profile();
				
		this.clickEditProfile();
		
		this.clickProfile_ChangePhoto();
		
		this.clickProfile_ChangePhotoByGallery();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		this.clickProfile_ChangePhoto();
		
		this.clickProfile_ChangePhotoByCamera();
		Thread.sleep(1000);
		
		this.clickProfile_ChangePhotoByCamera_ClickCapture();
		
		Thread.sleep(1500);
		
		System.out.println("Profile image changed");
		
		this.enterProfile_Title(userTitle);
		
		this.enterProfile_Fname(userFname);
		
		this.enterProfile_Lname(userLname);
		
		this.enterProfile_MobileCVV(userMobileCVV);
		
		this.enterProfile_MobileNumber(userMobileNumber);
		driver.hideKeyboard();
		
		this.enterProfile_About(userAbout);
		driver.hideKeyboard();
		
		this.clickEditProfile_SaveButton();
		
		System.out.println("Profile Edited Successfully");
		
		Thread.sleep(1500);
		
	}
	
}
