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
	String classification = null;
	String managment = null;
	String legislation = null;
	String absenceCertifications_Name = null;
	String certification_Name = null;	
	String description = null;
	String certificaton_Description = null;
	String status = null;
	final String erro_Message = "No data to display.";
	String absenceRecordUpdateRule = null;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		//Login the application
		hCM_LogIn_LogOut.run();
		
		myClientGroups_Absences.run();
		
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Sprint 2\\HCM_Invalid_AbsenceCertification_0025.xlsx", true);
		//Get the name from the excel data
		absenceCertifications_Name=(String) datatable.getValue("DataSheet", 0, "Invalid_Name");
		info("AbsenceCertifications_Name --> "+absenceCertifications_Name);
		//click on Absence_Definitions text
		web.element("{{obj.HCM_Invalid_AbsenceCertification_0025.Absence_Definitions}}").focus();
		{
			think(0.89);
		}
		//Click on AbsenceCertificate_Icon
		web.element("{{obj.HCM_Invalid_AbsenceCertification_0025.AbsenceCertificate_Icon}}").focus();
		//web.link("{{obj.HCM_Invalid_AbsenceCertification_0025.web_a__FOpt1__FOr1_0__FOSritemN}}").click();
		//Clck on AbsenceCertifications link
		web.link("{{obj.HCM_Invalid_AbsenceCertification_0025.AbsenceCertifications}}").dblClick();
		{
			think(2.479);
		}
		web.textBox("{{obj.HCM_Invalid_AbsenceCertification_0025.AbsenceCertifications_Name}}").click();
		{
			think(1.229);
		}
		//Set the AbsenceCertifications_Name which get from excel data
		web.textBox("{{obj.HCM_Invalid_AbsenceCertification_0025.AbsenceCertifications_Name}}").setText(absenceCertifications_Name);
		{
			think(0.89);
		}
		web.button("{{obj.HCM_Invalid_AbsenceCertification_0025.Search}}").dblClick();
		{
			think(5.102);
		}
		//Error message 
		web.element("{{obj.HCM_Invalid_AbsenceCertification_0025.Error_MSG}}").focus();
		info(web.element("{{obj.HCM_Invalid_AbsenceCertification_0025.Error_MSG}}").getDisplayText());
		web.window("{{obj.HCM_Invalid_AbsenceCertification_0025.web_window}}").capturePage();
		
		if(erro_Message.equalsIgnoreCase(web.element("{{obj.HCM_Invalid_AbsenceCertification_0025.Error_MSG}}").getDisplayText())){
			info("Test Case Pass as it encountered error message after searching with invalid input ");			
		}else{
			fail("Test Case Fail as it do not encountered error message after searching with invalid input ");
		}
		
		web.element("{{obj.HCM_Invalid_AbsenceCertification_0025.SignOut_DropDown}}").click();
		{
			think(3.537);
		}
		web.link("{{obj.HCM_Invalid_AbsenceCertification_0025.Sign_Out}}").click();
		web.window("{{obj.HCM_Invalid_AbsenceCertification_0025.web_window}}").waitForPage(null);
		{
			think(3.849);
		}
		web.window("{{obj.HCM_Invalid_AbsenceCertification_0025.web_window}}").close();
		


	}
	
	public void finish() throws Exception {
	}
}
