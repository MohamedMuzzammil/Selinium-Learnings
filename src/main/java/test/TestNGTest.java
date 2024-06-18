package test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {

	

	
		@Test(groups= {"SmokeTest"})  
		public void firsttestCases() {
			System.out.println("This is the first test case");
	        Assert.assertEquals(0, 1,"OOPS");

			
		}
		
		@Test(groups= {"SmokeTest"})  
		public void secondtestCases() {
			System.out.println("This is the second test case");
		}

		@Test(groups= {"FireTest"})  
		public void thirdtestCases() {
			System.out.println("This is the third test case");
		}
		  @org.testng.annotations.BeforeTest  
			public void BeforeTest() {
				System.out.println("Running Before Test");
			}
		
		@Test(groups= {"FireTest"})  
		public void fourthtestCases() {
			System.out.println("This is the fourth test case");
		}

		public void fifthtestCases() {
			System.out.println("This is the fifth test case");
		}

		
		@org.testng.annotations.AfterTest  
		public void AfterTest() {
			System.out.println("Running After Test");
		}
		

		}



