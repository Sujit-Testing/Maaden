import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;
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
	@FunctionLibrary("PO_CreateRequisitionAndApproval_User_LAOE_001") lib.maaden.orackeEBS.PO_CreateRequisitionAndApproval_User_LAOE_001 pO_CreateRequisitionAndApproval_User_LAOE_001;

	
	String uidName;
	String requestion_Number;
	static int time = 180;
	@FunctionLibrary("PO_CreateRequisitionAndApproval_User_MECEVICM_001") lib.maaden.orackeEBS.PO_CreateRequisitionAndApproval_User_MECEVICM_001 pO_CreateRequisitionAndApproval_User_MECEVICM_001;
	@FunctionLibrary("PO_CreateRequisitionAndApproval_User_ENAZIFH_001") lib.maaden.orackeEBS.PO_CreateRequisitionAndApproval_User_ENAZIFH_001 pO_CreateRequisitionAndApproval_User_ENAZIFH_001;
	@FunctionLibrary("PO_RejectRequisition_User_LAOE_013") lib.maaden.orackeEBS.PO_RejectRequisition_User_LAOE_013 pO_RejectRequisition_User_LAOE_013;
	public void initialize() throws Exception {
		browser.launch();
				
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 * @throws Exception 
	 */
	
	public void run() throws Exception {
	

		getDatabank("PO_CreateRequisitionAndApproval_001").getNextDatabankRecord();
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").navigate("{{db.PO_CreateRequisitionAndApproval_001.URL,http://riyoramgbm02.maaden.com:8050/}}");
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time, true);
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").maximize();
		
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").click();
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").clearText();
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").setText("{{db.PO_CreateRequisitionAndApproval_001.UID,BRAHMEG}}");		
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").getAttribute("value");		
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_password}}").click();
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_password}}").setPassword("{{db.PO_CreateRequisitionAndApproval_001.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		web.button("{{obj.PO_CreateRequisitionAndApproval_001.web_button_LoginButton}}").click();
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time,true);
		web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_MWSPC_PURCHASING_PREPARER}}").click();
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time,true);
		
		web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisition}}").click();
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time,true);
		
		web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisitions_2}}").click();
		if(web.alertDialog(26,	"/web:dialog_alert[@text='Syntax error' and @index='0']").exists(5, TimeUnit.SECONDS)){
			web.alertDialog(26,	"/web:dialog_alert[@text='Syntax error' and @index='0']").clickOk();
			info("Alert Occured and move ahead after clicking the OK button");
		}
		
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window_1}}").waitForPage(360,true);
		forms.captureScreenshot(634);		
		if(forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_ServiceType}}").exists(360, TimeUnit.SECONDS))
			{
			info("forms_textField_ServiceType1");
			forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_ServiceType}}").click();
			info("forms_textField_ServiceType2");
			forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_ServiceType}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Type,Service}}");			
			//forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_ServiceType}}").wait(2);
			info("forms_textField_ServiceType3");
			}
		forms.captureScreenshot();
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Catagory}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Category,MISC.MISC}}");
		if(forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Description}}").exists())
			{
			info("Desc1");
			forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Description}}").setText("Application Engineer's Service Charge");
			}
		
		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_UOM}}").setText("{{db.PO_CreateRequisitionAndApproval_001.UOM,Daily}}");
		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Quantity}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Quantity,1}}");
		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Quantity}}").invokeSoftKey("NEXT_FIELD");
		
		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Price}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Price,660}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Price}}").invokeSoftKey("NEXT_FIELD");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_NeedByDate}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Need by Date,30-JUL-2021 00:00:00}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Organization}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Organization,PAW:MWSPC Phosphoric Acid Plant Warehouse}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Location}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Location,Turaif PAP}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Supplier}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Supplier,Nalco Saudi Company Limited}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Site}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Site,DAMMAM_SAR}}");
		//Click Source Tab to enter the required value- Optional Field
		/*
		forms.tab("{{obj.PO_CreateRequisitionAndApproval_001.forms_tab_SourceTab}}").select("Source Details");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_DocumentType}}").setText("{{db.PO_CreateRequisitionAndApproval_001.DocumentType,Blanket Purchase Agreement}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_DocumentType}}").invokeSoftKey("NEXT_FIELD");		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_DocumentNumber}}").setText("{{db.PO_CreateRequisitionAndApproval_001.DocumentNumber,741700202}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_LineNumber}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Line,13}}");		
		
		*/
		
		forms.window("{{obj.PO_CreateRequisitionAndApproval_001.forms_window_SaveButton}}").clickToolBarButton("Save");
		
		// save it from save button
		forms.statusBar("{{obj.PO_CreateRequisitionAndApproval_001.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value","FRM-40400: Transaction complete: 2 records applied and saved.",MatchOption.Exact, 0);
		{
			think(8.678);
		}
		
		// capture the requsition number here
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_RequisitionNumber}}").setFocus();
		
		requestion_Number = forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_RequisitionNumber}}").getText();		
		
		info("requestion_Number--------------->"+requestion_Number);

		forms.button("{{obj.PO_CreateRequisitionAndApproval_001.forms_button_DistrbutionButton}}").click();
		forms.captureScreenshot();
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_ChargeAccount}}").setText("{{db.PO_CreateRequisitionAndApproval_001.ChargeAccount ,01.05.530.17.5285.3100.00000}}");
		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_ChargeAccount}}").invokeSoftKey("NEXT_FIELD");
		forms.window("{{obj.PO_CreateRequisitionAndApproval_001.forms_window_DistrbutionSaveButton}}").clickToolBarButton("Save");
		{
			think(1.067);
		}
		forms.statusBar("{{obj.PO_CreateRequisitionAndApproval_001.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value",
						"FRM-40400: Transaction complete: 1 records applied and saved.",MatchOption.Exact, 0);
		{
			think(11.503);
		}
		forms.window(665,
				"{{obj.PO_CreateRequisitionAndApproval_001.forms_window_SaveButton}}").activate(true);
		forms.captureScreenshot();
		{
			think(1.337);
		}
		forms.button(668,
				"{{obj.PO_CreateRequisitionAndApproval_001.forms_button_CONTROL_APPROVAL_0}}").click();
		forms.captureScreenshot(670);
	
		forms.button("{{obj.PO_CreateRequisitionAndApproval_001.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}")
				.click();
		forms.captureScreenshot(673);
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_PO_REQ_HDR_OPERATING_UNIT}}").setFocus();
		forms.captureScreenshot(676);
		{
			think(0.138);
		}
		forms.close(677);
		forms.captureScreenshot(679);
		{
			think(2.789);
		}
		forms.choiceBox(680,
				"{{obj.PO_CreateRequisitionAndApproval_001.forms_choiceBox}}").clickButton("OK");
		
		//Click on Requisition_Summary to check the newly created Requestion Number
		if(	web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisition_Summary}}").exists(time, TimeUnit.SECONDS)){
			web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisition_Summary}}").click();
		}
	
		web.window(682,
				"{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time,true);
		forms.captureScreenshot(686);
		forms.textField(
				687,
				"{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_FIND_REQ_OPERATING_UNIT_0}}")
				.setFocus();
		{
			think(3.269);
		}
		//Set the Newly created Requestion number which needs to replace with variable
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_FIND_REQ_REQ_NUM_0}}").setText(requestion_Number);
		{
			think(0.012);
		}
		forms.button(689,
				"{{obj.PO_CreateRequisitionAndApproval_001.forms_button_FIND_REQ_FIND_0}}")
				.click();
		forms.captureScreenshot(691);
		forms.textField(
				692,
				"{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_REQ_HEADERS_FOLDER_AUTHOR}}")
				.setFocus();
		{
			think(0.022);
		}
		forms.window("{{obj.PO_CreateRequisitionAndApproval_001.forms_window_REQ_HEADERS_FOLDER}}").selectMenu("Tools|View Action History");
		forms.window(81, "//forms:window[(@name='PO_ACTION_HISTORY')]").close();
		forms.captureScreenshot(83);
		{
			think(5.161);
		}
		forms.window(84, "//forms:window[(@name='REQ_HEADERS_FOLDER')]").close();
		forms.captureScreenshot(86);
		{
			think(5.684);
		}
		forms.textField(87,
				"//forms:textField[(@name='FIND_REQ_OPERATING_UNIT_0')]").setFocus();
		
		forms.window(88, "//forms:window[(@name='FIND_REQ')]").close();
		forms.captureScreenshot(90);
		{
			think(3.623);
		}
		forms.close(91);
		forms.captureScreenshot(93);
		{
			think(2.526);
		}
		forms.choiceBox(94, "//forms:choiceBox").clickButton("OK");
		{
			think(21.526);
		}
		web.link(
				95,
				"/web:window[@index='0' or @title='Oracle Applications Home Page']/web:document[@index='0']/web:a[@text='Logout' or @href='http://riyoramgbm02.maaden.com:8050/OA_HTML/OALogout.jsp?menu=Y' or @index='2']")
				.click();
		web.window(96, "/web:window[@index='0' or @title='Login']")
				.waitForPage(null);
		{
			think(1.46);
		}
		web.window(99,
				"/web:window[@index='1' or @title='Oracle Applications R12']")
				.close();
		/*
		 * Calling the function for approve the requisition number
		 * 
		 * 
		 */
	
		//Call the function for Reject the requisition request from user LAOE
		browser.launch();
		pO_RejectRequisition_User_LAOE_013.run();
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		browser.launch();
		web.window(696,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_window_0}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(698,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(null);
{
	think(1.562);
}
	web.textBox(701,"{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").click();
{
	think(1.218);
}
web.textBox(702,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}")
		.setText("FAREEDM");
{
	think(2.334);
}
web.textBox(703,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}")
		.pressTab();
{
	think(0.031);
}
web.textBox(704,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_input_password}}")
		.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
{
	think(0.576);
}
web.button(705,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_button_LoginButton}}")
		.click();
