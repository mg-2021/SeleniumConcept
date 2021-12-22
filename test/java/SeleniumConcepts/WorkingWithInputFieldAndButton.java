package SeleniumConcepts;

import BasePackage.BaseTest;

public class WorkingWithInputFieldAndButton {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
   
		BaseTest bt=new BaseTest();
		driver=bt.launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
// this is the method to keep the browser wait, 5000 is equals to 5 seconds, need to throw exception for this
		Thread.sleep(5000);
//isDisplayed is a method to confirm whether particular element is displayed or not and retruns boolean value
		boolean UserNameField =driver.findElement(By.id("txtUsername")).isDisplayed();
		System.out.println("Status of Username Field:"+ UserNameField);
		if(UserNameField==true)
		{
			System.out.println("Username is displayed");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		}else
		{
			System.out.println("Username field is not displayed");
		}
//Verify that login button exist
	boolean LoginButtonField= driver.findElement(By.id("btnLogin")).isDisplayed();
	System.out.println("Login button field status:"+ LoginButtonField);
	//Following code to click on Login button in case it exist otherwise display message in else section
	if (LoginButtonField==true)
	{
		driver.findElement(By.id("btnLogin")).click();	
		}else
		{
			System.out.println("Login button does not exist");
		}
		}
	}


