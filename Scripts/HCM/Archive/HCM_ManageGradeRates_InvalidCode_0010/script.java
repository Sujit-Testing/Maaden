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
	String grade = null;
	String name = null;
	final String result = "No results found." ;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.i
	 */
	public void run() throws Exception {
		
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM_ManageGradeRates_InvalidCode_0010.xlsx", true);
		//Get the Name from the excel data
		name=(String) datatable.getValue("DataSheet", 0, "Name");
		info("Name from data sheet is : --> "+name);
		//Get the LegislativeDataGroup from the excel data
		legislativeDataGroup=(String) datatable.getValue("DataSheet", 0, "LegislativeDataGroup");
		info("LegislativeDataGroup from data sheet is : "+legislativeDataGroup);
		//Get the Grade Code from the excel data
		grade=(String) datatable.getValue("DataSheet", 0, "Grade");
		info("Grade from data sheet is : "+grade);
		//Get the Rate Type from the excel data
		rateType=(String) datatable.getValue("DataSheet", 0, "Rate Type");
		info("Rate Type from data sheet is : "+legislativeDataGroup);
		
		//Login in the application
		hCM_LogIn_LogOut.run();
		
		//Click on My Client Groups
		web.link("{{obj.HCM_ManageGradeRates_InvalidCode_0010.My Client Groups}}").click();
		//Click on Workforce Structures
		web.link("{{obj.HCM_ManageGradeRates_InvalidCode_0010.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageGradeRates_InvalidCode_0010.web_window}}").waitForPage(180,true);
		info("Title of the page is : "+web.window("{{obj.HCM_ManageGradeRates_InvalidCode_0010.web_window}}").getTitle());
		web.element(28,"{{obj.HCM_ManageGradeRates_InvalidCode_0010.Log Out con}}").focus();
		{
			think(1.1);
		}
		web.link("{{obj.HCM_ManageGradeRates_InvalidCode_0010.Manage_Grade_Rates}}").click();
		{
			think(2.91);
		}
		// Set the data from thr data sheet and click Search
		web.textBox("{{obj.HCM_ManageGradeRates_InvalidCode_0010.Name}}").setText(name);		
		web.textBox("{{obj.HCM_ManageGradeRates_InvalidCode_0010.Legislative Data Group}}").setText(legislativeDataGroup);
		web.textBox("{{obj.HCM_ManageGradeRates_InvalidCode_0010.RateInputType}}").setText(rateType);
		web.textBox("{{obj.HCM_ManageGradeRates_InvalidCode_0010.Grade}}").setText(grade);
		web.button("{{obj.HCM_ManageGradeRates_InvalidCode_0010.Search}}").click();
		{
			think(2.718);
		}
		web.element("{{obj.HCM_ManageGradeRates_InvalidCode_0010.InvaldSearchResults}}").dblClick();
		String showResults =  web.link("{{obj.HCM_ManageGradeRates_InvalidCode_0010.InvaldSearchResults}}").getDisplayText();
		info(showResults);
		if(result.equalsIgnoreCase(web.link("{{obj.HCM_ManageGradeRates_InvalidCode_0010.InvaldSearchResults}}").getDisplayText())){
			info("The Test Case pass as it return only : "+ showResults);
		}else {
			fail("The Test Case fail as it return only : "+ showResults);
		}
		
		
		//Capture the page-
		web.window("{{obj.HCM_ManageGradeRates_InvalidCode_0010.web_window}}").capturePage();
					
	}
	
	public void finish() throws Exception {
		//LogOut the applcation
		hCM_LogIn_LogOut.finish();
	}
}
