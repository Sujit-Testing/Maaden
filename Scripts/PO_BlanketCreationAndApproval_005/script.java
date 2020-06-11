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
		/*
		
		web.window(3, "{{obj.PO_BlanketCreationAndApproval_005.web_window_0}}")
				.navigate("http://riyoramgbm02.maaden.com:8050/");
		{
			think(0.047);
		}
		web.window(5, "{{obj.PO_BlanketCreationAndApproval_005.web_window_0}}")
				.navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(6,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_2}}")
				.waitForPage(null);
		{
			think(5.521);
		}
		web.textBox(9,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_text_unamebean}}")
				.click();
		{
			think(0.755);
		}
		web.textBox(10,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_text_unamebean}}")
				.setText("PEETHAMBARANS");
		{
			think(1.132);
		}
		web.textBox(11,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_text_unamebean}}")
				.pressTab();
		
		web.textBox(12,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.textBox(13,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_password_pwdbean}}").pressEnter();
		web.window(14,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_3}}")	.waitForPage(180,true);
	
		web.link(702,
		"{{obj.PO_BlanketCreationAndApproval_005.web_a_MWSPC_PURCHASING_SUPERUSE}}").click();
web.window(703,
		"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_3}}").waitForPage(null);
{
	think(5.92);
}
web.element(706,
		"{{obj.PO_BlanketCreationAndApproval_005.web_div_menuLayout_div}}").click();
{
	think(4.401);
}
web.link(707,
		"{{obj.PO_BlanketCreationAndApproval_005.web_a_Purchase_Order}}").click();
web.window(708,
		"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_3}}").waitForPage(null);
{
	think(1.575);
}
		web.window(27,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_3}}").waitForPage(null);
		{
			think(21.688);
		}
		if(web.alertDialog("{{obj.PO_BlanketCreationAndApproval_005.web_dialog_alert_Syntax_error}}").exists(10, TimeUnit.SECONDS)){
			web.alertDialog("{{obj.PO_BlanketCreationAndApproval_005.web_dialog_alert_Syntax_error}}").clickOk();
			
		}
				
		web.window(31, "{{obj.PO_BlanketCreationAndApproval_005.web_window_1}}")
				.waitForPage(null);
		forms.captureScreenshot(33);
		{
			think(54.319);
		}
		forms.textField(
				34,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_OPERATING_UNIT}}")
				.setFocus();
		{
			think(11.464);
			think(0.0);
		}
		forms.textField(
				327,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_DOC_TYPE_NAME_}}")
				.setText("Blanket Purchase Agreement");
		{
			think(9.185);
		}
		forms.textField(
				328,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_VENDOR_NAME_0}}")
				.setText("GENERAL INDUSTRIES Co. Ltd.");
		
		forms.textField(
				613,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_VENDOR_SITE_CO}}")
				.setText("AL KHOBAR");
		
		forms.textField(
				614,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_BLANKET_TOTAL_}}")
				.setText("100000");
		{
			think(0.016);
		}
		forms.checkBox(
				615,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_checkBox_PO_HEADERS_GLOBAL_AGREEME}}")
				.check(true);
		
		forms.textField(
				616,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_DESC_FLEX_0}}")
				.setFocus();
		forms.captureScreenshot(618);
		{
			think(0.2);
		}
//		forms.flexWindow(619,
//				"{{obj.PO_BlanketCreationAndApproval_005.forms_flexWindow}}").clickOk();
//		{
//			think(1.14);
//		}
		forms.statusBar(620,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_statusBar}}")
				.assertText(
						"FormsFT AutoValidation: Verify StatusBar text value",
						"FRM-40202: Field must be entered.", MatchOption.Exact,
						0);
		forms.captureScreenshot(622);
		{
			think(22.163);
		}
		forms.textField(
				623,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_FREIGHT_TERMS_}}")
				.setText("DDP");
		{
			think(6.516);
		}
		forms.textField(
				624,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_START_DATE_0}}")
				.setText("25-JUL-2019");
		{
			think(0.081);
		}
		forms.textField(
				625,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_START_DATE_0}}")
				.invokeSoftKey("NEXT_FIELD");
		{
			think(39.504);
		}
		forms.textField(
				626,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_END_DATE_0}}")
				.setText("21-DEC-2021");
		{
			think(0.016);
		}
		forms.window(627,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_window_PO_HEADER_DETAIL}}")
				.close();
		forms.captureScreenshot(629);
		{
			think(6.583);
		}
		forms.textField(
				630,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_DOC_TYPE_NAME_}}")
				.setFocus();
		{
			think(16.632);
		}
		forms.textField(
				631,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_LINES_ITEM_NUMBER_0}}")
				.setText("1000350101");
		{
			think(1.004);
		}
		forms.button(632,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_button_PO_CONTROL_TERMS_0}}")
				.click();
		forms.captureScreenshot(634);
		{
			think(5.392);
		}
		forms.window(635,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_window_PO_HEADER_DETAIL}}")
				.close();
		forms.captureScreenshot(637);
		{
			think(16.146);
		}
		forms.textField(
				638,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_DOC_TYPE_NAME_}}")
				.setFocus();
		{
			think(8.612);
		}
		forms.textField(
				639,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_LINES_UNIT_PRICE_0}}")
				.setText("100");
		{
			think(0.01);
		}
		forms.window(640,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_window_PO_HEADERS}}")
				.clickToolBarButton("Save");
		{
			think(0.502);
		}
		forms.statusBar(641,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_statusBar}}")
				.assertText(
						"FormsFT AutoValidation: Verify StatusBar text value",
						"FRM-40400: Transaction complete: 2 records applied and saved.",
						MatchOption.Exact, 0);
		{
			think(103.573);
		}
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_SEGMENT1_0}}").setFocus();
		String pONumber = forms.textField("{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_SEGMENT1_0}}").getText();
		info("pONumber is -> "+pONumber);
		forms.captureScreenshot();
		
			
		forms.button(643,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_button_PO_CONTROL_APPROVE_0}}")
				.click();
		forms.captureScreenshot(645);
		{
			think(7.328);
		}
		forms.button(
				646,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}")
				.click();
		forms.captureScreenshot(648);
		{
			think(125.174);
		}
		forms.textField(
				649,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_HEADERS_OPERATING_UNIT}}")
				.setFocus();
		{
			think(0.189);
		}
		forms.window(650,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_window_PO_HEADERS}}")
				.close();
		forms.captureScreenshot(652);
		{
			think(13.332);
		}
		forms.close(653);
		forms.captureScreenshot(655);
		{
			think(3.168);
		}
		forms.choiceBox(656,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_choiceBox}}")
				.clickButton("OK");
		{
			think(10.442);
		}
		web.link(657, "{{obj.PO_BlanketCreationAndApproval_005.web_a_Logout}}")
				.click();
		web.window(658,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_2}}")
				.waitForPage(null);
		{
			think(2.026);
		}
		web.window(661,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_2}}")
				.close();
		{
			think(0.334);
		}
		web.window(662,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_4}}")				
				.close();
		*/
		//Call the function
		browser.launch();
		pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.run();
		//Open and checking the status of the PO Number
		browser.launch();
		
		web.window(689,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0}}")
				.navigate("http://riyoramgbm02.maaden.com:8050/");
		{
			think(0.47);
		}
		web.window(690,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_1}}")
				.navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(691,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_2}}")
				.waitForPage(null);
		{
			think(13.266);
		}
		web.textBox(694,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_text_unamebean}}")
				.click();
		
		web.textBox(695,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_text_unamebean}}")
				.setText("PEETHAMBARANS");
		
		web.textBox(696,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_text_unamebean}}")
				.pressTab();
		
		web.textBox(697,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.textBox(698,
				"{{obj.PO_BlanketCreationAndApproval_005.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(699,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_3}}")
				.waitForPage(null);
		{
			think(13.962);
		}
		web.link(702,
				"{{obj.PO_BlanketCreationAndApproval_005.web_a_MWSPC_PURCHASING_SUPERUSE}}")
				.click();
		web.window(703,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_3}}")
				.waitForPage(null);
		{
			think(5.92);
		}
		web.element(706,
				"{{obj.PO_BlanketCreationAndApproval_005.web_div_menuLayout_div}}")
				.click();
		{
			think(4.401);
		}
		web.link(707,
				"{{obj.PO_BlanketCreationAndApproval_005.web_a_Purchase_Order}}")
				.click();
		web.window(708,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_3}}")
				.waitForPage(null);
		{
			think(1.575);
		}
		web.link(711,
				"{{obj.PO_BlanketCreationAndApproval_005.web_a_Purchase_Order_Summary_1}}")
				.click();
		web.window(712,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_1}}")
				.waitForPage(null);
		forms.captureScreenshot(716);
		{
			think(86.045);
		}
		forms.textField(
				717,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_FIND_OPERATING_UNIT_0}}")
				.setFocus();
		{
			think(4.416);
		}
		forms.textField(718,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_FIND_PO_NUM_0}}")
				.setText("2222222");//pONumber
		{
			think(0.033);
		}
		forms.button(719,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_button_FIND_FIND_0}}")
				.click();
		forms.captureScreenshot(721);
		{
			think(25.63);
		}
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").setFocus();
		String status=forms.textField("{{obj.PO_BlanketCreationAndApproval_005.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").getText();
		if(status.equalsIgnoreCase("Approved")){
			info("Status has been changed from Incomplete to "+status);
			
		}
		{
			think(0.007);
		}
		forms.window(723,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_window_HEADERS_FOLDER}}")
				.selectMenu("Inquire|View Action History");
		forms.captureScreenshot(725);
		{
			think(8.841);
		}
		forms.textField(
				726,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_PO_ACTION_HISTORY_ACTION_}}")
				.setFocus();
		{
			think(0.012);
		}
		forms.window(727,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_window_PO_ACTION_HISTORY}}")
				.close();
		forms.captureScreenshot(729);
		{
			think(2.566);
		}
		forms.window(730,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_window_HEADERS_FOLDER}}")
				.close();
		forms.captureScreenshot(732);
		{
			think(5.033);
		}
		forms.textField(
				733,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_textField_FIND_OPERATING_UNIT_0}}")
				.setFocus();
		{
			think(0.014);
		}
		forms.window(734,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_window_FIND}}")
				.close();
		forms.captureScreenshot(736);
		{
			think(3.048);
		}
		forms.close(737);
		forms.captureScreenshot(739);
		{
			think(2.76);
		}
		forms.choiceBox(740,
				"{{obj.PO_BlanketCreationAndApproval_005.forms_choiceBox}}")
				.clickButton("OK");
		{
			think(9.011);
		}
		web.window(741,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_0_3}}")
				.close();
		{
			think(0.301);
		}
		web.window(742,
				"{{obj.PO_BlanketCreationAndApproval_005.web_window_1}}")
				.close();
		
		

		
	
	}

	public void finish() throws Exception {
	}
}
