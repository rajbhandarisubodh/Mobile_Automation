/**
 * 
 */
package hiup.pages;

import org.openqa.selenium.By;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import hiup.pages.objectPath;

/**
 * @author Subodh
 *
 */
public class hiupButtonPage {
	
	// this class contain all buttons
		
		/**
		 * Mobile elements are define on following steps wise
		 * 1.  Thumbnav button
		 * 2. Left Main Menu section
		 * 3. Settings and more
		 * 4. settings > region
		 * 5. Login required dialogue
		 * 6. SignOut dialogue
		 * 7. SignIn Page
		 * 8. Forget Password
		 * 9. SignUp page
		 * 10. Job Feed
		 * 11. Job Page
		 * 12. Applications
		 * 13. Profile
		 * 14. Training
		 * 15. My Training
		 * 16. Wallet
		 * 17. Enter Code
		 * 18. 
		 * 
		 */
	
	// Andorid buttons
	
		By loader_loadingMessage = By.id(objectPath.loading_LoaderMessage);
		
		By AndroidButton_Ok = By.id(objectPath.AndroidButton_OK);
		
		By AndroidButton_Yes = By.id(objectPath.AndoridButton_Yes);
		
		By AndroidButton_No = By.id(objectPath.AndoridButton_No);

		//thumbNav buttons
		
			By thumbNavButton = By.id(objectPath.thumbNav);
			
			By thumbNav_JobFeed1 = By.id(objectPath.thumbNav_JobFeed);
			
			By thumbNav_JobFeed2 = By.xpath(objectPath.thumbNav_JobFeed2);
			
			By thumbNav_Wallet1 = By.id(objectPath.thumbNav_Wallet);
			
			By thumbNav_Wallet2 = By.xpath(objectPath.thumbNav_Wallet2);
			
			By thumbNav_Training1 = By.id(objectPath.thumbNav_Training);
			
			By thumbNav_Training2 = By.xpath(objectPath.thumbNav_Training2);

			By thumbNav_MainMenu1 = By.id(objectPath.thumbNav_mainMenu);
			
			By thumbNav_MainMenu2 = By.xpath(objectPath.thumbNav_mainMenu2);
			
		// Main menu section
			
			By mainMenu_JobFeed = By.xpath(objectPath.mainMenu_JobFeed);
			
			By mainMenu_JobSearchSettings = By.xpath
					(objectPath.mainMenu_JobSearchSettings);
			
			By mainMenu_Applications = By.xpath(objectPath.mainMenu_Applications);
			
			By mainMenu_Profile = By.xpath(objectPath.mainMenu_Profile);
			
			By mainMenu_Training = By.xpath(objectPath.mainMenu_Training);
			
			By mainMenu_MyTraining = By.xpath(objectPath.mainMenu_MyTraining);
			
			By mainMenu_Wallet = By.xpath(objectPath.mainMenu_Wallet);
			
			By maninMenu_EnterCode = By.xpath(objectPath.mainMenu_EnterCode);
			
			By mainMenu_Settings = By.xpath(objectPath.mainMenu_Settings);
			
			By mainMenu_Logout = By.xpath(objectPath.mainMenu_Logout);
			
		// Settings and more
			
			By settings_SignInSignOutButton = By.xpath(objectPath.settings_SignInSignOut);
			
			By settings_SignInButton = By.xpath(objectPath.settings_SignIn);

			By settings_SignOutButton = By.xpath(objectPath.settings_SignOut);

			By settings_FAQ = By.xpath(objectPath.settings_FAQ);
			
			By settings_PrivacyPolicy = By.xpath(objectPath.settings_PrivacyPolicy);
			
			By settings_TermsAndConditions = By.xpath(objectPath.settings_TermsAndConditions);
			
			By settings_Region = By.xpath(objectPath.settings_Region);
			
			
		// Settings -> Region
			
			By region_SelectCountry = By.id(objectPath.region_SelectCountry);
			
			By region_SelectCountryUK = By.xpath(objectPath.region_SelectCountryUK);
			
			By region_SelectCountryIreland = By.xpath(objectPath.region_SelectCountryIreland);
			
