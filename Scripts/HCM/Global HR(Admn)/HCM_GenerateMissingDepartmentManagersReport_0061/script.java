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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_GenerateMissingDepartmentManagersReport_0061.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		//LogIn the application
		web.window("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.web_window}}").maximize();
		web.window("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.web_window}}").navigate(url);
		web.window("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.web_window}}").waitForPage(50,true);
		web.textBox("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.UID}}").setText(uid);
		web.textBox("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.UID}}").pressTab();
		web.textBox("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.Sign_In}}").click();
		web.window("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.web_window}}").waitForPage(50,true);
		//Click on RepoOD Report->MissingDepartmentManagersReport
		web.link("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.OD_Report}}").click();				
		web.link("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.MissingDepartmentManagersReport}}").click();
		web.window("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.web_window_1_3}}").waitForPage(150,true);
		//Validate the report
		web.element("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.BusinessUnit}}").focus();
		web.element("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.Function}}").focus();
		web.element("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.Organization}}").focus();
		web.element("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.Department}}").focus();
		info("Department Name is : "+web.element("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.Department}}").getDisplayText());
		web.element("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.Section}}").focus();
		web.window("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.web_window_1_3}}").capturePage();
		
		
	}
	public void finish() throws Exception {
		web.window("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.web_window_1_3}}").close();
		web.window("{{obj.HCM_GenerateMissingDepartmentManagersReport_0061.web_window}}").close();
	}
}









