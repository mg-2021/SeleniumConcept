package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import BasePackage.BaseTest;

public class WorkingWithDropDowns {
     static WebDriver driver;
	public static void main(String[] args) {
 
	boolean status=true;
	WebDriverManager.chromedriver().setup();
	BaseTest bt=new BaseTest();
	driver=bt.launchBrowser("chrome");
//1.Line below will make every page for max 50 seconds,suppose it response within 5 seconds then it will skip
//those 45 seconds
	//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
//2.Another way to make particular page wait is as follows
//Locate that particular element and wait for it.
//Below we are creating object reference for WebDriverWait class & using the method to make sure Firstname element is visible
	//WebDriverWait wait= new WebDriverWait(driver,50);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	
//Enter the value in firstname field
	//driver.findElement(By.name("firstname")).sendKeys("Mukul");
	
//3.Wait statement for month dropdown
	WebDriverWait wait= new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("month")));
//Select month of "Jun" from drop down
	//driver.findElement(By.id("month")).sendKeys("jun");
	
//Selecting values from drop down using Select class
	Select select=new Select(driver.findElement(By.id("year")));
/*	
 //Selecting using selectByVisibleText
	select.selectByVisibleText("2017");
//Selecting using selectByValue
    select.selectByValue("1983");
//Selecting using Index value(the first value in the list indicates 0th index value)
    select.selectByIndex(13);*/
//count numbers of values in the drop down list
	List<WebElement> dd=select.getOptions();
	int totalNoOfYears=dd.size();
	System.out.println(totalNoOfYears);//It will print the total number of years
//Print all the years
	for(int i=0;i<totalNoOfYears;i++)
	{
		System.out.println(dd.get(i).getText());
	   
//to make a particular value exist
	if (dd.get(i).getText().equalsIgnoreCase("2010"))
	{
		status=true;
		break;
	}else {
		status=false;
	}}
	
	if (status==true)
	{
		System.out.println("Year 2010 exist");
	}else
	{
		System.out.println("Year 2010 does not exist");
	}
	
	
	}

}
