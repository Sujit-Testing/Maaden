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
	String url,uid,pwd,edit_Proposed_Contract_End_Date = null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Me Tab
		web.link("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.Me_Tab}}").click();
		{
			think(1.4);
		}
		//Click on Document Record link
		web.link("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.Document_Records}}").click();
		web.window("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").waitForPage(null);
		{
			think(2.561);
		}
		
		//Click on View_More_Details and check the added required details correct or not
		if(web.image("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.View_More_Details}}").isDisplayed()){
			web.image("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.View_More_Details}}").click();
			{
				think(2.615);
			}
		}else info("Extension to employee's retirement is not added correctily, Please add first before validate it.");
		
		web.element("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.ProposedContractEndDate_Focus}}").focus();
		{
			think(2.04);
		}
		//Capture the page for validation
		info("Before Edit -> Below captured the sreen shot of Proposed Contract End Date");
		web.window("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").capturePage();
		
		
		//Click on Edit and provide the ProposedContractEndDate
		web.element("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_span_Edit}}").click();
		{
			think(0.529);
		}
		web.textBox("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.ProposedContractEndDate}}").click();
		{
			think(0.97);
		}
		web.textBox("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.ProposedContractEndDate}}").setText(edit_Proposed_Contract_End_Date);
		{
			think(1.76);
		}

		web.link("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_a_Save}}").click();
		{
			think(1.76);
		}
		//Capture the page for validation
		info("After Edit -> Below captured the sreen shot of Proposed Contract End Date");
		web.element("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.ProposedContractEndDate_Focus}}").focus();
		web.window("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").capturePage();
		
//		web.element("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.Back_Button_1}}").click();
//		{
//			think(2.766);
//		}
//		web.element("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.Back_Button_2}}").click();
//		web.window("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").waitForPage(null);
				
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");			

		edit_Proposed_Contract_End_Date=(String) datatable.getValue("DataSheet", 0, "Edit_Proposed_Contract_End_Date");	
		
		
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").navigate(url);
		web.window("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").maximize();
		web.window("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.UID}}").pressTab();
		web.textBox("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.Sign_In}}").click();
		web.window("{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").waitForPage(150, true);
		
	}	
	
	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Edit_ContractExtensionforRetirementEmployees_Above_60Yrs_0195.web_window}}").close();		

	}
}