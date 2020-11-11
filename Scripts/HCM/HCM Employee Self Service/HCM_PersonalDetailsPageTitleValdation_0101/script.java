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
	String title =  "Personal Details";
	
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
		
		String pageTitle =  web.window("{{obj.HCM_ChangePersonalDetails_Name_0100.web_window}}").getTitle();
		info("Page title is -> "+pageTitle);
		String splitTitle[] = pageTitle.split(" ");
		String title =  splitTitle[0]+" "+splitTitle[1];
		info("Here we are landing "+title+" page");
				
		if(title.equalsIgnoreCase(title)){
			info("Test Case pass, as page title is return correctly.");
		}else fail("Test Case fail, as page title is return inCorrectly.");
		{
			think(2.166);
		}
	
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