import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import lib.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@FunctionLibrary("HCM_LogIn_LogOut") lib.maaden.orackeEBS.HCM_LogIn_LogOut hCM_LogIn_LogOut;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	String employee_Code = null;
	String employee_Jobs_Name = null;
	final String result = "No results found." ;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.i
	 */
	public void run() throws Exception {
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.xlsx", true);
		//Get the Employee Designation from the excel data
		employee_Jobs_Name=(String) datatable.getValue("DataSheet", 0, "Employee_Jobs_Name");
		info("Employee_Jobs_Name --> "+employee_Jobs_Name);
		//Get the Employee Code from the excel data
		employee_Code=(String) datatable.getValue("DataSheet", 0, "Employee_Code");
		info("Employee_Code--> "+employee_Code);
		
		//Login in the application
		hCM_LogIn_LogOut.run();
		
		//Click on My Client Groups
		web.link("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.My Client Groups}}").click();
		//Click on Workforce Structures
		web.link("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.web_window}}").waitForPage(180,true);
		info(web.window("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.web_window}}").getTitle());
		web.element(28,"{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Log Out con}}").focus();
		{
			think(1.1);
		}
		web.link("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Manage Jobs}}").focus();
		web.link("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Manage Jobs}}").dblClick();
		//web.link(31,"{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.web_a__FOpt1__FOr1_0__FOSritemN}}").click();
		{
			think(1.1);
		}
		info("Title of the page: "+web.window("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.web_window}}").getTitle());
		//Provide Manage Jobs Name and Code
		web.textBox("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Manage Jobs Name}}").setText(employee_Jobs_Name);		
		web.textBox("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Manage Jobs Code}}").setText(employee_Code);
		//Click Search Button
		web.button("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Search}}").click();
		{
			think(2.4);
		}
		//Select Search Result
		web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.SearchResults}}").dblClick();
		
		if(result.equalsIgnoreCase(web.link("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.SearchResults}}").getDisplayText())){
			info("The Test case pass, as it is one negative scenario. It returns No results found...");
			web.window("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.web_window}}").capturePage();
		}	else{	
			web.link("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.SearchResults}}").click();
			{
				think(2.4);
			}
		//display the manager name, code,status etc..
		web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Manager_Name}}").dblClick();
		info("Job Descrpton Manager_Name: "+web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Manager_Name}}").getDisplayText());
		web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Code}}").dblClick();
		info("Job Descrpton Code: "+web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Code}}").getDisplayText());
		web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Status}}").dblClick();
		info("Job Descrpton Status: "+web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Status}}").getDisplayText());
		web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Full_Part_Time}}").dblClick();
		info("Descrpton Full_Part_Time: "+web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Full_Part_Time}}").getDisplayText());
		web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Regular or Temporary}}").dblClick();
		info("Job Descrpton Regular or Temporary: "+web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Regular or Temporary}}").getDisplayText());
		web.window("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.web_window}}").capturePage();
		
		if(employee_Code.equalsIgnoreCase(web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Job Descrpton Code}}").getDisplayText())){
			info("Search code and reterive code are same, Hence Test Case Pass ");
			
		}else{
			fail("Test Case Pass as. Search code and reterive code are same");
		}
		web.element("{{obj.HCM_ManageJobs_Invalid_JobName_Invalid_JobCode_007.Done Button}}").click();
		}		
	}
	
	public void finish() throws Exception {
		//LogOut the applcation
		hCM_LogIn_LogOut.finish();
	}
}
