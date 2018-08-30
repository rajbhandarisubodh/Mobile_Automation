/**
 * 
 */
package hiup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hiup.pages.objectPath;
import hiup.pages.hiupButtonPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


/**
 * @author Subodh
 *loginpage first test copy
 */
public class firstTestPage {

	 AppiumDriver<MobileElement> driver;
	 
	 hiupButtonPage objHiupButton = new hiupButtonPage();

	 
	 // Defining Selectors
//	//thumbNav buttons
//	
//		By thumbNavButton = By.id(objectPath.thumbNav);
//
//		By thumNav_MainMenu1 = By.xpath(objectPath.thumbNav_mainMenu1);
//		
//		By thumNav_MainMenu2 = By.xpath(objectPath.thumbNav_mainMenu2);
//		
//		By settingsButton = By.xpath(objectPath.mainMenu_Settings);
//		
//		By settings_SignInSignOutButton = By.xpath(objectPath.settings_SignInSignOut);
//		
//		
//	//Login required dialogue
//		
//		By LoginRequired_Login = By.xpath(objectPath.loginRequired_Login);
//		
//		By LoginRequied_SignUp = By.xpath(objectPath.loginRequired_Login);
//		
//		By LoginRequired_Cancel = By.xpath(objectPath.loginRequired_Cancel);
//		
//	// Sign out dialogue
//		
//		By signOut_Yes = By.xpath(objectPath.signOut_Yes);
//		
//		By signOut_No = By.xpath(objectPath.signOut_No);
//		
//	// SignIn Page
//		
//		By signIn_BuildVersion = By.id(objectPath.signIn_BuildVersion);
//				
//		By signIn_Email = By.id(objectPath.signIn_Email);
//		
//		By signIn_Password = By.id(objectPath.signIn_Password);
//		
//		By signIn_SignInButton = By.id(objectPath.signIn_SignInBtn);
//		
//		By signIn_ExitButton = By.id(objectPath.signIn_Cancel);
		
		
		public void loginPage(AppiumDriver<MobileElement> driver) {
			this.driver = driver;
		}
	
		
		public void clickThumbNavButton() {
			
			driver.findElement(objHiupButton.thumbNavButton).click(); 
		}
		
		public void clickThumbNavMainMenu1() {
			
			driver.findElement(objHiupButton.thumbNav_MainMenu1).click();
		}
		
		public void clickThumbNavMainMenu2() {
			
			driver.findElement(objHiupButton.thumbNav_MainMenu2).click();
		}
		
		public void clickSettingsButton() {
			
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
		
		public String getBuildVerison() {
			
			return driver.findElement(objHiupButton.signIn_BuildVersion).getText(); // build version of app
		}
		
		public void enterUserEmail(String userEmail) {
			
		 driver.findElement(objHiupButton.signIn_Email).sendKeys(userEmail);
		}
		
		public void enterUserPassword(String userPassword) {
			driver.findElement(objHiupButton.signIn_Password).sendKeys(userPassword);
		}
		
		
		public void loginMain(String userEmail, String userPassword) throws InterruptedException {
			
	//app job activity
		
			this.clickThumbNavButton(); 
			this.clickThumbNavMainMenu1();
			this.clickSettingsButton(); //Settings page
			
	//get user login status
			
			String loginStatus = this.getUserLoginStatus();
			
				if(loginStatus.equalsIgnoreCase("Sign out")) { //user sign out if login
					
					System.out.println("User is already login");
					this.clickSettingsSignOutButton();
					System.out.println("User Logout Successfully");
				
				// after logout recall of flow to go to settings page
					this.clickThumbNavButton();
					this.clickThumbNavMainMenu1();
					this.clickSettingsButton();
				}
			
			// User login process
				
			this.clickSettingsSignInButton();
			
			System.out.println("Login Screen Loaded "+'\n');
			
			String BuildVersion =  this.getBuildVerison();
			System.out.println("App. Build version: " + BuildVersion +'\n');
			
			this.enterUserEmail(userEmail);
			this.enterUserPassword(userPassword);	
			
			driver.hideKeyboard();
			
			driver.findElement(objHiupButton.signIn_SignInButton).click(); // click sign in button
	
		// wait until login in message to be shown
			WebDriverWait wait =  new WebDriverWait(driver, 20);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objectPath.settings_SignInSignOut)));
			System.out.println("User Sign In successfully");
			System.out.println("Login User Test pass");
			
		}
	// main function to test functions of this class
//		public static void main(String[] args) {
//			
//			System.out.println("AThumbnacev " + path.thumbNav);
//		}
}
