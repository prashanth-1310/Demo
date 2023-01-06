package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.Reporter;

@Listeners(Demo.Listner.class)
public class TC_02_Test {
	@Test
	public void m2() {
		Reporter.log("TC_02 running");
	}
}
