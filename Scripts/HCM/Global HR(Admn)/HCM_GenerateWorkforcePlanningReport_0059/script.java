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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_GenerateWorkforcePlanningReport_0059.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window}}").maximize();
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window}}").navigate(url);
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window}}").waitForPage(50,true);
		web.textBox("{{obj.HCM_GenerateWorkforcePlanningReport_0059.UID}}").setText(uid);
		web.textBox("{{obj.HCM_GenerateWorkforcePlanningReport_0059.UID}}").pressTab();
		web.textBox("{{obj.HCM_GenerateWorkforcePlanningReport_0059.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_GenerateWorkforcePlanningReport_0059.Sign_In}}").click();
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window}}").waitForPage(50,true);
		
		web.link("{{obj.HCM_GenerateWorkforcePlanningReport_0059.OD_Reports}}").click();
		{
			think(0.408);
		}		
		//web.link("{{obj.HCM_GenerateWorkforcePlanningReport_0059.WorkforcePlanningReport}}").click();
//		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window}}").waitForPage(50,true);
//		{
//			think(50.511);
//		}
//		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window}}").capturePage();
//		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window}}").close();
		//web.link(109,"{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_a_c_9d354f351278467297b8adc}}").click();
		web.link("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_a_c_9d354f351278467297b8adc_2}}").click();
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window_1_2}}").waitForPage(null);
		{
			think(139.683);
		}
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window_1_2}}").capturePage();
		web.element("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_span__}}").click();
		{
			think(2.553);
		}
		web.element("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_div_Ma_aden_Bauxite_and_Alumi}}").click();
		{
			think(2.018);
		}
		web.button("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_button_reportViewApply}}").click();
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window_1_2}}").waitForPage(null);
		{
			think(135.58);
		}
		
		web.element("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_span_Ma_aden_Bauxite_and_Alumi}}").focus();
		web.element("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_span_Ma_aden_Bauxite_and_Alumi_1}}").focus();
		web.element("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_span_Ma_aden_Bauxite_and_Alumi_2}}").focus();
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window_1_2}}").capturePage();
		{
			think(4.606);
		}
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window_1_2}}").close();
		web.window("{{obj.HCM_GenerateWorkforcePlanningReport_0059.web_window}}").close();
		
		
		
	}
	public void finish() throws Exception {
	}
}









