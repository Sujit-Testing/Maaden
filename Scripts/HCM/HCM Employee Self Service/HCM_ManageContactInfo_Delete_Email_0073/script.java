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
	String url,uid,pwd,email_Address,email_Comments = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ManageContactInfo_Delete_Email_0073.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		email_Address=(String) datatable.getValue("DataSheet", 0, "Email_Address");
		email_Comments = (String) datatable.getValue("DataSheet", 0, "Email_Comments");
				
		
		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").maximize();
		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManageContactInfo_Delete_Email_0073.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageContactInfo_Delete_Email_0073.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Delete_Email_0073.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageContactInfo_Delete_Email_0073.Sign_In}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		
		if(web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.Me}}").click();
		{
			think(3.147);
		}
		
		}
		if(web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.PersonalInformation}}").exists(150, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.PersonalInformation}}").focus();
			{
			think(0.3);
		}
		
		web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.PersonalInformation}}").click();
		}
		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").waitForPage(150, true);
		{
			think(60.147);
		}
		//Click on Family and Emergency 
		
		if(web.element("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_span_Add_family_and_friends_to}}").exists(200, TimeUnit.SECONDS)){
			web.element("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_span_Add_family_and_friends_to}}").focus();
			{
				think(4.147);
			}
		web.element("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_span_Add_family_and_friends_to}}").dblClick();		
		}
		{
			think(8.147);
		}
		if(web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.MyContact}}").exists(100, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.MyContact}}").focus();
			{
				think(1.946);
			}
		web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.MyContact}}").click();
		}
		{
			think(1.946);
		}
		web.element("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_html_1}}").click();
		{
			think(2.446);
		}
		web.element("{{obj.HCM_ManageContactInfo_Delete_Email_0073.Communication}}").focus();
		{
			think(0.175);
		}
		web.image("{{obj.HCM_ManageContactInfo_Delete_Email_0073.Communication_Dropdown}}").click();
		{
			think(3.411);
		}
		
		web.image("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_img_Edit_1}}").click();
		
		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").capturePage();
		
		{
			think(1.717);
		}
		//Click on Delete
		web.element("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_span_Delete}}").click();
		
		{
			think(8.633);
		}
		web.element("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_span_We_are_submitting_your_ch_1}}").focus();
		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").capturePage();
		
	}
	public void finish() throws Exception {
		//SignOut
		web.element("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_svg_true}}").click();
		{
			think(3.667);
		}
		web.link("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_a__FOpt1__UISlg1}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").waitForPage(150, true);
		{
			think(5.679);
		}
		web.button("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_button_Confirm}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").waitForPage(150, true);
		{
			think(0.247);
		}

		web.window("{{obj.HCM_ManageContactInfo_Delete_Email_0073.web_window}}").close();
	
	}
}









