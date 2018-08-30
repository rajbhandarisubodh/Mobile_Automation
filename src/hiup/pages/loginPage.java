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
import net.jcip.annotations.ThreadSafe;


/**
 * @author Subodh update: 26 July, 2018
 *
 */
public class loginPage {

	protected AppiumDriver<MobileElement> driver;

	protected hiupButtonPage objElementPath = new hiupButtonPage();
	
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
	
// Define Constructor	
	public loginPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

//	ThumbNav
	public void clickThumbNavButton() {

		driver.findElement(thumbNavButton).click(); 
	}

	public void clickThumbNavMainMenu() {

		driver.findElement(thumbNav_MainMenu).click();
	}

	public void clickMainMenu_SettingsButton() {

		driver.findElement(mainMenu_Settings).click();
	}

	public void clickMainMenu_Logout() {
		
		driver.findElement(mainMenu_Logout).click();
	}
	
	public String getLoginStatus() {

		return driver.findElement(settings_SignInSignOut).getText();
	}
	
// sign in
	public void clickSettingsSignInSignOutButton() {

		driver.findElement(settings_SignInSignOut).click();
	}
	
	public void clickLoginRequired_Login() {
		
		driver.findElement(LoginRequired_Login).click();
	}
	
	public String getLoginAlertTitle()
	{
		return driver.findElement(objElementPath.loginRequired_Title).getText();
		
	}
	
	public String getBuildVerison() {

		return driver.findElement(signIn_BuildVersion).getText(); // build version of app
	}

	public void enterSignIn_UserEmail(String userEmail) {

		driver.findElement(signIn_Email).sendKeys(userEmail);
	}

	public void enterSignIn_UserPassword(String userPassword) {
		driver.findElement(signIn_Password).sendKeys(userPassword);
	}

	public void clickSignIn_SignInButton() {
		driver.findElement(signIn_SignInButton).click();
	}
	
// For sign out if user already sign in	
	public void clickSignoutYesBtn() {
		
		driver.findElement(signOut_Yes).click();
	}
	
	public void appBuildVersion() {
		
		String BuildVersion =  this.getBuildVerison();
		System.out.println("App. Build version: " + BuildVersion +'\n');

	}
	

	public void loginUser1(String userEmail, String userPassword) throws InterruptedException {
		
		// Test case 1: Login user when user login = 0
			// First go to Setting page	
				
				this.clickThumbNavButton();
				this.clickThumbNavMainMenu();
				this.clickMainMenu_SettingsButton();
				this.clickSettingsSignInSignOutButton();
				
				try {
					this.clickLoginRequired_Login();
					Thread.sleep(2000);
					this.appBuildVersion();
					this.enterSignIn_UserEmail(userEmail);
					this.enterSignIn_UserPassword(userPassword);
					driver.hideKeyboard();
					this.clickSignIn_SignInButton();
					WebDriverWait wait =  new WebDriverWait(driver, 20);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objectPath.settings_SignInSignOut)));
					
			// verify login
					String loginStatus = getLoginStatus();
					if(loginStatus.equalsIgnoreCase("Sign Out")) {
							System.out.println("User Sign In successfully");
							System.out.println("Login User Test pass"+'\n');
						}
						else
							{
								System.out.println("Login User Test Case Fail"+'\n');
							}
					}
				catch(Exception e) {
					
					System.out.println("User is already login. Please logout to execute test case"+'\n');
					System.out.println(e.getMessage());
				}
			}
			
	public void loginUser2(String userEmail, String userPassword) throws InterruptedException {
		
// Test case 2: Login user when user login = 0
	// First go to Setting page	
		
		this.clickThumbNavButton();
		this.clickThumbNavMainMenu();
		this.clickMainMenu_SettingsButton();
		
	//get user login status 

		String loginStatus = this.getLoginStatus();
	
	// sign out user if login

		if(loginStatus.equalsIgnoreCase("Sign out")) { 

			System.out.println("User is already login. User is being logout");
			this.clickSettingsSignInSignOutButton();
			Thread.sleep(2000);
			this.clickSignoutYesBtn();
			System.out.println("User Logout successfully.");


		// after logout recall of flow to go to settings page
			this.clickThumbNavButton();
			this.clickThumbNavMainMenu();
			this.clickMainMenu_SettingsButton();
		}

	// User login process
		
				this.clickSettingsSignInSignOutButton();
					this.clickLoginRequired_Login();

					System.out.println("Login Screen Loaded "+'\n');
					Thread.sleep(1500);
				
					this.appBuildVersion();
					this.enterSignIn_UserEmail(userEmail);
					this.enterSignIn_UserPassword(userPassword);	
			
					driver.hideKeyboard();
			
					this.clickSignIn_SignInButton();
			
				// wait until login in message to be shown
					WebDriverWait wait =  new WebDriverWait(driver, 20);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objectPath.settings_SignInSignOut)));
				
					 MobileElement signOut = driver.findElement(settings_SignInSignOut);
				
			// verify test case	
					if(signOut.isDisplayed()) {
						System.out.println("User Sign In successfully");
						System.out.println("Login User Test pass"+'\n');
					}
					else
					{
						System.out.println("Login User Test Case Fail"+'\n');
					}		
		
	
	
	}
	
	public void userLogout() {
	//Test Case 2: User logout from Main Menu
		// user logout from Setting
			try {
			this.clickThumbNavButton();
			this.clickThumbNavMainMenu();
			this.clickMainMenu_Logout();
			this.clickSignoutYesBtn();
			System.out.println("User Logout Successfully");
			}
			catch(Exception e) {
				System.out.println("User is not login to proceceed this test case.");
				System.out.println(e.getMessage());
			}
		}
	

		

	}


