package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.Reporter;

@Listeners(Demo.Listner.class)
public class TC_03_Test {
	@Test
	public void m3() {
		Reporter.log("TC_03 running");
	}
}
