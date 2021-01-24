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
		getDatabank("PO_StandardPOcreationWithoutPRAndApproval_004").getNextDatabankRecord();

		web.window(450,
		"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window_0_1}}").navigate("http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE");
		web.window(452,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window_0_2}}").waitForPage(null);
		{
			think(0.408);
		}
		web.textBox(
				455,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_text_unamebean}}").click();
		
		web.textBox(
				456,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_text_unamebean}}").setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.UID,PEETHAMBARANS}}");
		
		web.textBox(
				457,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_text_unamebean}}").pressTab();
		
		web.textBox(
				458,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_password_pwdbean}}").setPassword("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		
		web.textBox(
				459,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_password_pwdbean}}").pressEnter();
		web.window(460,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}").waitForPage(null);
		{
			think(2.355);
		}
		web.link(
				464,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_a_MWSPC_PURCHASING_BUYER_I}}").click();
		{
			think(5.253);
		}
		web.window(465,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}")
				.waitForPage(180,true);
		if(web.link("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_a_Purchase_Orders}}").exists(10,TimeUnit.SECONDS)){
			web.link("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_a_Purchase_Orders}}").click();
			if(web.link("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_a_Purchase_Orders_1}}").exists(10, TimeUnit.SECONDS)){
				web.link("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_a_Purchase_Orders_1}}").click();
			}
		}
		
		
		//web.window(470,"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}").waitForPage(180,true);
		
		
		web.window(475,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window_1}}")
				.waitForPage(280,true);
		forms.captureScreenshot(480);
		
		forms.textField(481,"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_OperatingUnit}}").setFocus();
		
		forms.textField(482,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_Supplier}}")
				.setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.Supplier ,GENERAL INDUSTRIES Co. Ltd.}}");
		
		forms.textField(483,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_Site}}")
				.setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.Site,AL KHOBAR}}");
		
		forms.textField(484,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_Site}}")
				.invokeSoftKey("NEXT_FIELD");
		
		forms.textField(485,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_Contact}}")
				.setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.Contact,Sen, Bodhisatya}}");
		
		forms.button(
				486,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_button_PO_CONTROL_TERMS_0}}")
				.click();
		forms.captureScreenshot(488);
		{
			think(5.314);
		}
		forms.textField(489,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_InfoTerm}}").setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.IncoTerm,DDP}}");
		
		forms.window("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_window_PO_HEADER_DETAIL}}")	.close();
		forms.captureScreenshot(492);
		{
			think(3.707);
		}
		forms.textField(
				493,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_PO_HEADERS_DOC_TYPE_NAME_}}").setFocus();
		{
			think(5.549);
		}
		forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_PO_HEADERS_DESC_FLEX_0}}").setFocus();
		forms.captureScreenshot(496);
		{
			think(0.314);
		}
		forms.flexWindow(497,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_flexWindow}}").setText("Discount Note", "", "{{db.PO_StandardPOcreationWithoutPRAndApproval_004.note,Note}}");
		{
			think(2.549);
		}
		forms.flexWindow(498,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_flexWindow}}").setText("Discount Amount", "", "{{db.PO_StandardPOcreationWithoutPRAndApproval_004.amount,10}}");
		{
			think(2.549);
		}
		
		forms.flexWindow("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_flexWindow}}").setTextAndClickOk("Currency", "", "{{db.PO_StandardPOcreationWithoutPRAndApproval_004.currency,AED}}");
		forms.captureScreenshot(501);
		{
			think(6.425);
		}

		forms.textField(
				502,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_PO_LINES_LINE_NUM_0}}").setFocus();
		{
			think(7.292);
		}
		forms.textField(503,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_ItemNumber}}").setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.Item,1000350101}}");
		
		forms.textField(504,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_ItemNumber}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField(505,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_Quantity}}").setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.Quantity,1}}");
		
		forms.textField(506,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_Quantity}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField(507,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_Price}}").setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.Price,660}}");
		
		forms.textField(508,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_Price}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_PromisedDate}}").setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.PromisedDate,19-May-2019 00:00:00}}");
		
		forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_PromisedDate}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField(511,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_NeedByDate}}").setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.NeedByDate,19-May-2022 00:00:00}}");
		
		forms.window(512,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_window_PO_HEADERS}}").clickToolBarButton("Save");
		{
			think(8.408);
		}
