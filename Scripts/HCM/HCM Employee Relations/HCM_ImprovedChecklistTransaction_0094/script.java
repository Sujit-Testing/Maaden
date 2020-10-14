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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_ImprovedChecklistTransaction_0094.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		searchValue=(String) datatable.getValue("DataSheet", 0, "SearchValue");	
		
		
		web.window("{{obj.HCM_ImprovedChecklistTransaction_0094.web_window}}").maximize();
		web.window("{{obj.HCM_ImprovedChecklistTransaction_0094.web_window}}").navigate(url);
		web.window("{{obj.HCM_ImprovedChecklistTransaction_0094.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ImprovedChecklistTransaction_0094.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ImprovedChecklistTransaction_0094.UID}}").pressTab();
		web.textBox("{{obj.HCM_ImprovedChecklistTransaction_0094.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ImprovedChecklistTransaction_0094.Sign_In}}").click();
		web.window("{{obj.HCM_ImprovedChecklistTransaction_0094.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		//Clk on Tools
		web.link("{{obj.HCM_ImprovedChecklistTransaction_0094.Tools}}").click();
		{
			think(0.544);
		}
		//Click on Transaction Console
		web.link("{{obj.HCM_ImprovedChecklistTransaction_0094.TransactionConsole}}").click();
		web.window("{{obj.HCM_ImprovedChecklistTransaction_0094.web_window}}").waitForPage(null);
		//Clik on Clear from status
		web.link("{{obj.HCM_ImprovedChecklistTransaction_0094.Clear}}").click();
		{
			think(0.523);
		}
		//Click on Search box
		web.textBox("{{obj.HCM_ImprovedChecklistTransaction_0094.SearchBox}}").click();
		//Provide the search box value as Checklist
		web.textBox("{{obj.HCM_ImprovedChecklistTransaction_0094.SearchBox}}").setText(searchValue);
		//Click on enter
		web.textBox("{{obj.HCM_ImprovedChecklistTransaction_0094.SearchBox}}").pressEnter();
		{
			think(2.764);
		}
		web.window("{{obj.HCM_ImprovedChecklistTransaction_0094.web_window}}").capturePage();
		//Select any transaction checkbox
		web.element("{{obj.HCM_ImprovedChecklistTransaction_0094.web_label__FOpt1__FOr1_0__FONSr2_0_}}").click();
		web.window("{{obj.HCM_ImprovedChecklistTransaction_0094.web_window}}").capturePage();
		web.checkBox("{{obj.HCM_ImprovedChecklistTransaction_0094.web_input_checkbox__FOpt1__FOr1_0__FONSr2_0_}}").pressTab();
		web.link("{{obj.HCM_ImprovedChecklistTransaction_0094.web_a__FOpt1__FOr1_0__FONSr2_0__1}}").pressTab();
		web.window("{{obj.HCM_ImprovedChecklistTransaction_0094.web_window}}").capturePage();
		
	}
	public void finish() throws Exception {
		//SignOut

		web.window("{{obj.HCM_ImprovedChecklistTransaction_0094.web_window}}").close();
		
		

	}
}