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
	String effective_Start_Date,createJob_Name,createJob_Code =null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageJobs_CreateJobs_WO_Grades_0036.xlsx", true);
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective_Start_Date is : "+effective_Start_Date);
		createJob_Name=(String) datatable.getValue("DataSheet", 0, "CreateJob_Name");
		info("CreateJob_Name is : "+createJob_Name);
		createJob_Code=(String) datatable.getValue("DataSheet", 0, "CreateJob_Code");
		info("CreateJob_Code is : "+createJob_Code);
		
		hCM_LogIn_LogOut.run();	
		
		web.link("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.MyClientGroups}}").click();
		web.link("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.WorkforceStructure}}").click();
		web.window("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_window}}").waitForPage(100,true);
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_h2_Jobs}}").focus();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_path_svg_outline}}").focus();
		/*
		web.window("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_window}}").capturePage();
		web.button("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.DoneButton}}").click();
		{
			think(1.869);
		}
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_svg__FOpt1__UIScmil1u__icon}}").click();
		{
			think(1.961);
		}
		web.link("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.Sign_Out}}").click();
		web.window("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_window}}")	.waitForPage(100,true);
		web.window("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_window}}").close();
		
		
		*/
		web.link("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_a__FOpt1__FOr1_0__FOSritemN_2}}").click();
		{
			think(0.145);
		}
		web.link("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_a__FOpt1__FOr1_0__FOSritemN_3}}").dblClick();
		{
			think(1.559);
		}
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.Create}}").click();
		{
			think(1.836);
		}
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_input_text__FOpt1__FOr1_0__FOSritemN_1}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_input_text__FOpt1__FOr1_0__FOSritemN_1}}").setText(effective_Start_Date);
//		web.link("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_a__FOpt1__FOr1_0__FOSritemN_4}}").click();
//		{
//			think(2.64);
//		}
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_Common_Set}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.createJob_Name}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.createJob_Name}}").setText(createJob_Name);
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.createJob_Name}}").pressTab();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.createJob_Code}}").setText(createJob_Code);
		
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.Next}}").click();
		{
			think(0.074);
		}
		web.link("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_a__FOpt1__FOr1_0__FOSritemN_5}}").click();
		
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_li_Active}}")	.click();
		
//		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_x}}").click();
//		{
//			think(0.045);
//		}
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.Next}}").click();
		{
			think(1.529);
		}
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.Next}}").click();
		{
			think(1.529);
		}web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.Next}}").click();
		{
			think(3.529);
		}
//		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_Sjit_Job}}").dblClick();
//		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_Sujit_Job}}").dblClick();
//		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.Status}}").dblClick();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_m}}").click();
		{
			think(4.124);
		}
		web.button("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.Yes}}")	.click();
		{
			think(2.374);
		}
		web.button("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.OK}}").click();
		{
			think(2.187);
		}
//		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_input_text__FOpt1__FOr1_0__FOSritemN_5}}").click();
//		{
//			think(1.391);
//		}
//		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_input_text__FOpt1__FOr1_0__FOSritemN_5}}").setText("Suit_Job");
//		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_input_text__FOpt1__FOr1_0__FOSritemN_5}}").click();
		web.textBox("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_input_text__FOpt1__FOr1_0__FOSritemN_5}}").setText(createJob_Code);
		web.button("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.Search}}").click();
		{
			think(3.049);
		}
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_Sjit_Job_1}}").dblClick();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_Sjit_Job_2}}").focus();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_Sujit_Job_1}}").focus();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_Active_1}}").focus();
		{
			think(0.029);
		}
		web.window("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_span_Done}}").click();
		web.window("{{obj.HCM_ManageJobs_CreateJobs_WO_Grades_0036.web_window}}").close();
		
	}
	
	public void finish() throws Exception {
	}
}
