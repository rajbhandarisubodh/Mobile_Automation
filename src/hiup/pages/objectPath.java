/**
 * 
 */
package hiup.pages;



/**
 * @author Subodh
 *
 */


public class objectPath {

	/**
	 * @param objectPath for  Mobile elements
	 */
	//Note:
		// to use it first import <packagename>.className;
		// 2nd: set class ko static
		// 3rd only call class name on main function

// Following are the flow of mobile element	
	//Sign up data
	//thumb nav
	// main menu
	// settings
	//settings>region
	//setting>loginrequired dialogue
	//sign in
	//forget password
	//sign up
	//sign out
	// job feed
	// job pages
	// job search 
	// Applications
	// Profile
	// Training
	// My Training
	// Wallet
	// Enter Code
	// Main Menu Log ut


//input Signup Form

	static String signUp_EmailData = "automation2@hiuptest.com";
	static String signUp_ConfirmEmailData = "automation2@hiuptest.com";
	static String signUp_FnameData = "Automation";
	static String signUp_LnameData = "2";
	static String signUp_PasswordData = "test12345";
	static String signUp_ConfirmPasswordData = "test12345";

	static String signUp_MobileCCData = "01";

	static String signUp_MobileNumberData = "1234567890";

// Loader loading message
	
	static String loading_LoaderMessage = "android:id/message";
	
	static String AndroidButton_OK = "android:id/button1";
	
	static String AndoridButton_Yes = "android:id/button2";
	
	static String AndoridButton_No = "android:id/button1";

// ThumbNav

	static String thumbNav = "co.olivemedia.hihoandroidwebapp:id/control_hint";
	//static String thumbNav = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.Button";


	//Note thumbNav_<btnName1> is button before login and thumbNav_<btnName2> is button after login, here after login xpath of button get changed
	static String thumbNav_JobFeed = "co.olivemedia.hihoandroidwebapp:id/arcMenu1";
	static String thumbNav_JobFeed2 = "	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView";

	static String thumbNav_Wallet = "co.olivemedia.hihoandroidwebapp:id/arcMenu2";
	static String thumbNav_Wallet2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.ImageView";


	static String thumbNav_Training = "co.olivemedia.hihoandroidwebapp:id/arcMenu3";
	static String thumbNav_Training2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout[3]/android.widget.ImageView";

	static String thumbNav_mainMenu = "co.olivemedia.hihoandroidwebapp:id/arcMenu4";
	static String thumbNav_mainMenu2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout[4]/android.widget.ImageView";


	// Main Menu

	static String mainMenu_JobFeed = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView";

	static String mainMenu_JobSearchSettings = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView";

	static String mainMenu_Applications = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView";

	static String mainMenu_Profile = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView";

	static String mainMenu_Training = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView";

	static String mainMenu_MyTraining = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView";

