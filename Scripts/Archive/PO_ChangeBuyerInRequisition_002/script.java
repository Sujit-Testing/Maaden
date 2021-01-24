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
	static int time = 180;

	public void initialize() throws Exception {
		browser.launch();
	}

	/**
	 * Changing the Buyer Name from the approved Requestion Number
	 */
	
	public void run() throws Exception {
		getDatabank("PO_ChangeBuyerInRequisition_002").getNextDatabankRecord();
		web.window(53, "{{obj.PO_ChangeBuyerInRequisition_002.web_window}}").navigate("{{db.PO_ChangeBuyerInRequisition_002.URL,http://riyoramgbm02.maaden.com:8050/}}");
		{
			think(0.259);
		}
		web.window(55, "{{obj.PO_ChangeBuyerInRequisition_002.web_window}}").navigate("{{db.PO_ChangeBuyerInRequisition_002.URL,http://riyoramgbm02.maaden.com:8050/}}");
		web.window(56, "{{obj.PO_ChangeBuyerInRequisition_002.web_window}}").waitForPage(time, true);
		
		web.textBox(59,
				"{{obj.PO_ChangeBuyerInRequisition_002.web_UID}}").click();
		
		web.textBox("{{obj.PO_ChangeBuyerInRequisition_002.web_UID}}").setText("{{db.PO_ChangeBuyerInRequisition_002.UID,PEETHAMBARANS}}");
		
		web.textBox("{{obj.PO_ChangeBuyerInRequisition_002.web_UID}}").pressTab();
		
		web.textBox(170,
		"{{obj.PO_ChangeBuyerInRequisition_002.web_input_password_pwdbean}}")
		.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.button(918, "{{obj.PO_ChangeBuyerInRequisition_002.web_button_SubmitButton}}").click();
		web.window(64, "{{obj.PO_ChangeBuyerInRequisition_002.web_window}}").waitForPage(time, true);
		{
			think(8.379);
		}
		
		
		web.link("{{obj.PO_ChangeBuyerInRequisition_002.web_a_CORP_PURCHASING_SUPERUSER}}").click();
		web.window(68, "{{obj.PO_ChangeBuyerInRequisition_002.web_window}}").waitForPage(time, true);
		{
			think(8.379);
		}
		web.element("{{obj.PO_ChangeBuyerInRequisition_002.web_div_menuLayout_div}}").click();
		{
			think(4.379);
		}
		
		/*
		 * Now it will go and change the new Buyer details from Management option
		 * 
		 * 
		 * 
		 * 
		 */
		web.link("{{obj.PO_ChangeBuyerInRequisition_002.web_a_Management}}").click();
		web.window("{{obj.PO_ChangeBuyerInRequisition_002.web_window}}").waitForPage(time, true);
		
		web.link("{{obj.PO_ChangeBuyerInRequisition_002.web_a_Manage_Buyer_Workload}}").click();
		
		if(web.alertDialog("{{obj.PO_ChangeBuyerInRequisition_002.web_dialog_alert_Syntax_error}}").exists(5, TimeUnit.SECONDS)){
			web.alertDialog("{{obj.PO_ChangeBuyerInRequisition_002.web_dialog_alert_Syntax_error}}").clickOk();
			}
		web.window("{{obj.PO_ChangeBuyerInRequisition_002.web_window_1}}").waitForPage(time, true);
		forms.captureScreenshot(113);
		
		forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_textField_FIND_REQ_LINES_OPERATING_}}").setFocus();
		{
			think(4.847);
		}
		forms.textField(
				115,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_RequistionNumber}}").setText("{{db.PO_ChangeBuyerInRequisition_002.RequisitionNumber,11801840}}");
		{
			think(1.134);
		}
		forms.list(116,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_Assign}}").selectItem("Yes");
		{
			think(4.328);
		}
		forms.list(117,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_Approval}}").selectItem("Approved");
		{
			think(3.43);
		}
		forms.button(
				118,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_button_FIND_REQ_LINES_FIND_BUTTO}}").click();
		forms.captureScreenshot(120);
		{
			think(29.767);
		}
		forms.checkBox(
				121,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_checkBox_REQ_LINES_FOLDER_RECORD_S}}").check(true);
		{
			think(17.84);
		}
		forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_BuyerName}}").setFocus();
		String buyerName = forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_BuyerName}}").getText();
		info("BuyerName is : "+buyerName);
		/*
		if(buyerName.equalsIgnoreCase("Corp Automated Buyer")){
			forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_NewBuyerName}}").setText("Hamad Rashid Al Hino");
		}else if((buyerName.equalsIgnoreCase("Hamad Rashid Al Hino"))){
			forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_NewBuyerName}}").setText("Corp Automated Buyer");			
		}else if((buyerName.equalsIgnoreCase("Mohammed Abdulrahman Abdulkareem"))){
			forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_NewBuyerName}}").setText("Corp Automated Buyer");			
		}*/
		forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_NewBuyerName}}").setText("{{db.PO_ChangeBuyerInRequisition_002.NewBuyerName,Hamad Rashid Al Hino}}");
				
	/*	
		if(buyerName.equalsIgnoreCase("{{db.PO_ChangeBuyerInRequisition_002.Buyer1,Corp Automated Buyer}}")){
			forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_NewBuyerName}}").setText("{{db.PO_ChangeBuyerInRequisition_002.Buyer2,Hamad Rashid Al Hino}}");
		}else if((buyerName.equalsIgnoreCase("{{db.PO_ChangeBuyerInRequisition_002.Buyer2,Hamad Rashid Al Hino}}"))){
			forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_NewBuyerName}}").setText("{{db.PO_ChangeBuyerInRequisition_002.Buyer1,Corp Automated Buyer}}");			
		}
		*/
		
		{
			think(0.018);
		}
		forms.window(124,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_window_ASSIGN}}").clickToolBarButton("Save");
		{
			think(0.274);
		}
