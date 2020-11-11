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
	
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_AddSkills_Qualifications_Previous_Employment_0111.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		employerName=(String) datatable.getValue("DataSheet", 0, "EmployerName");	
		jobTitle=(String) datatable.getValue("DataSheet", 0, "JobTitle");	
		startDate=(String) datatable.getValue("DataSheet", 0, "StartDate");
		endDate=(String) datatable.getValue("DataSheet", 0, "EndDate");
	
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").maximize();
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").navigate(url);
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.UID}}").setText(uid);
		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.UID}}").pressTab();
		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Sign_In}}").click();
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.You have a new home page!}}").focus();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").capturePage();
		web.link("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Me}}").click();
		{
			think(0.868);
		}
		web.link("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Show More}}").click();
		{
			think(0.785);
		}
		web.element("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_html_1}}").click();
		{
			think(0.576);
		}
		web.link("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Skills_and_Qualifications}}").click();
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").waitForPage(null);
		web.element("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_html_1_1}}").click();
		{
			think(1.594);
		}
		web.element("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Add}}").click();
		{
			think(1.914);
		}
		//Provide Previous Employment Details and Save it

		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Employer Name}}").click();
		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Employer Name}}").setText(employerName);
		{
			think(0.249);
		}
		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Job Title}}").click();
		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Job Title}}").setText(jobTitle);		
		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Start Date}}").setText(startDate);
		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Start Date}}").pressTab();
		web.textBox("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.End Date}}").setText(endDate);
		{
			think(1.841);
		}
		web.link("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.Save}}").click();
		{
			think(3.537);
		}
		//web.element("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.NewlyAddedPreviousEmployment}}").focus();	
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").capturePage();
		
	}
	public void finish() throws Exception {
		//SignOut
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").waitForPage(null);
//		//Close both wndows
		web.window("{{obj.HCM_AddSkills_Qualifications_Previous_Employment_0111.web_window}}").close();

	}
}