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
	String url,uid,pwd,email,comments = null;
	String title =  "Contact Info - - Oracle Applications";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ContactInfo_Add_Email_0085.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		email=(String) datatable.getValue("DataSheet", 0, "Email");	
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		
		
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").maximize();
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").navigate(url);
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ContactInfo_Add_Email_0085.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ContactInfo_Add_Email_0085.UID}}").pressTab();
		web.textBox("{{obj.HCM_ContactInfo_Add_Email_0085.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ContactInfo_Add_Email_0085.Sign_In}}").click();
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_ContactInfo_Add_Email_0085.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_ContactInfo_Add_Email_0085.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Me Tab
		if(web.link("{{obj.HCM_ContactInfo_Add_Email_0085.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ContactInfo_Add_Email_0085.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ContactInfo_Add_Email_0085.Me}}").click();
		{
			think(0.147);
		}
		}
		//Click on Contact_Info		
		web.link("{{obj.HCM_ContactInfo_Add_Email_0085.web_a_Contact_Info_1}}").click();
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").waitForPage(50, true);
		
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").capturePage();
		//Verify Page Title
		String pageTitle = web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").getTitle();
		info("Page title is -> "+pageTitle);
				
		if(pageTitle.equalsIgnoreCase(title)){
			info("Test Case pass, as page title is return correctly.");
		}else fail("Test Case fail, as page title is return inCorrectly.");
		{
			think(2.166);
		}
		//Click on Add button
		web.element("{{obj.HCM_ContactInfo_Add_Email_0085.web_span_Add}}").click();
		{
			think(0.803);
		}
		//Choose type details
		web.element("{{obj.HCM_ContactInfo_Add_Email_0085.Email Details}}").click();
		{
			think(0.524);
		}
		//Email Type
		web.textBox("{{obj.HCM_ContactInfo_Add_Email_0085.web_input_text__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(0.269);
		}
		//Choose Personal Email
		web.element("{{obj.HCM_ContactInfo_Add_Email_0085.Personal Email}}").click();
		{
			think(1.75);
		}
		
		//Set email details
		web.textBox("{{obj.HCM_ContactInfo_Add_Email_0085.Emial_Id}}").setText(email);
		//Set comments
		web.textArea("{{obj.HCM_ContactInfo_Add_Email_0085.Comment}}").setText(comments);
		{
			think(0.02);
		}
		//Click Submit
		web.element("{{obj.HCM_ContactInfo_Add_Email_0085.web_span_Submit}}").click();
		{
			think(6.349);
		}
		web.element("{{obj.HCM_ContactInfo_Add_Email_0085.ApprovalNotification}}").focus();
		web.window(671, "{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").capturePage();
		{
			think(7.928);
		}
		//Press BackButton
		web.element(670, "{{obj.HCM_ContactInfo_Add_Email_0085.BackButton}}").click();
		web.window(671, "{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").waitForPage(null);
		{
			think(6.578);
		}
		//Again Contact Info
		web.link("{{obj.HCM_ContactInfo_Add_Email_0085.web_a_Contact_Info}}").click();
		web.window(674, "{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").waitForPage(null);
		//focus on approval notification
//		web.element("{{obj.HCM_ContactInfo_Add_Email_0085.web_span_Approval_in_progress_}}").click();
//		{
//			think(1.398);
//		}
		web.element("{{obj.HCM_ContactInfo_Add_Email_0085.web_span_Approval_in_progress_}}").focus();
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").capturePage();
		{
			think(0.051);
		}
		web.link("{{obj.HCM_ContactInfo_Add_Email_0085.See how it Progess}}").click();
		{
			think(4.462);
		}
		web.element("{{obj.HCM_ContactInfo_Add_Email_0085.web_span_Mohammad_Mahtab_Khan}}").focus();
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").capturePage();
		{
			think(0.865);
		}
		web.link("{{obj.HCM_ContactInfo_Add_Email_0085.Show Detail}}").click();
		{
			think(4.642);
		}
//		web.element(681, "{{obj.HCM_ContactInfo_Add_Email_0085.web_html_1_1}}").click();
//		{
//			think(2.831);
//		}
		//Pendng with user 
		web.element("{{obj.HCM_ContactInfo_Add_Email_0085.web_strong__1}}").focus();
		web.window("{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").capturePage();

		
		
	}
	public void finish() throws Exception {
		//SignOut

//		web.element(637, "{{obj.HCM_ContactInfo_Add_Email_0085.web_html_1}}").click();
//	{
//		think(1.917);
//	}
//	web.element(638, "{{obj.HCM_ContactInfo_Add_Email_0085.web_svg_true}}").click();
//	{
//		think(4.936);
//	}
//	web.link("{{obj.HCM_ContactInfo_Add_Email_0085.web_a__FOpt1__UISlg1}}").click();
//	web.window(640, "{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").waitForPage(50, true);
	web.window(640, "{{obj.HCM_ContactInfo_Add_Email_0085.web_window}}").close();

		

	}
}