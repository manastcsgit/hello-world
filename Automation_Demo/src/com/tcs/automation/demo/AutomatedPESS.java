package com.tcs.automation.demo;

import com.tcs.automation.api.types.ElementTypes;

public class AutomatedPESS extends AppTestEngine {

	/**
	 * Login.
	 * 
	 * @param userName
	 *            the user name
	 * @param password
	 *            the password
	 */
	public static void login(String userName, String password) {
		if (automationEngine.isVisible("userId")) {
			automationEngine.inputText("userId", userName);
			automationEngine.inputText("password", password);
			automationEngine.click("btbg", ElementTypes.CLASS);
		}
		automationEngine.click("Create New Ticket", ElementTypes.SPAN);
		automationEngine.click("centralTabPanel__catalogMainCenterAAC");
	}

	/**
	 * Raise security ticket.
	 * 
	 * @param requestType
	 *            the request type
	 * @param version
	 *            the version
	 */
	public static void raiseSecurityTicket(String requestType, String version) {

		automationEngine.doubleClick("span_Security", ElementTypes.ID);

		selectComboByLabel("ServiceType", "Security");

		selectComboByLabel("RequestType", requestType);

		automationEngine.inputText("description", ElementTypes.NAME,
				"New Automated Request for IPRMS " + version);

		selectComboByLabel("productName", "IPRMS");

		automationEngine
				.inputText("ProductVersion", ElementTypes.NAME, version);

		automationEngine.inputText("PlannedServicePeriodStartDate",
				ElementTypes.NAME, "13/08/2015 19:27:58");

		automationEngine.inputText("PlannedServicePeriodEndDate",
				ElementTypes.NAME, "21/08/2015 19:27:58");

		selectComboByLabel("Complexity", "High");

	}

	/**
	 * Raise performance ticket.
	 */
	public static void raisePerformanceTicket() {
		automationEngine.doubleClick("span_Performance", ElementTypes.ID);
	}

}
