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
	String url,uid,pwd,date,firstName,emergencyContact_FirstName,familyName,emergencyContact_FamilyName,middleName,grandFatherName,comments,effective_Start_Date,
	legalEmployer_SerchInput,legislationCode,airTicketEligibility,justification,contractEndDate;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		web.link(268, "{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.My_Team}}").click();
		{
			think(0.452);
		}
		
		web.link("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.My_Team_Image}}").click();
		web.window("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").waitForPage(30,true);
		{
			think(2.126);
		}
		if(web.link("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Select_Employee}}").exists(15, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Select_Employee}}").click();
		{
			think(2.126);
		} 
		}
		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.ShowMore}}").click();
		{
			think(1.97);
		}
		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.DocumentRecords}}").click();


		//Click on Add
		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Add}}").dblClick();
		{
			think(1.506);
		}
		
		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Document Type}}").click();
		{
			think(1.638);
		}
		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Retirement Extension}}").click();
		{
			think(1.664);
		}
		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Justification}}").click();
		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Justification}}").setText(justification);
		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Justification}}").pressTab();
		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Current Retirement Date}}").click();
		{
			think(1.541);
		}
		web.link("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Date}}").click();
		{
			think(1.484);
		}
		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Select_CurrentRetirementDate}}").click();
		{
			think(2.094);
		}
		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Proposed Contract End Date}}").setText(contractEndDate);
		{
			think(0.589);
		}
		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Submt}}").click();
		{
			think(3.441);
		}
		//Click Glass image
		web.image("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_img_View_More_Details}}").click();
		{
			think(0.589);
		}
		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Validation_CurrentDate}}").focus();
		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Validation_ProposeDate}}").focus();
		{
			think(0.589);
		}
		
		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_span_Retirement_Extension}}").focus();
		
		
		info("After Contract Extensions, below is the validation screen shot available.");
		web.window("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").capturePage();
		
//		//Edit the extension
//		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Edit}}").click();
//		{
//			think(2.252);
//		}
//		
//		web.link("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_a_35}}").click();
//		{
//			think(2.283);
//		}
//		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_td_16_Sep_2048}}").click();
//		{
//			think(13.102);
//		}
////		
////		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Edit_CurrentRetirementDate}}").click();
////		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Edit_CurrentRetirementDate}}").setText("16-Sep-2048");
////		{
////			think(1.814);
////		}
//		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Edit_ProposedContractEndDate}}").click();
//		{
//			think(1.812);
//		}
//		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Edit_ProposedContractEndDate}}").setText(contractEndDate);
//		{
//			think(0.292);
//		}
//		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_html_1_2}}").click();
//		{
//			think(2.664);
//		}
//		web.link("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Save}}").click();
//		{
//			think(1.022);
//		}
//		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Validation_CurrentDate}}").focus();
//		{
//			think(0.589);
//		}
//		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Validation_ProposeDate}}").focus();
//		{
//			think(0.589);
//		}
//		
//		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_span_Retirement_Extension}}").focus();
//		info("After Edit, below screenshot attached for the confirmation.");
//		web.window(640, "{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").capturePage();
//		
//		web.element("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Delete}}").click();
//		{
//			think(2.429);
//		}
//		web.link("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_a_OK}}").click();
//		info("After Delete, extension details will be not available...");
//		web.window(640, "{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").capturePage();
//		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Manager Self Service\\HCM_ContractExtension_RetirementEmployees_60 yrs_0229.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
				
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");	
		contractEndDate =(String) datatable.getValue("DataSheet", 0, "ContractEndDate");
		justification=(String) datatable.getValue("DataSheet", 0, "Justification");		
	}
	public void validation(){
		
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").navigate(url);
		{
			think(5.0);
		}
		System.out.println("URL is ->"+url);
		
		web.window("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").maximize();
		//web.window("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").navigate(url);
		web.window("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.UID}}").pressTab();
		web.textBox("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.Sign_In}}").click();
		web.window("{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").waitForPage(50, true);
		{
			think(3.0);
		}
	}
		
	

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_ContractExtension_RetirementEmployees_60 yrs_0229.web_window}}").close();		

	}
}