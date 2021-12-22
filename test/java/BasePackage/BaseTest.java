package BasePackage;

public class BaseTest {
	 //WebDriver is an Interface,here we defined a variable driver and made it static so we dont have to create object reference
	static WebDriver driver;
	public WebDriver launchBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
//Following is the code to launch chrome browser
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Edge"))
		{
//Following is the code to launch Edge browser
           WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
//Following is the code to launch Firefox browser
         WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}

		else {
			System.out.println("Please pass the browser name as chrome");
		}
	//Maximize the browser
		driver.manage().window().maximize();

		//returning the value of driver variable where this method will be called.
		return driver;
	}
}
