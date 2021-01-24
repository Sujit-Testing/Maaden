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
	
	String divisionName = null;
	final String error = "No results found.";
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM_Manage_InvaldDivisions_0018.xlsx", true);
		
		//Get the Employee Designation from the excel data
		divisionName=(String) datatable.getValue("DataSheet", 0, "Division_Name");
		info("Division Name is  --> "+divisionName);
	
		// After adding the resusable script, call the run() method inside the script
		hCM_LogIn_LogOut.run();
		
		//Click on My_Client_Groups
		web.link("{{obj.HCM_ManageDivisions_0017.My_Client_Groups}}").click();
		{
			think(0.2);
		}
		//Click on Workforce_Structures
		web.link("{{obj.HCM_ManageDivisions_0017.Workforce_Structures}}").click();
		web.window("{{obj.HCM_ManageDivisions_0017.web_window}}").waitForPage(180,true);
		
		//Focus on logOut icon 
		web.element("{{obj.HCM_ManageDivisions_0017.LogOutIcon}}").focus();
		
		web.element(69, "{{obj.HCM_ManageDivisions_0017.Organizations_Heading}}").focus();
		
		//web.element(72, "{{obj.HCM_ManageDivisions_0017.OrganizationImage}}").focus();
		{
			think(5.0);
		}
		web.link("{{obj.HCM_ManageDivisions_0017.Manage Division Link}}").focus();
		web.link("{{obj.HCM_ManageDivisions_0017.Manage Division Link}}").dblClick();
		{
			think(2.641);
		}
		
		web.textBox(91,
				"{{obj.HCM_ManageDivisions_0017.ManageDivisionName}}").setText(divisionName);
		//Clck Search Button
		web.button("{{obj.HCM_ManageDivisions_0017.Click_Search_Button}}").click();
		{
			think(1.674);
		}
		//Clik Search Results
		web.element("{{obj.HCM_ManageDivisions_0017.ClickOnResults}}").focus();
		String errorResults = web.element("{{obj.HCM_ManageDivisions_0017.ClickOnResults}}").getDisplayText();
		info(errorResults);
		if(error.equalsIgnoreCase(errorResults)){
			info("Test Cases pass as it is negative scenario");
		}else {
			fail("Test Case fail as it is not matching with expected and actual results.");
		}
	
		
	}
	
	public void finish() throws Exception {
		
		//LogOut and close the application		
		hCM_LogIn_LogOut.finish();

	}
}
