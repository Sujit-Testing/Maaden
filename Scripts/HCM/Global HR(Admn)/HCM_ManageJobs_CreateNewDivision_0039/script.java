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
	
	String effective_Start_Date,division_Name,division_Classification,division_Location,division_ReportName,division_ManagerName = null;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageJobs_CreateNewDivision_0039.xlsx", true);
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective_Start_Date is : "+effective_Start_Date);
		division_Name=(String) datatable.getValue("DataSheet", 0, "Division_Name");
		info("Division_Name is : "+division_Name);
		division_Classification=(String) datatable.getValue("DataSheet", 0, "Division_Classification");
		info("CreateJob_Code is : "+division_Classification);
		division_Location=(String) datatable.getValue("DataSheet", 0, "Division_Location");
		info("Division_Location is : "+division_Location);
		division_ReportName=(String) datatable.getValue("DataSheet", 0, "Division_ReportName");
		info("Division_ReportName is : "+division_ReportName);
		division_ManagerName=(String) datatable.getValue("DataSheet", 0, "Division_ManagerName");
		info("Division_ManagerName is : "+division_ManagerName); 
//		add_Existing_Profile=(String) datatable.getValue("DataSheet", 0, "Add_Existing_Profile");
//		info("Add_Existing_Profile is : "+add_Existing_Profile);
		
		hCM_LogIn_LogOut.run();
		
		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.My Client Groups}}").click();
		{
			think(0.825);
		}
		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_window}}").waitForPage(30,true);
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Organizations}}").click();
		{
			think(2.527);
		}
	//	web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_a__FOpt1__FOr1_0__FOSritemN}}").click();
		{
			think(2.256);
		}
		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Manage Divisions}}").dblClick();
		//web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Manage Divisions}}").click();
		{
			think(9.949);
		}
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_span_Create}}").click();
		//web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Create_Division}}").click();
		{
			think(1.409);
		}
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Create_new_RadioButton}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Date}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Date}}").setText(effective_Start_Date);
		{
			think(1.409);
		}
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Division_Name}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Division_Name}}").setText(division_Name);
		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Classification_SearchDropDown}}").click();
		{
			think(2.11);
		}

		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Classification_Search}}").click();
		{
			think(2.11);
		}
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Classification_Name}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Classification_Name}}").setText(division_Classification);
		web.button("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Classification_Name_Search}}").click();
		{
			think(2.186);
		}
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Select_Classification}}").click();
		web.button("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Classification_OK}}").click();
		
		
		
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_input_text__FOpt1__FOr1_0__FOSritemN_3}}").click();
		{
			think(5.915);
		}
		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Division_Location}}").click();
		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Division_Location_Search}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Division_Location_Name}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Division_Location_Name}}").setText(division_Location);
		web.button("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Division_Location_Name_Search}}").click();
		{
			think(2.323);
		}
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Select_Division_Location_Name}}").click();
		web.button("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Division_Location_OK_Button}}").click();
		{
			think(1.288);
		}
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Next}}").click();
		{
			think(3.904);
		}
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.ReportingName}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.ReportingName}}").setText(division_ReportName);
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_input_text__FOpt1__FOr1_0__FOSritemN_6}}").click();
		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_a__FOpt1__FOr1_0__FOSritemN_6}}").click();
		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_a__FOpt1__FOr1_0__FOSritemN_7}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.ManagerName}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.ManagerName}}").setText(division_ManagerName);
		web.button("{{obj.HCM_ManageJobs_CreateNewDivision_0039.ManagerNameSearch}}").click();
		{
			think(3.386);
		}
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_td_Abdul_Khader}}").click();
		web.button("{{obj.HCM_ManageJobs_CreateNewDivision_0039.ManagerNameSearch_OK_Button}}").click();
		{
			think(4.998);
		}
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Next}}").click();
		{
			think(2.188);
		}
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.DivisionName}}").focus();
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Submit}}").click();
		{
			think(3.57);
		}
		web.button("{{obj.HCM_ManageJobs_CreateNewDivision_0039.PopUp_Yes_Button}}").click();
		{
			think(3.671);
		}
		web.button("{{obj.HCM_ManageJobs_CreateNewDivision_0039.PopUp_OK_Button}}").click();
		{
			think(2.523);
		}
		
		web.textBox("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Division_Name_Search}}").setText(division_Name);
		web.button("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Click_Division_Name_Search_Button}}").click();
		{
			think(0.038);
		}
		web.link("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_a__FOpt1__FOr1_0__FOSritemN_8}}").click();
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Search_Division_Name}}").focus();
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Search_Division_Status}}").focus();
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Search_Division_Location}}").focus();
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.Search_Division_Classification}}").focus();
		web.window("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_span_Done}}").click();
		web.window("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_window}}").close();
		
		//web.element("{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_span_Create}}").click();
//		{
//			think(7.963);
//		}
//		web.window(62,
//				"{{obj.HCM_ManageJobs_CreateNewDivision_0039.web_window}}")
//				.close();

	}
	
	public void finish() throws Exception {
	}
}
