package com.tcs.automation.demo;

import java.text.SimpleDateFormat;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.tcs.automation.api.html.HtmlAutomationEngine;
import com.tcs.automation.api.types.DataSourceTypes;
import com.tcs.automation.api.types.ElementTypes;
import com.tcs.automation.data.DataFactory;

public class AppTestEngine {

	protected static WebDriver driver;

	protected static final HtmlAutomationEngine automationEngine = new HtmlAutomationEngine();

	protected static final SimpleDateFormat SDF = new SimpleDateFormat(
			"dd/MM/yyyy hh:mm:ss");
	
	static {
		DataFactory.init(DataSourceTypes.PROPERTYFILE);
	}

	/**
	 * Select combo by label.
	 * 
	 * @param comboName
	 *            the combo name
	 * @param label
	 *            the label
	 */
	protected static void selectComboByLabel(String comboName, String label) {
		automationEngine.inputText(comboName, ElementTypes.NAME, label);
		automationEngine.inputText(comboName, ElementTypes.NAME, Keys.TAB);
	}
	
}
