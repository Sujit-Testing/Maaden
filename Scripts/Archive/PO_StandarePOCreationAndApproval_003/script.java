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
	String status;
	@FunctionLibrary("PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002") lib.maaden.orackeEBS.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002 pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002;
	public void initialize() throws Exception {
		browser.launch();
		
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 * 
	 * Approved Requestion needs to be use to create standared PO creation and approve
	 */
	public void run() throws Exception {
//		web.window(173,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}").navigate("http://riyoramgbm02.maaden.com:8050/");
//		{
//			think(0.394);
//		}
//		web.window(174,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}").navigate("http://riyoramgbm02.maaden.com:8050/");
//		web.window(175,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}")
//				.waitForPage(null);
//		{
//			think(8.986);
//		}
//		web.textBox(178,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_text_unamebean}}").click();
//		
//		web.textBox(179,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_text_unamebean}}").setText("PEETHAMBARANS");
//		
//		web.textBox(180,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_text_unamebean}}").pressTab();
//		
//		web.textBox(181,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_password_pwdbean}}").setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
//		
//		web.button(182,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_button_SubmitButton}}")	.click();
//		web.window(183,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}").waitForPage(null);
//		{
//			think(3.594);
//		}
//		web.link(186,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_MWSPC_PURCHASING_SUPERUSE}}").click();
//		web.window(187,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}").waitForPage(null);
//		{
//			think(5.896);
//		}
//		web.link(190,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_AutoCreate_1}}").click();
//		web.window(191,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_1}}").waitForPage(null);
//		forms.captureScreenshot(195);
//		{
//			think(62.001);
//		}
//		forms.textField(
//				196,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_REQ_LINES_OPERATING_}}").setFocus();
//		{
//			think(0.0);
//		}
//		forms.button(
//				197,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_FIND_REQ_LINES_CLEAR_0}}").click();
//		{
//			think(3.421);
//		}
//		forms.textField(
//				198,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_REQ_LINES_OPERATING_}}").setFocus();
//		{
//			think(2.149);
//			think(1.508);
//		}
//		forms.textField(
//				242,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_REQ_LINES_REQUISITIO}}").setText("711905245");
//		{
//			think(0.009);
//		}
//		forms.button(
//				243,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_FIND_REQ_LINES_FIND_0}}").click();
//		forms.captureScreenshot(245);
//		{
//			think(13.787);
//		}
//		forms.checkBox(
//				246,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_checkBox_REQ_LINES_SELECT_LINE_0}}").check(true);
//		{
//			think(7.033);
//		}
//		forms.button(
//				247,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_ACTION_AUTOCREATE_BUTTON_}}").click();
//		forms.captureScreenshot(249);
//		{
//			think(8.854);
//		}
//		forms.choiceBox(250,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_choiceBox}}").clickButton("OK");
//		forms.captureScreenshot(252);
//		{
//			think(5.779);
//		}
//		forms.button(253,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_NEW_DOCUMENT_OK_0}}").click();
//		{
//			think(5.215);
//		}
//		forms.window(254,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_PO_HEADERS}}").activate(true);
//		forms.captureScreenshot(256);
//		{
//			think(5.736);
//		}
//		forms.textField(
//				257,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_OPERATING_UNIT}}").setFocus();
//		{
//			think(9.381);
//		}
//		forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_SEGMENT1_0}}").setFocus();
//		{
//			think(0.01);
//		}
//		info(forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_SEGMENT1_0}}").getText());
//		
//		forms.button(259,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_PO_CONTROL_TERMS_0}}").click();
//		forms.captureScreenshot(261);
//		{
//			think(38.625);
//		}
//		forms.list(
//				262,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_list_PO_HEADERS_ACCEPTANCE_REQ}}").selectItem("None");
//		{
//			think(8.995);
//		}
//		forms.textField(
//				263,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_FREIGHT_TERMS_}}").setText("DOOR TO DOOR");
//		{
//			think(0.051);
//		}
//		forms.window(264,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_PO_HEADER_DETAIL}}").clickToolBarButton("Save");
//		{
//			think(0.03);
//		}
//		forms.statusBar(265,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_statusBar}}").assertText(	"FormsFT AutoValidation: Verify StatusBar text value",
//						"FRM-40400: Transaction complete: 1 records applied and saved.",MatchOption.Exact, 0);
//		{
//			think(6.11);
//		}
//		forms.window(266,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_PO_HEADER_DETAIL}}").close();
//		forms.captureScreenshot(268);
//		{
//			think(7.194);
//		}
//		forms.textField(
//				269,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_DOC_TYPE_NAME_}}").setFocus();
//		{
//			think(0.191);
//		}
////		forms.button(
////				270,
////				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_PO_CONTROL_APPROVE_0}}").click();
////		forms.captureScreenshot(272);
////		{
////			think(8.718);
////		}
////		forms.button(
////				273,
////				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_PO_APPROVE_CANCEL_BUTTON_}}").click();
////		forms.captureScreenshot(275);
////		{
////			think(6.135);
////		}
//		forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_SEGMENT1_0}}").setFocus();
//	
//		forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_STATUS_0}}").setFocus();
//		status = forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_STATUS_0}}").getText();
//		if(status.equalsIgnoreCase("Incomplete")){
//			info("Now PO Status is: "+status);
//		}
//		
//		forms.button("{{obj.PO_StandarePOCreationAndApproval_003.forms_button_PO_CONTROL_APPROVE_0}}").click();
//		forms.captureScreenshot(280);
//		{
//			think(6.457);
//		}
//		forms.button(
//				281,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}").click();
//		forms.captureScreenshot(283);
//		{
//			think(16.336);
//		}
//		forms.textField(
//				284,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_DOC_TYPE_NAME_}}").setFocus();
//		{
//			think(11.25);
//		}
//		forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_STATUS_0}}").setFocus();
//		status = forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_STATUS_0}}").getText();
//		info(status);
//		if(status.contains("Aproved")){
//			info("Now PO Status changed to : "+status);
//		}
//		{
//			think(0.011);
//		}
//		forms.window(286,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_PO_HEADERS}}").close();
//		{
//			think(1.414);
//		}
//		forms.window(287,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_FIND_REQ_LINES}}").activate(true);
//		forms.captureScreenshot(289);
//		{
//			think(8.768);
//		}
//		forms.textField(
//				290,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_REQ_LINES_OPERATING_}}").setFocus();
//		{
//			think(0.0);
//		}
//		forms.window(291,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_FIND_REQ_LINES}}").close();
//		forms.captureScreenshot(293);
//		{
//			think(3.771);
//		}
//		forms.close(294);
//		forms.captureScreenshot(296);
//		{
//			think(7.484);
//		}
//		forms.choiceBox(297,
//				"{{obj.PO_StandarePOCreationAndApproval_003.forms_choiceBox}}").clickButton("OK");
//		{
//			think(15.972);
//		}
//		web.link(298,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_Logout}}").click();
//		web.window(299,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}").waitForPage(null);
//		{
//			think(2.49);
//		}
//		web.window(302,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}").close();
//		{
//			think(0.42);
//		}
//		web.window(303,	"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}").close();
//		
//		
//		
		
		
		getDatabank("PO_StandarePOCreationAndApproval_003").getNextDatabankRecord();
		web.window(803,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_0}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(805,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_0_1}}").waitForPage(180,true);
		
		web.textBox(808,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_text_unamebean_1}}")
				.click();
		
		web.textBox(809,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_text_unamebean_1}}")
				.setText("{{db.PO_StandarePOCreationAndApproval_003.UID,PEETHAMBARANS}}");
		
		web.textBox(810,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_text_unamebean_1}}")
				.pressTab();
		
		web.textBox(811,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_password_pwdbean_1}}")
				.setPassword("{{db.PO_StandarePOCreationAndApproval_003.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		
		web.textBox(812,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_password_pwdbean_1}}")
				.pressEnter();
		web.window(813,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}")
				.waitForPage(180,true);
		
		web.link(
				817,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_MWSPC_PURCHASING_SUPERUSE_1}}")
				.click();
		web.window(818,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}")
				.waitForPage(180,true);
		
		web.link(822,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_AutoCreate_3}}")
				.click();
		web.window(823,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_1}}")
				.waitForPage(180,true);
		forms.captureScreenshot(828);
		
		forms.textField(
				829,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_REQ_LINES_OPERATING_}}")
				.setFocus();
		
		forms.button(
				830,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_FIND_REQ_LINES_CLEAR_0}}")
				.click();
		
		forms.textField(
				831,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_REQ_LINES_OPERATING_}}")
				.setFocus();
		{
			think(3.345);
		}
		forms.textField(
				832,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_REQ_LINES_REQUISITIO}}")
				.setText("{{db.PO_StandarePOCreationAndApproval_003.RequestionNumber,711905497}}");
		{
			think(0.0);
		}
		forms.button(
				833,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_FIND_REQ_LINES_FIND_0}}")
				.click();
		forms.captureScreenshot(835);
		{
			think(10.471);
		}
		forms.checkBox(
				836,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_checkBox_REQ_LINES_SELECT_LINE_0}}")
				.check(true);
		{
			think(4.671);
		}
		forms.button(
				837,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_ACTION_AUTOCREATE_BUTTON_}}")
				.click();
		forms.captureScreenshot(839);
		{
			think(6.362);
		}
		forms.choiceBox(840,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_choiceBox}}")
				.clickButton("OK");
		forms.captureScreenshot(842);
		{
			think(23.864);
		}
		forms.textField(
				843,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_NEW_DOCUMENT_VENDOR_0}}")
				.setText("{{db.PO_StandarePOCreationAndApproval_003.SupplierName,AL TALA'A INTERNATIONAL TRANSPORTATION CO LTD. Hanco}}");
		{
			think(0.015);
		}
		forms.textField(
				844,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_NEW_DOCUMENT_VENDOR_0}}")
				.invokeSoftKey("NEXT_FIELD");
		{
			think(6.227);
		}
		forms.button(845,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_NEW_DOCUMENT_OK_0}}")
				.click();
		{
			think(20.643);
		}
		forms.window(846,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_PO_HEADERS}}")
				.activate(true);
		forms.captureScreenshot(848);
		{
			think(4.349);
		}
		forms.textField(
				849,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_OPERATING_UNIT}}")
				.setFocus();
		{
			think(6.183);
		}
		forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_SEGMENT1_0}}").setFocus();
		String PO_Number = forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_SEGMENT1_0}}").getText();
		info("PO_Number is -> "+PO_Number);
		{
			think(0.544);
		}
		forms.button(851,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_PO_CONTROL_TERMS_0}}")
				.click();
		forms.captureScreenshot(853);
		{
			think(29.326);
		}
		forms.textField(
				854,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_FREIGHT_TERMS_}}")
				.setText("{{db.PO_StandarePOCreationAndApproval_003.InComm,DOOR TO DOOR}}");
		{
			think(5.895);
		}
		forms.window(855,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_PO_HEADER_DETAIL}}")
				.clickToolBarButton("Save");
		forms.captureScreenshot(857);
		{
			think(4.151);
		}
		forms.choiceBox(858,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_choiceBox}}")
				.clickButton("OK");
		forms.captureScreenshot(860);
		{
			think(5.738);
		}
		forms.textField(
				861,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_DOC_TYPE_NAME_}}")
				.setFocus();
		{
			think(4.636);
		}
		forms.textField(
				862,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_DESC_FLEX_0}}")
				.setFocus();
		forms.captureScreenshot(864);
		{
			think(0.313);
		}
		forms.flexWindow(865,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_flexWindow}}")
				.setText("Discount Note", "", "{{db.PO_StandarePOCreationAndApproval_003.DiscountNote,Note}}");
		{
			think(0.705);
		}
		forms.flexWindow(866,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_flexWindow}}")
				.setText("Discount Amount", "", "{{db.PO_StandarePOCreationAndApproval_003.DiscountAmount,10}}");
		{
			think(5.155);
		}
		forms.flexWindow(867,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_flexWindow}}")
				.setTextAndClickOk("Currency", "", "{{db.PO_StandarePOCreationAndApproval_003.Currency,AED}}");
		forms.captureScreenshot(869);
		{
			think(8.939);
		}
		forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_LINES_LINE_NUM_0}}").setFocus();
		
		{
			think(0.018);
		}
		forms.window(871,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_PO_HEADERS}}")
				.clickToolBarButton("Save");
		{
			think(0.353);
		}
		forms.statusBar(872,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_statusBar}}")
				.assertText(
						"FormsFT AutoValidation: Verify StatusBar text value",
						"FRM-40400: Transaction complete: 1 records applied and saved.",
						MatchOption.Exact, 0);
		{
			think(2.976);
		}
		forms.button(
				873,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_PO_CONTROL_APPROVE_0}}")
				.click();
		forms.captureScreenshot(875);
		{
			think(7.457);
		}
		forms.button(
				876,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}")
				.click();
		forms.captureScreenshot(878);
		{
			think(13.329);
		}
		forms.textField(
				879,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_OPERATING_UNIT}}")
				.setFocus();
		{
			think(4.26);
		}
		forms.textField("{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_LINES_LINE_NUM_0}}").setFocus();
		
		forms.textField(
				881,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_OPERATING_UNIT}}").setFocus();
		
		forms.textField(
				882,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_PO_HEADERS_SEGMENT1_0}}").setFocus();
		
		forms.window(883,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_PO_HEADERS}}").close();
		
		forms.window(884,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_FIND_REQ_LINES}}")
				.activate(true);
		forms.captureScreenshot(886);
		
		forms.textField(
				887,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_REQ_LINES_OPERATING_}}")
				.setFocus();
		forms.captureScreenshot(889);
		{
			think(0.163);
		}
		forms.close(890);
		forms.captureScreenshot(892);
		{
			think(1.773);
		}
		forms.choiceBox(893,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_choiceBox}}")
				.clickButton("OK");
		{
			think(12.654);
		}
