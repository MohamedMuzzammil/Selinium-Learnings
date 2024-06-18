package testNGTutorials;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	
	@Test
	@Parameters("Name")
	public void animal(String name){
		System.out.println(name);
	}

}
