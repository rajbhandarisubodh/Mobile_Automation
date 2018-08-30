package hiup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class forgotPasswordPage extends loginPage{

	
	By forgetPasswordButton = By.id(objectPath.signIn_ForgottenPassword);
	
	By forgetPasswordEmail = By.id(objectPath.forgottenPassword_Email);
	
	By forgetPasswordResetButton = By.id(objectPath.forgottenPassword_ResetBtn);
	
	
	public forgotPasswordPage(AppiumDriver<MobileElement> driver) {
	// super driver need to define to extend class and use methods	
		super(driver); 
		this.driver = driver;
	}

	public void clickForgottenPasswordButton() {
		
		driver.findElement(forgetPasswordButton).click();
	}
	
	public void enterUserEmail(String userEmail) {
		
		driver.findElement(forgetPasswordEmail).sendKeys(userEmail);
	}
	
	public void clickForgottenPasswordResetButton() {
		
		driver.findElement(forgetPasswordResetButton).click();
	}
	
	public void forgotPasswordMain( String userEmail) throws InterruptedException {
		
	// no object is required of called class if used extend class inheritance	
		
		clickThumbNavButton();
		clickThumbNavMainMenu();
		clickMainMenu_SettingsButton();
		
	// get user login status
		
		String loginStatus = getLoginStatus();
		
		if(loginStatus.equalsIgnoreCase("Sign Out")) { 
			
	//user sign out if login
			
			System.out.println("User is already login");
			clickSettingsSignInSignOutButton();
			clickSignoutYesBtn();
			System.out.println("User Logout Successfully");
			
	// after logout recall of flow to go to settings page	
			clickThumbNavButton();
			clickThumbNavMainMenu();
			clickMainMenu_SettingsButton();
		
		}
		
	// Load User login screen
		
		clickSettingsSignInSignOutButton();
		clickLoginRequired_Login();
		
		System.out.println("Login Screen loaded");
		
		Thread.sleep(2000);
		this.clickForgottenPasswordButton();
		
		System.out.println("Forget password screen loaded");
		
		this.enterUserEmail(userEmail);
		driver.hideKeyboard();
		
		this.clickForgottenPasswordResetButton();
		
	// wait for reset successful message
		WebDriverWait wait = new WebDriverWait(driver, 20);
	// until OK button of dailogue is present
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		
		String resultMessage = driver.findElementById("android:id/message").getText();
		
		System.out.println("Result:" + resultMessage);
		System.out.println("Forget Password test passed " +'\n');
	}
	
}
