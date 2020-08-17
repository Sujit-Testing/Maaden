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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_GenerateOrganizationHierarchyReport_0058.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window}}").maximize();
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window}}").navigate(url);
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window}}").waitForPage(50,true);
		web.textBox("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.UID}}").setText(uid);
		web.textBox("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.UID}}").pressTab();
		web.textBox("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Sign_In}}").click();
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window}}").waitForPage(50,true);
		
		web.link("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.OD_Reports}}").click();
		{
			think(0.408);
		}
		web.link("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.OrganizationHierarchyReport}}").click();
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window_1}}").waitForPage(null);
		{
			think(46.454);
		}
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Division}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.BusinessUnit}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Function}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Organization}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Department}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_p_21}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.LeastLevelDepartment}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_p_30}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_p_31}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_span_0}}").focus();
		{
			think(3.833);
		}
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window}}").capturePage();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_span__}}").click();
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window_1}}").waitForPage(null);
		{
			think(1.069);
		}
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_div_Ma_aden_Bauxite_and_Alumi}}").click();
//		web.window(78,"{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window_1}}").waitForPage(null);
//		{
//			think(66.873);
//		}
		web.button("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_button_reportViewApply}}").click();
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window_1}}").waitForPage(null);
		{
			think(50.511);
		}
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Division}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.BusinessUnit}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Function}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Organization}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.Department}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_p_21}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.LeastLevelDepartment}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_p_30}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_p_31}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_span_0}}").focus();
		web.element("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_span_Sign_Out}}").click();
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window_1}}").waitForPage(null);
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window}}").capturePage();
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window_1}}").close();
		web.window("{{obj.HCM_GenerateOrganizationHierarchyReport_0058.web_window}}").close();
		
			
	}
	
	public void finish() throws Exception {
	}
}
