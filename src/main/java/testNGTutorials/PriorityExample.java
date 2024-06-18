package testNGTutorials;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
	public void ExamResults() {
		System.out.println("You have a xam");
	}
    @Test(priority = 2)
	public void Quarterly() {
		System.out.println("You have a Quarterly xam");
	}
    @Test(priority = 4,enabled = false)
	public void revisionExams() {
		System.out.println("You have a revision exam");
	}
    
    @Test(priority = 3)
	public void Half_Earley() {
		System.out.println("You have a  Half_Earley");
	}
    @Test(priority = 5)
	public void Annual() {
		System.out.println("You have a  Annual");
	}
	
}
