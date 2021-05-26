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
	String url,uid,pwd,date,firstName,familyName,middleName,grandFatherName,contractChangeStartDate,contractEndDate;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_Delete_ServiceContractExtension_0228.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Delete_ServiceContractExtension_0228.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		
		
		web.link(268, "{{obj.HCM_Delete_ServiceContractExtension_0228.My_Team}}").click();
		{
			think(2.452);
		}
		web.link("{{obj.HCM_Delete_ServiceContractExtension_0228.Employment_Contracts}}").click();
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").waitForPage(null);
		{
			think(2.007);
		}
		//Click on any reportee
		web.link("{{obj.HCM_Delete_ServiceContractExtension_0228.Select_DirectReport_Name}}").click();
		{
			think(2.718);
		}
		info("Before adding the Contract Extensions, below is the  screen shot.");
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").capturePage();
		//Click on Edit
		web.image("{{obj.HCM_Delete_ServiceContractExtension_0228.web_img_Edit}}").click();
		{
			think(1.372);
		}
//		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.ContractChangeStartDate}}").click();
//		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.ContractChangeStartDate}}").setText(contractChangeStartDate);
//		{
//			think(1.537);
//		}
//		web.element("{{obj.HCM_Delete_ServiceContractExtension_0228.web_html_1_1}}").click();
//		{
//			think(1.105);
//		}
//		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.Contract_EndDate}}").click();
//		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.Contract_EndDate}}").setText(contractEndDate);

		
		
//		//web.element("{{obj.HCM_Delete_ServiceContractExtension_0228.Add}}").click();
//		{
//			think(1.506);
//		}
//		web.link(275, "{{obj.HCM_Delete_ServiceContractExtension_0228.web_a_26}}").click();
//		{
//			think(1.026);
//		}
//		//Select contract extension
//		web.element("{{obj.HCM_Delete_ServiceContractExtension_0228.Contract_Extension}}").click();
//		{
//			think(1.32);
//		}
//		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.ContractNumber}}").click();
//		{
//			think(1.359);
//		}
//		web.link(279, "{{obj.HCM_Delete_ServiceContractExtension_0228.web_a_27}}").click();
//		{
//			think(1.486);
//		}
//		web.element("{{obj.HCM_Delete_ServiceContractExtension_0228.UnspecifiedContract}}").click();
//		{
//			think(1.506);
//		}
//		web.element("{{obj.HCM_Delete_ServiceContractExtension_0228.web_div_19_Aug_2012}}").click();
//		{
//			think(1.908);
//		}
//		//Provide the end date
//		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.Contract End Date}}").click();
//		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.Contract End Date}}").setText(contractEndDate);
//		{
//			think(1.451);
//		}
//		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.Employment Status}}").click();
//		{
//			think(2.854);
//		}
		web.element("{{obj.HCM_Delete_ServiceContractExtension_0228.Delete}}").click();
		{
			think(3.538);
		}
		web.link(289, "{{obj.HCM_Delete_ServiceContractExtension_0228.Submit}}").click();
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").waitForPage(null);
		{
			think(2.54);
		}
		web.link("{{obj.HCM_Delete_ServiceContractExtension_0228.web_a_Employment_Contracts_1}}").click();
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").waitForPage(null);
		{
			think(1.827);
		}
		web.link("{{obj.HCM_Delete_ServiceContractExtension_0228.web_a_Abdulrahman_Saad_Ali_AlSa_1}}").click();
		{
			think(3.775);
		}
		//web.element("{{obj.HCM_Delete_ServiceContractExtension_0228.ValidateContractEndDate}}").focus();
		info("After adding the Contract Extensions, below is the validation screen shot.");
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").capturePage();
		
				
//	
//		web.element(309,
//				"{{obj.HCM_Delete_ServiceContractExtension_0228.web_span_OK}}")
//				.click();
//		{
//			think(2.752);
//		}
//		web.element(310,
//				"{{obj.HCM_Delete_ServiceContractExtension_0228.web_div_19_Aug_2012_1}}")
//				.click();
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Manager Self Service\\HCM_Delete_ServiceContractExtension_0228.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
				
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");			
		
		contractChangeStartDate=(String) datatable.getValue("DataSheet", 0, "ContractChangeStartDate");
		contractEndDate =(String) datatable.getValue("DataSheet", 0, "ContractEndDate");
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").navigate(url);
		{
			think(5.0);
		}
		System.out.println("URL is ->"+url);
		
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").maximize();
		//web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").navigate(url);
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.UID}}").pressTab();
		web.textBox("{{obj.HCM_Delete_ServiceContractExtension_0228.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Delete_ServiceContractExtension_0228.Sign_In}}").click();
		web.window("{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").waitForPage(50, true);
		
	}
		
	

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_Delete_ServiceContractExtension_0228.web_window}}").close();		

	}
}