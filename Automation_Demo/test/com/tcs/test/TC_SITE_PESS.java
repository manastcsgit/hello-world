package com.tcs.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.automation.api.types.BrowserTypes;
import com.tcs.automation.data.DataFactory;
import com.tcs.automation.demo.AutomatedPESS;

public class TC_SITE_PESS extends AutomatedPESS {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		automationEngine.setup(BrowserTypes.CHROME,
				DataFactory.getValue("PESS_URL"));
	}

	@Test
	public void test() {
		login("368433", "siben");
		raiseSecurityTicket("New Request", "6.6");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		automationEngine.quit();
	}

}
