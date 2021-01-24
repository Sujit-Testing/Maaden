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
import lib.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.applet.api.AppletService applet;
	@ScriptService oracle.oats.scripting.modules.formsFT.api.FormsService forms;
	@FunctionLibrary("PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002") lib.maaden.orackeEBS.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002 pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002;

	public void initialize() throws Exception {
		browser.launch();
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		web.window(96,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(97,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_1}}")
				.waitForPage(null);
		{
			think(0.371);
		}
		web.textBox(
				100,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_text_unamebean}}")
				.click();
		{
			think(1.687);
		}
		web.textBox(
				101,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_text_unamebean}}")
				.setText("PEETHAMBARANS");		
		web.textBox(
				102,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_text_unamebean}}")
				.pressTab();		
		web.textBox(
				103,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.textBox(
				104,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(105,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
				.waitForPage(null);
		{
			think(2.654);
		}
		web.link(
				109,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_a_MWSPC_PURCHASING_SUPERUSE}}")
				.click();
		web.window(110,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
				.waitForPage(null);
		{
			think(6.274);
		}
		web.link(114,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_a_AutoCreate}}")
				.click();
		web.window(115,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_1}}")
				.waitForPage(null);
		forms.captureScreenshot(120);
		{
			think(31.837);
		}
		forms.textField(
				121,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_FIND_REQ_LINES_OPERATING_}}")
				.setFocus();
		{
			think(0.0);
		}
		forms.button(
				122,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_FIND_REQ_LINES_CLEAR_0}}")
				.click();
		{
			think(8.654);
		}
		forms.textField(
				123,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_FIND_REQ_LINES_OPERATING_}}")
				.setFocus();
		{
			think(3.995);
		}
		forms.textField(
				124,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_FIND_REQ_LINES_REQUISITIO}}")
				.setText("711905903");
		{
			think(0.005);
		}
		forms.button(
				125,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_FIND_REQ_LINES_FIND_0}}")
				.click();
		
		forms.captureScreenshot(139);
		{
			think(10.748);
		}
		forms.checkBox(
				140,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_checkBox_REQ_LINES_SELECT_LINE_0}}")
				.check(true);
		{
			think(8.348);
		}
		forms.list(
				141,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_list_ACTION_DOCUMENT_TYPE_0}}")
				.selectItem("Blanket Release");
		{
			think(4.522);
		}
		forms.button(
				142,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_ACTION_PLACE_0}}")
				.click();
		forms.captureScreenshot(144);
		{
			think(44.5);
		}
		forms.textField(
				145,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PLACE_NEW_DOC_DOCUMENT_NU}}")
				.setText("741700202");
		{
			think(0.01);
		}
		forms.button(
				146,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_PLACE_NEW_DOC_OK_0}}")
				.click();
		{
			think(3.36);
		}
		forms.window(
				147,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_window_REQ_LINES}}")
				.activate(true);
		forms.captureScreenshot(149);
		{
			think(5.299);
		}
		forms.textField(
				150,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_REQ_LINES_REQUISITION_NUM}}")
				.setFocus();
		{
			think(1.229);
		}
		forms.textField(
				151,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_CURRENT_STATE_PO_LINE_NUM}}")
				.click();
		{
			think(2.416);
		}
		forms.button(
				152,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_ACTION_ADD_0}}")
				.click();
		{
			think(5.587);
		}
		forms.button(
				153,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_ACTION_MANUAL_CREATE_BUTT}}")
				.click();
		forms.captureScreenshot(155);
		{
			think(4.747);
		}
		forms.choiceBox(156,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_choiceBox}}")
				.clickButton("OK");
		forms.captureScreenshot(158);
		{
			think(6.282);
		}
		forms.button(
				159,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_NEW_DOCUMENT_OK_0}}")
				.click();
		{
			think(12.946);
		}
		forms.window(
				160,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_window_PO_RELEASES}}")
				.activate(true);
		forms.captureScreenshot(162);
		{
			think(12.529);
		}
		forms.textField(
				163,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PO_RELEASES_OPERATING_UNI}}")
				.setFocus();
		{
			think(3.595);
		}
		forms.textField("{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PO_RELEASES_PO_NUM_0}}").setFocus();
		String PO_Number = forms.textField("{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PO_RELEASES_PO_NUM_0}}").getText();
		info("PO_Number is :  "+PO_Number);
		
		forms.textField("{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PO_RELEASES_RELEASE_NUM_0}}").setFocus();
		String release_Number =forms.textField("{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PO_RELEASES_RELEASE_NUM_0}}").getText();
			info("release_Number is :  "+release_Number);
		forms.button(
				166,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_REL_CONTROL_APPROVAL_0}}")
				.click();
		forms.captureScreenshot(168);
		{
			think(7.503);
		}
		forms.button(
				169,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}")
				.click();
		{
			think(35.548);
		}
		web.element(
				170,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_div_menuLayout_div}}")
				.click();
		{
			think(2.168);
		}
		web.link(171,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_a_Purchase_Order}}")
				.click();
		web.window(172,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
				.waitForPage(null);
		{
			think(1.596);
		}
		web.link(
				176,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_a_Purchase_Order_Summary}}")
				.click();
		web.window(177,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
				.waitForPage(null);
		forms.captureScreenshot(182);
		{
			think(3.431);
		}
		forms.textField(
				183,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PO_RELEASES_PO_NUM_0}}")
				.setFocus();
		{
			think(0.775);
		}
		
		forms.captureScreenshot(187);
		{
			think(4.1);
		}
		forms.textField(
				188,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_FIND_OPERATING_UNIT_0}}")
				.setFocus();
		{
			think(2.569);
		}
		forms.textField(
				189,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_FIND_PO_NUM_0}}")
				.setText(PO_Number);
		{
			think(5.354);
		}
		forms.textField(
				190,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_FIND_RELEASE_NUM_0}}")
				.setText(release_Number);
		{
			think(0.015);
		}
		forms.button(
				191,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_FIND_FIND_0}}")
				.click();
		forms.captureScreenshot(193);
		{
			think(20.704);
		}
		forms.textField("{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").setFocus();
		String status = forms.textField("{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").getText();
		info("status--->"+status);
		{
			think(0.322);
		}
		forms.window(
				195,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_window_HEADERS_FOLDER}}")
				.selectMenu("Inquire|View Action History");
		{
			think(9.082);
		}
		web.window(196,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
				.close();
		{
			think(2.643);
		}
		web.window(197,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_3}}")
				.close();
		{
			think(0.711);
		}
		forms.close(198);
		
		
		// Call the function
		
		pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.run();
		
		
		web.window(96,
		"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(97,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_1}}")
				.waitForPage(null);
		{
			think(0.371);
		}
		web.textBox(
				100,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_text_unamebean}}")
				.click();
		{
			think(1.687);
		}
		web.textBox(
				101,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_text_unamebean}}")
				.setText("PEETHAMBARANS");		
		web.textBox(
				102,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_text_unamebean}}")
				.pressTab();		
		web.textBox(
				103,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.textBox(
				104,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(105,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
				.waitForPage(null);
		{
			think(2.654);
		}
		web.link(
				109,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_a_MWSPC_PURCHASING_SUPERUSE}}")
				.click();
		web.window(110,
				"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
				.waitForPage(null);
		web.element(
			170,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_div_menuLayout_div}}")
			.click();
		{
		think(2.168);
		}
		web.link(171,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_a_Purchase_Order}}")
			.click();
		web.window(172,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
			.waitForPage(null);
		{
		think(1.596);
		}
		web.link(
			176,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_a_Purchase_Order_Summary}}")
			.click();
		web.window(177,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
			.waitForPage(null);
		forms.captureScreenshot(182);
		{
		think(3.431);
		}
		forms.textField(
			183,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PO_RELEASES_PO_NUM_0}}")
			.setFocus();
		{
		think(0.775);
		}
		forms.textField(
			184,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PO_RELEASES_PO_NUM_0}}")
			.setFocus();
		{
		think(8.337);
		}
		forms.textField(
			185,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_PO_RELEASES_PO_NUM_0}}")
			.setFocus();
		forms.captureScreenshot(187);
		{
		think(4.1);
		}
		forms.textField(
			188,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_FIND_OPERATING_UNIT_0}}")
			.setFocus();
		{
		think(2.569);
		}
		forms.textField(
			189,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_FIND_PO_NUM_0}}")
			.setText(PO_Number);
		{
		think(5.354);
		}
		forms.textField(
			190,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_FIND_RELEASE_NUM_0}}")
			.setText(release_Number);
		{
		think(0.015);
		}
		forms.button(
			191,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_button_FIND_FIND_0}}")
			.click();
		forms.captureScreenshot(193);
		{
		think(20.704);
		}
		forms.textField("{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").setFocus();
		String status_Approved = forms.textField("{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").getText();
		info("status_Approved--->"+status_Approved);
		{
		think(0.322);
		}
		forms.window(
			195,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.forms_window_HEADERS_FOLDER}}")
			.selectMenu("Inquire|View Action History");
		{
		think(9.082);
		}
		web.window(196,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_2}}")
			.close();
		{
		think(2.643);
		}
		web.window(197,
			"{{obj.PO_BlanketReleaseCreationFromPRAnd Approval_006.web_window_0_3}}")
			.close();
				

	}

	public void finish() throws Exception {
	}
}
