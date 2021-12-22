package SeleniumConcepts;

import BasePackage.BaseTest;

public class SampleSeleniumCode {
	
   static WebDriver driver;
	public static void main(String[] args) {
//BaseTest is a class made where we have written the code for opening the Chrome browser,Maximizing the browser
//benefit of calling Basetest class that we dont have to the lines of code to launch the browser
		BaseTest bt=new BaseTest();
		//launchBrowser is a method to launch browser
		driver= bt.launchBrowser("chrome");
		String ExpTitle="Google";
		//here we are telling Selenium to open google website
    driver.get("https://www.google.com/");
 //now we will write code to check whether it opened the Google website or not
 //evrey website has it own title
   String ActTitle=driver.getTitle();
   System.out.println(ActTitle);
  //equalsIgnorecase ignore uppercase or lowercase & just compares the string
   if(ActTitle.equalsIgnoreCase(ExpTitle))
   {
	   System.out.println("It opened the Google");
   }else
   {
	   System.out.println("It has not opened Google");
   }
   //Code below closes the browser
   driver.close();
	}

}
