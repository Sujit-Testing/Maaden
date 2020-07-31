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
	@FunctionLibrary("HCM_LogIn_LogOut") lib.maaden.orackeEBS.HCM_LogIn_LogOut hCM_LogIn_LogOut;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	
	String effective_Start_Date,division_Name,division_Classification,division_Location,division_ReportName,division_ManagerName,organizationType,eMail = null;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageJobs_EditDivision_UpdateOption_0041.xlsx", true);
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective_Start_Date is : "+effective_Start_Date);
		division_Name=(String) datatable.getValue("DataSheet", 0, "Division_Name");
		info("Division_Name is : "+division_Name);
		division_ReportName=(String) datatable.getValue("DataSheet", 0, "Division_ReportName");
		info("Division_ReportName is : "+division_ReportName);
		eMail=(String) datatable.getValue("DataSheet", 0, "Email");
		info("Email is : "+eMail);
		
		hCM_LogIn_LogOut.run();
		//Click on My Client Groups
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.My Client Groups}}").click();
		{
			think(0.825);
		}
		//Click on Workforce Structures
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_window}}").waitForPage(30,true);
		//Clik on Organizations
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.Organizations}}").click();
		{
			think(2.527);
		}
		//Click on Manage Divisions
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.Manage Divisions}}").dblClick();
		
		{
			think(3.949);
		}
		//Search the division name which want to edit
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.SearchInput}}").click();
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.SearchInput}}").setText(division_Name);
		web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.Search}}").click();
		{
			think(3.83);
		}
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_a__FOpt1__FOr1_0__FOSritemN_1}}").click();
		{
			think(3.171);
		}
		//Capture the screen shot
		web.window("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_window}}").capturePage();		
		//Click on Edit option
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_a_Edit}}").click();
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_td_Update}}").click();
		{
			think(1.561);
		}		
		//Provide the effective start date and clik OK
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_input_text__FOpt1__FOr1_0__FOSritemN}}").setText(effective_Start_Date);	
		web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.Confirmation_OK}}").click();
		//Clik on OK on pop-Up
		if(web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_button__FOpt1__FOr1_0__FOSritemN}}").exists(3, TimeUnit.SECONDS)){
			web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_button__FOpt1__FOr1_0__FOSritemN}}").click();
		}		
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_input_text__FOpt1__FOr1_0__FOSritemN_2}}").setText(eMail);
		//Edit the  Division Name
		//web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_input_text__FOpt1__FOr1_0__FOSritemN_4}}").setText("Sujit_Division_1");
		{
			think(1.956);
		}
		//Submit after edit 
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_span_Submit_1}}").click();
//		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_span_Submit}}").click();
		{
			think(3.927);
		}
		//Clik on Yes and OK on confirmaton pop-up
		web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.Yes_Confirmation_PopUp}}").click();
		{
			think(3.116);
		}
		web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.OK_Confirmation_PopUp}}").click();
		{
			think(3.116);
		}
		//Search the edited text
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.SearchInput}}").click();
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.SearchInput}}").setText(division_Name);
		web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.Search}}").click();
		{
			think(6.83);
		}
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_a__FOpt1__FOr1_0__FOSritemN_1}}").click();
		{
			think(3.171);
		}
		//Capture the screen shot
		web.window("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_window}}").capturePage();
		web.window("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0041.web_window}}").close();
	
	
		
		
		

	}
	
	public void finish() throws Exception {
	}
}
