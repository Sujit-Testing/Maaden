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
	
	String effective_Start_Date,division_Name,division_Classification,division_Location,division_ReportName,division_ManagerName,organizationType = null;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageJobs_EditDivision_UpdateOption_0042.xlsx", true);
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective_Start_Date is : "+effective_Start_Date);
		
		organizationType=(String) datatable.getValue("DataSheet", 0, "OrganizationType");
		info("OrganizationType is : "+organizationType);
		
		hCM_LogIn_LogOut.run();
		
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.My Client Groups}}").click();
		{
			think(0.825);
		}
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_window}}").waitForPage(30,true);
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Organizations}}").click();
		{
			think(2.527);
		}
	
		{
			think(2.256);
		}
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Manage Divisions}}").dblClick();
		
		{
			think(3.949);
		}
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_span_Create}}").click();
		
		{
			think(1.409);
		}
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Select an existing organization to define as a Division}}").click();
		{
			think(2.751);
		}
		
		
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Organization_Input_Type}}").click();		
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Organization_Input_Type}}").setText(organizationType);
		web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.OrganizationTypeSearch}}").click();
		{
			think(4.751);
		}
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.SelectSearchResults}}").click();
		web.image("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.SelectOrganizationTypemage}}").click();
		{
			think(2.761);
		}
		//Provide the dates
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_input_text__FOpt1__FOr1_0__FOSritemN_1}}").setText(effective_Start_Date);
		{
			think(2.65);
		}

		
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.SelectedValue}}").focus();
		//Capture the screen shot
		web.window("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_window}}").capturePage();
		String selectedText = web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.SelectedValue}}").getDisplayText();
		
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Next}}").click();
		//web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_span_x}}").click();
		{
			think(2.876);
		}
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_span_Submit}}").click();
		{
			think(2.927);
		}
		web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Confirmation_Yes}}").click();
		{
			think(3.339);
		}
		web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Confirmation_OK}}").click();
		{
			think(1.956);
		}
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.SearchInput}}").click();
		web.textBox("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.SearchInput}}").setText(selectedText);
		web.button("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.Search}}").click();
		{
			think(6.83);
		}
		web.link("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_a__FOpt1__FOr1_0__FOSritemN_1}}").click();
		{
			think(6.171);
		}
		//Capture the screen shot
		web.window("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_span_Done_1}}").click();
		{
			think(3.244);
		}
		web.window("{{obj.HCM_ManageJobs_EditDivision_UpdateOption_0042.web_window}}").close();
		
		
		

	}
	
	public void finish() throws Exception {
	}
}
