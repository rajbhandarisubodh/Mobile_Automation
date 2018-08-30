package hiup.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidKeyCode;


// update 26 july, 2018
public class signUpPage {
	
		static AppiumDriver<MobileElement> driver; 
// static driver for public  access from another function
				
		 hiupButtonPage objHiupButton = new hiupButtonPage(); // class of buttons locators
		 
		// Defining Selectors
			
		//thumbNav buttons
			
			By thumbNavButton = By.id(objectPath.thumbNav);
			
			By thumbNav_MainMenu = By.id(objectPath.thumbNav_mainMenu);
			
			By mainMenu_Settings =  By.xpath(objectPath.mainMenu_Settings);
			
			By mainMenu_Logout = By.xpath(objectPath.mainMenu_Logout);

			By settings_SignInSignOut = By.xpath(objectPath.settings_SignInSignOut);

		//Login required dialogue
			
			By loginRequired_Title = By.id(objectPath.loginRequired_Title);
			
			By LoginRequired_Login = By.xpath(objectPath.loginRequired_Login);
			
			By LoginRequied_SignUp = By.xpath(objectPath.loginRequired_SignUp);
			
			By LoginRequired_Cancel = By.xpath(objectPath.loginRequired_Cancel);
			
			
		// Sign out dialogue
			
			By signOut_Yes = By.xpath(objectPath.signOut_Yes);
						
			By signOut_No = By.xpath(objectPath.signOut_No);	
			
		// SignIn Page
			
			By signIn_BuildVersion = By.id(objectPath.signIn_BuildVersion);
					
			By signIn_Email = By.id(objectPath.signIn_Email);
			
			By signIn_Password = By.id(objectPath.signIn_Password);
			
			By signIn_SignInButton = By.id(objectPath.signIn_SignInBtn);
			
			By signIn_ExitButton = By.id(objectPath.signIn_Cancel);
		
	// Sign Up
			
			By signUp_Email = By.xpath(objectPath.signUp_Email);
			
			By signUp_ConfirmEmail = By.xpath(objectPath.signUp_ConfirmEmail);
			
			By signUp_FirstName = By.xpath(objectPath.signUp_FirstName);
			
			By signUp_LastName = By.xpath(objectPath.signUp_LastName);
			
			By signUp_Password = By.xpath(objectPath.signUp_Password);
			
			By signUp_ConfirmPassword  = By.xpath(objectPath.signUp_ConfirmPassword);
			
			By signUp_TermsAndConditions  = By.xpath(objectPath.signUp_TermsAndConditions);
			
			By signUp_AgreeCheckbox = By.xpath(objectPath.signUp_AgreeCheckbox);  
			
			By signUp_ContinueNextBtn = By.xpath(objectPath.signUp_ContinueNextBtn); 
			
			By signUp_MobileCC = By.xpath(objectPath.signUp_MobileCC); 
			
			By signUp_MobileNumber = By.xpath(objectPath.signUp_MobileNumber);

			By signUp_Finish = By.xpath(objectPath.signUp_Finish);
			
				
				public signUpPage(AppiumDriver<MobileElement> driver) {
					signUpPage.driver = driver; // since diver is static so className is required
				}
				
				public void clickThumbNavButton() {
					driver.findElement(thumbNavButton).click();
				}
				
				public void clickThumbNavMainMenu() {
					driver.findElement(thumbNav_MainMenu).click();
				}
				
				public void clickSettingsButton() {
					driver.findElement(mainMenu_Settings).click();
				}
				
				public String getUserLoginStatus() {
					return driver.findElement(settings_SignInSignOut).getText();
				}
				
				public void clickSettingsSignInSignUpButton() { // open sign up screen
					driver.findElement(settings_SignInSignOut).click(); 
				}
				
				public void clickLoginRequired_SignUp() {
					driver.findElement(LoginRequied_SignUp).click();
				}
				
				public void clickSignOutYes() { //sign out if any user is already sign in
						driver.findElement(signOut_Yes).click();
				}
				
				public void clickLoginRequired_Login() {
					
					driver.findElement(LoginRequired_Login).click();
				}
				
