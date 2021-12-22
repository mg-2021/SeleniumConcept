package SeleniumConcepts;

import BasePackage.BaseTest;

public class WorkingWithAlertAndPopups {
  static WebDriver driver;
	public static void main(String[] args) {
		
		BaseTest bt=new BaseTest();
		driver=bt.launchBrowser("chrome");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		
//by this we tell the selenium to Alert Interface as we can not inspect elements on an alert
		Alert alert=driver.switchTo().alert();
//following will capture the alert
		String alerttext=alert.getText();
		System.out.println(alerttext);//this will print it
//Follows are two ways to click on ok button using accept or dismiss methods(We can not click on ok button)
	/*/1.accept method will basically clicks on the enter button
		alert.accept();*/
	//2. dismiss method clicks on ESC button.
		alert.dismiss();
		

	}

}
