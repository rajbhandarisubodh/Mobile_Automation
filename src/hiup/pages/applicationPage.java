/**
 * 
 */
package hiup.pages;

import org.apache.commons.collections.functors.ExceptionFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author Subodh
 * May 9, 2018> application page test case
 *
 *
 */
public class applicationPage {

	AppiumDriver<MobileElement> driver;

	hiupButtonPage objElementPath = new hiupButtonPage();



	public applicationPage(	AppiumDriver<MobileElement> driver)
	{
		this.driver = driver;
	}

	// ThumbNav
	public void clickThumbNavButton() {

		driver.findElement(objElementPath.thumbNavButton).click(); 
	}

	public void clickThumbNavMainMenu1() {

		driver.findElement(objElementPath.thumbNav_MainMenu1).click();
	}

	public void clickThumbNavMainMenu2() {

		driver.findElement(objElementPath.thumbNav_MainMenu2).click();
	}

	public void clickMainMenu_Applications()
	{
		driver.findElement(objElementPath.mainMenu_Applications).click();
	}
	// Application tab
	public void clickApplications_ApplicationTab()
	{
		driver.findElement(objElementPath.applications_ApplicationsTab).click();
	}

	public String getApplicationNullMessage()
	{
		return driver.findElement(objElementPath.applicationNullMessage).getText();
	}

	public void clickApplicationViewBtn()
	{
		driver.findElement(objElementPath.applicationView).click();

	}

	public void clickApplicationDetail_View()
	{
		driver.findElement(objElementPath.applicationDetail_View).click();
	}

	public void clickApplicationDetail_CancelBtn()
	{
		driver.findElement(objElementPath.applicationDetail_CancelBtn).click();
	}

	public void clickApplicationDetail_CancelBtn_Yes()
	{
		driver.findElement(objElementPath.applicationDetail_CancelBtn_Yes).click();
	}

	public void clickApplicationDetail_CancelBtn_No()
	{
		driver.findElement(objElementPath.applicationDetail_CancelBtn_No).click();
	}

	public void clickApplicationCancelBtn_Ok()
	{
		driver.findElement(objElementPath.AndroidButton_Ok).click();
	}

	// Interview tab	
	public void clickApplications_InterviewsTab()
	{
		driver.findElement(objElementPath.applications_InterviewsTab).click();

	}

	public String getInterviewNullMessage()
	{
		return driver.findElement(objElementPath.interviewNullMessage).getText();
	}

	public void clickInterview_Respond()
	{
		driver.findElement(objElementPath.interviewRespond).click();
	}

	public void clickInterview_Accept()
	{
		driver.findElement(objElementPath.interviewAccept).click();
	}

	public void clickInterview_Decline()
	{
		driver.findElement(objElementPath.interviewDecline).click();
	}


	// Offers Tab
	public void clickApplications_OffersTab()
	{
		driver.findElement(objElementPath.applications_OffersTab).click();
	}

	public String getOfferNullMessage()
	{
		return driver.findElement(objElementPath.interviewNullMessage).getText();
	}

	public void clickOffer_Respond()
	{
		driver.findElement(objElementPath.offerRespond).click();
	}

	public void clickOffer_Accept()
	{
		driver.findElement(objElementPath.offerAccept).click();
	}

	public void clickOffer_Decline()
	{
		driver.findElement(objElementPath.offerDecline).click();
	}


	public void applicationTabTestScenario() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(2000);
		this.clickThumbNavButton();
		this.clickThumbNavMainMenu1();
		this.clickMainMenu_Applications();
		System.out.println("Application Tab Test.");

		this.clickApplications_ApplicationTab();
		Thread.sleep(2000);

