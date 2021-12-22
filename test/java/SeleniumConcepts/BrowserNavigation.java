package java.SeleniumConcepts;

import org.openqa.selenium.WebDriver;

import BasePackage;
import BasePackage.BaseTest;

public class BrowserNavigation {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BaseTest bt=new BaseTest();
		driver =bt.launchBrowser("chrome");
//opens google.com
		driver.get("https://www.google.com/");
//opens facebook.com	
       driver.get("https://www.facebook.com/");
 //waits for 2 seconds
        Thread.sleep(2000);
  //navigate the browser back button one time
       driver.navigate().back();
  //wait for 2 seconds
       Thread.sleep(2000);
//navigate the browser forward button one time
       driver.navigate().forward();
//wait for 2 seconds
       Thread.sleep(2000);
//refreshes the browser one time
       driver.navigate().refresh();
 //wait for 4 seconds
       Thread.sleep(4000);
 //closes the browser      
       driver.close();

	}

}
