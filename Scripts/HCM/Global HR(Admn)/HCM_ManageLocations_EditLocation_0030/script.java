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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageLocations_EditLocation_0030.xlsx", true);
		//Get the Name from the excel data
		locationName=(String) datatable.getValue("DataSheet", 0, "Location_Name");
		info("Name from data sheet is : --> "+locationName);
		
		//Get the Grade Code from the excel data
		locationCode=(String) datatable.getValue("DataSheet", 0, "Location_Code");
		info("locationCode from data sheet is : "+locationCode);
		//Get the Grade Code from the excel data
		String Update_Location = null;
		Update_Location=(String) datatable.getValue("DataSheet", 0, "Update_Location");
		info("locationCode from data sheet is : "+locationCode);
		//Get the Grade Code from the excel data
		String Correction_Location =  null;
		Correction_Location=(String) datatable.getValue("DataSheet", 0, "Correction_Location");
		info("locationCode from data sheet is : "+Correction_Location);
		
		
		//Login in the application
		hCM_LogIn_LogOut.run();
		
		//Click on My Client Groups
		web.link("{{obj.HCM_ManageLocations_EditLocation_0030.My Client Groups}}").click();
		//Click on Workforce Structures
		web.link("{{obj.HCM_ManageLocations_EditLocation_0030.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageLocations_EditLocation_0030.web_window}}").waitForPage(180,true);
		info("Title of the page is : "+web.window("{{obj.HCM_ManageLocations_EditLocation_0030.web_window}}").getTitle());
		web.element(28,"{{obj.HCM_ManageLocations_EditLocation_0030.Log Out con}}").focus();
		{
			think(1.1);
		}
		web.element(99, "{{obj.HCM_ManageLocations_EditLocation_0030.ManageLocatonsIcon}}").focus();		
		//Click on Manage Locatons Link
		web.link(101,"{{obj.HCM_ManageLocations_EditLocation_0030.ManageLocatonsLink}}").dblClick();
		{
			think(1.145);
		}
		//Provide the Manage Locations Name
		web.textBox("{{obj.HCM_ManageLocations_EditLocation_0030.ManageLocatonName}}").setText(locationName);
		//Provide the Manage Locations Code
		web.textBox("{{obj.HCM_ManageLocations_EditLocation_0030.ManageLocatons_Code}}").setText(locationCode);
		//Capture the acreen shot of the page
		web.window("{{obj.HCM_ManageLocations_EditLocation_0030.web_window}}").capturePage();
		
		//Click on the search button
		web.button("{{obj.HCM_ManageLocations_EditLocation_0030.Locaton_Search}}").click();
		{
			think(2.599);
		}
		//Capture the acreen shot of the page
		web.window("{{obj.HCM_ManageLocations_EditLocation_0030.web_window}}").capturePage();
		{
			think(2.599);
		}
		//Click the Search Results
		web.element(120, "{{obj.HCM_ManageLocations_EditLocation_0030.web_span_Riyadh}}").click();
		{
			think(5.599);
		}		
		web.link("{{obj.HCM_ManageLocations_EditLocation_0030.Edit_DropDown}}").click();
		web.element("{{obj.HCM_ManageLocations_EditLocation_0030.Update}}").click();
		{
			think(5.158);
		}
		web.button("{{obj.HCM_ManageLocations_EditLocation_0030.Update_StartDate_PopUp}}").click();
		{
			think(3.856);
		}
		web.button("{{obj.HCM_ManageLocations_EditLocation_0030.Warning_Pop_Up}}").click();
		{
			think(3.102);
		}
		web.textBox("{{obj.HCM_ManageLocations_EditLocation_0030.Edit_Locaton_Pane}}").click();
		web.textBox("{{obj.HCM_ManageLocations_EditLocation_0030.Edit_Locaton_Pane}}").click();
		web.textBox("{{obj.HCM_ManageLocations_EditLocation_0030.Edit_Locaton_Pane}}").setText(Update_Location);
		web.element("{{obj.HCM_ManageLocations_EditLocation_0030.Submit}}").click();
		{
			think(0.053);
		}
		web.button("{{obj.HCM_ManageLocations_EditLocation_0030.WarningMessage_Yes}}").click();
		{
			think(3.804);
		}
		web.button("{{obj.HCM_ManageLocations_EditLocation_0030.WarningMessage_OK}}").click();	
		
		{
			think(0.599);
		}
		//Capture the acreen shot of the page
		web.window("{{obj.HCM_ManageLocations_EditLocation_0030.web_window}}").capturePage();
								
	}
	
	public void finish() throws Exception {
		//LogOut the applcation
		web.window("{{obj.HCM_ManageLocations_EditLocation_0030.web_window}}").close();
	}
}
