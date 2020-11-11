import java.text.SimpleDateFormat;
import java.util.Date;
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
	String url,uid,pwd,date,firstName,familyName,fatherName,grandFatherName,comments = null;
	String title =  "Contact Info - - Oracle Applications";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
	
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy"); 
//		Date date = new Date();
//		System.out.println(formatter.format(date));
		
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ChangePersonalDetails_Name_0100.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");	
		date=(String) datatable.getValue("DataSheet", 0, "Date");
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		fatherName=(String) datatable.getValue("DataSheet", 0, "FatherName");
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		
		
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").maximize();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").navigate(url);
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.UID}}").pressTab();
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ChangePersonalDetails_Name_0100.Sign_In}}").click();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Me Tab
		if(web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.Me}}").click();
		{
			think(0.147);
		}
		}
		
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").capturePage();
		//Click on Personal_Details link
		web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.web_a_Personal_Details}}").click();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").waitForPage(null);
		//Click on Edit Button
		web.image("{{obj.HCM_ChangePersonalDetails_Name_0100.web_img_Edit}}").click();
		{
			think(5.389);
		}
		//Provide change start date
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.ChangeStartDate}}").click();
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.ChangeStartDate}}").setText(date);
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.ChangeStartDate}}").pressTab();
		{
			think(1.438);
		}
		//Click on Title
		web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.web_a__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(0.367);
		}
		web.element("{{obj.HCM_ChangePersonalDetails_Name_0100.web_li_Miss}}").click();
		{
			think(2.533);
		}
		//Provide First Name
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.FirstName}}").click();
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.FirstName}}").setText(firstName);
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.FirstName}}").pressTab();
		{
			think(0.055);
		}
		//Provide father's Name
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.FatherName}}").setText(fatherName);
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.FatherName}}").pressTab();
		{
			think(0.055);
		}
		//Provide Grandfather's Name
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.GrandFatherName}}").setText(grandFatherName);
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.GrandFatherName}}").pressTab();
		{
			think(0.088);
		}
		//Provide Family Name
		web.textBox("{{obj.HCM_ChangePersonalDetails_Name_0100.FamilyName}}").setText(familyName);
		{
			think(0.091);
		}
		//Comments
		web.textArea("{{obj.HCM_ChangePersonalDetails_Name_0100.Comments}}").setText(comments);
		{
			think(3.522);
		}
		//Click on Submit
		web.element("{{obj.HCM_ChangePersonalDetails_Name_0100.Submit}}").click();
		{
			think(7.218);
		}
		//Capture the confirmation MSG(We are submitting your changes for approval.)
		web.element("{{obj.HCM_ChangePersonalDetails_Name_0100.Submission_Confirmation_MSG}}").focus();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").capturePage();
		{
			think(0.034);
		}
		//Click Back Button
		web.element("{{obj.HCM_ChangePersonalDetails_Name_0100.BackButton}}").click();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").waitForPage(null);
		{
			think(6.424);
		}
		//Click on personal button again
		web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.web_a_Personal_Details_1}}").click();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").waitForPage(null);
		{
			think(3.201);
		}
		//Capture the confirmation MSG
		web.element("{{obj.HCM_ChangePersonalDetails_Name_0100.web_span_Approval_in_progress_}}").focus();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").capturePage();
		{
			think(0.042);
		}
		//Click on Link(See how it's going.)
		web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.SeeHowItGoing}}").click();
		{
			think(5.878);
		}
		//Capture the change personal informaton page
		web.element("{{obj.HCM_ChangePersonalDetails_Name_0100.web_span_Change_Personal_Informati}}").focus();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").capturePage();
		{
			think(0.026);
		}
		
		web.element("{{obj.HCM_ChangePersonalDetails_Name_0100.web_html_1}}").click();
		{
			think(4.62);
		}
		//Click on Show Details link
		web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.ShowDetails}}").click();
		{
			think(12.54);
		}
		//Capture the approver list
		web.element("{{obj.HCM_ChangePersonalDetails_Name_0100.web_strong__1}}").focus();
		web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").capturePage();

		
		
	}
	public void finish() throws Exception {
		//SignOut

//		web.element(637, "{{obj.HCM_ChangePersonalDetails_Name_0100.web_html_1}}").click();
//	{
//		think(1.917);
//	}
//	web.element(638, "{{obj.HCM_ChangePersonalDetails_Name_0100.web_svg_true}}").click();
//	{
//		think(4.936);
//	}
//	web.link("{{obj.HCM_ChangePersonalDetails_Name_0100.web_a__FOpt1__UISlg1}}").click();
//	web.window(640, "{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").waitForPage(50, true);
	web.window(640, "{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").close();

		

	}
}