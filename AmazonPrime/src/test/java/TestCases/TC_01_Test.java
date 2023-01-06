package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.Reporter;

@Listeners(Demo.Listner.class)
public class TC_01_Test {
	@Test
	public void m1() {
		Reporter.log("TC_01 running");
	}

}
