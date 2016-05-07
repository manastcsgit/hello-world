package com.tcs.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.automation.api.types.BrowserTypes;
import com.tcs.automation.api.types.ElementTypes;
import com.tcs.automation.demo.AppTestEngine;

public class TC_SITE_JUNIT extends AppTestEngine {

	private static final String URL = "http://junit.org/";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		automationEngine.setup(BrowserTypes.CHROME, URL);
	}

	@Test
	public void test() {
		automationEngine.click("Let's take a tour »", ElementTypes.LINK);
		automationEngine.click("Download and install", ElementTypes.LINK);
		automationEngine.inputText("wiki-pages-filter", "home");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//automationEngine.quit();
	}

}
