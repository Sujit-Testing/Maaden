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
	final String error_MSG = "No data to display.";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		hCM_LogIn_LogOut.run();
		myClientGroups_Absences.run();
		//Import the excel schhet
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Sprint 2\\HCM_Invalid_AbsencePlan_0027.xlsx", true);
		//Get the cell value
		String AbsencePlan_Name = (String) datatable.getValue("DataSheet", 0, "AbsencePlan_Name");
		info("The input Absence Plan Name captured from excel data sheet is : "+AbsencePlan_Name);
		{
			think(2.063);
		}
		web.element("{{obj.HCM_Invalid_AbsencePlan_0027.AbsenceDefinitions_Pane}}").focus();
		web.element(5, "{{obj.HCM_Invalid_AbsencePlan_0027.AbsencePlan_Icon}}").focus();
		web.link("{{obj.HCM_Invalid_AbsencePlan_0027.Absence Plans}}").focus();
		//click the AbsencePlans_Link
		web.link("{{obj.HCM_Invalid_AbsencePlan_0027.AbsencePlans_Link}}").dblClick();
		{
			think(5.063);
		}
		web.textBox("{{obj.HCM_Invalid_AbsencePlan_0027.Plan_Name}}").focus();
		//Provide the input in the input text area to search
		web.textBox("{{obj.HCM_Invalid_AbsencePlan_0027.Plan_Name}}").setText(AbsencePlan_Name);
		//Search the results
		
		web.button("{{obj.HCM_Invalid_AbsencePlan_0027.Search}}").click();
		{
			think(1.686);
		}
		//Click on results
		web.element("{{obj.HCM_Invalid_AbsencePlan_0027.web_p_No_data_to_display_}}").focus();
		web.window(22, "{{obj.HCM_Invalid_AbsencePlan_0027.web_window}}").capturePage();
		info("Actual message returned : "+web.element("{{obj.HCM_Invalid_AbsencePlan_0027.web_p_No_data_to_display_}}").getDisplayText());
		if(error_MSG.equalsIgnoreCase(web.element("{{obj.HCM_Invalid_AbsencePlan_0027.web_p_No_data_to_display_}}").getDisplayText())){
			info("The Test Case pass as expected results and actual results are matched..");
		}else fail ("The Test Case fail as expected results and actual results are not matched..");
		
		//web.link(13,"{{obj.HCM_Invalid_AbsencePlan_0027.Search_Results}}").click();
		{
			think(4.318);
		}
		//web.link("{{obj.HCM_Invalid_AbsencePlan_0027.Actual_AbsencePlan_Name}}").dblClick();
		/*
		 * //After search, actual results captured.
		web.element(15, "{{obj.HCM_Invalid_AbsencePlan_0027.Actual_PlanName}}").focus();
		info("Absence Plane name : "+web.element("{{obj.HCM_Invalid_AbsencePlan_0027.Actual_PlanName}}").getDisplayText());
				
		web.element(16, "{{obj.HCM_Invalid_AbsencePlan_0027.Actual_PlanType}}").focus();
		info("Plan Type is : "+web.element(16, "{{obj.HCM_Invalid_AbsencePlan_0027.Actual_PlanType}}").getDisplayText());
		web.element(17, "{{obj.HCM_Invalid_AbsencePlan_0027.Actual_Management}}").focus();
		info("Management is : "+web.element(17, "{{obj.HCM_Invalid_AbsencePlan_0027.Actual_Management}}").getDisplayText());
		web.element(18, "{{obj.HCM_Invalid_AbsencePlan_0027.Actual_Legislation}}").focus();
		info("Legislation : "+web.element(18, "{{obj.HCM_Invalid_AbsencePlan_0027.Actual_Legislation}}").getDisplayText());
		//Validate the plan name
		if(AbsencePlan_Name.equalsIgnoreCase(web.element("{{obj.HCM_Invalid_AbsencePlan_0027.Actual_PlanName}}").getDisplayText())){
			info("The Test Case Pass as the expected Absence Plane name and Actual Absence Plane name are same.");
		}else fail("The Test Case fail as the expected Absence Plane name and Actual Absence Plane name are not same.");
		
		web.window(22, "{{obj.HCM_Invalid_AbsencePlan_0027.web_window}}").capturePage();
		
		web.element(19, "{{obj.HCM_Invalid_AbsencePlan_0027.Save_And_Close}}").click();
		{
			think(1.647);
		}	
		*/
		
		//LogOut from the applicaton
		web.element("{{obj.HCM_Invalid_AbsencePlan_0027.SignOut_Icon}}").click();
		{
			think(2.581);
		}
		web.link(21, "{{obj.HCM_Invalid_AbsencePlan_0027.SignOut}}").click();
		web.window(22, "{{obj.HCM_Invalid_AbsencePlan_0027.web_window}}").waitForPage(null);
		web.window(22, "{{obj.HCM_Invalid_AbsencePlan_0027.web_window}}").close();

	
	}
	
	public void finish() throws Exception {
	}
}
