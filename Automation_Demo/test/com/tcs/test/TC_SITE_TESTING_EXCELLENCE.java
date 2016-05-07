package com.tcs.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.automation.api.html.HtmlAutomationEngine;
import com.tcs.automation.api.types.BrowserTypes;
import com.tcs.automation.api.types.ElementTypes;
import com.tcs.automation.demo.AppTestEngine;

public class TC_SITE_TESTING_EXCELLENCE extends AppTestEngine {
	
	private static final String URL = "http://www.testingexcellence.com/";
	
	private static final HtmlAutomationEngine automationEngine = new HtmlAutomationEngine();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		automationEngine.setup(BrowserTypes.CHROME, URL);
	}
	
	@Test
	public void test() {
		automationEngine.waitFor(2);
		automationEngine.click("ISTQB QUIZ", ElementTypes.LINK);
		automationEngine.click("Selenium WebDriver Quiz", ElementTypes.LINK);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		automationEngine.quit();
	}

}