				public void enterSignUpUserEmail(String userEmail) {
					//Email
						driver.findElement(signUp_Email).sendKeys(userEmail);
					//Keyword Next button
							((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
					//Confirm Email	
								driver.findElement(signUp_ConfirmEmail).sendKeys(userEmail);
									((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
				
				}
				
				public void enterSignUpUserFname(String userFname) {
					driver.findElement(signUp_FirstName).sendKeys(userFname);
						((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
				}
				
				public void enterSignUpUserLname(String userLname) {
					driver.findElement(signUp_LastName).sendKeys(userLname);
			
				}
				
				public void enterSignUpUserPassword(String userPassword) {
					driver.findElement(signUp_Password).sendKeys(userPassword);
						((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
							driver.findElement(signUp_ConfirmPassword).sendKeys(userPassword);
					
				}
				
				public void clickSignUpTermsAndConditions() {
					driver.findElement(signUp_TermsAndConditions).click();
					
				}
				public void clickSignUpAgreeCheckbox() {
					driver.findElement(signUp_AgreeCheckbox).click();
					
				}
				
				public void clickSignUpContinueBtn() {
					driver.findElement(signUp_ContinueNextBtn).click();
				}
				
				public void enterSignUpMobileCC(String userMobileCC) {
					driver.findElement(signUp_MobileCC).sendKeys(userMobileCC);
				}
				
				public void enterSignUpMobileNumber(String userMobileNumber) {
					driver.findElement(signUp_MobileNumber).sendKeys(userMobileNumber);
				}
				
				public String getSignUpFinishBtnText() {
					return driver.findElement(signUp_Finish).getText();
					
				}
				public Boolean settingScreenOpen() {
					 return driver.findElement(settings_SignInSignOut).isDisplayed();
					
				}
				public void clickSignUpFinishBtn() {
					driver.findElement(signUp_Finish).click();
				}
				
				
				public void openSignUpScreen() throws InterruptedException { 
				//Load Sign Up screen
					this.clickThumbNavButton();
					this.clickThumbNavMainMenu();
					this.clickSettingsButton();
			
					String loginStatus = this.getUserLoginStatus();
								
					if(loginStatus.equalsIgnoreCase("Sign Out")) {
						
						// if user is login then sign out user
							
								System.out.println("User is already login. User is being log out.");
									this.clickSettingsSignInSignUpButton();
										Thread.sleep(1000);
										this.clickSignOutYes();
										System.out.println("User logout successfully"+'\n');
										
									// after logout recall of flow to go to settings page

											this.clickThumbNavButton();
												this.clickThumbNavMainMenu();
													this.clickSettingsButton();
								
										}
	
										this.clickSettingsSignInSignUpButton();
											this.clickLoginRequired_SignUp();
												System.out.println("SignUp Screen loaded"+'\n');
				}
				
				
				public void signUpMainWithoutExcel(String userEmail, String userFname, String userLname, 
						String userPassword, String MobileCC, String MobileNumber ) throws InterruptedException {
					
			//P.S: appium1@manualtest.co,....., appiumN@manualtest.co is used for creating user account with direct data
			//    All test used Password, AS IS i.e. test12345
			
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					
					this.enterSignUpUserEmail(userEmail);
					this.enterSignUpUserFname(userFname);
					this.enterSignUpUserLname(userLname);
						((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER); //next button
					
					this.enterSignUpUserPassword(userPassword);
					Thread.sleep(1000);
					driver.hideKeyboard();
					verticalScroll();
					Thread.sleep(1000);
//			to test on oneplus	
//				MobileElement continueButton = driver.findElementById(objectPath.signUp_ContinueNextBtn);
//				if(!continueButton.isDisplayed()) {
//					verticalScroll();
//				}
				
				this.clickSignUpTermsAndConditions();
					Thread.sleep(3000);
					driver.navigate().back();
											
					Thread.sleep(1000);
						this.clickSignUpAgreeCheckbox();
						Thread.sleep(1000);
						this.clickSignUpContinueBtn();
					
						System.out.println("User Details Entered"+'\n');
																		
						try {
				// check condition whether 2nd screen of signup loaded or not to check email is already user or not
							
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							
							WebDriverWait wait = new WebDriverWait(driver, 20);
							wait.until(ExpectedConditions.visibilityOfElementLocated(objHiupButton.signUp_MobileCC));
					
							this.enterSignUpMobileCC(MobileCC);
							this.enterSignUpMobileNumber(MobileNumber);
							driver.hideKeyboard();
													
							this.clickSignUpFinishBtn();
									
							wait.until(ExpectedConditions.visibilityOfElementLocated(objHiupButton.thumbNavButton));
													
							Thread.sleep(5000);
							
							System.out.println("User SignUp Sucessfully"+'\n');
													
						//	String MobileText = null;
//							MobileText = this.getSignUpFinishBtnText();
//							if(MobileText.equalsIgnoreCase("Finish")) {
//								Thread.sleep(2000);
//									this.enterSignUpMobileCC(MobileCC);
//									this.enterSignUpMobileNumber(MobileNumber);
//									driver.hideKeyboard();
//													
//									this.clickSignUpFinishBtn();
//									
//									wait.until(ExpectedConditions.visibilityOfElementLocated(objHiupButton.thumbNavButton));
//													
//									System.out.println("User SignUp Sucessfully"+'\n');
//													}
												
						}
							catch(Exception e) {
								System.out.println("Email is already used.");
								
								Thread.sleep(2500);
								//verticalScroll();
								//this.clickSignUpAgreeCheckbox();
								
								}
												
						System.out.println("Sign Up test case passed");
				}
			
				public static void verticalScroll() {
					
					Dimension dim = driver.manage().window().getSize();
					
					int height = dim.getHeight();
					int width = dim.getWidth();
							
					int x = width/2;
					
					int startY = (int) (height*0.8);
					int endY = (int) (height*0.2);
					
					driver.swipe(x, startY, x, endY, 400);
					
				}
			
}
