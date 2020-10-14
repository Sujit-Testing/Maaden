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
	String url,uid,pwd,name,personal_Number,start_Date = null;
	String title =  "Contact Info - - Oracle Applications";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		name=(String) datatable.getValue("DataSheet", 0, "Name");	
		personal_Number=(String) datatable.getValue("DataSheet", 0, "Personal_Number");
		start_Date=(String) datatable.getValue("DataSheet", 0, "Start_Date");
		
		
		web.window("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_window}}").maximize();
		web.window("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_window}}").navigate(url);
		web.window("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.UID}}").pressTab();
		web.textBox("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.Sign_In}}").click();
		web.window("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}

		//Clik on My Client Group
		if(web.link("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.My_Client_Groups}}").exists(120, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.My_Client_Groups}}").click();
		}
		//Add_a_Contingent_Worker
		web.link("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_a_Add_a_Contingent_Worker}}").click();
		web.window("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_window}}").waitForPage(150, true);
		//Click continue
		web.element("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_span_Continue}}").click();
		{
			think(1.975);
		}
		//Check the lebel->  What's the way to add a contingent worker?
		web.element("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_label_af_panelLabelAndMessage_l}}").focus();
		web.window("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_window}}").capturePage();
		//Check the lebel->  Why are you adding a contingent worker?
		web.element("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_label_af_panelLabelAndMessage_l_1}}").focus();
		web.window("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_window}}").capturePage();
		
		
		
	}
	public void finish() throws Exception {
		//SignOut

		web.window("{{obj.HCM_ActionLabelChanged_EmploymentFlows_Contingent_Worker_0089.web_window}}").close();
		
		

	}
}