import java.util.concurrent.TimeUnit;

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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManagePosition_UpdatePosition_0056.xlsx", true);
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
		web.window("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_window}}").waitForPage(null);
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.uid}}").setText(uid);
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.uid}}").pressTab();
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.logIn}}").click();
		web.window("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_window}}").waitForPage(180,true);

		//Click on MyClientGroups
		web.link("{{obj.HCM_ManagePosition_UpdatePosition_0056.MyClientGroups}}").click();
		{
			think(2.227);
		}
		//Click on WorkforceStructures
		web.link("{{obj.HCM_ManagePosition_UpdatePosition_0056.WorkforceStructures}}").click();
		web.window("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_window}}").waitForPage(180,true);
		
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.Positions_Section_Text}}").click();
		{
			think(1.683);
		}
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.ManagePositions_IMG}}").focus();
		//web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.ManagePositions_IMG}}").pressTab();
		{
			think(2.096);
		}
		web.link("{{obj.HCM_ManagePosition_UpdatePosition_0056.ManagePositions}}").click();
		web.link("{{obj.HCM_ManagePosition_UpdatePosition_0056.ManagePositions}}").dblClick();
		{
			think(3.834);
		}
		
			
		//Search the the created position
		
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.Name}}").click();
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.Name}}").setText(position_Name);
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.Search}}").click();
		{
			think(4.034);
		}
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.Select_Search_Results}}").click();
		{
			think(5.054);
		}
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Sujit1_1}}").focus();
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_10223}}").focus();
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Leader}}").focus();
		info("Search Job Name is : "+web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Leader}}").getDisplayText());
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Active}}").focus();
		web.window("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_window}}").capturePage();
		//web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Done}}")	.click();
		{
			think(2.92);
		}
		
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.Edit_DropDown}}")	.click();
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.Update}}").click();
		{
			think(2.839);
		}
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.Effective_Start_Date}}").setText(effective_Start_Date);
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.Effective_Start_Date_OK_Button}}").click();
		{
			think(2.63);
		}
		if(web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.Effective_Start_Date_Warning_OK_Button}}").exists(5, TimeUnit.SECONDS)){
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.Effective_Start_Date_Warning_OK_Button}}").click();
		{
			think(2.758);
		}
		}
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.Update_Job}}").click();
		web.link("{{obj.HCM_ManagePosition_UpdatePosition_0056.Update_Job_DropDown}}").click();
		{
			think(2.331);
		}
		web.link("{{obj.HCM_ManagePosition_UpdatePosition_0056.Update_Job_Search}}").click();
		{
			think(2.965);
		}
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.Restet}}").click();
		{
			think(1.965);
		}
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.Provide_Job_Name}}").click();
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.Provide_Job_Name}}").setText(job_Name);
		{
			think(2.046);
		}
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.Provide_Job_Name}}").pressTab();
		{
			think(1.965);
		}
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.JobName_Search}}").click();
		{
			think(0.061);
		}
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.Select_Job_Name}}").click();
		{
			think(0.065);
		}
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.Search_Job_PopUP_OK}}").click();
		{
			think(3.283);
		}
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.Review}}").click();
		{
			think(5.995);
		}
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Submit}}").click();
		{
			think(3.337);
		}
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.Warning_Dialog}}").click();
		{
			think(4.261);
		}
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.ConfirmationDialog_OK}}").click();
		{
			think(2.261);
		}
		//Search the updated position
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.Name}}").click();
		web.textBox("{{obj.HCM_ManagePosition_UpdatePosition_0056.Name}}").setText(position_Name);
		web.button("{{obj.HCM_ManagePosition_UpdatePosition_0056.Search}}").click();
		{
			think(4.034);
		}
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.Select_Search_Results}}").click();
		{
			think(5.054);
		}
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Sujit1_1}}").focus();
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_10223}}").focus();
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Leader}}").focus();
		info("Search updated Job Name is : "+web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Leader}}").getDisplayText());
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Active}}").focus();
		web.window("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_window}}").capturePage();
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_span_Done}}")	.click();
		{
			think(2.92);
		}

	}
	
	public void finish() throws Exception {
		web.element("{{obj.HCM_ManagePosition_UpdatePosition_0056.SignOutIcon}}").click();
		{
			think(4.439);
		}
		web.link("{{obj.HCM_ManagePosition_UpdatePosition_0056.Sign_Out}}").click();
		web.window("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_window}}").waitForPage(null);
		{
			think(2.452);
		}
		web.window("{{obj.HCM_ManagePosition_UpdatePosition_0056.web_window}}").close();
	}
}
