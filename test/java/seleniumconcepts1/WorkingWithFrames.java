package seleniumconcepts1;

import BasePackage.BaseTest;

public class WorkingWithFrames {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        BaseTest bt=new BaseTest();
        driver=bt.launchBrowser("edge");
        driver.get("https://jqueryui.com/droppable/");
  //switch to the frame instance as Selenium will not move to frame automatically.
        driver.switchTo().frame(0);
   //Find the first frame element and get the text of the element 
        String text= driver.findElement(By.id("draggable")).getText();
        System.out.println(text);
 	
        
  //Interface for the mouse action
        Actions a=new Actions(driver);
  //wait for 10 seconds
     Thread.sleep(10000);
 //dragAnddrop method moves the element from target to destination
    a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();        
 //Switch out of frame instance
    driver.switchTo().defaultContent();
 //click on a particular link using mouse action
    a.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();
    a.click(driver.findElement(By.linkText("Code"))).build().perform();
	}    
       
      

}
