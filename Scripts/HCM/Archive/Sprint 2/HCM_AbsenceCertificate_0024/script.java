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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Sprint 2\\HCM_AbsenceCertificate_0024.xlsx", true);
		//Get the name from the excel data
		absenceCertifications_Name=(String) datatable.getValue("DataSheet", 0, "Name");
		info("AbsenceCertifications_Name --> "+absenceCertifications_Name);
		//click on Absence_Definitions text
		web.element("{{obj.HCM_AbsenceCertificate_0024.Absence_Definitions}}").focus();
		{
			think(0.89);
		}
		//Click on AbsenceCertificate_Icon
		web.element("{{obj.HCM_AbsenceCertificate_0024.AbsenceCertificate_Icon}}").focus();
		//web.link("{{obj.HCM_AbsenceCertificate_0024.web_a__FOpt1__FOr1_0__FOSritemN}}").click();
		//Clck on AbsenceCertifications link
		web.link("{{obj.HCM_AbsenceCertificate_0024.AbsenceCertifications}}").dblClick();
		{
			think(2.479);
		}
		web.textBox("{{obj.HCM_AbsenceCertificate_0024.AbsenceCertifications_Name}}").click();
		{
			think(1.229);
		}
		//Set the AbsenceCertifications_Name which get from excel data
		web.textBox("{{obj.HCM_AbsenceCertificate_0024.AbsenceCertifications_Name}}").setText(absenceCertifications_Name);
		{
			think(0.89);
		}
		web.button("{{obj.HCM_AbsenceCertificate_0024.Search}}").dblClick();
		{
			think(5.102);
		}
		web.link("{{obj.HCM_AbsenceCertificate_0024.Search_Results}}").click();
		{
			think(2.724);
		}
		//retrive the output and print in console 
		web.element("{{obj.HCM_AbsenceCertificate_0024.Classification}}").focus();
		classification = web.element("{{obj.HCM_AbsenceCertificate_0024.Classification}}").getDisplayText();
		info("Classification is : "+classification);
		web.element("{{obj.HCM_AbsenceCertificate_0024.Management}}").focus();
		managment = web.element("{{obj.HCM_AbsenceCertificate_0024.Management}}").getDisplayText();
		info("Managment is : "+managment);
		web.element("{{obj.HCM_AbsenceCertificate_0024.Legislation}}").focus();
		legislation = web.element("{{obj.HCM_AbsenceCertificate_0024.Legislation}}").getDisplayText();
		info("legislation is : "+legislation);
		web.element("{{obj.HCM_AbsenceCertificate_0024.Certification_Name}}").focus();
		certification_Name = web.element("{{obj.HCM_AbsenceCertificate_0024.Certification_Name}}").getDisplayText();
		info("certification_Name is : "+certification_Name);
		web.textArea("{{obj.HCM_AbsenceCertificate_0024.Certificaton_Description}}").focus();
		certificaton_Description = web.textArea("{{obj.HCM_AbsenceCertificate_0024.Certificaton_Description}}").getDisplayText();
		info("Certificaton_Description is : "+certificaton_Description);
		web.element(17, "{{obj.HCM_AbsenceCertificate_0024.Status}}").focus();
		status = web.element(17, "{{obj.HCM_AbsenceCertificate_0024.Status}}").getDisplayText();
		info("Status is : "+ status);
		web.element(18, "{{obj.HCM_AbsenceCertificate_0024.AbsenceRecordUpdateRule}}").focus();
		absenceRecordUpdateRule = web.element(18, "{{obj.HCM_AbsenceCertificate_0024.AbsenceRecordUpdateRule}}").getDisplayText();
		info("AbsenceRecordUpdateRule is : "+ absenceRecordUpdateRule);
		
		// Name validation
		if(certification_Name.equalsIgnoreCase(absenceCertifications_Name)){
			info("Test Case Pass as expected result and actual results are matched.");			
		}else{
			fail("Test Case fail as expected result and actual results are not matched.");
		}
		
		
		web.window("{{obj.HCM_AbsenceCertificate_0024.web_window}}").capturePage();
	
		//Click Save and Close
		web.button("{{obj.HCM_AbsenceCertificate_0024.SaveAndClose}}").click();
		{
			think(1.537);     
		}
		web.element("{{obj.HCM_AbsenceCertificate_0024.SignOut_DropDown}}").click();
		{
			think(3.537);
		}
		web.link("{{obj.HCM_AbsenceCertificate_0024.Sign_Out}}").click();
		web.window("{{obj.HCM_AbsenceCertificate_0024.web_window}}").waitForPage(null);
		{
			think(3.849);
		}
		web.window("{{obj.HCM_AbsenceCertificate_0024.web_window}}").close();

	}
	
	public void finish() throws Exception {
	}
}
