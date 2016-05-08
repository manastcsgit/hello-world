package com.tcs.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.automation.api.types.BrowserTypes;
import com.tcs.automation.api.types.ElementTypes;
import com.tcs.automation.demo.AppTestEngine;

public class TC_SITE_GOOGLE_FINANCE extends AppTestEngine {

	private static final String URL = "https://www.google.com";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		automationEngine.setup(BrowserTypes.CHROME, URL);
	}

	@Test
	public void test() {
		automationEngine.submit("q", ElementTypes.NAME, "State Banks");
		automationEngine.click("manas Naik", ElementTypes.LINK);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//automationEngine.quit();
	}

}
