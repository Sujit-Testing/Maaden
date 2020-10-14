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
	String url,uid,pwd,searchValue = null;
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_RouteEmploymentApprovals_0095.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		searchValue=(String) datatable.getValue("DataSheet", 0, "SearchValue");	
		
		
		web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").maximize();
		web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").navigate(url);
		web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_RouteEmploymentApprovals_0095.UID}}").setText(uid);
		web.textBox("{{obj.HCM_RouteEmploymentApprovals_0095.UID}}").pressTab();
		web.textBox("{{obj.HCM_RouteEmploymentApprovals_0095.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_RouteEmploymentApprovals_0095.Sign_In}}").click();
		web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").waitForPage(150, true);
		
		//Clk on Tools
		web.link("{{obj.HCM_RouteEmploymentApprovals_0095.Tools}}").click();
		{
			think(1.544);
		}
		//Click on Transaction Console
		web.link("{{obj.HCM_RouteEmploymentApprovals_0095.TransactionConsole}}").click();
		web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").waitForPage(null);
		web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").capturePage();
		String title = web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").getTitle();
		info(title);
		//Click on Approval Rules option
		web.element("{{obj.HCM_RouteEmploymentApprovals_0095.ApprovalRules}}").click();
		{
			think(2.544);
		}
		//Clik on find text box
		if(web.textBox("{{obj.HCM_RouteEmploymentApprovals_0095.find}}").exists(50, TimeUnit.SECONDS)){
		web.textBox("{{obj.HCM_RouteEmploymentApprovals_0095.find}}").click();
		web.textBox("{{obj.HCM_RouteEmploymentApprovals_0095.find}}").setText(searchValue);
		web.textBox("{{obj.HCM_RouteEmploymentApprovals_0095.find}}").pressEnter();
		}
		{
			think(3.81);
		}
		//Clik on the pencile icon of the search results
		web.image("{{obj.HCM_RouteEmploymentApprovals_0095.Pencile_Icon}}").click();
		{
			think(5.564);
		}
		//Clk on Managment Hirechey Box
		web.element("{{obj.HCM_RouteEmploymentApprovals_0095.Managment Hirechey}}").click();
		{
			think(1.237);
		}

		//Check if "Use primary assignment hierarchy" is availabe or not
		web.element("{{obj.HCM_RouteEmploymentApprovals_0095.Use primary assignment hierarchy}}").focus();
		web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").capturePage();
		//Check if "Use current assignment hierarchy" is availabe or not
		web.element("{{obj.HCM_RouteEmploymentApprovals_0095.Use current assignment hierarchy}}").focus();
		web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").capturePage();
		{
			think(1.081);
		}

		//Clik on Cancel Button
		web.link(824, "{{obj.HCM_RouteEmploymentApprovals_0095.web_a_Cancel}}").click();
		{
			think(1.377);
		}
		web.button("{{obj.HCM_RouteEmploymentApprovals_0095.Warning_Yes}}").click();
		
	}
	public void finish() throws Exception {
		//SignOut

		web.window("{{obj.HCM_RouteEmploymentApprovals_0095.web_window}}").close();
		
		

	}
}