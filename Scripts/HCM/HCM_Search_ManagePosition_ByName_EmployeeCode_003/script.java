import java.util.concurrent.TimeUnit;

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
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	//Adding re-usable "script HCM_LogIn_LogOut" using Assets tab.
	@FunctionLibrary("HCM_LogIn_LogOut") lib.maaden.orackeEBS.HCM_LogIn_LogOut hCM_LogIn_LogOut;
	String employee_Code = null;
	String employee_Designation = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM_Search_ManagePosition_ByName_EmployeeCode_003.xlsx", true);
		//Get the Employee Designation from the excel data
		employee_Designation=(String) datatable.getValue("DataSheet", 0, "Employee_Designation");
		info("employee_Designation --> "+employee_Designation);
		//Get the Employee Code from the excel data
		employee_Code=(String) datatable.getValue("DataSheet", 0, "Employee_Code");
		info("Employee_Code--> "+employee_Code);
		// After adding the resusable script, call the run() method inside the script
		hCM_LogIn_LogOut.run();
		
		//Click on My_Client_Groups
		web.link("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.My_Client_Groups}}").click();
		{
			think(3.2);
		}
		//Click on Workforce_Structures
		web.link("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Workforce_Structures}}").click();
		web.window("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_window}}").waitForPage(180,true);
		
		//Focus on logOut icon 
		web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.LogOutIcon}}").focus();
		{
			think(6.00);	
		}
		web.link("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Manage Positions}}").focus();
		{
			think(.10);	
		}
		web.link("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Manage Positions}}").dblClick();
		{
			think(6.00);	
		}
		// Provide the Position Name
		web.textBox("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Position_Name}}").click();
		//web.textBox("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Position_Name}}").setText("Vice President(A), Human Capital");
		web.textBox("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Position_Name}}").setText(employee_Designation);
		
		//Provide the Employee Code
		if(web.textBox("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Code}}").exists(20, TimeUnit.SECONDS)){
			web.textBox("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Code}}").setText(employee_Code);			

		}else{
			web.link("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_a_Manage_Positions}}").click();
			
			{
				think(6.00);	
			}
			web.textBox("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Code}}").setText(employee_Code);
		}
		
		
		web.button("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.SearchButton}}").click();
		{
		think(3.00);	
		}
		//No results found
//		web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_div__FOpt1__FOr1_0__FOSritemN}}").focus();
//		info(web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_div__FOpt1__FOr1_0__FOSritemN}}").getDisplayText());
//		{
//			think(0.118);
//		}
		
		web.link("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.SelectRecordByName}}").click();
		//Fetch the employee id and print
		web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Empployee_Id}}").focus();
		String code= web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Empployee_Id}}").getDisplayText();
		
		info("Employee code  : "+code);
		if(employee_Code.equals(code)){
			info("TC Pass as both code matched ");
		}else{
			info("TC Fail, as both code doesn't matched");
		}
		
		//Fetch the Employee Hirings Status and print
		web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Hiring Status}}").focus();
		info("Employee Hirings Status : "+web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Hiring Status}}").getDisplayText());
		//Fetch the Employee Position and print
		web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Position Name}}").focus();
		info("Position : "+web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Position Name}}").getDisplayText());	
		//Fetch the Dept and print
		web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Dept}}").focus();		
		info("Dept : "+web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Dept}}").getDisplayText());
		//Fetch the Job and print
		web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Job}}").focus();
		info("Job: " + web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Job}}").getDisplayText());
		web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_span_o}}").click();		
		{
			think(1.451);	
			
		}
		
	}
	
	public void finish() throws Exception {
		
		//LogOut and close the application		
		hCM_LogIn_LogOut.finish();

	}
}
