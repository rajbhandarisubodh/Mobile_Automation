/**
 * 
 */
package hiup.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

import hiup.pages.hiupButtonPage;

/**
 * @subodh This class contain all activities flow wise for smoke test
 *
 */
public class allActivityPage {
	
		static AppiumDriver<MobileElement> driver;
		
		hiupButtonPage objHiupButton = new hiupButtonPage(); // locators of buttons
		
			public allActivityPage(AppiumDriver<MobileElement> driver) {
					allActivityPage.driver = driver;
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
			
			public void clickThumbNavJobFeed1() {
				driver.findElement(objHiupButton.thumbNav_JobFeed1).click();
			}
			
			public void clickThumbNavJobFeed2() {
				driver.findElement(objHiupButton.thumbNav_JobFeed2).click();
			}
			
			public void  clickThumbNavWallet1(){
				driver.findElement(objHiupButton.thumbNav_Wallet1).click();
			}
			
			public void  clickThumbNavWallet2(){
				driver.findElement(objHiupButton.thumbNav_Wallet2).click();
			}
		
	
			public void clickThumbNavTraining1() {
				driver.findElement(objHiupButton.thumbNav_Training1).click();
			}
			
			public void clickThumbNavTraining2() {
				driver.findElement(objHiupButton.thumbNav_Training2).click();
			}
	// main menu buttons		
			public void clickMainMenu_JobFeed() {
				driver.findElement(objHiupButton.mainMenu_JobFeed).click();
			}
			
			public void clickMainMenu_JobSearch() {
				driver.findElement(objHiupButton.mainMenu_JobSearchSettings).click();
			}
			
			public void clickMainMenu_Applications() {
				driver.findElement(objHiupButton.mainMenu_Applications).click();
			}
			
			public void clickMainMenu_Profile() {
				driver.findElement(objHiupButton.mainMenu_Profile).click();
			}
			
			public void clickMainMenu_Training() {
				driver.findElement(objHiupButton.mainMenu_Training).click();
			}
			
			public void clickMainMenu_MyTraining() {
				driver.findElement(objHiupButton.mainMenu_MyTraining).click();
			}
			
			public void clickMainMenu_Wallet() {
				driver.findElement(objHiupButton.mainMenu_Wallet).click();
			}
			
			public void clickMainMenu_EnterCode() {
				driver.findElement(objHiupButton.maninMenu_EnterCode).click();
			}
			
			public void clickMainMenu_Settings() {
				driver.findElement(objHiupButton.mainMenu_Settings).click();
			}
			
			public void clickMainMenu_Logout() {
				driver.findElement(objHiupButton.mainMenu_Logout).click();
			}
			
		// Login Required dialogues button
			
			public void clickLoginRequired_SignInButton() {
				driver.findElement(objHiupButton.LoginRequired_Login).click();
			}
			
			public void clickLoginRequired_CancelButton() {
				driver.findElement(objHiupButton.LoginRequired_Cancel).click();
			}
			
			public void clickLoginRequired_SignUpButton() {
				driver.findElement(objHiupButton.LoginRequied_SignUp).click();
			}
			
			
	//	Sign Up, Forget password and Sign In
			public void clickSettings_SignInButton( ){
				driver.findElement(objHiupButton.settings_SignInButton).click();
			}
			
			public void clickSettings_SignUpButton() {
				driver.findElement(objHiupButton.settings_SignInButton).click();
				driver.findElement(objHiupButton.LoginRequied_SignUp).click();
			}
			
			public void clickForgottenPasswordButton() {
				driver.findElement(objHiupButton.settings_SignInButton).click();
				driver.findElement(objHiupButton.LoginRequired_Login).click();
				driver.findElement(objHiupButton.forgettenPasswordButton).click();
			}
			
			public String signIn_getBuildVerison() {
				
				return driver.findElement(objHiupButton.signIn_BuildVersion).getText(); // build version of app
			}
			public void clickSignIn_CrossButton() {
				driver.findElement(objHiupButton.signIn_ExitButton).click();
				
			}
			public void enterSignIn_UserEmail(String userEmail) {
				
				 driver.findElement(objHiupButton.signIn_Email).sendKeys(userEmail);
				}
				
			public void enterSignIn_UserPassword(String userPassword) {
				driver.findElement(objHiupButton.signIn_Password).sendKeys(userPassword);
				driver.hideKeyboard(); // hide keyboard
				driver.findElement(objHiupButton.signIn_SignInButton).click(); //click sign in button
				}
	// Job Feed	
			public void goTOJobFeed() { //go to job feed after login
				driver.findElement(objHiupButton.thumbNavButton).click();
				driver.findElement(objHiupButton.thumbNav_JobFeed2).click();
			}
			
			public void clickJobFeedRefineButton() {
				driver.findElement(objHiupButton.jobFeed_Refine).click();
			}
			
			public void clickJobFeed_JobView() {
				driver.findElement(objHiupButton.jobFeed_JobView).click();
			}
			
			public void clickJobPageApplyButton() {
				driver.findElement(objHiupButton.JobPage_Apply).click();
			}
//Job Search			
			public void clickJobSearch_LocationTab() {
				driver.findElement(objHiupButton.jobSearch_LocationTab).click();
				driver.findElement(objHiupButton.jobSearch_Location_UseMyCurrentLocation).click();
			}
			
			public void clickJobSearch_Location_UseMyLocation() {
				driver.findElement(objHiupButton.jobSearch_LocationTab).click();
				driver.findElement(objHiupButton.jobSearch_Location_UseMyCurrentLocation).click();
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
				driver.findElement(objHiupButton.jobSearch_Job_RolesInIndustry).click();

			}
			
			public void clickJobSearch_Job_Roles() {
				driver.findElement(objHiupButton.jobSearch_Job_Roles).click();
			}
			
			public void clickJobSearch_Job_RolesSelect() {
				driver.findElement(objHiupButton.jobSearch_Job_Roles).click();
			}
			
			public void clickJobSearch_PayTab() {
				driver.findElement(objHiupButton.jobSearch_PayTab).click();
			}
// Training		
			public void clickTraining_CourseByIndustry() {
				driver.findElement(objHiupButton.training_CoursesByIndustry).click();
			}
			
			public void clickTraining_CourseByIndustrySelect() {
				driver.findElement(objHiupButton.training_CoursesByIndustry_Education).click();
			}
			
			public void clickTraining_Course_Sort() {
				driver.findElement(objHiupButton.training_Course_SortButton).click();
			}
			
			public void clickTraining_MyCourses() {
				driver.findElement(objHiupButton.training_MyCourses).click();
			} 
			
//Settings & more	
			public void clickSettings_FAQ() {
				driver.findElement(objHiupButton.settings_FAQ).click();
			}
			
			public void clickSettings_PrivacyPolicy() {
				driver.findElement(objHiupButton.settings_PrivacyPolicy).click();
			}
			
			public void clickSettings_TermsAndConditions() {
				driver.findElement(objHiupButton.settings_TermsAndConditions).click();
			}
			
			public void clickSettings_Region() {
				driver.findElement(objHiupButton.settings_Region).click();
			}
			
			public void clickRegion_SelectCountry() {
				driver.findElement(objHiupButton.region_SelectCountry).click();
			}
			
			public void clickRegion_SelectCountry_Cancel() {
				driver.findElement(objHiupButton.region_SelectCountryCancelButton).click();
			}
			
			public void clickRegion_ChangeButton() {
				driver.findElement(objHiupButton.region_ChangeRegionButton).click();
			}
			
//Enter code
			public void clickEnterCode_SubmitButton() {
				driver.findElement(objHiupButton.enterCode_Submit).click();
			}
			
	public void testAllActivityWithoutLogin() throws InterruptedException {
			
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// ThumbNav buttons tests
				//ThumbNav_JobFeed
		
		System.out.println("All Activity test without login");
		
				this.clickThumbNavButton();
				this.clickThumbNavJobFeed1();
				
					//ThumbNav_Wallet
						this.clickThumbNavButton();
						this.clickThumbNavWallet1();
						this.clickLoginRequired_CancelButton();
						
							//ThumbNav_Training
								this.clickThumbNavButton();
								this.clickThumbNavTraining1();
								
									//ThumbNav_MainMenu
										this.clickThumbNavButton();
										this.clickThumbNavMainMenu2();
										
		System.out.println("ThumbNav Buttons test passed. Continuing another test case of Main Menu button test....");
			
			//MainMenu Buttons Test
				//Job Feed
				this.clickMainMenu_JobFeed();
				
				//Job Search Setting
					this.clickThumbNavButton();
					this.clickThumbNavMainMenu1();
					this.clickMainMenu_JobSearch();
				
					// Applications
						this.clickThumbNavButton();
						this.clickThumbNavMainMenu1();
						this.clickMainMenu_Applications();
						this.clickLoginRequired_CancelButton();
				
						//Profile
							this.clickThumbNavButton();
							this.clickThumbNavMainMenu2();
							this.clickMainMenu_Profile();
							this.clickLoginRequired_CancelButton();
							
							//Training
								this.clickThumbNavButton();
								this.clickThumbNavMainMenu2();
								this.clickMainMenu_Training();
								
								//My Training
									this.clickThumbNavButton();
									this.clickThumbNavMainMenu2();
									this.clickMainMenu_MyTraining();		
									this.clickLoginRequired_CancelButton();
										
									//Wallet
										this.clickThumbNavButton();
										this.clickThumbNavMainMenu1();
										this.clickMainMenu_Wallet();
										this.clickLoginRequired_CancelButton();
										
									//Enter Code
										this.clickThumbNavButton();
										this.clickThumbNavMainMenu1();
										this.clickMainMenu_EnterCode();
										
									//Settings
										this.clickThumbNavButton();
										this.clickThumbNavMainMenu2();
										this.clickMainMenu_Settings();
										
					System.out.println("Main Menu Buttons test passed. Continuing another test case of Job Feed....");

					// Test Job Feeds Activity												
										this.clickThumbNavButton();
										this.clickThumbNavJobFeed2();	
										
										this.clickJobFeedRefineButton();
										this.clickJobSearch_LocationTab();
										this.clickJobSearch_JobTab();
										this.clickJobSearch_PayTab();
										
										driver.navigate().back();
										
//										//this.clickThumbNavButton();
//										//this.clickThumbNavJobFeed1();
//										
									//Thread.sleep(6000);
								// date: 27 march, unable to view job detail due to false in xpath
//										this.clickJobFeed_JobView();
//										this.clickJobPageApplyButton();
//										this.clickLoginRequired_CancelButton();
										
										//driver.navigate().back();
				
					System.out.println("Job Feeds Buttons test passed. Continuing another test case of Job Search....");
				
				// Job Search test

									this.clickThumbNavButton();
									this.clickThumbNavMainMenu1();
									this.clickMainMenu_JobSearch();
										
									this.clickJobSearch_LocationTab();
									this.clickJobSearch_Location_UseMyLocation();
									this.clickJobSearch_JobTab();
				/*
				 * Job Search > job, is not proceed on test script due to app crash with null Industry
				 * Hiup_2.2.2_68
				 * 10 April, 2018
				 * 					
				 */
									
									//this.clickJobSearch_Job_Industry();
									//this.clickJobSearch_Job_IndustrySelect();
									//Thread.sleep(5000);
									
								//	this.clickJobSearch_Job_RolesInIndustrySelect();
									//driver.navigate().back();
									
									this.clickJobSearch_Job_Roles();
									Thread.sleep(5000);
									driver.navigate().back();
									
									this.clickJobSearch_PayTab();
									System.out.println("Job Search Buttons test passed. Continuing another test case of Job Applications....");
									
				//Applications				
						this.clickThumbNavButton();
						this.clickThumbNavMainMenu1();
						this.clickMainMenu_Applications();
						this.clickLoginRequired_CancelButton();
						System.out.println("Job Applications Activity test passed. Continuing another test case of Profile....");
						
						//Profile
							this.clickThumbNavButton();
							this.clickThumbNavMainMenu2();
							this.clickMainMenu_Profile();
							this.clickLoginRequired_CancelButton();
							System.out.println("Profile Activity passed. Continuing another test case of Training....");

							//Training
								this.clickThumbNavButton();
								this.clickThumbNavMainMenu2();
								this.clickMainMenu_Training();
								this.clickTraining_CourseByIndustry();
								Thread.sleep(3000);
								driver.navigate().back();
								
							//below commented elements are not found
								//this.clickTraining_CourseByIndustrySelect(); //education is selected
								//Thread.sleep(3000);

								//this.clickTraining_Course_Sort();
								//driver.navigate().back();
								//driver.navigate().back();
								//driver.navigate().back();

								this.clickTraining_MyCourses();
								this.clickLoginRequired_CancelButton();
								System.out.println("Training activity test passed. Continuing another test case of My Training....");
								
								//My Training
									this.clickThumbNavButton();
									this.clickThumbNavMainMenu1();
									this.clickMainMenu_MyTraining();		
									this.clickLoginRequired_CancelButton();
									System.out.println("My Training activity test passed. Continuing another test case of Wallet....");
										
									//Wallet
										this.clickThumbNavButton();
										this.clickThumbNavMainMenu1();
										this.clickMainMenu_Wallet();
										this.clickLoginRequired_CancelButton();
										System.out.println("Wallet activity test passed. Continuing another test case of Enter Code....");
										
									//Enter Code
										this.clickThumbNavButton();
										this.clickThumbNavMainMenu1();
										this.clickMainMenu_EnterCode();
										this.clickEnterCode_SubmitButton();
										System.out.println("Enter Code activity test passed. Continuing another test case of Settings....");
									
									//Settings
											this.clickThumbNavButton();
											this.clickThumbNavMainMenu2();
											this.clickMainMenu_Settings();
											//signup activity
											this.clickSettings_SignUpButton();
											Thread.sleep(3000);
											driver.navigate().back();
											
											this.clickSettings_SignInButton();
											this.clickLoginRequired_SignInButton();
											this.clickForgottenPasswordButton();
											driver.navigate().back();
											Thread.sleep(2000);
											this.clickSignIn_CrossButton();
											Thread.sleep(1000);
											
											this.clickSettings_FAQ();
											Thread.sleep(2000);
											driver.navigate().back();
											
											this.clickSettings_PrivacyPolicy();
											Thread.sleep(2000);
											driver.navigate().back();
											
											this.clickSettings_TermsAndConditions();
											Thread.sleep(2000);
											driver.navigate().back();
											
											this.clickSettings_Region();
											this.clickRegion_SelectCountry();
											this.clickRegion_SelectCountry_Cancel();
											this.clickRegion_ChangeButton();
											
											System.out.println("Settings All activities test without login passed. Test Case Completed");
										
										
										
				
				
				
			}
			
	
			

}
