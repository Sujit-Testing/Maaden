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
	@FunctionLibrary("MyClientGroups_Absences") lib.maaden.orackeEBS.MyClientGroups_Absences myClientGroups_Absences;
	@FunctionLibrary("HCM_LogIn_LogOut") lib.maaden.orackeEBS.HCM_LogIn_LogOut hCM_LogIn_LogOut;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	
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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Sprint 2\\HCM_Invalid_AbsenceType_0029.xlsx", true);
		//Get the cell value
		String AbsenceType_Name = (String) datatable.getValue("DataSheet", 0, "AbsenceType_Name");
		info("The input Absence Plan Name captured from excel data sheet is : "+AbsenceType_Name);
		web.element("{{obj.HCM_AbsenceType_0028.Absence_Definitions_Text}}").focus();
		{
			think(1.988);
		}
		web.element("{{obj.HCM_AbsenceType_0028.PlanType_Icon}}").focus();
		web.link("{{obj.HCM_AbsenceType_0028.Absence Types_Link}}").dblClick();
		
		//web.link("{{obj.HCM_AbsenceType_0028.web_a__FOpt1__FOr1_0__FOSritemN_2}}").dblClick();
		{
			think(4.098);
		}
		web.textBox("{{obj.HCM_AbsenceType_0028.PlanTypeName}}").click();		
		web.textBox("{{obj.HCM_AbsenceType_0028.PlanTypeName}}").setText(AbsenceType_Name);
		{
			think(2.825);
		}
		web.button("{{obj.HCM_AbsenceType_0028.Search_String}}").click();
		{
			think(1.082);
		}
		web.element("{{obj.HCM_AbsenceType_0028.web_p_No_data_to_display_}}").focus();
		info(web.element("{{obj.HCM_AbsenceType_0028.web_p_No_data_to_display_}}").getDisplayText());		
	
		web.window(16, "{{obj.HCM_AbsenceType_0028.web_window}}").capturePage();
//		if(AbsenceType_Name!(web.element("{{obj.HCM_AbsenceType_0028.web_p_No_data_to_display_}}").getDisplayText())){
//			info("Test Case passed as plan type name are equal before and after search");			
//		}else fail("Test Case failed as plan type name are not equal before and after search");
//		web.button("{{obj.HCM_AbsenceType_0028.SaveAndClose}}").click();
//		{
//			think(1.348);
//		}
		web.window(16, "{{obj.HCM_AbsenceType_0028.web_window}}").capturePage();
		web.window(16, "{{obj.HCM_AbsenceType_0028.web_window}}").close();
				
		

	}
	
	public void finish() throws Exception {
	}
}
