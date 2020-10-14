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
	String url,uid,pwd = null;
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_ConfigureChecklist_TaskDisplayProperties_0092.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
		
		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").maximize();
		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").navigate(url);
		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.UID}}").pressTab();
		web.textBox("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.Sign_In}}").click();
		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}

		//Clik on My Client Group
		if(web.link("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.My_Client_Groups}}").exists(120, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.My_Client_Groups}}").click();
		}
		
		
		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").capturePage();
		//Click Show More
		web.link("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_a_showmore_groupNode_workfo}}").click();
		{
			think(0.608);
		}
		
		//Checklist Templates
		web.link("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_a_Checklist_Templates}}").click();
		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").waitForPage(120,true);
		//Click on any Checklist
		web.element("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_span_Maaden_Resignation_Checkl}}").focus();
		{
			think(3.0);
		}
		if(web.element("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_span_Maaden_Resignation_Checkl}}").exists(30, TimeUnit.SECONDS)){
		web.element("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_span_Maaden_Resignation_Checkl}}").click();
		web.element("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_span_Maaden_Resignation_Checkl}}").dblClick();
		{
			think(3.862);
		}
		}
		//Click on Task tab
		web.link("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.Tasks}}").click();
		{
			think(2.866);
		}
		//Click on any task -> Exit Clearance for Company...
		if(web.element("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_span_Exit_Clearance_for_Compan}}").exists(30, TimeUnit.SECONDS)){
		web.element("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_span_Exit_Clearance_for_Compan}}").click();
		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").capturePage();
		{
			think(3.075);
		}
		}
		//Sequence fiels should be displayed
		web.element("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.Sequence}}").focus();
		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").capturePage();
		//Display Properties should be display
		web.link("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.DisplayProperties}}").focus();		
		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").capturePage();
		
	}
	public void finish() throws Exception {
		//SignOut

		web.window("{{obj.HCM_ConfigureChecklist_TaskDisplayProperties_0092.web_window}}").close();
		
		

	}
}