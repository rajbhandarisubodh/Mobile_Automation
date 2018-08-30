/**
 * 
 */
package hiup.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author Subodh
 * 25 APril, 2018
 * this test All job search functions
 *
 */
public class jobSearchPage {
	static AppiumDriver<MobileElement> driver;
	hiupButtonPage objHiupButton = new hiupButtonPage();
	
	public jobSearchPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	// thumbNav buttons		
				public void clickThumbNavButton() {
					driver.findElement(objHiupButton.thumbNavButton).click();
				}
				
				public void clickThumbNavMainMenu1(){
					driver.findElement(objHiupButton.thumbNav_MainMenu1).click();
				}
				
				public void clickThumbNavMainMenu2() {
					driver.findElement(objHiupButton.thumbNav_MainMenu2).click();
				}
				
				public void clickMainMenu_JobSearch() {
					driver.findElement(objHiupButton.mainMenu_JobSearchSettings).click();
				}
				
				public void clickJobFeedRefineButton() {
					driver.findElement(objHiupButton.jobFeed_Refine).click();
				}
				
		//Job Search		
				
				public void clickJobSearch_Reset() {
					driver.findElement(objHiupButton.jobSearch_Reset).click();
				}
				
				public void clickJobSearch_Done() {
					driver.findElement(objHiupButton.jobSearch_Done).click();
				}
				
				public void clickJobSearch_LocationTab() {
					driver.findElement(objHiupButton.jobSearch_LocationTab).click();
				}
				
				public void clickJobSearch_Location_Distance() {
					driver.findElement(objHiupButton.jobSearch_Location_Distance).click();
				}
				
				public void clickJobSearch_Location_DistanceBar() {
					driver.findElement(objHiupButton.jobSearch_Location_DistanceBar).click();
				}
				
				public void clickJobSearch_Location_UseMyCurrentLocation() {
					driver.findElement(objHiupButton.jobSearch_Location_UseMyCurrentLocation).click();
				}
				
				public void clickJobSearch_Location_AreaCode(String AreaCode) {
					driver.findElement(objHiupButton.jobSearch_Location_AreaCode).sendKeys(AreaCode);
				}
					
				public void clickJobSearch_JobTab() throws InterruptedException {
					
					driver.findElement(objHiupButton.jobSearch_JobTab).click();
					Thread.sleep(2000);
				}
				
				public void clickJobSearch_Job_Industry() {
					
					driver.findElement(objHiupButton.jobSearch_Job_Industry).click();		
				}
				
				public void clickJobSearch_Job_IndustrySelect() {
					
					driver.findElement(objHiupButton.jobSearch_Job_IndustrySelect).click(); // Select educations training
				}
				
				public void clickJobSearch_Job_RolesInIndustry() {
					driver.findElement(objHiupButton.jobSearch_Job_RolesInIndustry).click();

				}
				
				public void clickJobSearch_Job_RolesInIndustrySelect() {
					driver.findElement(objHiupButton.jobSearch_Job_RolesInIndustry_Select).click();

				}
				
				public void clickJobSearch_Job_RolesInIndustrySearch(String searchKeyword) {
					driver.findElement(objHiupButton.jobSearch_Job_RolesInIndustry_Search).sendKeys(searchKeyword);

				}
				public void clickJobSearch_Job_Roles() {
					driver.findElement(objHiupButton.jobSearch_Job_Roles).click();
				}
				
				public void clickJobSearch_Job_RolesSelect() {
					driver.findElement(objHiupButton.jobSearch_Job_Roles_Select).click();
				}
				
				public void clickJobSearch_Job_RolesSearch() {
					driver.findElement(objHiupButton.jobSearch_Job_Roles_Search).click();
				}
				
				public void clickJobSearch_PayTab() {
					driver.findElement(objHiupButton.jobSearch_PayTab).click();
				}
				
				public void clickJobSearch_PayTab_Minimum() {
					driver.findElement(objHiupButton.jobSearch_Pay_MinimumSlider).click();
				}
				
				public void clickJobSearch_PayTab_Maximum() {
					driver.findElement(objHiupButton.jobSearch_Pay_MaximumSlider).click();
				}
				
				public void clickJobSearch_PayTab_ShopNoJobs() {
					driver.findElement(objHiupButton.jobSearch_Pay_ShowJobsNoPay).click();
				}
				
				
				public void jobSearchMain(String AreaCode) throws InterruptedException {
					
					this.clickJobFeedRefineButton();
					this.clickJobSearch_LocationTab();
					this.clickJobSearch_Location_UseMyCurrentLocation();
					this.clickJobSearch_Done();
					
					Thread.sleep(4000);
					
					this.clickJobFeedRefineButton();
					
					this.clickJobSearch_Location_AreaCode(AreaCode);
					driver.hideKeyboard();
					
					this.clickJobSearch_Done();
					
					Thread.sleep(4000);
					
					this.clickJobFeedRefineButton();
					
					this.clickJobSearch_Location_DistanceBar();
					
				//	this.clickJobSearch_JobTab();
				}
}
