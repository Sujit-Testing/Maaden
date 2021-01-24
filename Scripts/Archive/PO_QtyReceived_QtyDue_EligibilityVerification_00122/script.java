import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.formsFT.api.*;
import oracle.oats.scripting.modules.applet.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.applet.api.AppletService applet;
	@ScriptService oracle.oats.scripting.modules.formsFT.api.FormsService forms;

	public void initialize() throws Exception {
		browser.launch();
	}

	/**PO_QtyReceived_QtyDue_EligibilityVerification_00122
	 * Verify the quantity received and due eligibility 
	 * "1) Open the Browser
2) Login with correct user
3) Click on MWSPC_PURCHASING_SUPERUSE-> Purchase_Order->Purchase Summary
4) InPO Field, Search the PO details
5) Click Lines->Click Shipment button-> captured the quantity received and due
6) LogOut and Close the browser."

	 */
	public void run() throws Exception {
		web.window(2,
				"{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_window}}").navigate(
						"http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE");
		web.window(4,
				"{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_window}}").waitForPage(180, true);
		
		web.textBox("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_input_text_unamebean}}").click();
		
		web.textBox("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_input_text_unamebean}}").setText("PEETHAMBARANS");
				
		web.textBox("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
	
		web.button("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_button_SubmitButton}}").click();
		web.window("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_window}}").waitForPage(180, true);
		
		web.link("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.MWSPC_PURCHASING_SUPERUSE}}").click();
		web.window(17,
				"{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_window}}").waitForPage(180, true);
	
	
		web.link("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.Purchase_Order}}").click();
		web.window("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_window}}").waitForPage(180, true);
		
		web.link("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.Purchase_Order_Summary}}").click();
		web.window(28,
				"{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_window_1}}")
				.waitForPage(180,true);
		forms.captureScreenshot(33);
		
		//forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
		if(forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_FIND_PO_NUM_0}}").exists(60, TimeUnit.SECONDS)){
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_FIND_PO_NUM_0}}").setText("741903172");
		}
		
		String PO_Number = forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_FIND_PO_NUM_0}}").getText();
		info("PO_Number  ->"+PO_Number);
		
		forms.button("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(38);
	
		forms.button("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.Lines}}").click();
		forms.captureScreenshot(41);
		
		forms.button("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.Shipment}}").click();
		forms.captureScreenshot(44);
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_PO_NUM_0}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_RELEASE_}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_LINE_NUM}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_SHIPMENT}}").invokeSoftKey("NEXT_FIELD");
	
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_ITEM_NUM}}").invokeSoftKey("NEXT_FIELD");
	
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_UNIT_MEA}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_SHIP_TO_}}").invokeSoftKey("NEXT_FIELD");
	
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_SHIPMENT_1}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_START_DA}}").invokeSoftKey("NEXT_FIELD");
	
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_END_DATE}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_QUANTITY}}").invokeSoftKey("NEXT_FIELD");
	
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_QUANTITY}}").setFocus();
	
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_QUANTITY_1}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_QUANTITY_1}}").setFocus();
		info("Quantity Due is : "+forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_QUANTITY_1}}").getText() );
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_QUANTITY_2}}").setFocus();
		info("Quantity Received is : "+forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_SHIPMENTS_FOLDER_QUANTITY_2}}").getText());
		forms.captureScreenshot();
		forms.window("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_window_SHIPMENTS_FOLDER}}").close();
		forms.captureScreenshot(63);
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_LINES_FOLDER_PURCHASING_O}}").setFocus();
		
//		forms.button("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.Shipment}}").click();
//		
//		forms.window("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_window_SHIPMENTS_FOLDER}}").activate(true);
//		forms.captureScreenshot(68);
//		
//		forms.window("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_window_SHIPMENTS_FOLDER}}").close();
//		forms.captureScreenshot(71);
//		
		forms.window("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_window_LINES_FOLDER}}").close();
		forms.captureScreenshot(74);
		
		forms.window("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_window_HEADERS_FOLDER}}").close();
		forms.captureScreenshot(77);
		
		forms.textField("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
		forms.captureScreenshot(80);
		
		forms.close(81);
		forms.captureScreenshot(83);
		
		forms.choiceBox("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.forms_choiceBox}}").clickButton("OK");
		
		

	}

	public void finish() throws Exception {
		web.link("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_a_Logout}}").click();
		web.window(86,
				"{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_window}}").waitForPage(180, true);
		
		web.window("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_window}}").close();
		
		web.window("{{obj.PO_QtyReceived_QtyDue_EligibilityVerification_00122.web_window_1}}").close();
	}
}
