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
	
	static int time=180;
	static String PONumber,releaseNumber;
	@FunctionLibrary("PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002") lib.maaden.orackeEBS.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002 pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002;
	public void initialize() throws Exception {
		browser.launch();
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		web.window("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window_0}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		
		web.window("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		
		web.window("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window}}").waitForPage(time, true);
		web.textBox("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_input_text_unamebean}}").click();
		web.textBox("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_input_text_unamebean}}").setText("PEETHAMBARANS");		
		web.textBox("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_input_password_pwdbean}}").setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.button("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_button_SubmitButton}}").click();
		web.window(	"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window}}").waitForPage(time, true);
		
		web.link("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_MWSPC_PURCHASING_SUPERUSE}}").click();
		web.window("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window}}").waitForPage(time, true);
		if(web.link("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_AutoCreate}}").exists(time, TimeUnit.SECONDS))
		{
			web.link("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_AutoCreate}}").click();
		}		
		if(web.alertDialog(26,	"/web:dialog_alert[@text='Syntax error' and @index='0']").exists(3, TimeUnit.SECONDS)){
			web.alertDialog(26,	"/web:dialog_alert[@text='Syntax error' and @index='0']").clickOk();
			info("Alert Occured and move ahead after clicking the OK button");
		}
		web.window("{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window_1}}").waitForPage(time, true);
		forms.captureScreenshot(26);		
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_REQ_LINES_OPERATING_}}").exists(time, TimeUnit.SECONDS);
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_REQ_LINES_OPERATING_}}").setFocus();
		forms.button("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_ClearBuyer}}").exists(time, TimeUnit.SECONDS);
		forms.button("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_ClearBuyer}}").click();		
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_REQ_LINES_OPERATING_}}").setFocus();
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_Requestion}}").exists(time, TimeUnit.SECONDS);
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_Requestion}}").setText("711802659");
		forms.button("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_Find}}").click();
		forms.captureScreenshot(33);		
		if(forms.checkBox("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_checkBox_REQ_LINES_SELECT_LINE_0}}").exists(time, TimeUnit.SECONDS)){
		forms.checkBox("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_checkBox_REQ_LINES_SELECT_LINE_0}}").check(true);
		}		
		forms.captureScreenshot(37);		
//		forms.textField(
//				39,
//				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_REQ_LINES_REQUISITION_NUM}}").setFocus();
//		{
//			think(2.379);
//		}
		forms.list(	"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_list_SelectBlanketRelease}}").selectItem("Blanket Release");
		forms.button("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_ACTION_PLACE_0}}").click();
		forms.captureScreenshot(43);		
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_DocumentNumber}}").setText("741700202");
		
		forms.button("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_PLACE_NEW_DOC_OK_0}}").click();
		{
			think(2.459);
		}
		forms.window(46,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_REQ_LINES}}").activate(true);
		forms.captureScreenshot(48);
		{
			think(5.974);
		}
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_REQ_LINES_REQUISITION_NUM}}").setFocus();
		{
			think(1.539);
		}
		forms.textField(
				50,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_CURRENT_STATE_PO_LINE_NUM}}").click();
		{
			think(1.735);
		}
		forms.button(51,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_ACTION_ADD_0}}").click();
		{
			think(16.508);
		}
		forms.button(
				52,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_ACTION_MANUAL_CREATE_BUTT}}").click();
		forms.captureScreenshot(54);
		{
			think(4.766);
		}
		forms.choiceBox(55,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_choiceBox}}").clickButton("OK");
		forms.captureScreenshot(57);
		{
			think(5.131);
		}
		forms.button(58,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_NEW_DOCUMENT_OK_0}}").click();
		{
			think(13.766);
		}
		forms.window(59,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_PO_RELEASES}}")
				.activate(true);
		forms.captureScreenshot(61);
		{
			think(6.842);
		}
		forms.textField(
				62,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_PO_RELEASES_OPERATING_UNI}}")
				.setFocus();
		{
			think(3.545);
		}
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_PO_Number}}").setFocus();
		PONumber= forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_PO_Number}}").getText();
		info("PONumber->"+PONumber);
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_ReleaseNumber}}").setFocus();
		releaseNumber= forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_ReleaseNumber}}").getText();
		info("releaseNumber->"+releaseNumber);
		forms.button("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_REL_CONTROL_APPROVAL_0}}").click();
		forms.captureScreenshot(67);
		forms.button("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_Approve}}").click();
		forms.captureScreenshot(70);
		//forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_PO_RELEASES_PO_NUM_0}}").setFocus();
		forms.window(72,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_PO_RELEASES}}").close();
		{
			think(0.378);			
		}
		forms.window("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_FIND_REQ_LINES}}").activate(true);
		forms.captureScreenshot(91);
		forms.window("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_FIND_REQ_LINES}}").close();
		{
			think(4.886);
		}
		forms.captureScreenshot(116);
		forms.treeList("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_treeList_NAVIGATOR_LIST_0}}").focusItem("Purchase Order");
		{
			think(0.891);			
		}
		forms.treeList("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_treeList_NAVIGATOR_LIST_0}}").selectItem("Purchase Order");
		{
			think(7.863);			
		}
		forms.treeList("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_treeList_NAVIGATOR_LIST_0}}").selectItem("Purchase Order|Purchase Order Summary");
		forms.captureScreenshot(165);
		if(forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_OPERATING_UNIT_0}}").exists(time, TimeUnit.SECONDS)){
			forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
			{
				think(2.837);
			}
		}
		
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_PO_NUM_0}}").setText(PONumber);
		
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_RELEASE_NUM_0}}").setText(releaseNumber);
		
		forms.button(169,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(171);
		{
			think(11.931);
		}
		forms.window(172,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_HEADERS_FOLDER}}").selectMenu("Inquire|View Action History");
		forms.captureScreenshot(174);
		{
			think(21.022);
		}
		forms.window(175,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_PO_ACTION_HISTORY}}")
				.close();
		forms.captureScreenshot(177);
		{
			think(5.572);
		}
		forms.window(178,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_HEADERS_FOLDER}}")
				.close();
		forms.captureScreenshot(180);
		{
			think(5.78);
		}
		forms.textField(
				181,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_OPERATING_UNIT_0}}")
				.setFocus();
		{
			think(0.01);
		}
		forms.window(182,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_FIND}}")
				.close();
		{
			think(0.102);
		}
		forms.window(183,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_NAVIGATOR}}")
				.activate(true);
		forms.captureScreenshot(185);
		{
			think(5.261);
		}
		forms.window(186,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_NAVIGATOR}}")
				.close();
		forms.captureScreenshot(188);
		{
			think(3.136);
		}
