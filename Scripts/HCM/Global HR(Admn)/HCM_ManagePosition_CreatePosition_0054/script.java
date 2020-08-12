import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	String url,uid,pwd,effective_Start_Date,parent_Position_Code,parent_Position_Name,position_Name,job_Name,job_Code,profile_Code,profile_Name = null;
	
	public void initialize() throws Exception {
		browser.launch();
	}
			
	public void run() throws Exception {
		///Import data from the Data Table
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManagePosition_CreatePosition_0054.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");		
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective Start Date is : "+effective_Start_Date);
		parent_Position_Code=(String) datatable.getValue("DataSheet", 0, "Parent_Position_Code");
		info("Parent_Position_Code is : "+parent_Position_Code);
		parent_Position_Name=(String) datatable.getValue("DataSheet", 0, "Parent_Position_Name");
		info("Parent_Position_Name is : "+parent_Position_Name);
		position_Name=(String) datatable.getValue("DataSheet", 0, "Position_Name");
		info("Position_Name is : "+position_Name);
		job_Name=(String) datatable.getValue("DataSheet", 0, "Job_Name");
		info("Job_Name is : "+job_Name);
		job_Code=(String) datatable.getValue("DataSheet", 0, "Job_Code");
		info("Job_Code is : "+job_Code);
		profile_Code=(String) datatable.getValue("DataSheet", 0, "Profile_Code");
		info("Profile_Name is : "+profile_Code);
		profile_Name=(String) datatable.getValue("DataSheet", 0, "Profile_Name");
		info("Profile_Name is : "+profile_Name);
		
		
		//LogIn the application
		web.window("{{obj.HCM_ManagePosition_CreatePosition_0054.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManagePosition_CreatePosition_0054.web_window}}").waitForPage(null);
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.uid}}").setText(uid);
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.uid}}").pressTab();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.logIn}}").click();
		web.window("{{obj.HCM_ManagePosition_CreatePosition_0054.web_window}}").waitForPage(180,true);

		//Click on MyClientGroups
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.MyClientGroups}}").click();
		{
			think(2.227);
		}
		//Click on WorkforceStructures
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.WorkforceStructures}}").click();
		web.window("{{obj.HCM_ManagePosition_CreatePosition_0054.web_window}}").waitForPage(180,true);
		
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Positions_Section_Text}}").click();
		{
			think(1.683);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.ManagePositions_IMG}}").focus();
		//web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.ManagePositions_IMG}}").pressTab();
		{
			think(2.096);
		}
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.ManagePositions}}").click();
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.ManagePositions}}").dblClick();
		{
			think(3.834);
		}
		
		//Click on Create button
		web.image("{{obj.HCM_ManagePosition_CreatePosition_0054.Create}}").click();
		{
			think(2.155);
		}
		//Provide basic information
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.effectiveStartDate}}").click();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.effectiveStartDate}}").setText(effective_Start_Date);
		{
			think(2.95);
		}
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.ParentPosition}}").click();
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.ParentPosition_DropDown}}").click();
		{
			think(2.712);
		}
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.ParentPosition_Search}}").click();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.ParentPosition_Code}}").click();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.ParentPosition_Code}}").setText(parent_Position_Code);
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.ParentPosition_Name}}").click();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.ParentPosition_Name}}").setText(parent_Position_Name);
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.ParentPosition_Details_Search}}").click();
		{
			think(2.418);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Select_ParentPosition}}").click();
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.ParentPosition_PopUP_OK}}").click();
		{
			think(1.791);
		}
		
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Position_Name}}").setText(position_Name);
		{
			think(1.01);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Next}}").click();
		{
			think(2.556);
		}
		// Provide Position Details
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Status}}").click();
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Select_Status_Active}}").click();
		{
			think(2.7);
		}
		/*
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Click_Department_PopUP_OK}}").click();
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.Department_DropDown}}").click();
		{
			think(1.907);
		}
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.Department_Search}}").click();
		{
			think(1.491);
		}
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Dept_Name}}").click();
		{
			think(1.844);
		}
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Dept_Name}}").click();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Dept_Name}}").setText("Reduction-Potline I & II");
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.Click_Department_Search}}").click();
		{
			think(2.592);
		}
		
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Select_Department_Name}}").click();
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.Click_Department_PopUP_OK}}").click();
		{
			think(2.514);
		}
		*/
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Job}}").click();
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.Job_DropDown}}").click();
		{
			think(3.351);
		}
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.web_a__FOpt1__FOr1_0__FOSritemN}}").click();
		//web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.Job_PopUP_Search}}").click();
		{
			think(4.457);
		}
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Job_Name}}").click();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Job_Name}}").setText(job_Name);
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Job_Name}}").pressTab();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Job_Code}}").setText(job_Code);
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.Job_PopUP_Search}}").click();
		{
			think(2.208);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.web_td_Leader}}").click();
		//web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Select_Job}}").click();
		{
			think(1.672);
		}
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.Job_PopUP_OK}}").click();
		{
			think(2.568);
		}
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.HiringStatus}}").click();
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.HiringStatus_Approved}}").click();
		{
			think(5.88);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Next}}").click();
		//web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.web_span_x}}").click();	
		{
			think(1.9);
		}

		//provide Evaluation Criteria
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.web_input_text__FOpt1__FOr1_0__FOSritemN}}").click();
		{
			think(1.9);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.web_li_Custom}}").click();
		
//		
//		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Evaluation_System_Name}}").click();
//		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Custom}}").click();
		{
			think(3.311);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Next}}").click();
		{
			think(1.109);
		}
		//provide Evaluation Criteria
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Create_Profile}}").click();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Profile_Code}}").setText(profile_Code);
		{
			think(1.109);
		}
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Profile_Name}}").click();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Profile_Name}}").setText(profile_Name);
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.Profile_OK_Button}}").click();
		{
			think(4.12);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Next}}").click();
		//web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.web_a_Next_1}}").click();
		{
			think(6.218);
		}
		web.window("{{obj.HCM_ManagePosition_CreatePosition_0054.web_window}}").capturePage();
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.web_a_Submit}}").click();
		{
			think(3.615);
		}
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.Warning_Dialog_Yes}}").click();
		{
			think(5.933);
		}
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.Confirm_OK}}").click();
		{
			think(3.615);
		}
		
		//Search the newly created position
		
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Name}}").click();
		web.textBox("{{obj.HCM_ManagePosition_CreatePosition_0054.Name}}").setText(position_Name);
		web.button("{{obj.HCM_ManagePosition_CreatePosition_0054.Search}}").click();
		{
			think(4.034);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.Select_Search_Results}}").click();
		{
			think(5.054);
		}
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.web_span_Sujit1_1}}").focus();
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.web_span_10223}}").focus();
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.web_span_Leader}}").focus();
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.web_span_Active}}").focus();
		web.window("{{obj.HCM_ManagePosition_CreatePosition_0054.web_window}}").capturePage();
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.web_span_Done}}")	.click();
		{
			think(2.92);
		}

	}
	
	public void finish() throws Exception {
		web.element("{{obj.HCM_ManagePosition_CreatePosition_0054.SignOutIcon}}").click();
		{
			think(4.439);
		}
		web.link("{{obj.HCM_ManagePosition_CreatePosition_0054.Sign_Out}}").click();
		web.window("{{obj.HCM_ManagePosition_CreatePosition_0054.web_window}}").waitForPage(null);
		{
			think(2.452);
		}
		web.window("{{obj.HCM_ManagePosition_CreatePosition_0054.web_window}}").close();
	}
}
