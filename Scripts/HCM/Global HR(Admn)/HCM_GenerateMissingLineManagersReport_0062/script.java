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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_GenerateMissingLineManagersReport_0062.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		//LogIn the application
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window}}").maximize();
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window}}").navigate(url);
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window}}").waitForPage(50,true);
		web.textBox("{{obj.HCM_GenerateMissingLineManagersReport_0062.UID}}").setText(uid);
		web.textBox("{{obj.HCM_GenerateMissingLineManagersReport_0062.UID}}").pressTab();
		web.textBox("{{obj.HCM_GenerateMissingLineManagersReport_0062.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_GenerateMissingLineManagersReport_0062.Sign_In}}").click();
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window}}").waitForPage(50,true);
		//Click on RepoOD Report->MissingDepartmentManagersReport
		web.link("{{obj.HCM_GenerateMissingLineManagersReport_0062.OD_Report}}").click();		
		web.link("{{obj.HCM_GenerateMissingLineManagersReport_0062.MissingLineManagersReport}}").click();
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window_1}}").waitForPage(null);
		{
			think(61.249);
		}
		
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.PersonNumber}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.EmployeeName}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.HireDate}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.BusinessUnit}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.PositionCode}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.PositionName}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.Job}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.Department}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.Location}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.Grade}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.ParentPosition}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.ParentPositionIncumbent}}").focus();
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window_1}}").capturePage();

		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.DropDown}}").click();
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window_1}}").waitForPage(null);
		{
			think(4.307);
		}
		web.checkBox("{{obj.HCM_GenerateMissingLineManagersReport_0062.Uncheck_All_Option}}").check(false);
		{
			think(0.548);
		}
		web.checkBox("{{obj.HCM_GenerateMissingLineManagersReport_0062.Selected_oneValue}}").check(true);
		{
			think(3.692);
		}
		web.button("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_button_reportViewApply}}").dblClick();
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window_1}}").waitForPage(null);
		web.image("{{obj.HCM_GenerateMissingLineManagersReport_0062.Refresh}}").click();

		{
			think(13.825);
		}
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.PersonNumber}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.EmployeeName}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.HireDate}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.BusinessUnit}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.PositionCode}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.PositionName}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.Job}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.Department}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.Location}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.Grade}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.ParentPosition}}").focus();
		web.element("{{obj.HCM_GenerateMissingLineManagersReport_0062.ParentPositionIncumbent}}").focus();
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window_1}}").capturePage();
		
		
	}
	public void finish() throws Exception {
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window_1}}").close();
		web.window("{{obj.HCM_GenerateMissingLineManagersReport_0062.web_window}}").close();
	}
}