//		forms.choiceBox(189,
//				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_choiceBox}}")
//				.clickButton("OK");
//		{
//			think(24.82);
//		}
		web.link(190,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_Logout}}")
				.click();
//		web.window(191,
//				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window_0_1}}")
//				.waitForPage(null);
//		{
//			think(1.794);
//		}
		web.window(194,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window_1}}").close();
		
		/*
		 * 
		 * Call the approver user script 
		 * 
		 * 
		 */
		browser.launch();
		pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.run();
		//***********************************************************************************************
		
		browser.launch();
		
		{
			think(0.18);
		}
		web.window(841,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window_0_3}}")
				.navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(842,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window_0_1}}")
				.waitForPage(null);
		{
			think(8.66);
		}
		web.textBox(845,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_input_text_unamebean_1}}")
				.click();
		{
			think(0.748);
		}
		web.textBox(846,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_input_text_unamebean_1}}")
				.setText("PEETHAMBARANS");
		{
			think(0.969);
		}
		web.textBox(847,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_input_password_pwdbean_1}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		{
			think(0.064);
		}
		web.textBox(848,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_input_password_pwdbean_1}}")
				.click();
		{
			think(1.038);
		}
		web.textBox(849,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_input_password_pwdbean_1}}")
				.dblClick();
		{
			think(0.648);
		}
		web.textBox(850,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_input_password_pwdbean_1}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		{
			think(1.172);
		}
		web.button(851,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_button_SubmitButton_1}}")
				.click();
		web.window(852,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window}}")
				.waitForPage(null);
		{
			think(4.249);
		}
		web.link(855,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_MWSPC_PURCHASING_SUPERUSE}}")
				.click();
		web.window(856,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window}}")
				.waitForPage(null);
		{
			think(5.598);
		}
		web.element(859,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_div_menuLayout_div}}")
				.click();
		{
			think(2.004);
		}
		web.link(860,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_a_Purchase_Order}}")
				.click();
		web.window(861,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window}}")
				.waitForPage(null);
		{
			think(2.253);
		}
		web.link(864,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_a_Purchase_Order_Summary_1}}")
				.click();
		web.window(865,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window_1}}")
				.waitForPage(null);
		forms.captureScreenshot(869);
		{
			think(41.581);
		}
		forms.textField(
				870,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_OPERATING_UNIT_0}}")
				.setFocus();
		{
			think(3.115);
		}
		forms.textField(871,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_PO_NUM_0}}")
				.setText(PONumber);
		{
			think(4.426);
		}
		forms.textField(
				872,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_RELEASE_NUM_0}}").setText(releaseNumber);
		{
			think(0.0);
		}
		forms.button(873,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(875);
		{
			think(17.003);
		}
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").setFocus();
		String status = forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").getText();
		info("Status of the PO is - "+status);
		if(status.equalsIgnoreCase("Approved")){
			info("Now Status is "+status+". Hence the procedure is completed.");			
		}else{
			info("Now Status is "+status+". Hence the procedure is not completed.");	
		}
		{
			think(0.0);
		}
		forms.window(877,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_HEADERS_FOLDER}}").selectMenu("Inquire|View Action History");
		forms.captureScreenshot(879);
		{
			think(7.843);
		}
		//Reserve in status
		forms.textField("{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_PO_ACTION_HISTORY_ACTION__1}}").setFocus();
		{
			think(0.007);
		}
		forms.window(881,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_PO_ACTION_HISTORY}}").close();
		forms.captureScreenshot(883);
		{
			think(3.341);
		}
		forms.window(884,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_HEADERS_FOLDER}}").close();
		forms.captureScreenshot(886);
		{
			think(4.108);
		}
		
		
		forms.textField(
				887,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
		{
			think(0.016);
		}
		forms.window(888,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_window_FIND}}").close();
		forms.captureScreenshot(890);
		{
			think(2.489);
		}
		forms.close(891);
		forms.captureScreenshot(893);
		{
			think(2.373);
		}
		forms.choiceBox(894,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.forms_choiceBox}}").clickButton("OK");
		{
			think(11.239);
		}
		web.window(895,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window}}").close();
		{
			think(0.069);
		}
		web.window(896,
				"{{obj.PO_CreateBlanketReleaseAndApproval_002.web_window_1}}").close();
		
		
	}

	public void finish() throws Exception {
	}
}
