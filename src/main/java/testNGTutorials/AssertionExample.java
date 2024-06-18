package testNGTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String name="Muzz";
	@Test
	public void Check() {
		Assert.assertEquals(name, "Muzz");
		
	}

}