web.window(706,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_window_0_1}}")
		.waitForPage(null);
{
	think(2.103);
}
web.link(709,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_a_MWSPC_PURCHASING_PREPARER_1}}")
		.click();
web.window(710,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_window_0_1}}")
		.waitForPage(null);
{
	think(1.064);
}
web.link(713,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisition_1}}")
		.click();
web.window(714,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_window_0_1}}")
		.waitForPage(null);
{
	think(1.196);
}
web.element(717,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_div_menuLayout_div}}")
		.click();
{
	think(1.315);
}
web.link(718,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisition_Summary_1}}")
		.click();
web.window(719,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_window_1}}")
		.waitForPage(null);
forms.captureScreenshot(723);
{
	think(36.997);
}
forms.textField(
		724,
		"{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_FIND_REQ_OPERATING_UNIT_0}}")
		.setFocus();
{
	think(2.742);
}
forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_FIND_REQ_REQ_NUM_0}}").setText(requestion_Number);
{
	think(0.015);
}
forms.button(726,
		"{{obj.PO_CreateRequisitionAndApproval_001.forms_button_FIND_REQ_FIND_0}}")
		.click();
forms.captureScreenshot(728);
{
	think(6.402);
}
forms.button(
		729,
		"{{obj.PO_CreateRequisitionAndApproval_001.forms_button_REQ_HEADERS_FOLDER_CONTRO}}")
		.click();
