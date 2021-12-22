package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import BasePackage.BaseTest;

public class WorkingWithWindows {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
 
	//boolean status=true;
	WebDriverManager.chromedriver().setup();
	BaseTest bt=new BaseTest();
	driver=bt.launchBrowser("chrome");

	driver.get("https://www.facebook.com/");
	//clicks on create new account button
	driver.findElement(By.linkText("Create new account")).click();
	
	Thread.sleep(5000);
	//clicks on cookies policy
	driver.findElement(By.id("cookie-use-link")).click();
	
	//code to switch windows
    Set<String> ids=driver.getWindowHandles();
    Iterator<String> itr=ids.iterator();
    String firstWindowId=itr.next();
    String SecondWindowId=itr.next();
    System.out.println(firstWindowId);
    System.out.println(SecondWindowId);
    
    //Code to switch to next window
    driver.switchTo().window(SecondWindowId);

    String titleOfSecondWindow=driver.getTitle();
    System.out.println(titleOfSecondWindow);
    
    //switch to 1st window
    driver.switchTo().window(firstWindowId);
    
    //driver.close();// closes the current window ( where the Selenium instance are)
    driver.quit();//closes the all windows opened by selenium
	
	
	}

}
