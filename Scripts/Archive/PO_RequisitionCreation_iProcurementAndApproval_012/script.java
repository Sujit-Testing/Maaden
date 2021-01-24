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
	@FunctionLibrary("PO_CreateRequisitionAndApproval_User_LAOE_001") lib.maaden.orackeEBS.PO_CreateRequisitionAndApproval_User_LAOE_001 pO_CreateRequisitionAndApproval_User_LAOE_001;
	@FunctionLibrary("PO_Approver_User_ANAZIDH") lib.maaden.orackeEBS.PO_Approver_User_ANAZIDH pO_Approver_User_ANAZIDH;
	@FunctionLibrary("PO_Approver_User_JONESM") lib.maaden.orackeEBS.PO_Approver_User_JONESM pO_Approver_User_JONESM;
	@FunctionLibrary("PO_Approver_User_ABUHETLAHD") lib.maaden.orackeEBS.PO_Approver_User_ABUHETLAHD pO_Approver_User_ABUHETLAHD;
	public void initialize() throws Exception {
		browser.launch();
			
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	
	public void run() throws Exception {
		getDatabank("PO_RequisitionCreation_iProcurementAndApproval_012").getNextDatabankRecord();
		web.window(230,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").navigate("{{db.PO_RequisitionCreation_iProcurementAndApproval_012.URL,http://riyoramgbm02.maaden.com:8050/}}");
		{
			think(0.336);
		}
		web.window(231,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
				.navigate("{{db.PO_RequisitionCreation_iProcurementAndApproval_012.URL,http://riyoramgbm02.maaden.com:8050/}}");
		web.window(232,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
				.waitForPage(null);
		{
			think(14.657);
		}
		web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserName}}").click();
		
		web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserName}}").setText("{{db.PO_RequisitionCreation_iProcurementAndApproval_012.UID,PEETHAMBARANS}}");
	
		web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserName}}").pressTab();
		
		web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserPassword}}").setPassword("{{db.PO_RequisitionCreation_iProcurementAndApproval_012.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		
		web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserPassword}}").pressEnter();
		web.window("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").waitForPage(null);
		{
			think(4.601);
		}
		web.link(
				243,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_a_MWSPC_IPROCUREMENT}}").click();
		web.window(244,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").waitForPage(null);
		{
			think(1.519);
		}
		web.link(
				247,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_a_iProcurement_Home_Page}}").click();
		web.window(248,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
				.waitForPage(null);
		{
			think(9.477);
		}
		//Click the Checkout Button if it present otherwise it will click copy button
		if(web.button("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_button_Checkout}}").exists(5, TimeUnit.SECONDS)){
			
			web.button("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_button_Checkout}}").click();
		}else{
			web.image(
				251,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_img_Copy_Requisitions}}").click();
			
		}
		
	
		//Click on copy Button
		
		web.window(252,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
				.waitForPage(null);
		{
			think(4.372);
		}
		//Click on CheckOut Button
		web.button(
				255,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_CheckoutButton}}")
				.click();
		web.window(256,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
				.waitForPage(null);
		{
			think(6.247);
		}
		//Need By Date
		web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_input_text_NeedByDate}}").click();
	
		//web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_input_text_NeedByDate}}").clearText();
			
		//web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_input_text_NeedByDate}}").setText("16-Aug-2022 00:00:00");
		{
			think(2.154);
		}
	
		//Click on DeliverToLocation option
		web.textBox(
				259,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_DeliverToLocation}}")
				.click();
		{
			think(2.154);
		}
		//Click on clocse option to add the DeliverToLocation text
		web.textBox(
				260,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_DeliverToLocation}}")
				.click();
		{
			think(0.023);
		}
		
		web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_DeliverToLocation}}")	.setText("{{db.PO_RequisitionCreation_iProcurementAndApproval_012.Deliver_To_Location,Al-Jubail}}");
		{
			think(1.92);
		}
		//Click on search button
//		web.image(
//				262,
//				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_img_Search_for_Deliver_To_Loc}}").click();
//		web.window(263,
//				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window_1}}")
//				.waitForPage(null);
//		{
//			think(10.386);
//		}
//		web.radioButton(
//				269,
//				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_input_radio_N1_N8_0}}")
//				.select();
//		{
//			think(1.933);
//		}
//		web.button(270,
//				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_button_Select}}")
//				.click();
		web.window(271,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").waitForPage(null);
		{
			think(0.025);
		}
		web.button(
				274,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_NextButton}}").click();
		web.window(275,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").waitForPage(null);
		{
			think(7.832);
		}
		web.button(
				278,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_NextButton}}")
				.click();
		web.window(279,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
				.waitForPage(null);
		{
			think(6.199);
		}
		web.button(
				282,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_SubmitButton}}")
				.click();
		web.window(283,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
				.waitForPage(null);
		{
			think(6.623);
		}
		web.button(
				286,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_button_Continue_Shopping}}").click();
		web.window(287,"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").waitForPage(null);
		{
			think(5.41);
		}
		web.element("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_td_In_Process}}").click();
		{
			think(5.011);
		}
		
		
		String status = web.element("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_td_In_Process}}").getDisplayText();
		System.out.println("status: "+ status);
		if(status.equalsIgnoreCase("In Process")){
			info("The status of the requestion is : "+status);
			
		}
		web.link(291,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_a_In_Process}}")
				.click();
		web.window(292,
				"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
				.waitForPage(null);
		web.window(287,"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").close();
		browser.launch();
		pO_CreateRequisitionAndApproval_User_LAOE_001.run();
		browser.launch();
		pO_Approver_User_ANAZIDH.run();
		browser.launch();
		pO_Approver_User_JONESM.run();
		browser.launch();
		pO_Approver_User_ABUHETLAHD.run();
		browser.launch();
		verifyStatus();
		
	}
	public  void verifyStatus() throws Exception{
		web.window(230,
	"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").navigate("{{db.PO_RequisitionCreation_iProcurementAndApproval_012.URL,http://riyoramgbm02.maaden.com:8050/}}");
	{
		think(0.336);
	}
	web.window(231,
			"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
			.navigate("{{db.PO_RequisitionCreation_iProcurementAndApproval_012.URL,http://riyoramgbm02.maaden.com:8050/}}");
	web.window(232,
			"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
			.waitForPage(null);
	{
		think(14.657);
	}
	web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserName}}").click();
	
	web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserName}}").setText("{{db.PO_RequisitionCreation_iProcurementAndApproval_012.UID,PEETHAMBARANS}}");

	web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserName}}").pressTab();
	
	web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserPassword}}").setPassword("{{db.PO_RequisitionCreation_iProcurementAndApproval_012.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
	
	web.textBox("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_UserPassword}}").pressEnter();
	web.window("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").waitForPage(null);
	{
		think(4.601);
	}
	web.link(
			243,
			"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_a_MWSPC_IPROCUREMENT}}").click();
	web.window(244,
			"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").waitForPage(null);
	{
		think(1.519);
	}
	web.link(
			247,
			"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_a_iProcurement_Home_Page}}").click();
	web.window(248,
			"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}")
			.waitForPage(null);
	{
		think(9.477);
	}

	web.element("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_td_In_Process}}").click();
	{
		think(5.011);
	}
	
	String status = web.element("{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_td_In_Process}}").getDisplayText();
	System.out.println("status: "+ status);
	if(status.equalsIgnoreCase("Approved")){
		info("The status of the requestion is : "+status);
		
	}

	web.window(287,"{{obj.PO_RequisitionCreation_iProcurementAndApproval_012.web_window}}").close();

	}

	public void finish() throws Exception {
	}
}
