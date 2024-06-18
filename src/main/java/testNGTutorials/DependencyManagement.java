package testNGTutorials;

import org.testng.annotations.Test;

public class DependencyManagement {
	@Test(enabled = true)
	public void MiddleSchool() {
		System.out.println("Completed Middle School");
	}
	@Test(dependsOnMethods = "MiddleSchool")
	public void HighSchool() {
		System.out.println("Completed High School");
	}
	@Test(dependsOnMethods = "HighSchool")
	public void Engineering() {
		System.out.println("Completed College");
	}

}
