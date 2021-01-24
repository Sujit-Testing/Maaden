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
	@FunctionLibrary("MyClientGroups_Absences") lib.maaden.orackeEBS.MyClientGroups_Absences myClientGroups_Absences;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	
	String AbsenceReasons_Name = null;
	String nameAfterSearch = null;
	final String errorText = "No results found." ;
	String errorResults = null;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		//LogIn the application
		hCM_LogIn_LogOut.run();
		//Click the Absence after clicking my client group lick
		myClientGroups_Absences.run();
		
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Sprint 2\\HCM_Invalid_AbsenceReason_0023.xlsx", true);
		//Get the name from the excel data
		AbsenceReasons_Name=(String) datatable.getValue("DataSheet", 0, "Name");
		info("AbsenceReasons_Name --> "+AbsenceReasons_Name);
		
		//focus on LogOutIcon
		web.element("{{obj.HCM_Invalid_AbsenceReason_0023.LogOutIcon}}").focus();
		{
			think(3.569);
		}
		//focus on Absence_Reasons_Icon
		web.element("{{obj.HCM_Invalid_AbsenceReason_0023.Absence_Reasons_Icon}}").focus();
		//web.element("{{obj.HCM_Invalid_AbsenceReason_0023.Absence_Reasons_Icon}}").dblClick();
		{
			think(2.004);
		}
		web.element("{{obj.HCM_Invalid_AbsenceReason_0023.web_h2_Absence_Definitions}}").dblClick();
		//click on AbsenceReasons_Link
		web.link("{{obj.HCM_Invalid_AbsenceReason_0023.AbsenceReasons_Link}}").focus();
		{
			think(2.714);
		}
		web.link("{{obj.HCM_Invalid_AbsenceReason_0023.AbsenceReasons_Link}}").dblClick();
		{
			think(2.714);
		}
		web.textBox("{{obj.HCM_Invalid_AbsenceReason_0023.Name}}").click();
		{
			think(1.926);
		}
		web.textBox("{{obj.HCM_Invalid_AbsenceReason_0023.Name}}").setText(AbsenceReasons_Name);
		web.button("{{obj.HCM_Invalid_AbsenceReason_0023.Search}}").click();
		{
			think(2.135);
		}
		//Click on Results
		
		web.element("{{obj.HCM_Invalid_AbsenceReason_0023.web_p_No_results_found_}}").dblClick();
		errorResults = web.element("{{obj.HCM_Invalid_AbsenceReason_0023.web_p_No_results_found_}}").getDisplayText();
		info("After search the result is : "+errorResults);
		if(errorResults.equalsIgnoreCase(errorText)){
			info("Test cases pass as before search and after search string are matched. ");			
		}else{
			fail("Test cases fail as before search and after search string are not matched. ");
		}
		/*
		
		web.link("{{obj.HCM_Invalid_AbsenceReason_0023.Results_Name}}").click();
		{
			think(0.298);
		}
		//capture the name, status and location and Validate the results
		web.element("{{obj.HCM_Invalid_AbsenceReason_0023.Text}}").dblClick();
		nameAfterSearch = web.element("{{obj.HCM_Invalid_AbsenceReason_0023.Text}}").getDisplayText();
		info("Name is : "+nameAfterSearch);
		if(nameAfterSearch.equalsIgnoreCase(AbsenceReasons_Name)){
			info("Test Case Pass as before search and after search string are same.");
		}else{
			fail("Test Case fail as before search and after search string are not same.");
		}
		web.element("{{obj.HCM_Invalid_AbsenceReason_0023.Locaton}}").dblClick();
		info("Location is : "+web.element("{{obj.HCM_Invalid_AbsenceReason_0023.Locaton}}").getDisplayText());
		web.element(11, "{{obj.HCM_Invalid_AbsenceReason_0023.Status}}").dblClick();
		info("Status is : "+web.element(11, "{{obj.HCM_Invalid_AbsenceReason_0023.Status}}").getDisplayText());
		//Captrure the screen shot
		web.window("{{obj.HCM_Invalid_AbsenceReason_0023.web_window}}").capturePage();
		
		web.element("{{obj.HCM_Invalid_AbsenceReason_0023.Save_And_Close}}").click();
		{
			think(1.135);
		}
		*/
		web.window("{{obj.HCM_Invalid_AbsenceReason_0023.web_window}}").close();
		
			

	}
	
	public void finish() throws Exception {
	}
}
