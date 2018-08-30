package hiup.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidKeyCode;

public class signUpUsingExcelPage {
	
	static AppiumDriver<MobileElement> driver;
	
	hiupButtonPage objHiupButton = new hiupButtonPage();
	
			public signUpUsingExcelPage(AppiumDriver<MobileElement> driver) {
				signUpUsingExcelPage.driver = driver;
			}
		
	
			public void clickThumbNavButton() {
				driver.findElement(objHiupButton.thumbNavButton).click();
			}
			
			public void clickThumbNavMainMenu1() {
				driver.findElement(objHiupButton.thumbNav_MainMenu1).click();
			}
			
			public void clickThumnNavMainMenu2() {
				driver.findElement(objHiupButton.thumbNav_MainMenu2).click();
			}
			
			public void clickSettingsButton() {
				driver.findElement(objHiupButton.mainMenu_Settings).click();
			}
			
			public String getUserLoginStatus() {
				return driver.findElement(objHiupButton.settings_SignInSignOutButton).getText();
			}
			
			public void clickSettingsSignUpButton() { // open sign up screen
				driver.findElement(objHiupButton.settings_SignInButton).click(); 
					driver.findElement(objHiupButton.LoginRequied_SignUp).click();
			}
			
			public void clickSettingsSignOutButton() { //sign out if any user is already sign in
				driver.findElement(objHiupButton.settings_SignOutButton).click();
					driver.findElement(objHiupButton.signOut_Yes).click();
			}
			
			public void enterSignUpUserEmail(String userEmail) {
				//Email
					driver.findElement(objHiupButton.signUp_Email).sendKeys(userEmail);
				//Keyword Next button
						((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
			}
			
			public void enterSignUpUserConfirmEmail(String userConfirmEmail) {
				
				//Confirm Email	
							driver.findElement(objHiupButton.signUp_ConfirmEmail).sendKeys(userConfirmEmail);
								((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
			
			}
			
			public void enterSignUpUserFname(String userFname) {
				driver.findElement(objHiupButton.signUp_FirstName).sendKeys(userFname);
					((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
			}
			
			public void enterSignUpUserLname(String userLname) {
				driver.findElement(objHiupButton.signUp_LastName).sendKeys(userLname);
		
			}
			
			public void enterSignUpUserPassword(String userPassword) {
				driver.findElement(objHiupButton.signUp_Password).sendKeys(userPassword);
					((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
			
				
			}
			
			public void enterSignUpUserConfirmPassword(String userConfirmPassword) {
				
			// Confirm Password
						driver.findElement(objHiupButton.signUp_ConfirmPassword).sendKeys(userConfirmPassword);
				
			}
			
			public void clickSignUpTermsAndConditions() {
				driver.findElement(objHiupButton.signUp_TermsAndConditions).click();
				
			}
			
			public void clickSignUpAgreeCheckbox() {
				driver.findElement(objHiupButton.signUp_AgreeCheckbox).click();
				
			}
			
			public void clickSignUpContinueBtn() {
				driver.findElement(objHiupButton.signUp_ContinueNextBtn).click();
			}
			
			public void enterSignUpMobileCC(int mobileCC) {
				driver.findElement(objHiupButton.signUp_MobileCC).sendKeys(String.valueOf(mobileCC)); //since the value is integer so String.valueof(number) is used
			}
			
			public void enterSignUpMobileNumber(int mobileNumber) {
				driver.findElement(objHiupButton.signUp_MobileNumber).sendKeys(String.valueOf(mobileNumber));
			}
			
			public String getSignUpFinishBtnText() {
				return driver.findElement(objHiupButton.signUp_Finish).getText();
				
			}
			
			public Boolean settingScreenOpen() {
				 return driver.findElement(objHiupButton.settings_SignInSignOutButton).isDisplayed();
				
			}
			
			public void clickSignUpFinishBtn() {
				driver.findElement(objHiupButton.signUp_Finish).click();
			}
		
		
			public void loadSignUpScreen() { 
		//Load Sign Up screen
				this.clickThumbNavButton();
				this.clickThumbNavMainMenu1();
				this.clickSettingsButton();
		
					String loginStatus = this.getUserLoginStatus();
							
					if(loginStatus.equalsIgnoreCase("Sign Out")) { 
			// if user is login then sign out user
							System.out.println("User is already login. User being log out......");
							this.clickSettingsSignOutButton();
							System.out.println("User logout successfully"+'\n');
				
							this.clickThumbNavButton();
							this.clickThumbNavMainMenu1();
							this.clickSettingsButton();
							
									}
	
							this.clickSettingsSignUpButton();
							System.out.println("SignUp Screen loaded"+'\n');
			}
										
			public void signUpMainUsingExcel(String userEmail, String userConfirmEmail, String userFname, String userLname, 
												String userPassword, String userConfirmPassword, int mobileCC, int mobileNumber ) throws InterruptedException {
											

				//         automate1@test.co,...., automateN@test.co is used for creating account through data from Hiup SignUp data.xls file locates at
				//         ->E:\eclipse-java-oxygen-M5-NEW\Workspace-Training\Hiup_Automation\Excel_Files
				//         All test used Password, AS IS i.e. test12345
	
							driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					
											
							this.enterSignUpUserEmail(userEmail);
							this.enterSignUpUserConfirmEmail(userConfirmEmail);
							this.enterSignUpUserFname(userFname);
							this.enterSignUpUserLname(userLname);
							((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER); //next button
											
							this.enterSignUpUserPassword(userPassword);
							this.enterSignUpUserConfirmPassword(userConfirmPassword);
							driver.hideKeyboard();
							Thread.sleep(3000);
							verticalScroll();
							Thread.sleep(1000);
							
							this.clickSignUpTermsAndConditions();
							Thread.sleep(3000);
							driver.navigate().back();
							verticalScroll();
											
								this.clickSignUpAgreeCheckbox();
								Thread.sleep(1000);
								this.clickSignUpContinueBtn();
											
								System.out.println("User Details Entered"+'\n');
						
								try {
									// check condition whether 2nd screen of signup loaded or not to check email is already user or not

								WebDriverWait wait = new WebDriverWait(driver, 20);
								wait.until(ExpectedConditions.visibilityOfElementLocated(objHiupButton.signUp_Finish));
																													
								this.enterSignUpMobileCC(mobileCC);
								this.enterSignUpMobileNumber(mobileNumber);
								driver.hideKeyboard();
																		
								this.clickSignUpFinishBtn();
							
						
								wait.until(ExpectedConditions.visibilityOfElementLocated(objHiupButton.thumbNavButton));
								Thread.sleep(5000);									
								System.out.println("User SignUp Sucessfully"+'\n');
																		
//								String MobileText = null;
//																	
//							try {// check condition whether 2nd screen of signup loaded or not to check email is already user or not
//								driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//									 MobileText = this.getSignUpFinishBtnText();
//										if(MobileText.equalsIgnoreCase("Finish")) {
//										Thread.sleep(2000);
//										this.enterSignUpMobileCC(mobileCC);
//										this.enterSignUpMobileNumber(mobileNumber);
//										driver.hideKeyboard();
//																			
//							this.clickSignUpFinishBtn();
//									WebDriverWait wait = new WebDriverWait(driver, 10);
//								wait.until(ExpectedConditions.visibilityOfElementLocated(objHiupButton.thumbNavButton));
//																			
//									System.out.println("User SignUp Sucessfully"+'\n');
//										}
//																		
//									}
//									catch(Exception e) {
//								System.out.println("Email is already used.");
//									Thread.sleep(1500);
//									this.clickSignUpAgreeCheckbox();
//																		}
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