//		forms.statusBar(125,
//				"{{obj.PO_ChangeBuyerInRequisition_002.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value",
//						"FRM-40400: Transaction complete: 1 records applied and saved.",MatchOption.Exact, 0);
//		{
//			think(4.329);
//		}
		
		forms.checkBox("{{obj.PO_ChangeBuyerInRequisition_002.forms_checkBox_REQ_LINES_FOLDER_RECORD_S}}").setFocus();
		{
			think(5.595);
		}
				
		forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_BuyerName}}").setFocus();
		//info(forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_BuyerName}}").getText());
		forms.captureScreenshot(129);
		{
			think(0.132);
		}
		forms.close(130);
		forms.captureScreenshot(132);
		{
			think(0.108);
		}
		forms.choiceBox(133,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_choiceBox}}").clickButton("OK");
		{
			think(1.591);
		}
		web.link(134,
				"{{obj.PO_ChangeBuyerInRequisition_002.web_a_Requisition_Summary}}").click();
		if(web.alertDialog("{{obj.PO_ChangeBuyerInRequisition_002.web_dialog_alert_Syntax_error}}").exists(5, TimeUnit.SECONDS)){
			web.alertDialog("{{obj.PO_ChangeBuyerInRequisition_002.web_dialog_alert_Syntax_error}}").clickOk();
			}
		web.window(135,
				"{{obj.PO_ChangeBuyerInRequisition_002.web_window_1}}").waitForPage(time, true);
		forms.captureScreenshot(139);
		
		forms.textField(
				140,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_textField_FIND_REQ_OPERATING_UNIT_0}}").setFocus();
		
		forms.textField(141,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_textField_FIND_REQ_REQ_NUM_0}}").setText("{{db.PO_ChangeBuyerInRequisition_002.RequisitionNumber,11801840}}");
	
		forms.button(142,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_FindButton}}").click();
		forms.captureScreenshot(144);
		{
			think(9.628);
		}
		forms.button(
				145,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_button_REQ_HEADERS_FOLDER_CONTRO}}").click();
		forms.captureScreenshot(147);
		{
			think(11.981);
		}
		forms.window(148,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_window_REQ_LINES_FOLDER}}").selectMenu("Folder|Show Field...");
		forms.captureScreenshot();
		{
			think(3.732);
		}
		forms.window(149,
				"{{obj.PO_ChangeBuyerInRequisition_002.forms_window_REQ_LINES_FOLDER}}").activate(true);
		{
			think(0.254);
		}
		forms.listOfValues(92,
		"{{obj.PO_ChangeBuyerInRequisition_002.forms_listOfValues}}").select("Buyer                                                                                                                                                                                                                      *SUGGESTED_BUYER");
		forms.captureScreenshot(152);
		{
			think(15.07);
		}
		forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_textField_REQ_LINES_FOLDER_SUGGESTE}}").setFocus();	
		info(forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_textField_REQ_LINES_FOLDER_SUGGESTE}}").getText());
//		if((forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_BuyerName}}").getText()).equalsIgnoreCase(forms.textField("{{obj.PO_ChangeBuyerInRequisition_002.forms_textField_REQ_LINES_FOLDER_SUGGESTE}}").getText())){
//			info("Sucessfully changed the Buyer Name");
//		}else
//		{
//			info("UnSucessfully.. BuyerName not changed");
//		}
//		
//		forms.close(153);
		forms.captureScreenshot(155);
		{
			think(4.489);
		}
		//forms.choiceBox(156,"{{obj.PO_ChangeBuyerInRequisition_002.forms_choiceBox}}").clickButton("OK");
		{
			think(8.665);
		}
		web.window(157,
				"{{obj.PO_ChangeBuyerInRequisition_002.web_window}}").close();
		{
			think(0.063);
		}
		web.window(158, "{{obj.PO_ChangeBuyerInRequisition_002.web_window_1}}").close();


		

	}

	public void finish() throws Exception {
	}
}
