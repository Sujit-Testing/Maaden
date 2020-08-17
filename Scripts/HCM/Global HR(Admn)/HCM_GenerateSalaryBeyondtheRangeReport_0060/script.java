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
	String url,uid,pwd = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_GenerateSalaryBeyondtheRangeReport_0060.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window}}").maximize();
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window}}").navigate(url);
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window}}").waitForPage(50,true);
		web.textBox("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.UID}}").setText(uid);
		web.textBox("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.UID}}").pressTab();
		web.textBox("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Sign_In}}").click();
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window}}").waitForPage(50,true);
		
//		web.link("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.OD_Reports}}").click();
//		{
//			think(0.408);
//		}
		web.link("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.OD_Report}}").click();
		web.link("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.SalaryBeyondtheRangeReport}}")	.click();
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window_1_2}}").waitForPage(null);
		{
			think(14.877);
		}
		web.image("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Refresh}}").click();
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window_1_2}}").waitForPage(null);
		{
			think(31.609);
		}
		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.BusinessUnit}}").focus();
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.PersonNumber}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.EmployeeName}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.PositionCode}}").focus();	
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.PositionName}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.JobName}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Department}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Location}}")	.focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Grade}}").focus();
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window_1_2}}").capturePage();

		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.SalaryRange}}").focus();
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Salary Amount_Monthly}}").focus();
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window_1_2}}").capturePage();
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.BusinessUnit_DropDown}}").click();
		{
			think(1.013);
		}

		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Ma_aden_Bauxite_and_AluminaCompany}}").click();
		{
			think(0.185);
		}
		
		web.button("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Apply}}").click();
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window_1_2}}").waitForPage(null);
	
		{
			think(31.609);
		}
		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.BusinessUnit}}").focus();
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.PersonNumber}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.EmployeeName}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.PositionCode}}").focus();	
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.PositionName}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.JobName}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Department}}").focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Location}}")	.focus();		
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Grade}}").focus();
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window_1_2}}").capturePage();

		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.SalaryRange}}").focus();
		web.element("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.Salary Amount_Monthly}}").focus();
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window_1_2}}").capturePage();
		
		
	}
	public void finish() throws Exception {
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window_1_2}}").close();
		{
			think(5.0);
		}
		web.window("{{obj.HCM_GenerateSalaryBeyondtheRangeReport_0060.web_window}}").close();
	}
}









