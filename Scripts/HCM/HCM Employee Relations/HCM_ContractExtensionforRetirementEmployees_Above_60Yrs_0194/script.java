import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;
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
	String url,uid,pwd,current_Retirement_Date,proposed_Contract_End_Date,justification = null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Me Tab
		web.link("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Me_Tab}}").click();
		{
			think(1.4);
		}
		//Click on Document Record link
		web.link("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Document_Records}}").click();
		web.window("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_window}}").waitForPage(null);
		{
			think(2.561);
		}
		//Click on Add Button
		web.element("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Add_Button}}").dblClick();
		//web.element("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_svg_true}}").click();
		{
			think(2.042);
		}
		//Click on Document Type and select Retirement Extension
		web.link("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Document Type}}").click();
		{
			think(2.203);
		}
		web.element("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Select_Retirement_Extension}}").click();
		{
			think(1.738);
		}

		//Provide Current Retirement Date, Proposed Contract End Date,Justification
		web.textBox("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Current Retirement Date}}").click();
		web.textBox("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Current Retirement Date}}").setText(current_Retirement_Date);
		{
			think(0.27);
		}
		web.textBox("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Proposed Contract End Date}}").click();
		web.textBox("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Proposed Contract End Date}}").setText(proposed_Contract_End_Date);
		{
			think(0.127);
		}
		web.textBox("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Justification}}").click();
		web.textBox("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Justification}}").setText(justification);
		{
			think(0.508);
		}
//		web.element("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_html_1}}").click();
//		{
//			think(1.034);
//		}
		//Click on Sublit Button
		web.element("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Submit_Button}}").click();
		{
			think(4.388);
		}
		//Click on View_More_Details and check the added required details correct or not
		if(web.image("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.View_More_Details}}").isDisplayed()){
			web.image("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.View_More_Details}}").click();
			{
				think(2.615);
			}
		}else info("Extension to employee's retirement is not added correctily, Please add first before validate it.");
		
		web.element("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.ProposedContractEndDate_Focus}}").focus();
		{
			think(2.04);
		}
		//Capture the page for validation
		info("Below captured the sreen shot of Proposed Contract End Date");
		web.window("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_window}}").capturePage();
		web.element("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Back_Button_1}}").click();
		{
			think(2.766);
		}
		web.element("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Back_Button_2}}").click();
		web.window("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_window}}").waitForPage(null);
				
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");			
		current_Retirement_Date=(String) datatable.getValue("DataSheet", 0, "Current_Retirement_Date");	
		proposed_Contract_End_Date=(String) datatable.getValue("DataSheet", 0, "Proposed_Contract_End_Date");	
		justification=(String) datatable.getValue("DataSheet", 0, "Justification");
		
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_window}}").navigate(url);
		web.window("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_window}}").maximize();
		web.window("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.UID}}").pressTab();
		web.textBox("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.Sign_In}}").click();
		web.window("{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_window}}").waitForPage(150, true);
		
	}	
	
	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_ContractExtensionforRetirementEmployees_Above_60Yrs_0194.web_window}}").close();		

	}
}