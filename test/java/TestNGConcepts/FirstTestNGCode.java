package TestNGConcepts;

//Any code should be written inside non-static method
//To execute code we need @Test annotation.
//TestNg execute the program in alphabetical order so among displayMessages() and addition() method, addition()
//will be executed first until and unless we define priority after @test annotation.


public class FirstTestNGCode {
	
	@Test(priority=1)
	public void displayMessages()
	{
	System.out.println("This is my first testNG code");	
	}
	@Test(priority=2)
  public void addition()
  {
	  int no1=10,no2=20,result;
	  result=no1+no2;
	  System.out.println(result);
	  
  
  }
}
