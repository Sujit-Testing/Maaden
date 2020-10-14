import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	String url,uid,pwd,name,personal_Number,start_Date = null;
	String title =  "Contact Info - - Oracle Applications";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_ModifyExistingEmergencyContact_StartDateChange_0088.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		name=(String) datatable.getValue("DataSheet", 0, "Name");	
		personal_Number=(String) datatable.getValue("DataSheet", 0, "Personal_Number");
		start_Date=(String) datatable.getValue("DataSheet", 0, "Start_Date");
		
		
		web.window("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_window}}").maximize();
		web.window("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_window}}").navigate(url);
		web.window("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.UID}}").pressTab();
		web.textBox("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.Sign_In}}").click();
		web.window("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}

		//Clik on My Client Group
		if(web.link("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.My_Client_Groups}}").exists(120, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.My_Client_Groups}}").click();
		}
		//Click on Person Managment
		if(web.link("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.Person_Management}}").exists(120, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.Person_Management}}").click();
		}
		web.window("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_window}}").waitForPage(100,true);
		
		String pageTitle = web.window("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_window}}").getTitle();
		info("Page title is -> "+pageTitle);
//				
//		if(pageTitle.equalsIgnoreCase(title)){
//			info("Test Case pass, as page title is return correctly.");
//		}else fail("Test Case fail, as page title is return inCorrectly.");
//		{
//			think(1.166);
//		}

		//Provide Name and Personal Number
		web.textBox("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_input_text__FOpt1__FOr1_0__FONSr2_0_}}").click();
		web.textBox("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_input_text__FOpt1__FOr1_0__FONSr2_0_}}").setText(name);
		web.textBox("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_input_text__FOpt1__FOr1_0__FONSr2_0_}}").pressTab();
		web.textBox("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").setText(personal_Number);
		web.textBox("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").pressTab();
		{
			think(6.171);
		}
		//Click on Search Button
		web.button("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_button__FOpt1__FOr1_0__FONSr2_0__6}}").click();
		web.button("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_button__FOpt1__FOr1_0__FONSr2_0__6}}").dblClick();
		{
			think(3.818);
		}
		web.link("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_a__FOpt1__FOr1_0__FONSr2_0_}}").click();		

		{
			think(5.171);
		}
		//Clik on Search Results

		web.window("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_window}}").waitForPage(100,true);
		
		//Click on task icon
		web.image("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_img_Tasks}}").click();
		{
			think(1.171);
		}
		//Clik on "Person" from Personal and Managment 
		web.link("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_a__FOpt1__FOr1_0__FONSr2_0__1}}").click();
		{
			think(5.782);
		}
		//Clik on Contact link

		web.link("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_a__FOpt1__FOr1_0__FONSr2_0__2}}").click();
		{
			think(1.161);
		}
		//Provide the Change Start Date
		web.element("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_span_Change_Start_Date}}").click();
		{
			think(1.161);
		}
		web.textBox("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_input_text__FOpt1__FOr1_0__FONSr2_0__2}}").setText(start_Date);
		{
			think(3.395);
		}
		//Click OK
		web.button("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_button__FOpt1__FOr1_0__FONSr2_0__1}}").click();
		{
			think(5.945);
		}
		
		web.element("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_div__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(5.23);
		}
		//Click Yes
		web.button("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_button__FOpt1__FOr1_0__FONSr2_0__2}}").click();
		{
			think(7.47);
		}
		//Click OK
		web.button("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_button__FOpt1__FOr1_0__FONSr2_0__3}}").click();
		{
			think(5.031);
		}
		
		//Click on task icon
		web.image("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_img_Tasks}}").click();
		
		{
			think(3.171);
		}
		//Clik on "Person" from Personal and Managment 
		web.link("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_a__FOpt1__FOr1_0__FONSr2_0__1}}").click();
		{
			think(5.782);
		}
		//Clik on Contact link

		web.link("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_a__FOpt1__FOr1_0__FONSr2_0__2}}").click();
		{
			think(3.161);
		}
		//web.element("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_span_Edit}}").click();
		web.element("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.Edit}}").click();
		{
			think(5.254);
		}
		web.element("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_span_5_5_20}}").focus();
		web.window("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_window}}").capturePage();
		{
			think(1.017);
		}
		//Click OK
		web.element("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_span_K}}").click();
		//web.button("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.OK}}").click();
		
		
		
	}
	public void finish() throws Exception {
		//SignOut

		web.window("{{obj.HCM_ModifyExistingEmergencyContact_StartDateChange_0088.web_window}}").close();
		
		

	}
}