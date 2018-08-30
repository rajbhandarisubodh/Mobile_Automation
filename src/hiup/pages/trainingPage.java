/**
 * 
 */
package hiup.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author Subodh
 * May 5, 2018
 * Training test case scenarios
 *
 */
public class trainingPage {
	AppiumDriver<MobileElement> driver;

	hiupButtonPage objElementPath = new hiupButtonPage();



	public trainingPage(AppiumDriver<MobileElement> driver)
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
	
	public void clickMainMenu_Training()
	{
		driver.findElement(objElementPath.mainMenu_Training).click();
	}
	
	// training
	
	public void clickTraining_CourseByIndustry()
	{
		driver.findElement(objElementPath.training_CoursesByIndustry).click();
	}

	public void clickTraining_MyCourses()
	{
		driver.findElement(objElementPath.training_MyCourses).click();
	}
	
	public void testTrainingMain() throws InterruptedException
	{
		Thread.sleep(2000);
		this.clickThumbNavButton();
		this.clickThumbNavMainMenu1();
		this.clickMainMenu_Training();
		
		System.out.println("Training Screen loaded. ");
		this.clickTraining_MyCourses();
		Thread.sleep(2000);

		driver.navigate().back();
		
		this.clickTraining_CourseByIndustry();
		Thread.sleep(2000);
		
	}

}
