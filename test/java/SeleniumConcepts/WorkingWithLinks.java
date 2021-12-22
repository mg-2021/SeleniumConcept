package SeleniumConcepts;

import java.util.List;

import BasePackage.BaseTest;

public class WorkingWithLinks {
	
    static WebDriver driver;
    
	public static void main(String[] args) {
		
		BaseTest bt=new BaseTest();
		driver=bt.launchBrowser("chrome");
		driver.get("https://www.facebook.com/");
		
		boolean status=true;
		//4. count the number of links
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int TotalLink=links.size();
	System.out.println("Total number of links:" + TotalLink);	
	//5. Print all the links
	for(int i=0;i<TotalLink;i++)
	{
     String txt=links.get(i).getText();
     //here we are trying to print only the text which is not empty
     if(!(txt.isEmpty()==true))
     { 
 		System.out.println(txt);
     }
       if(txt.equalsIgnoreCase("places"))
       {
       status=true;
       break;
	}else {status=false;}}
       if (status==true)
       {
    	   System.out.println("Places exist");
       }else {System.out.println("Places does not exist");}
    	  
	
	
	/*	//3. click on a link
		driver.findElement(By.linkText("Create a Page")).click();*/
		//2. To confirm that link is displayed
		/*
		boolean LinkStatus=driver.findElement(By.linkText("Forgot password?")).isDisplayed();
		if(LinkStatus == true)
		{
			System.out.println("Link is displayed");
		}else
		{
			System.out.println("Link is not displayed");

		}*/
	    /*
		//1.capture the link text
		String LinkText=driver.findElement(By.linkText("Forgot password?")).getText();
		if(LinkText.equalsIgnoreCase("Forgot password?"))
		{
		System.out.println("Forgot password link exist");
		}else {
		System.out.println("Forgot password link does not exist");
     
		}*/
		driver.close();
	}

}