//		web.element(894,
//				"{{obj.PO_StandarePOCreationAndApproval_003.web_div_menuLayout_div}}")
//				.click();
		{
			think(1.803);
		}
		web.link(895,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_Purchase_Order}}")
				.click();
		web.window(896,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}")
				.waitForPage(180,true);
		{
			think(2.018);
		}
		web.link(900,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_Purchase_Order_Summary}}")
				.click();
		web.window(901,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_1}}")
				.waitForPage(180,true);
		forms.captureScreenshot(906);
		{
			think(21.559);
		}
		forms.textField(
				907,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_OPERATING_UNIT_0}}")
				.setFocus();
		{
			think(2.381);
		}
		forms.textField(908,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_PO_NUM_0}}")
				.setText(PO_Number);
		
		forms.button(909,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_FIND_FIND_0}}")
				.click();
		forms.captureScreenshot(911);
		
		forms.window(912,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_HEADERS_FOLDER}}")
				.selectMenu("Inquire|View Action History");
		forms.captureScreenshot(914);
		
		forms.window(915,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_window_PO_ACTION_HISTORY}}")
				.close();
		forms.captureScreenshot(917);
		{
			think(14.447);
		}
		forms.textField(
				918,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}")
				.setFocus();
		forms.captureScreenshot(920);
		{
			think(0.561);
		}
		forms.close(921);
		forms.captureScreenshot(923);
		{
			think(1.929);
		}
		forms.choiceBox(924,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_choiceBox}}")
				.clickButton("OK");
		{
			think(11.616);
		}
		web.window(925,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}")
				.close();
		{
			think(0.635);
		}
		web.window(926,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_1}}")
				.close();
		
		browser.launch();
		pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.run();
		browser.launch();
		web.window(1080,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_0}}")
				.navigate(
						"{{db.PO_StandarePOCreationAndApproval_003.URL,http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE}}");
		web.window(1081,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_0_1}}")
				.waitForPage(180,true);
		{
			think(0.687);
		}
		web.textBox(1084,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_text_unamebean_1}}")
				.click();
		{
			think(2.036);
		}
		web.textBox(1085,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_text_unamebean_1}}")
				.setText("{{db.PO_StandarePOCreationAndApproval_003.UID,PEETHAMBARANS}}");
		{
			think(0.702);
		}
		web.textBox(1086,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_text_unamebean_1}}")
				.pressTab();
		{
			think(0.044);
		}
		web.textBox(1087,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_password_pwdbean_1}}")
				.setPassword("{{db.PO_StandarePOCreationAndApproval_003.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		{
			think(0.053);
		}
		web.textBox(1088,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_input_password_pwdbean_1}}")
				.pressEnter();
		web.window(1089,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}")
				.waitForPage(180,true);
		{
			think(8.175);
		}
		web.link(
				1093,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_MWSPC_PURCHASING_SUPERUSE_1}}")
				.click();
		web.window(1094,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}")
				.waitForPage(180,true);
		{
			think(12.68);
		}
		web.element(1098,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_div_menuLayout_div}}")
				.click();
		{
			think(1.803);
		}
		web.link(1099,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_Purchase_Order}}")
				.click();
		web.window(1100,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}")
				.waitForPage(180,true);
		{
			think(3.453);
		}
		web.link(1104,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_a_Purchase_Order_Summary_3}}")
				.click();
		web.window(1105,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_1}}")
				.waitForPage(180,true);
		forms.captureScreenshot(1110);
		
		forms.textField(
				1111,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_OPERATING_UNIT_0}}")
				.setFocus();
		
		forms.textField(1112,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_textField_FIND_PO_NUM_0}}")
				.setText(PO_Number);
		
		forms.button(1113,
				"{{obj.PO_StandarePOCreationAndApproval_003.forms_button_FIND_FIND_0}}")
				.click();
		
		web.window(1114,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window}}")
				.close();
		{
			think(2.679);
		}
		web.window(1115,
				"{{obj.PO_StandarePOCreationAndApproval_003.web_window_0_2}}")
				.close();
		
		}

	public void finish() throws Exception {
	}
}
