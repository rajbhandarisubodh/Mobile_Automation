/**
 * 
 */
package hiup.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author Subodh
 * Date: april 24, 2018
 *	this class contain the test case of enter code test.
 *Note: Enter Code activity, invalid code submission, valid code submission is only tested
 */
public class enterCodePage {
	
		AppiumDriver<MobileElement> driver;
		
		hiupButtonPage objHiupButton = new hiupButtonPage();
		
		//define constructor
		
		public enterCodePage(AppiumDriver<MobileElement> driver) {
			this.driver = driver;
		}
		
		public void clickThumbavNavButton() {
			driver.findElement(objHiupButton.thumbNavButton).click();
		}
		
		public void clickThumbNav_MainMenu1() {
			driver.findElement(objHiupButton.thumbNav_MainMenu1).click();
		}
		
		public void clickThumbNav_MainMenu2() {
			driver.findElement(objHiupButton.thumbNav_MainMenu2).click();
		}
	
		public void clickMainMenu_EnterCode() {
			driver.findElement(objHiupButton.maninMenu_EnterCode).click();
		}
		
		public void enterPromoCode(String promoCode) { //Hk4G0B6P
			driver.findElement(objHiupButton.enterCode_EnterCode).sendKeys(promoCode);
		}
		
		public void enterCode_ClickSubmit() {
			driver.findElement(objHiupButton.enterCode_Submit).click();
		}
		
		public void enterCode_EnterPassword(String enterPassword) {
			driver.findElement(objHiupButton.enterCode_Password).sendKeys(enterPassword);
		}
		
		public void enterCode_ConfrimPasword(String confirmPassword) {
			driver.findElement(objHiupButton.enterCode_ConfirmPassword).sendKeys(confirmPassword);
		}
		
		public void enterCode_ClickTermsAndConditions() {
			driver.findElement(objHiupButton.enterCode_ClickTCs).click();
		}
		
		public void enterCode_ClickCheckBox() {
			driver.findElement(objHiupButton.enterCode_ClickCheckBox).click();
		}
		
		public void enterCode_ClickCreateAccountSubmit() {
			driver.findElement(objHiupButton.enterCode_CreateAccount_Submit).click();
		}
		
		public void enterCodeMain(String promoCode, String enterPassword, String confirmPassword) throws InterruptedException {
			
			this.clickThumbavNavButton();
			this.clickThumbNav_MainMenu1();
			this.clickMainMenu_EnterCode();
			
			this.enterCode_ClickSubmit();
			Thread.sleep(1500);
				
				this.enterPromoCode(promoCode);
				driver.hideKeyboard();
				this.enterCode_ClickSubmit();
				
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(objHiupButton.enterCode_Password));

				
					this.enterCode_ClickCreateAccountSubmit();
					Thread.sleep(1500);

					
					this.enterCode_EnterPassword(enterPassword);
					this.enterCode_ConfrimPasword(confirmPassword);
					driver.hideKeyboard();
					
					this.enterCode_ClickTermsAndConditions();
					Thread.sleep(3000);
					driver.navigate().back();
					//this.enterCode_ClickCheckBox();
					this.enterCode_ClickCreateAccountSubmit();
					
					System.out.println("Test case passed");
		}
		
		
}