		try {
			// test application is empty or not
			try {
				String ApplicationStatus = this.getApplicationNullMessage();

				if(ApplicationStatus.contains("When you apply for a job"))
				{
					System.out.println("No Application to perform test. "+ApplicationStatus);
					System.out.println("Application test case skipped.");

				}
				}
				catch(Exception e2){
				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(objElementPath.applicationView));
					this.clickApplicationViewBtn();
					wait.until(ExpectedConditions.visibilityOfElementLocated(objElementPath.applicationDetail_View));
					this.clickApplicationDetail_View();
					wait.until(ExpectedConditions.invisibilityOfElementLocated(objElementPath.loader_loadingMessage));
					System.out.println("Application Detail Loaded.");
					verticalScroll();
					try {
						//perform cancel action of Application
						this.clickApplicationDetail_CancelBtn();
						this.clickApplicationDetail_CancelBtn_Yes();
						this.clickApplicationCancelBtn_Ok();
						System.out.println("Application successfully cancelled.");
					} 
					catch(Exception e4) 
					{
						System.out.println("No Cancel button.Application is outdated.");
					}
				}catch(Exception e3)
				{
				// may 10, 2018: unable to test application detail due to element not found problem
					System.out.println("Application detail loading timeout.");
					driver.navigate().back();
				}
				}
		}
		catch (Exception e1)//main try-catch
		{
			System.out.println("Application Tab loading timeout.");
			System.out.println("Application Test Case Failed");

		}
	}
	
	
	public void interviewTabTestScenarios() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(2000);
		this.clickThumbNavButton();
		this.clickThumbNavMainMenu1();
		this.clickMainMenu_Applications();
		System.out.println("Interview Tab Test.");

		this.clickApplications_InterviewsTab();
		Thread.sleep(2000);
		
			try {
				try {
					
					String InterviewStatus = this.getInterviewNullMessage();
					
					if(InterviewStatus.contains("When your application is approved"))
					{
						System.out.println("No Interview to perform test."+InterviewStatus);
						System.out.println("Interview test case skipped.");
					}
				}catch(Exception e2)
				{
					try {
						wait.until(ExpectedConditions.visibilityOfElementLocated(objElementPath.interviewRespond));
						this.clickInterview_Respond();
						wait.until(ExpectedConditions.invisibilityOfElementLocated(objElementPath.loader_loadingMessage));
						verticalScroll();
						try {//accept interview if any
							this.clickInterview_Accept();
							System.out.println("Interview Accepted.");
						}catch(Exception e4)
						{
							System.out.println("Interview is outdated or already accepted.");
						}
					}catch(Exception e3)
					{
						System.out.println("Interview detail loading timeout.");
						driver.navigate().back();
					}
				}
			}
			catch(Exception e1)
			{
				System.out.println("Interview Tab data loading timeout. ");
				System.out.println("Interview Test Case Failed.");
			}
	}
	
	public void offerTabTestScenarios() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(2000);
		this.clickThumbNavButton();
		this.clickThumbNavMainMenu1();
		this.clickMainMenu_Applications();
		System.out.println("Offers Tab Test.");

		this.clickApplications_OffersTab();
		
			try {
				try {
					Thread.sleep(2000);
					String OfferStatus = this.getOfferNullMessage();
					if(OfferStatus.contains("When your application is approved"))
					{
						System.out.println("No Offers to perform test. "+OfferStatus);
						System.out.println("Offer test case skipped.");

					}
				}catch(Exception e2)
				{
					try {
						wait.until(ExpectedConditions.visibilityOfElementLocated(objElementPath.offerRespond));
						this.clickOffer_Respond();
						verticalScroll();
						try {//accept offer if any
							this.clickOffer_Accept();
							System.out.println("Offer Accepted.");
						}catch(Exception e4)
						{
							System.out.println("Offer is already accepted.");
						}
					}catch(Exception e3)
					{
						System.out.println("Offer detail loading timeout.");
						System.out.println("Offer test case skipped.");
					}
				}
			}
			catch(Exception e1)
			{
				System.out.println("Offer Tab data loading timeout. ");
			}
	}
	public void verticalScroll()
	{
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();

		int x = width/2;

		int startY = (int) (height*0.8);

		int endY = (int) (height*0.2);

		driver.swipe(x, startY, x, endY, 500);
	}


}