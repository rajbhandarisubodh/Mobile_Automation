/**
 * 
 */
package hiup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author Subodh
 * 24 April, 2018
 * test of wallet activity
 *
 */
public class walletPage {
	
	AppiumDriver<MobileElement> driver;
	
	hiupButtonPage objHiupButton = new hiupButtonPage();
	
	public walletPage(AppiumDriver<MobileElement> driver) {
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
	
	public String getBuildVerison() {
		
		return driver.findElement(objHiupButton.signIn_BuildVersion).getText(); // build version of app
	}
	
	public void enterSignIn_UserEmail(String userEmail) {
		
	 driver.findElement(objHiupButton.signIn_Email).sendKeys(userEmail);
	}
	
	public void enterSignIn_UserPassword(String userPassword) {
		driver.findElement(objHiupButton.signIn_Password).sendKeys(userPassword);
	}
	
	public void clickSignIn_SignInButton() {
		driver.findElement(objHiupButton.signIn_SignInButton).click();
	}
	
// Wallet
	public void clickThumbNav_Wallet1() {
		driver.findElement(objHiupButton.thumbNav_Wallet1).click();
	}
	
	public void clickThumbNav_Wallet2() {
		driver.findElement(objHiupButton.thumbNav_Wallet2).click();
	}
	
	public void clickMainMenu_Wallet() {
		driver.findElement(objHiupButton.mainMenu_Wallet).click();
	}
	
	public void clickWallet_DocumentTab() {
		driver.findElement(objHiupButton.wallet_DocumentsTab).click();
	}
	
	public void clickWallet_CertificateTab() {
		driver.findElement(objHiupButton.wallet_DocumentsTab).click();
	}
	
	public void clickWallet_AddDocumentButton() {
		driver.findElement(objHiupButton.wallet_DocumentsTab).click();
		driver.findElement(objHiupButton.wallet_AddDocument).click();
	}
	
	public void clickWallet_AddCertificateButton() {
		driver.findElement(objHiupButton.wallet_CertificatesTab).click();
		driver.findElement(objHiupButton.wallet_AddCertificate).click();
	}
	
	public void clickWallet_AddAssest() {
		driver.findElement(objHiupButton.wallet_ClickAssest).click();
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
				try {
				this.clickThumbNavMainMenu1();
				}
				catch(Exception e) {
					this.clickThumbNavMainMenu2();
				}
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

	public void walletMain() {
		
		this.clickThumbNavButton();
		this.clickThumbNav_Wallet2();
		
		this.clickWallet_CertificateTab();
		this.clickWallet_DocumentTab();
		
		this.clickWallet_AddCertificateButton();
		//this.clickWallet_AddDocumentButton();
	// on hold due to unable to take snap shot of add wallet
		this.clickWallet_AddAssest();
	}


}