			By region_SelectCountryGermany = By.xpath(objectPath.region_SelectCountryGermany);
			
			By region_SelectCountryUS = By.xpath(objectPath.jobPage_UploadDocumentUsingCamera);
			
			By region_SelectCountryCancelButton = By.id(objectPath.region_SelectCountryCancelButton);
			
			By region_ChangeRegionButton = By.id(objectPath.region_ChangeRegionButton);
			
			
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
			
		// Forgot password
			
			By forgettenPasswordButton = By.id(objectPath.signIn_ForgottenPassword);
			
			By forgetPasswordEmail = By.id(objectPath.forgottenPassword_Email);
			
			By forgetPasswordResetButton = By.id(objectPath.forgottenPassword_ResetBtn);
			
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
			
		// Job Feed
			
			By jobFeed_JobCount = By.id(objectPath.jobFeed_JobCount);
			
			By jobFeed_Refine = By.id(objectPath.jobFeed_Refine);
			//Note: in job feeds, there are 5 jobs which have different LinearLayout[n] from 1 to 5 -> android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.ImageView 
			
			By jobFeed_JobView = By.xpath(objectPath.jobFeed_JobView);
			
			By JobPage_Apply = By.id(objectPath.jobPage_ApplyButton);
			
	// Job Search or Refines
			
			By jobSearch_Reset = By.id(objectPath.jobSearch_Reset);
			
			By jobSearch_Done = By.id(objectPath.jobSearch_Done);
			
			By jobSearch_LocationTab = By.id(objectPath.jobSearch_LocationTab);
			
			By jobSearch_JobTab = By.id(objectPath.jobSearch_JobTab);
			
			By jobSearch_PayTab = By.id(objectPath.jobSearch_PayTab);
			
			By jobSearch_Location_Distance = By.id(objectPath.jobSearch_Location_Distance);

			
			By jobSearch_Location_DistanceBar = By.id(objectPath.jobSearch_Location_DistanceBar);
			
			By jobSearch_Location_UseMyCurrentLocation = By.id(objectPath.jobSearch_Location_UseMyCurrentLocation);
			
			By jobSearch_Location_AreaCode = By.id(objectPath.jobSearch_Location_AreaCode);
			
			By jobSearch_Job_Industry = By.id(objectPath.jobSearch_Job_Industry);
			
			By jobSearch_Job_IndustrySelect = By.xpath(objectPath.jobSearch_Job_IndustrySelect);
			
			By jobSearch_Job_RolesInIndustry = By.id(objectPath.jobSearch_Job_RolesInIndustry);
					
			By jobSearch_Job_RolesInIndustry_Select = By.xpath(objectPath.jobSearch_Job_RolesInIndustry_Select);

			By jobSearch_Job_RolesInIndustry_Search = By.id(objectPath.jobSearch_Job_RolesInIndustry_Search);

			By jobSearch_Job_Roles = By.id(objectPath.jobSearch_Job_Roles);
			
			By jobSearch_Job_Roles_Select = By.xpath(objectPath.jobSearch_Job_Roles_Select);
			
			By jobSearch_Job_Roles_Search = By.id(objectPath.jobSearch_Job_Roles_Search);
			
			By jobSearch_Pay_MinimumSlider = MobileBy.AccessibilityId(objectPath.jobSearch_Pay_MinimumSlider);
			
			
			By jobSearch_Pay_MaximumSlider = MobileBy.AccessibilityId(objectPath.jobSearch_Pay_MaximumSlider);
			
			
			By jobSearch_Pay_ShowJobsNoPay = By.id(objectPath.jobSearch_Pay_ShowJobsNoPay);
			
	// Applications
			
			By applications_ApplicationsTab = By.id(objectPath.applicationsTab);
			
			By applicationNullMessage = By.id(objectPath.applicationNullMessage);
			
			By applicationView = By.id(objectPath.applicationView);
			
			By applicationDetail_View = By.id(objectPath.applicationDetail_View);
			
			By applicationDetail_CancelBtn = By.id(objectPath.applicationDetail_CancelBtn);
			
