package annotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void testCase1() {
		System.out.println("This is the Test Case1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is the Test Case2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after every method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after the class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the test");
	}
	
	@BeforeSuite
	public void beforeTestSuite() {
		System.out.println("This will execute before the test suite");
	}
	
	
	@AfterSuite
	public void afterTestSuite() {
		System.out.println("This will execute after the test suite");
	}

}
