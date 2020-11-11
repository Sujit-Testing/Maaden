import java.text.SimpleDateFormat;
import java.util.Date;
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
	String url,uid,pwd,employeeNumber= null;
	
	public void initialize() throws Exception {
		browser.launch();
	}		
	
	public void run() throws Exception {
	
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		employeeNumber=(String) datatable.getValue("DataSheet", 0, "EmployeeNumber");	
		
				
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window}}").maximize();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window}}").navigate(url);
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.UID}}").pressTab();
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Sign_In}}").click();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.You have a new home page!}}").focus();
		{
			think(2.147);
		}
		web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Letters and Certificates tab
		if(web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Letters and Certificates}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Letters and Certificates}}").focus();
			{
				think(0.147);
			}
			
		web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Letters and Certificates}}").click();
			{
			think(1.147);
			}
		}
		//Clik on Embassy Certificate link
		web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.No Objection Certificate}}").click();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window_1}}").waitForPage(null);
		
		//Click on Employee Number(Provide EMP Nuber Details)		
		if(web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Employee Number}}").exists(30, TimeUnit.SECONDS)){
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Employee Number}}").click();
		{
			think(0.136);
		}
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.EmployeeNumber_Search}}").click();
		{
			think(2.843);
		}
		//Input the EMP number
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Input_EmployeeNumber}}").setText(employeeNumber);
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.EMP_Search_Button}}").click();
		{
			think(2.376);
		}
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Select_EMP_Search_Result}}").click();
		{
			think(0.204);
		}
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.EMP_Search_OK}}").click();
		}
		
			
		//Clik Apply
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.Apply}}").click();
		{
			think(2.819);
		}
		info("Certficate screenshot attached below.");
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window_1}}").waitForPage(null);
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window_1}}").capturePage();		
		
		web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.NoObjectionCertificate}}").click();		
		
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window_1}}").capturePage();	
			
		
	}
	public void finish() throws Exception {
		//SignOut
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_span_Sign_Out}}").click();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window_1}}").waitForPage(null);
		//Close both wndows
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window_1}}").close();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_NoObjectionCertificate_0110.web_window}}").close();	
	}
}