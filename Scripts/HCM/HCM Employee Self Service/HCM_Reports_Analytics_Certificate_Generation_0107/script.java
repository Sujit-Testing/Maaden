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
	String url,uid,pwd,employeeNumber,country_Of_Travel= null;
	
	public void initialize() throws Exception {
		browser.launch();
	}		
	
	public void run() throws Exception {
	
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Reports_Analytics_Certificate_Generation_0107.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		employeeNumber=(String) datatable.getValue("DataSheet", 0, "EmployeeNumber");	
		country_Of_Travel=(String) datatable.getValue("DataSheet", 0, "Country_Of_Travel");	
				
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window}}").maximize();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window}}").navigate(url);
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.UID}}").pressTab();
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Sign_In}}").click();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Letters and Certificates tab
		if(web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Letters and Certificates}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Letters and Certificates}}").focus();
			{
				think(0.147);
			}
			
		web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Letters and Certificates}}").click();
			{
			think(1.147);
			}
		}
		//Clik on Embassy Certificate link
		web.link("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107. Embassy Certificate}}").click();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window_1}}").waitForPage(null);
		
		//Click on Employee Number(Provide EMP Nuber Details)		
		if(web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Employee Number}}").exists(30, TimeUnit.SECONDS)){
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Employee Number}}").click();
		{
			think(0.136);
		}
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.EmployeeNumber_Search}}").click();
		{
			think(2.843);
		}
		//Input the EMP number
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Input_EmployeeNumber}}").setText(employeeNumber);
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Input_EMP_Search}}").click();
		{
			think(2.376);
		}
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Select_EMP_AfterSearch}}").click();
		{
			think(0.204);
		}
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.EMP_Search_OK}}").click();
		}
		
		//Provide Country of travel details
		{
			think(1.753);
		}

		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_span___1}}").click();
		{
			think(1.078);
		}
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_span_Search_____1}}").click();	
		{
			think(2.383);
		}
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.input_text_Country_Of_Travel}}").setText(country_Of_Travel);
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Country_of_travel_Search}}").click();
		{
			think(2.54);
		}
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Select_SearchResult}}").click();
		{
			think(0.633);
		}
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.OK_Button}}").click();
		{
			think(1.493);
		}
		//Provide Include Salary details
		web.textBox("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.IncludeSalary}}").click();
		{
			think(0.374);
		}
		//Select additional_salary
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_div_With_additional_salary_de}}").click();
		{
			think(2.324);
		}
		//Clk Apply
		web.button("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.Apply}}").click();
		{
			think(5.819);
		}
		info("Certficate screenshot attached below.");
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window_1}}").waitForPage(null);
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window}}").capturePage();
		
				
		
	}
	public void finish() throws Exception {
		//SignOut
		web.element("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_span_Sign_Out}}").click();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window_1}}").waitForPage(null);
		//Close both wndows
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window_1}}").close();
		web.window("{{obj.HCM_Reports_Analytics_Certificate_Generation_0107.web_window}}").close();	
	}
}