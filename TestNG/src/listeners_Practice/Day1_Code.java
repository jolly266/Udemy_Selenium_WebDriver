package listeners_Practice;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	// Through this setup without XML file we can achieve listeners class methods @listeners as below
	@Listeners(listeners_Practice.Listners_Class.class)
	public class Day1_Code {

	@Test
	public void testsuccess() {
		
		System.out.println("This Test is Success");
	}
	

	@Test
	public void testfailure() {

		System.out.println("This Test is Failed");
		org.testng.Assert.assertTrue(false);	
	}
	

	@Test
	public void skipped() {
		throw new SkipException("This Test is Skiped");
		
		
	}
	
}
