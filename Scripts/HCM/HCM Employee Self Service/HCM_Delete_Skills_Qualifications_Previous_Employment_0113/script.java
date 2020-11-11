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
	String url,uid,pwd,employerName,jobTitle,startDate,endDate= null;
	
	public void initialize() throws Exception {
		browser.launch();
	}		
	
	public void run() throws Exception {
	
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Delete_Skills_Qualifications_Previous_Employment_0113.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		employerName=(String) datatable.getValue("DataSheet", 0, "EmployerName");	
		jobTitle=(String) datatable.getValue("DataSheet", 0, "JobTitle");	
		startDate=(String) datatable.getValue("DataSheet", 0, "StartDate");
		endDate=(String) datatable.getValue("DataSheet", 0, "EndDate");
	
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").maximize();
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").navigate(url);
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.UID}}").pressTab();
		web.textBox("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.Sign_In}}").click();
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.You have a new home page!}}").focus();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").capturePage();
		//Clik on Me
		web.link("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.Me}}").click();
		{
			think(0.868);
		}
		//Clik on More
		web.link("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.Show More}}").click();
		{
			think(1.785);
		}
//		web.element("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_html_1}}").click();
//		{
//			think(0.576);
//		}
		//Clik on Skill and Qualification
		web.link("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.Skills_and_Qualifications}}").click();
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").waitForPage(null);
		//web.element("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_html_1_1}}").click();
		{
			think(1.594);
		}
		info("Before delete the employment");
		web.image("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_img_Edit}}").focus();
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").capturePage();
		//Clik on Edit
		web.image("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_img_Edit}}").dblClick();
		{
			think(1.841);
		}
		info("After delete the employment");
		//Clik on Delete 
		web.link("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.Delete}}").dblClick();
		{
			think(1.537);
		}
		//web.element("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.NewlyAddedPreviousEmployment}}").focus();	
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").capturePage();
		//web.image("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_img_Edit}}").click();
		
	}
	public void finish() throws Exception {
		//SignOut
		web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").waitForPage(null);
//		//Close both wndows
		//web.window("{{obj.HCM_Delete_Skills_Qualifications_Previous_Employment_0113.web_window}}").close();

	}
}