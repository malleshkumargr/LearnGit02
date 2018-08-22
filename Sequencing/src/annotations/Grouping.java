package annotations;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups={"Car"})
	public void car1() {
		System.out.println("Batch Car - Test car 1");
	}
	
	@Test(groups={"Car"})
	public void car2() {
		System.out.println("Batch Car - Test car 2");
	}
	
	@Test(groups={"Scooter"})
	public void scooter1() {
		System.out.println("Batch scooter - Test scooter 1");
	}
	
	@Test(groups={"Scooter"})
	public void scooter2() {
		System.out.println("Batch scooter - Test scooter 2");
	}
	
	@Test(groups={"Car", "Sedan Car"})
	public void sedan1() {
		System.out.println("Batch Sedan Car - Test sedan 1");
	}

}
