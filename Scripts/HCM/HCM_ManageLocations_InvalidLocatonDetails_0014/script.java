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
	String legislativeDataGroup = null;
	String rateType = null;
	String locationCode = null;
	String locationName = null;
	final String result = "No results found." ;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.i
	 */
	public void run() throws Exception {
		
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM_ManageLocations_InvalidLocatonDetails_0014.xlsx", true);
		//Get the Name from the excel data
		locationName=(String) datatable.getValue("DataSheet", 0, "Location_Name");
		info("Name from data sheet is : --> "+locationName);
		
		//Get the Grade Code from the excel data
		locationCode=(String) datatable.getValue("DataSheet", 0, "Location_Code");
		info("locationCode from data sheet is : "+locationCode);
		
		
		//Login in the application
		hCM_LogIn_LogOut.run();
		
		//Click on My Client Groups
		web.link("{{obj.HCM_ManageLocations_0013.My Client Groups}}").click();
		//Click on Workforce Structures
		web.link("{{obj.HCM_ManageLocations_0013.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageLocations_0013.web_window}}").waitForPage(180,true);
		info("Title of the page is : "+web.window("{{obj.HCM_ManageLocations_0013.web_window}}").getTitle());
		web.element(28,"{{obj.HCM_ManageLocations_0013.Log Out con}}").focus();
		{
			think(1.1);
		}
		web.element(99, "{{obj.HCM_ManageLocations_0013.ManageLocatonsIcon}}").focus();		
		//Click on Manage Locatons Link
		web.link(101,"{{obj.HCM_ManageLocations_0013.ManageLocatonsLink}}").dblClick();
		{
			think(1.145);
		}
		//Provide the Manage Locations Name
		web.textBox("{{obj.HCM_ManageLocations_0013.ManageLocatonName}}").setText(locationName);
		//Provide the Manage Locations Code
		web.textBox("{{obj.HCM_ManageLocations_0013.ManageLocatons_Code}}").setText(locationCode);
		//Capture the acreen shot of the page
		web.window("{{obj.HCM_ManageLocations_0013.web_window}}").capturePage();
		
		//Click on the search button
		web.button("{{obj.HCM_ManageLocations_0013.Locaton_Search}}").click();
		{
			think(2.599);
		}
		//Capture the acreen shot of the page
		web.window("{{obj.HCM_ManageLocations_0013.web_window}}").capturePage();
		//Click the Search Results
		web.element("{{obj.HCM_ManageLocations_0013.ErrorResults}}").focus();
		
		info("Error Results displayed if search string not matched:" +
				web.element("{{obj.HCM_ManageLocations_0013.ErrorResults}}").getDisplayText());
		
		if(result.equalsIgnoreCase(web.element("{{obj.HCM_ManageLocations_0013.ErrorResults}}").getDisplayText())){
			info("Test Case pass as search string is displayed No results found. due to mismatched of search string");
		}else{
			fail("Test Case pass as search string is not displayed No results found.");
		}
		//Capture the acreen shot of the page
		web.window("{{obj.HCM_ManageLocations_0013.web_window}}").capturePage();				
	}
	
	public void finish() throws Exception {
		//LogOut the applcation
		hCM_LogIn_LogOut.finish();
	}
}
