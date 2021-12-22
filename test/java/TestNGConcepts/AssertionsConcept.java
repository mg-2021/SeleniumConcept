//Assertions: to check values we use assertions (basically to compare two values)
//If any assertion is failed it will not go to next line.

package TestNGConcepts;

//import static org.testng.Assert.assertEquals;



public class AssertionsConcept {
	@Test
	public void CheckValues()
	{
		int no1=10,no2=20;
		String name1="Mukul",name2="Gupta";
	//	boolean status1=true, status2=true;

//Soft Assertion
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(no1, no2,"Not same");
		sa.assertEquals(name1, name2, "not same");
		sa.assertAll();
/*
//Hard Assertion
	Assert.assertEquals(no1, no2,"no1 is not same as no2.");
   Assert.assertEquals(name1, name2,"name1 is not same as name2.");	
   //following line will not print as above assertion failed*/
   System.out.println("Lets see whether it prints this or not");
}

}
