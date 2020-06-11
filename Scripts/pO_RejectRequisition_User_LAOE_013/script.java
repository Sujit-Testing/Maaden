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

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		web.window(39, "{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0}}")
				.navigate(
						"http://riyoramgbm02.maaden.com:8050/");
		web.window(40,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_1}}")
				.waitForPage(null);
		{
			think(1.95);
		}
		
		web.textBox(55,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_text_unamebean}}")
				.click();
		{
			think(1.233);
		}
		web.textBox(56,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_text_unamebean}}")
				.setText("laoe");
		{
			think(0.594);
		}
		web.textBox(57,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_text_unamebean}}")
				.pressTab();
		{
			think(1.289);
		}
		web.textBox(58,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		{
			think(1.056);
		}
		web.textBox(59,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(60,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_2}}")
				.waitForPage(null);
		{
			think(1.356);
		}
		web.link(63,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_a_Purchase_Requisition_7118}}")
				.click();
		web.window(64,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_3}}")
				.waitForPage(null);
		{
			think(2.453);
		}
		web.element(67, "{{obj.PO_RejectRequistion_User_LAOE_013.web_body_0}}")
				.click();
		{
			think(2.312);
		}
		web.textArea(68,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_textarea_N58}}")
				.setText("Rejected");
		{
			think(2.485);
		}
		web.button(69,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_button_Reject}}")
				.click();
		web.window(70,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_2}}")
				.waitForPage(null);
		{
			think(3.854);
		}
		web.link(73, "{{obj.PO_RejectRequistion_User_LAOE_013.web_a_Logout_1}}")
				.click();
		web.window(74,
				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_1}}")
				.waitForPage(null);
		{
			think(1.86);
//		}
//		web.textBox(77,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_text_unamebean}}")
//				.click();
//		{
//			think(1.529);
//		}
//		web.textBox(78,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_text_unamebean}}")
//				.setText("fareedm");
//		{
//			think(0.332);
//		}
//		web.textBox(79,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_text_unamebean}}")
//				.pressTab();
//		{
//			think(0.802);
//		}
//		web.textBox(80,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_password_pwdbean}}")
//				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
//		{
//			think(0.432);
//		}
//		web.textBox(81,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_input_password_pwdbean}}")
//				.pressEnter();
//		web.window(82,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_2}}")
//				.waitForPage(null);
//		{
//			think(4.209);
//		}
//		web.link(85,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_a_MWSPC_PURCHASING_PREPARER}}")
//				.click();
//		web.window(86,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_2}}")
//				.waitForPage(null);
//		{
//			think(1.353);
//		}
//		web.link(89,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_a_Requisition}}")
//				.click();
//		web.window(90,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_2}}")
//				.waitForPage(null);
//		{
//			think(2.922);
//		}
//		web.element(93,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_div_menuLayout_div}}")
//				.click();
//		{
//			think(1.434);
//		}
//		web.link(94,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_a_Requisition_Summary}}")
//				.click();
//		web.window(95,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_2}}")
//				.waitForPage(null);
//		{
//			think(2.965);
//		}
//		if(web.alertDialog(98,"{{obj.PO_RejectRequistion_User_LAOE_013.web_dialog_alert_Syntax_error}}").exists(10, TimeUnit.SECONDS)){
//			web.alertDialog(98,"{{obj.PO_RejectRequistion_User_LAOE_013.web_dialog_alert_Syntax_error}}").clickOk();
//		}
//		
//		
//		web.window(99, "{{obj.PO_RejectRequistion_User_LAOE_013.web_window_1}}")
//				.waitForPage(null);
//		forms.captureScreenshot(101);
//		{
//			think(35.866);
//		}
//		forms.textField(
//				102,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_textField_FIND_REQ_OPERATING_UNIT_0}}")
//				.setFocus();
//		{
//			think(3.064);
//		}
//		forms.textField(103,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_textField_FIND_REQ_REQ_NUM_0}}")
//				.setText("711802692");
//		{
//			think(0.0);
//		}
//		forms.button(104,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_button_FIND_REQ_FIND_0}}")
//				.click();
//		forms.captureScreenshot(106);
//		{
//			think(7.676);
//		}
//		forms.button(
//				107,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_button_REQ_HEADERS_FOLDER_CONTRO}}")
//				.click();
//		forms.captureScreenshot(109);
//		{
//			think(11.177);
//		}
//		forms.textField(
//				110,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_textField_PO_REQ_HDR_OPERATING_UNIT}}")
//				.setFocus();
//		{
//			think(1.963);
//		}
//		forms.textField(
//				111,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_textField_PO_REQ_HDR_DESCRIPTION_0}}")
//				.setText("A");
//		{
//			think(6.055);
//		}
//		forms.textField(
//				112,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_textField_PO_REQ_HDR_DESCRIPTION_0}}")
//				.setText("Approval is pending");
//		{
//			think(2.452);
//		}
//		forms.textField(
//				113,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_textField_LINES_SUGGESTED_VENDOR_PH}}")
//				.setText("9");
//		{
//			think(3.406);
//		}
//		forms.textField(
//				114,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_textField_LINES_SUGGESTED_VENDOR_PH}}")
//				.setText("9331051554");
//		{
//			think(0.016);
//		}
//		forms.button(115,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_button_CONTROL_APPROVAL_0}}")
//				.click();
//		{
//			think(1.705);
//		}
//		forms.statusBar(116,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_statusBar}}")
//				.assertText(
//						"FormsFT AutoValidation: Verify StatusBar text value",
//						"FRM-40400: Transaction complete: 2 records applied and saved.",
//						MatchOption.Exact, 0);
//		forms.captureScreenshot(118);
//		{
//			think(18.162);
//		}
//		forms.textField(119,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_textField_PO_APPROVE_NOTE_0}}")
//				.setText("Approval is pending.Approve it.");
//		{
//			think(0.111);
//		}
//		forms.button(
//				120,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}")
//				.click();
//		forms.captureScreenshot(122);
//		{
//			think(18.393);
//		}
//		forms.textField(
//				123,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_textField_PO_REQ_HDR_OPERATING_UNIT}}")
//				.setFocus();
//		forms.captureScreenshot(125);
//		{
//			think(0.162);
//		}
//		forms.close(126);
//		forms.captureScreenshot(128);
//		{
//			think(2.504);
//		}
//		forms.choiceBox(129,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.forms_choiceBox}}")
//				.clickButton("OK");
//		{
//			think(11.285);
//		}
//		web.window(130,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_0_2}}")
//				.close();
//		{
//			think(0.302);
//		}
//		web.window(131,
//				"{{obj.PO_RejectRequistion_User_LAOE_013.web_window_1}}")
//				.close();


	}}

	public void finish() throws Exception {
	}
}
