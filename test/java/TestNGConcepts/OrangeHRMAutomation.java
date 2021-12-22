package TestNGConcepts;

import java.util.concurrent.TimeUnit;

public class OrangeHRMAutomation {
	WebDriver driver;
	@Test(priority=1)
	public void login()
	{
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");

	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
//verify the login is successful
	boolean status= driver.findElement(By.id("menu_dashboard_index")).isDisplayed();
	Assert.assertEquals(status, true);
	System.out.println("hello");

	}
	
	@Test(priority=2)
	public void getAllEmployeesname()
	{
	 driver.findElement(By.id("menu_pim_viewPimModule")).click();
//	 driver.findElements(By.xpath(xpathExpression))
	 
		
	}
	
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logged out");

	}

}