			By applicationDetail_CancelBtn_Yes = By.id(objectPath.applicationDetail_CancelBtn_Yes);
			
			By applicationDetail_CancelBtn_No = By.id(objectPath.applicationDetail_CancelBtn_No);
			
			By applications_InterviewsTab = By.id(objectPath.interviewsTab);
			
			By interviewRespond = By.id(objectPath.interviewsRespond);
			
			By interviewNullMessage = By.id(objectPath.interviewNullMessage);
			
			By interviewAccept = By.id(objectPath.interviewAccept);
			
			By interviewDecline = By.id(objectPath.interviewDecline);
			
			By applications_OffersTab = By.id(objectPath.offersTab);
			
			By offerNullMessage = By.id(objectPath.offerNullMessage);
			
			By offerRespond = By.id(objectPath.offersRespond);
			
			By offerAccept = By.id(objectPath.offerAccept);
			
			By offerDecline = By.id(objectPath.offerDecline);
			
			
			
	// Profile
			
			By profile_EditProfile = By.id(objectPath.profileEditBtn);
			
			By editProfile_Save = By.id(objectPath.editProfile_Save);
			
			By editProfile_ChangePhoto = By.id(objectPath.editProfile_ChangePhoto);
					
			By editProfile_ChangePhotoByCamera = By.id(objectPath.editProfile_ChangePhotoByCamera);
			
			By editProfile_ChangePhotoByCamera_ClickCapture = By.id(objectPath.editProfile_ChangePhotoByCamera_Capture);
			
			By editProfile_ChangePhotoByGallery = By.id(objectPath.editProfile_ChangePhotoByGallery);
			
			By editProfile_Title = By.id(objectPath.editProfile_Title);
			
			By editProfile_Fname = By.id(objectPath.editProfile_FName);
			
			By editProfile_Lname = By.id(objectPath.editProfile_LName);
			
			By editProfile_MobileCVV = By.id(objectPath.editProfile_MobileCVV);
			
			By editProfile_MobileNumber = By.id(objectPath.editProfile_MobileNumber);
			
			By editProfile_About = By.id(objectPath.editProfile_About);
			
	// Training
			
			By training_CoursesByIndustry = By.id(objectPath.training_CourseByIndustry);
			
			By training_MyCourses = By.id(objectPath.training_MyCourse);
			
			By training_CoursesList = By.xpath(objectPath.training_CoursesList);
			
			By training_CoursesByIndustry_Education = By.xpath(objectPath.training_CoursesByIndustry_Education);
			
			By training_Course_SortButton = By.id(objectPath.training_Courses_SortButton);
			
			
			
	// My Courses/training
			
			By myTraining_ViewCourse = By.xpath(objectPath.myTraining_ViewCourse);
			
			
	// Wallet
			
			By wallet_DocumentsTab = By.id(objectPath.wallet_DocumentsTab) ;
			
			By wallet_CertificatesTab = By.id(objectPath.wallet_CertificatesTab);
			
			By wallet_AddDocument = By.id(objectPath.wallet_AddButton);
			
			By wallet_ViewDocument = By.id(objectPath.wallet_ViewDocument);
			
			By wallet_ViewCertificate = By.id(objectPath.wallet_ViewCertificate) ;
			
			By wallet_AddCertificate = By.id(objectPath.wallet_AddButton);
			
	// Enter Code

			By enterCode_EnterCode = By.id(objectPath.enterCode_EnterCode);
			
			By enterCode_Submit = By.id(objectPath.enterCode_Submit);
			
			By enterCode_Password = By.id(objectPath.enterCode_Password);
			
			By enterCode_ConfirmPassword = By.id(objectPath.enterCode_ConfirmPassword);
			
			By enterCode_ClickTCs = By.id(objectPath.enterCode_ClickTCs);
			
			By enterCode_ClickCheckBox = By.id(objectPath.entercode_ClickCheckBox);
			
			By enterCode_CreateAccount_Submit = By.id(objectPath.enterCode_CreateAccount_Submit);
			
			By wallet_ClickAssest = By.xpath("//android.widget.RelativeLayout[@index='0']");
			
			
			
}
