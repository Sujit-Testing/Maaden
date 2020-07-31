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
	String job_family_Name,job_family_Code,UpdatedText =null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageJobFamilies_Correct_JobFamilies_0035.xlsx", true);
		job_family_Name=(String) datatable.getValue("DataSheet", 0, "Job_family_Name");
		info("Job_family_Name is : "+job_family_Name);
		job_family_Code=(String) datatable.getValue("DataSheet", 0, "Job_family_Code");
		info("Job_family_Code is : "+job_family_Code);
		UpdatedText=(String) datatable.getValue("DataSheet", 0, "UpdatedText");
		info("UpdatedText is : "+UpdatedText);
		
		hCM_LogIn_LogOut.run();	
		
		web.link("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.MyClientGroups}}").click();
		web.link("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.WorkforceStructure}}").click();
		web.window("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_window}}").waitForPage(100,true);
		web.element("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_h2_Jobs}}").focus();
		web.element("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_path_svg_outline}}").focus();
		web.link("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_a__FOpt1__FOr1_0__FOSritemN_1}}").dblClick();
		
		web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Job_FamilyName}}").click();
		//web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Job_FamilyName}}").setText(job_family_Name);
		web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Job_FamilyName}}").pressTab();
		web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Job_FamilyCode}}").setText(job_family_Code);
		{
			think(0.015);
		}
		web.button("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Search_Button}}").click();
		
		web.element("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Search_Results}}").dblClick();
		{
			think(2.29);
		}
		
		web.link("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_a__FOpt1__FOr1_0__FOSritemN}}").click();		
		web.element("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Correct}}").click();
//		web.button("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_button__FOpt1__FOr1_0__FOSritemN}}").click();
//		
//		web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_input_text__FOpt1__FOr1_0__FOSritemN}}").click();
//		{
//			think(3.472);
//		}
//
//
//		web.button("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_button__FOpt1__FOr1_0__FOSritemN}}").click();
//		
		web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.UpdatedText}}").click();
		web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.UpdatedText}}").setText(UpdatedText);
		web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.UpdatedText}}").pressTab();
		web.element("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_span_Submit_1}}").click();
		{
			think(2.353);
		}
		web.button("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Yes}}").click();
		{
			think(2.353);
		}
		web.button("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.OK}}").click();
		{
			think(2.353);
		}
		//web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_input_text__FOpt1__FOr1_0__FOSritemN_2}}").click();
		//web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_input_text__FOpt1__FOr1_0__FOSritemN_2}}").clearText();
		//web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_input_text__FOpt1__FOr1_0__FOSritemN_2}}").setText(job_family_Code);
		web.textBox("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.InputCode}}").setText(job_family_Code);
		web.button("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Search}}").click();
		{
			think(3.809);
		}
		web.element("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.SearchResults}}").click();
		{
			think(5.715);
		}
		web.element("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.FamilyName}}").dblClick();
		{
			think(2.019);
		}
		web.element("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.FamilyCode}}").dblClick();

		web.window("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_window}}").capturePage();
		web.button("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.DoneButton}}").click();
		{
			think(1.869);
		}
		web.element("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_svg__FOpt1__UIScmil1u__icon}}").click();
		{
			think(1.961);
		}
		web.link("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.Sign_Out}}").click();
		web.window("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_window}}")	.waitForPage(100,true);
		web.window("{{obj.HCM_ManageJobFamilies_Correct_JobFamilies_0035.web_window}}").close();
		
		
		
		
	}
	
	public void finish() throws Exception {
	}
}