	static String mainMenu_Wallet = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]/android.widget.CheckedTextView";

	static String mainMenu_EnterCode = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[8]/android.widget.CheckedTextView";

	static String mainMenu_Settings = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[9]/android.widget.CheckedTextView";

	static String mainMenu_Logout = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[10]/android.widget.CheckedTextView";

	// Settings

	static String settings_SignInSignOut = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]";

	static String settings_SignIn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]";

	static String settings_SignOut = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]";

	//public String settings_SignOut = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]";

	static String settings_FAQ = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[2]";

	static String settings_PrivacyPolicy = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[3]";

	static String settings_TermsAndConditions = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[4]";

	static String settings_Region = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[5]";

	// Settings> Region screen

	static String region_SelectCountry = "co.olivemedia.hihoandroidwebapp:id/region_entry";

	static String region_SelectCountryUK = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]";

	static String region_SelectCountryIreland = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]";

	static String region_SelectCountryGermany = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]";

	static String region_SelectCountryUS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[4]";

	static String region_SelectCountryCancelButton = "co.olivemedia.hihoandroidwebapp:id/dialog_button";

	static String region_ChangeRegionButton = "co.olivemedia.hihoandroidwebapp:id/submit_button";


	// Login Required dialogue

	static String loginRequired_Title = "co.olivemedia.hihoandroidwebapp:id/alertTitle";
	
	static String loginRequired_Login = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]";

	static String loginRequired_SignUp = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]";

	static String loginRequired_Cancel = "	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]";

	// Sign In screen

	static String signIn_Email = "co.olivemedia.hihoandroidwebapp:id/email";

	static String signIn_Password = "co.olivemedia.hihoandroidwebapp:id/password";

	static String signIn_SignInBtn = "co.olivemedia.hihoandroidwebapp:id/sign_in_button";

	static String signIn_BuildVersion = "co.olivemedia.hihoandroidwebapp:id/version";

	static String signIn_Cancel = "co.olivemedia.hihoandroidwebapp:id/close_login";

	// Forgot password screen

	static String signIn_ForgottenPassword = "co.olivemedia.hihoandroidwebapp:id/forgotten_password";

	static String forgottenPassword_Email = "co.olivemedia.hihoandroidwebapp:id/et_email_reset_password";

	static String forgottenPassword_ResetBtn = "co.olivemedia.hihoandroidwebapp:id/bt_reset_password";

	// Sign up screen

	static String signUp_Email = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText[1]";

	static String signUp_ConfirmEmail = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText[2]";

	static String signUp_FirstName = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText[3]";

	static String signUp_LastName = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText[4]";

	static String signUp_Password = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText[5]";

	static String signUp_ConfirmPassword = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText[6]";

	static String signUp_TermsAndConditions = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView";

	static String signUp_AgreeCheckbox = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.CheckBox";

	static String signUp_ContinueNextBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.Button";

	static String signUp_MobileCC = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.EditText[1]";

	static String signUp_MobileNumber = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.EditText[2]";

	static String signUp_Finish = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.Button";

	// Sign out confirmation dialogue

	static String signOut_Yes = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]";

	static String signOut_No = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]";

	// Job Feed

	static String jobFeed_JobCount = "co.olivemedia.hihoandroidwebapp:id/openings_job_count";

	static String jobFeed_Refine = "co.olivemedia.hihoandroidwebapp:id/bt_refine";

	//Note: in job feeds, there are 5 jobs which have different LinearLayout[n] from 1 to 5 -> android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.ImageView 
	//static String jobFeed_JobView = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView";

	static String jobFeed_JobView = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView";


	// JobFeed_Job_loop is with n count for looping 
	static int n;
	static String jobFeed_Job_Loop = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[n]/android.widget.RelativeLayout/android.widget.ImageView";

	// Job page

	static String jobPage_JobCount = "co.olivemedia.hihoandroidwebapp:id/ll_job_position_total_count";

	static String jobPage_JobPosition = "co.olivemedia.hihoandroidwebapp:id/details_job_position";

	static String jobPage_JobName = "co.olivemedia.hihoandroidwebapp:id/job_details_screen_description";

	static String jobPage_JobPay = "co.olivemedia.hihoandroidwebapp:id/curency_section_1";

	static String jobPage_JobLocation = "co.olivemedia.hihoandroidwebapp:id/location_section_2";

	static String jobPage_JobType = "co.olivemedia.hihoandroidwebapp:id/details_section_3";

	static String jobPage_CompanyName = "co.olivemedia.hihoandroidwebapp:id/tv_company_name_inside_job_details";

	static String jobPage_JobDescription = "co.olivemedia.hihoandroidwebapp:id/tv_company_description_inside_job_details";

	static String jobPage_ApplyButton = "co.olivemedia.hihoandroidwebapp:id/bt_job_details_view_apply_now";

	static String jobPage_ApplyProgressLoaderMessage = "android:id/message";

	static String jobPage_RequestedDocumentsMandatory = "co.olivemedia.hihoandroidwebapp:id/ll_job_application_mandatory_document";

	static String jobPage_RequestedDocumentsNotMandatory = "co.olivemedia.hihoandroidwebapp:id/ll_job_application_not_required_document";

	static String jobPage_AddCoverLetter = "co.olivemedia.hihoandroidwebapp:id/et_job_application_information_to_the_recruiter";

	static String jobPage_DocumentEvidenceView = "co.olivemedia.hihoandroidwebapp:id/bt_photo";

	static String jobPage_DocumentEvidenceTakeHiupTraining = "co.olivemedia.hihoandroidwebapp:id/bt_take_hiup_training";

	static String jobPage_UploadDocumentUsingCamera = "co.olivemedia.hihoandroidwebapp:id/bt_take_photo";

	static String jobPage_UploadDocumentUsingCamera_ClickCapture = "co.olivemedia.hihoandroidwebapp:id/picture";

	static String jobPage_UploadDocumentUsingGallary = "co.olivemedia.hihoandroidwebapp:id/bt_upload_photo";

	static String jobPage_UploadDocumentExpireDate = "co.olivemedia.hihoandroidwebapp:id/tv_expire_date";

	static String jobpage_UploadDocumentExpireDate_SelectDatOk = "android:id/button1";

	static String jobPage_UploadDocumentSave= "co.olivemedia.hihoandroidwebapp:id/bt_upload_photo_save";

	static String jobPage_SendApplicationButton = "co.olivemedia.hihoandroidwebapp:id/bt_apply_job_application";

	static String jobPage_BackToJobSearch = "co.olivemedia.hihoandroidwebapp:id/bt_back_to_job_search";

	static String jobPage_ViewYourJobApplications = "co.olivemedia.hihoandroidwebapp:id/bt_view_your_job_application";

	// Job Search Settings

	static String jobSearch_Reset = "co.olivemedia.hihoandroidwebapp:id/bt_reset";

	static String jobSearch_Done = "co.olivemedia.hihoandroidwebapp:id/bt_refine";

	static String jobSearch_LocationTab = "co.olivemedia.hihoandroidwebapp:id/bt_tab_location";

	static String jobSearch_JobTab = "co.olivemedia.hihoandroidwebapp:id/bt_tab_job";

	static String jobSearch_PayTab = "co.olivemedia.hihoandroidwebapp:id/bt_tab_pay";

	static String jobSearch_Location_DistanceBar = "co.olivemedia.hihoandroidwebapp:id/seekBar";

	static String jobSearch_Location_Distance = "co.olivemedia.hihoandroidwebapp:id/num_progress_seek_bar";

	static String jobSearch_Location_UseMyCurrentLocation = "co.olivemedia.hihoandroidwebapp:id/bt_current_location";

	static String jobSearch_Location_AreaCode = "co.olivemedia.hihoandroidwebapp:id/et_postcode";

	static String jobSearch_Job_Industry = "co.olivemedia.hihoandroidwebapp:id/spinner_industry";

	// Note: industry list select option vary on android.widget.TextView[8] , current test [8] which is Engineering/Manufacturing

	static String jobSearch_Job_IndustrySelect = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[8]";

	static String jobSearch_Job_RolesInIndustry = "co.olivemedia.hihoandroidwebapp:id/button_industry_roles";

	// Note: this select first job role. To change for loop Relative Layout value android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[3]
	static String jobSearch_Job_RolesInIndustry_Select = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]";

	static String jobSearch_Job_RolesInIndustry_Search = "co.olivemedia.hihoandroidwebapp:id/search_role_view";

	static String jobSearch_Job_Roles = "co.olivemedia.hihoandroidwebapp:id/button_roles";

	// Note: this select first job role. To change for loop Relative Layout value android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[3]
	static String jobSearch_Job_Roles_Select = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]";

	static String jobSearch_Job_Roles_Search = "co.olivemedia.hihoandroidwebapp:id/search_role_view";

	static String jobSearch_Pay_MinimumSlider = "Multi-Slider thumb no:0"; //Accessibility id

	static String jobSearch_Pay_MaximumSlider = "Multi-Slider thumb no:1";//Accessibility id

	static String jobSearch_Pay_ShowJobsNoPay = "co.olivemedia.hihoandroidwebapp:id/pay_undisclosed_checkbox";

	// Applications

	static String applicationsTab = "co.olivemedia.hihoandroidwebapp:id/bt_tab_applications";

	//Note: First view applicaiton will select. to change then change the number of layout android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.Button
		static String applicationsView = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.Button";

		static String applicationView = "co.olivemedia.hihoandroidwebapp:id/bt_ints_applications_view";

		static String applicationNullMessage = "co.olivemedia.hihoandroidwebapp:id/no_applications_message";
		
		static String applicationDetail_View = "co.olivemedia.hihoandroidwebapp:id/bt_job_details_view_apply_now";
		
		static String applicationDetail_CancelBtn = "co.olivemedia.hihoandroidwebapp:id/bt_cancel_job_application";
		
		static String applicationDetail_CancelBtn_Yes = "android:id/button2";
		
		static String applicationDetail_CancelBtn_No = "android:id/button1";
				
	static String interviewsTab = "co.olivemedia.hihoandroidwebapp:id/bt_tab_interviews";

	//Note: First view interview will select and Interview respond & details has same resource id
	static String interviewsRespond = "co.olivemedia.hihoandroidwebapp:id/bt_ints_interviews_respond";
		
	static String interviewNullMessage = "co.olivemedia.hihoandroidwebapp:id/no_interviews_message";
	
	static String interviewAccept = "co.olivemedia.hihoandroidwebapp:id/bt_accept_job_interview";
	
	static String interviewDecline = "co.olivemedia.hihoandroidwebapp:id/bt_decline_job_interview";
	
	
	static String offersTab = "co.olivemedia.hihoandroidwebapp:id/bt_tab_offers";
	
	static String offersRespond = "co.olivemedia.hihoandroidwebapp:id/bt_ints_offers_respond";
	
	static String offerNullMessage = "co.olivemedia.hihoandroidwebapp:id/no_offers_message";

	static String offerAccept = "co.olivemedia.hihoandroidwebapp:id/bt_accept_job_offer";
	
	static String offerDecline = "co.olivemedia.hihoandroidwebapp:id/bt_decline_job_offer";

	//Profile

	static String profileEditBtn = "co.olivemedia.hihoandroidwebapp:id/bt_edit";

	static String editProfile_ChangePhoto = "co.olivemedia.hihoandroidwebapp:id/iv_upload_pic";

	static String editProfile_ChangePhotoByCamera= "co.olivemedia.hihoandroidwebapp:id/bt_edit_take_photo";

	static String editProfile_ChangePhotoByCamera_Capture = "co.olivemedia.hihoandroidwebapp:id/control";

	static String editProfile_ChangePhotoByGallery = "co.olivemedia.hihoandroidwebapp:id/bt_edit_gallery_photos";

	static String editProfile_Title = "co.olivemedia.hihoandroidwebapp:id/et_edit_user_profile_title";

	static String editProfile_FName = "co.olivemedia.hihoandroidwebapp:id/et_edit_user_profile_given_name";

	static String editProfile_LName = "co.olivemedia.hihoandroidwebapp:id/et_edit_user_profile_surname";

	static String editProfile_MobileCVV = "co.olivemedia.hihoandroidwebapp:id/edit_number_country_number";

	static String editProfile_MobileNumber = "co.olivemedia.hihoandroidwebapp:id/edit_mobile_number";

	static String editProfile_About = "co.olivemedia.hihoandroidwebapp:id/et_user_profile_about_me";

	static String editProfile_Save = "co.olivemedia.hihoandroidwebapp:id/bt_save_edit";

	//Training

	static String training_CourseByIndustry = "co.olivemedia.hihoandroidwebapp:id/bt_courses_by_industry";

	static String training_MyCourse = "co.olivemedia.hihoandroidwebapp:id/bt_my_courses";

	static String training_CoursesByIndustry_Education = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[6]";

	static String training_Courses_SortButton = "co.olivemedia.hihoandroidwebapp:id/bt_sort";

	static String training_Courses_Sort_Cost = "android:id/button1";

	static String training_Courses_Sort_Alphabetical = "android:id/button2";

	static String training_Courses_Sort_Cancel = "	android:id/button3";

	static String training_Courses_Search = "co.olivemedia.hihoandroidwebapp:id/search_courses_view";

	static String training_CoursesList = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[i]";

	//other remaining to add date 27 march, 2018

	// My Training 

	static String myTraining_ViewCourse = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout";

	// Wallet

	static String wallet_DocumentsTab = "co.olivemedia.hihoandroidwebapp:id/bt_tab_documents";

	static String wallet_CertificatesTab = "co.olivemedia.hihoandroidwebapp:id/bt_tab_certificates";

	static String wallet_AddButton = "co.olivemedia.hihoandroidwebapp:id/bt_add_assets";

	static String wallet_ViewDocument = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.Button";

	static String wallet_ViewCertificate = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.Button";

	static String wallet_ClickAssest = "";


	// Enter Code
	static String enterCode_EnterCode = "co.olivemedia.hihoandroidwebapp:id/promo_code";

	static String enterCode_Submit = "co.olivemedia.hihoandroidwebapp:id/submit_button";

	static String enterCode_Password = "co.olivemedia.hihoandroidwebapp:id/password";

	static String enterCode_ConfirmPassword = "co.olivemedia.hihoandroidwebapp:id/confirm_password";

	static String enterCode_ClickTCs = "co.olivemedia.hihoandroidwebapp:id/tv_term_conditions";

	static String entercode_ClickCheckBox = "co.olivemedia.hihoandroidwebapp:id/sign_up_agree_checkbox";

	static String enterCode_CreateAccount_Submit = "co.olivemedia.hihoandroidwebapp:id/submit_button";


	// job search 
	// Applications
	// Profile
	// Training
	// My Training
	// Wallet
	// Enter Code
	// Main Menu Log ut






































































}