forms.captureScreenshot(731);
{
	think(8.403);
}
forms.textField(
		732,
		"{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_PO_REQ_HDR_OPERATING_UNIT}}")
		.setFocus();
{
	think(0.322);
}
forms.button(733,
		"{{obj.PO_CreateRequisitionAndApproval_001.forms_button_CONTROL_APPROVAL_0}}")
		.click();
forms.captureScreenshot(735);
{
	think(16.177);
}
forms.textField(736,
		"{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_PO_APPROVE_NOTE_0}}")
		.setText("Please Approve it.");
{
	think(0.316);
}
forms.button(
		737,
		"{{obj.PO_CreateRequisitionAndApproval_001.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}")
		.click();
forms.captureScreenshot(739);
{
	think(13.685);
}
forms.textField(
		740,
		"{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_PO_REQ_HDR_OPERATING_UNIT}}")
		.setFocus();
forms.captureScreenshot(742);
{
	think(0.224);
}
forms.close(743);
forms.captureScreenshot(745);
{
	think(2.02);
}
forms.choiceBox(746,
		"{{obj.PO_CreateRequisitionAndApproval_001.forms_choiceBox}}")
		.clickButton("OK");
{
	think(6.416);
}
web.window(747,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_window_0_1}}")
		.close();
{
	think(0.041);
}
web.window(748,
		"{{obj.PO_CreateRequisitionAndApproval_001.web_window_1}}")
		.close();

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Call the function for Approver user LAOE
		browser.launch();	
		pO_CreateRequisitionAndApproval_User_LAOE_001.run();
		//Call the function for Approver user ENAZIFH
		browser.launch();
		pO_CreateRequisitionAndApproval_User_ENAZIFH_001.run();
		//Call the function for Approver user ENAZIFH
		browser.launch();
		pO_CreateRequisitionAndApproval_User_MECEVICM_001.run();
		
		
		//forms.window("{{obj.PO_CreateRequisitionAndApproval_001.forms_window_REQ_HEADERS_FOLDER}}").selectMenu("Tools|View Action History");
		
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").click();
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").clearText();
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").setText("BRAHMEG");
		uidName= web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").getAttribute("value");
		info(uidName);
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_password}}").click();
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_password}}").setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		web.button("{{obj.PO_CreateRequisitionAndApproval_001.web_button_LoginButton}}").click();
		web.window(618,
				"{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(null);
		{
			think(5.195);
		}
		web.link(621,
				"{{obj.PO_CreateRequisitionAndApproval_001.web_a_MWSPC_PURCHASING_PREPARER}}").click();
		web.window(622,
				"{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time,true);
		
//		if(web.alertDialog(98,"{{obj.PO_CreateRequisitionAndApproval_001.web_dialog_alert_Syntax_error}}").exists(10, TimeUnit.SECONDS)){
//			web.alertDialog(98,"{{obj.PO_CreateRequisitionAndApproval_001.web_dialog_alert_Syntax_error}}").clickOk();
//		}
//		
		
		if(	web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisition_Summary}}").exists(time, TimeUnit.SECONDS)){
			web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisition_Summary}}").click();
		}
	
		web.window(682,
				"{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time,true);
//		if(web.alertDialog(98,"{{obj.PO_CreateRequisitionAndApproval_001.web_dialog_alert_Syntax_error}}").exists(10, TimeUnit.SECONDS)){
//			web.alertDialog(98,"{{obj.PO_CreateRequisitionAndApproval_001.web_dialog_alert_Syntax_error}}").clickOk();
		forms.captureScreenshot(686);
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_FIND_REQ_OPERATING_UNIT_0}}").setFocus();
		{
			think(3.269);
		}
		//Set the Newly created Requestion number which needs to replace with variable
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_FIND_REQ_REQ_NUM_0}}").setText(requestion_Number);
		{
			think(0.012);
		}
		forms.button(689,"{{obj.PO_CreateRequisitionAndApproval_001.forms_button_FIND_REQ_FIND_0}}").click();
		
		forms.captureScreenshot(691);