//		forms.statusBar("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value","FRM-40400: Transaction complete: 2 records applied and saved.",MatchOption.Exact, 0);
//		{
//			think(24.863);
//		}
		forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_PO_HEADERS_SEGMENT1_0}}").setFocus();
		String PO_Number= forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_PO_HEADERS_SEGMENT1_0}}").getText();
		info("PO_Number is ----> "+PO_Number);
		{
			think(0.01);
		}
		forms.button("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_button_PO_CONTROL_APPROVE_0}}").click();
		forms.captureScreenshot(517);
		{
			think(1.865);
		}
		if(forms.choiceBox(518,"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_choiceBox}}").exists()){
			forms.choiceBox(518,"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_choiceBox}}").clickButton("OK");
		}
		
		forms.captureScreenshot(520);
		{
			think(2.777);
		}
		forms.checkBox(
				521,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_checkBox_PO_APPROVE_RESERVE_0}}").check(true);
		{
			think(3.392);
		}
		forms.button("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}").click();
		{
			think(5.785);
		}
		forms.captureScreenshot(524);
		if(forms.choiceBox(533,"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_choiceBox}}").exists()){
			forms.choiceBox(533,"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_choiceBox}}").clickButton("OK");
		}
		
		{
			think(5.785);
		}
		web.link(
				534,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_a_Purchase_Order_Summary}}")
				.click();
		web.window(535,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}")
				.waitForPage(180,true);
		forms.captureScreenshot(540);
		{
			think(2.935);
		}

		forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
		{
			think(10.712);
		}
		forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_FIND_PO_NUM_0}}").setText(PO_Number);
		//PO_Number
		
		forms.button(
				548,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(550);
		{
			think(24.43);
		}
		forms.textField(
				551,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}")
				.setFocus();
		{
			think(0.016);
		}
		forms.window(
				552,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_window_HEADERS_FOLDER}}").selectMenu("Inquire|View Action History");
		{
			think(17.824);
		}
		web.window(553,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}")	.close();
		{
			think(2.184);
		}
		web.window(554,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window_0}}").close();
		web.window(581,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}")
				.navigate(
						"http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?page=/oracle/apps/fnd/framework/navigate/webui/HomePG&homePage=Y&OAPB=FWK_HOMEPAGE_BRAND&transactionid=1220370051&oapc=2&oas=ldsERkNNd0HqGbs9btiUTw..##");
		web.window(583,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}")
				.navigate(
						"http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?page=/oracle/apps/fnd/framework/navigate/webui/HomePG&homePage=Y&OAPB=FWK_HOMEPAGE_BRAND&transactionid=230458548&oapc=2&oas=KDeG5XZY1dldiYhmV52zEg..##");
	}
		
		
		/*
		 * 
		 * 
		 * 
		 * Calling script for approval
		 * 
		 * 
		 */
		
		/*
		browser.launch();
		pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.run();
		browser.launch();
		web.window(450,
		"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window_0_1}}").navigate("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.URL,http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE}}");
		web.window("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window_0_2}}").waitForPage(180,true);
		{
			think(0.408);
		}
		web.textBox(
				455,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_text_unamebean}}")
				.click();
		
		web.textBox(
				456,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_text_unamebean}}")
				.setText("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.UID,PEETHAMBARANS}}");
		
		web.textBox(
				457,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_text_unamebean}}")
				.pressTab();
		
		web.textBox(
				458,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_password_pwdbean}}")
				.setPassword("{{db.PO_StandardPOcreationWithoutPRAndApproval_004.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		
		web.textBox(
				459,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(460,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}")
				.waitForPage(180,true);
		{
			think(2.355);
		}
		web.link(
				464,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_a_MWSPC_PURCHASING_BUYER_I}}")
				.click();
		web.window(465,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}")
				.waitForPage(180,true);
		{
			think(2.372);
		}
		web.link(
			534,
			"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_a_Purchase_Order_Summary}}")
			.click();
		web.window(535,
			"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}")
			.waitForPage(180,true);
		forms.captureScreenshot(540);
		forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
		{
			think(10.712);
		}
		forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_FIND_PO_NUM_0}}").setText("741904496");
		//PO_Number
		{
			think(0.015);
		}
		forms.button(
				548,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_button_FIND_FIND_0}}")
				.click();
		forms.captureScreenshot(550);
		{
			think(24.43);
		}
		forms.textField(
				551,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}")
				.setFocus();
		{
			think(0.016);
		}
		forms.textField("{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").setFocus();
		
		forms.window(
				552,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.forms_window_HEADERS_FOLDER}}").selectMenu("Inquire|View Action History");	
		{
			think(17.824);
		}
		forms.captureScreenshot();
		web.window(553,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window}}").close();
		{
			think(2.184);
		}
		web.window(554,
				"{{obj.PO_StandardPOcreationWithoutPRAndApproval_004.web_window_0}}").close();
		{
			think(0.448);
		}
		
			}
			*/
			public void finish() throws Exception {
			}
		}
