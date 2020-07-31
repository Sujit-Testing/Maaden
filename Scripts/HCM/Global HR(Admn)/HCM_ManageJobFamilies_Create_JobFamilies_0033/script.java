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
	String job_family_Name,job_family_Code =null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		hCM_LogIn_LogOut.run();	
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageJobFamilies_Create_JobFamilies_0033.xlsx", true);
		job_family_Name=(String) datatable.getValue("DataSheet", 0, "Job_family_Name");
		info("Job_family_Name s : "+job_family_Name);
		job_family_Code=(String) datatable.getValue("DataSheet", 0, "Job_family_Code");
		info("Job_family_Code is : "+job_family_Code);
		
		web.link("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.MyClientGroups}}").click();
		web.link("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.WorkforceStructure}}").click();
		web.window("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_window}}").waitForPage(100,true);
		web.element("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_h2_Jobs}}").focus();
		web.element("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_path_svg_outline}}").focus();
		web.link("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_a__FOpt1__FOr1_0__FOSritemN_1}}").dblClick();
		{
			think(5.733);
		}
		web.image("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Create_Button}}").click();
		{
			think(5.012);
		}
		web.textBox("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Input_Job_Family}}").click();
		web.textBox("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Input_Job_Family}}").setText(job_family_Name);
		web.textBox("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Input_Job_Family}}").pressTab();
		web.textBox("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Input_Job_Family_Code}}").setText(job_family_Code);
		web.element("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_span_Submit}}").click();
		{
			think(2.292);
		}
		web.button("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Yes_Button}}").click();
		{
			think(0.334);
		}
		web.button("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.OK_Button}}").click();
		{
			think(2.881);
		}
		web.textBox("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Job_FamilyName}}").click();
		web.textBox("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Job_FamilyName}}").setText(job_family_Name);
		web.textBox("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Job_FamilyName}}").pressTab();
		web.textBox("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Job_FamilyCode}}").setText(job_family_Code);
		{
			think(0.015);
		}
		web.button("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Search_Button}}").click();
		
		web.element("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Search_Results}}").dblClick();
		{
			think(2.29);
		}
		web.element("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_span_Job_Famly_1_1}}")	.dblClick();
		web.element("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_span_Job_Faily_1}}").dblClick();
		web.window("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_window}}").capturePage();
		web.button("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.DoneButton}}").click();
		{
			think(1.869);
		}
		web.element("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_svg__FOpt1__UIScmil1u__icon}}").click();
		{
			think(1.961);
		}
		web.link("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.Sign_Out}}").click();
		web.window("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_window}}")	.waitForPage(100,true);
		web.window("{{obj.HCM_ManageJobFamilies_Create_JobFamilies_0033.web_window}}").close();

	}
	
	public void finish() throws Exception {
	}
}
