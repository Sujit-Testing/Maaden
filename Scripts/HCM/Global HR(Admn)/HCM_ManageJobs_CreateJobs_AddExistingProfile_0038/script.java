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
	String effective_Start_Date,createJob_Name,createJob_Code,profile_Code,profile_Name,profile_Description,add_Existing_Profile =null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.xlsx", true);
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective_Start_Date is : "+effective_Start_Date);
		createJob_Name=(String) datatable.getValue("DataSheet", 0, "CreateJob_Name");
		info("CreateJob_Name is : "+createJob_Name);
		createJob_Code=(String) datatable.getValue("DataSheet", 0, "CreateJob_Code");
		info("CreateJob_Code is : "+createJob_Code);
		profile_Code=(String) datatable.getValue("DataSheet", 0, "Profile_Code");
		info("profile_Code is : "+profile_Code);
		profile_Name=(String) datatable.getValue("DataSheet", 0, "Profile_Name");
		info("profile_Name is : "+profile_Name);
		profile_Description=(String) datatable.getValue("DataSheet", 0, "Profile_Description");
		info("CreateJob_Code is : "+profile_Description); 
		add_Existing_Profile=(String) datatable.getValue("DataSheet", 0, "Add_Existing_Profile");
		info("Add_Existing_Profile is : "+add_Existing_Profile);
		
		hCM_LogIn_LogOut.run();	
		
		web.link("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.MyClientGroups}}").click();
		web.link("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.WorkforceStructure}}").click();
		web.window("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_window}}").waitForPage(100,true);
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_h2_Jobs}}").focus();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_path_svg_outline}}").focus();
	
		web.link("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_a__FOpt1__FOr1_0__FOSritemN_2}}").click();
		{
			think(0.145);
		}
		web.link("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_a__FOpt1__FOr1_0__FOSritemN_3}}").dblClick();
		{
			think(1.559);
		}
		
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Create}}").click();
		{
			think(1.836);
		}
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_input_text__FOpt1__FOr1_0__FOSritemN_1}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_input_text__FOpt1__FOr1_0__FOSritemN_1}}").setText(effective_Start_Date);
		//Provide basic details
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_span_Common_Set}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.createJob_Name}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.createJob_Name}}").setText(createJob_Name);
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.createJob_Name}}").pressTab();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.createJob_Code}}").setText(createJob_Code);		
		
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Next}}").click();
		{
			think(0.074);
		}
		//Job Description 
		web.link("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_a__FOpt1__FOr1_0__FOSritemN_5}}").click();		
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_li_Active}}")	.click();
		
		//Added Valid Grades
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Add_Row}}").click();
		{
			think(2.529);
		}
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.GradeName}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.GradeName}}").setText("SA.03");
		{
			think(5.529);
		}
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.GradeName}}").pressTab();
		//web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.SelectGrade}}").click();
		
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Next}}").click();
		{
			think(1.529);
		}
		//Evaluation Criteria 
		web.link("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.EvaluationSystem_DropDown}}").click();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Custom}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.MeasurementUnit_InputBox}}").click();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Points}}").click();
		{
			think(1.529);
		}
		//Click on Next Button
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Next}}").click();
		{
			think(2.529);
		}
			//Create Profile
//			web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Create_Profile}}").click();
//			web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Profile_Code}}").setText(profile_Code);		
//			web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Profile_Name}}").setText(profile_Name);
//			web.textArea("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Profile_Description}}").setText(profile_Description);
//			web.button("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Pop_Up_OK}}").click();
//			{
//				think(3.529);
//			}
		//Add existing profile
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Add_Existing_Profile}}").click();
		{
			think(1.671);
		}
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Add_Existing_Profile_InputBox}}").click();
		{
			think(1.094);
		}
		web.link("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Search}}").click();
		{
			think(1.134);
		}
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Add_Existing_Profile_SearchInputBox}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Add_Existing_Profile_SearchInputBox}}").setText(add_Existing_Profile);
		{
			think(0.055);
		}
		web.button("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.SearchPopUP}}").click();
		{
			think(0.049);
		}
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.SelectSearchResults}}").click();
		{
			think(0.057);
		}
		web.button("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.OK_PopUp}}").click();
		//Click on Next
		
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Next}}").click();
		{
			think(5.529);
		}
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Submit}}").click();
		{
			think(4.124);
		}
		if(web.button("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Yes}}").exists(10, TimeUnit.SECONDS)){
			web.button("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Yes}}").click();	
		}		
		{
			think(4.187);
		}
		web.button("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_button__FOpt1__FOr1_0__FOSritemN_1}}").click();
		{
			think(2.187);
		}
		
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_input_text__FOpt1__FOr1_0__FOSritemN_5}}").setText(createJob_Code);
		web.button("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Search_Button}}").click();
		{
			think(3.049);
		}
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.SearchResult}}").dblClick();
		{
			think(3.049);
		}
		
//		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.JobName}}").focus();
//		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.JobCode}}").focus();
//		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.JobStatus}}").focus();
		{
			think(0.029);
		}
		web.window("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_window}}").capturePage();
		web.link("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Tab_EvaluationCriteria}}").click();
		{
			think(2.649);
		}
		web.window("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_window}}").capturePage();
		web.link("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.Tab_Profiles}}").click();
		web.window("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_span_Done}}").click();
		web.window("{{obj.HCM_ManageJobs_CreateJobs_AddExistingProfile_0038.web_window}}").close();
		
		
	}
	
	public void finish() throws Exception {
	}
}