//		forms.textField(
//				692,
//				"{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_REQ_HEADERS_FOLDER_AUTHOR}}")
//				.setFocus();
//		{
//			think(0.022);
//		}
		
		forms.textField("//forms:textField[(@name='REQ_HEADERS_FOLDER_AUTHORIZATION_STATUS_DSP_0')]").exists(time, TimeUnit.SECONDS);
		forms.textField("//forms:textField[(@name='REQ_HEADERS_FOLDER_AUTHORIZATION_STATUS_DSP_0')]").setFocus();
		String status=forms.textField("//forms:textField[(@name='REQ_HEADERS_FOLDER_AUTHORIZATION_STATUS_DSP_0')]").getText();

		if(status.equalsIgnoreCase("Approved")){
	    info("Approved");
	
		
		forms.window("{{obj.PO_CreateRequisitionAndApproval_001.forms_window_REQ_HEADERS_FOLDER}}").selectMenu("Tools|View Action History");		
		
		
		forms.captureScreenshot(140);
		{
			think(13.887);
		}
		forms.textField("//forms:textField[(@name='PO_ACTION_HISTORY_ACTION_CODE_DSP_1')]").setFocus();		
		forms.textField("//forms:textField[(@name='PO_ACTION_HISTORY_ACTION_CODE_DSP_0')]").setFocus();		
		forms.window(143, "//forms:window[(@name='PO_ACTION_HISTORY')]").close();
		forms.captureScreenshot(145);
		{
			think(1.842);
		}
		forms.window(146, "//forms:window[(@name='REQ_HEADERS_FOLDER')]").close();
		forms.captureScreenshot(148);
		{
			think(3.993);
		}
		forms.textField(149,
				"//forms:textField[(@name='FIND_REQ_OPERATING_UNIT_0')]").setFocus();
		{
			think(0.0);
		}
		forms.window(150, "//forms:window[(@name='FIND_REQ')]").close();
		forms.captureScreenshot(152);
		{
			think(2.875);
		}
		forms.close(153);
		forms.captureScreenshot(155);
		{
			think(2.607);
		}
		forms.choiceBox(156, "//forms:choiceBox").clickButton("OK");
		
		
		web.window(694,
				"{{obj.PO_CreateRequisitionAndApproval_001.web_window_0}}").close();

		}
		
		}

		
	public void finish() throws Exception {
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window_0_1}}").close();
	}
}
