package com.tcs.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.automation.api.types.BrowserTypes;
import com.tcs.automation.api.types.ElementTypes;
import com.tcs.automation.data.DataFactory;
import com.tcs.automation.demo.AppTestEngine;

public class TC_SITE_SBI_APPLY_ONLINE extends AppTestEngine {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		automationEngine.setup(BrowserTypes.CHROME,
				DataFactory.getValue("SBI_URL"));
	}

	@Test
	public void test() {
		automationEngine.scrollDown(100);
		automationEngine.click("ONLINE SB ACCOUNT APPLICATION",
				ElementTypes.LINK);
		automationEngine.switchTab(1);
		automationEngine.click("btnApply");
		automationEngine.click("Start New", ElementTypes.LINK);
		automationEngine.selectRadioButton("Public", ElementTypes.VALUE);
		automationEngine.inputText("firstName", "Siben");
		automationEngine.inputText("last", "Nayak");
		automationEngine.inputDate("dob", "04/01/1988");
		automationEngine.waitFor(5);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		automationEngine.quit();
	}

}
