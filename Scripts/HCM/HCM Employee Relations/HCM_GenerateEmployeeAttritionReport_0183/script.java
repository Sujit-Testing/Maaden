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
	String url,uid,pwd,businessUnit_Input_Search,dept_Input_Search = null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_GenerateEmployeeAttritionReport_0183.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_GenerateEmployeeAttritionReport_0183.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on ER Reports Tab
		if(web.link("{{obj.HCM_GenerateEmployeeAttritionReport_0183.ER Reports}}")
				.exists(30, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_GenerateEmployeeAttritionReport_0183.ER Reports}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_GenerateEmployeeAttritionReport_0183.ER Reports}}").click();
			{
				think(3.147);
			}
		}	
		//Click on TimeAttendanceReport
		web.link("{{obj.HCM_GenerateEmployeeAttritionReport_0183.Employee Attrition Report}}").click();	
		{
			think(3.096);
		}
		web.window("{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window_1}}").waitForPage(150, true);
		
		web.button("{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_button_reportViewApply}}").click();
		{
			think(15.252);
		}
		web.window(165, "{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window_1}}").capturePage();
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_GenerateEmployeeAttritionReport_0183.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");			
		businessUnit_Input_Search=(String) datatable.getValue("DataSheet", 0, "BusinessUnit_Input_Search");	
		dept_Input_Search=(String) datatable.getValue("DataSheet", 0, "Dept_Input_Search");	
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window}}").navigate(url);
		web.window("{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window}}").maximize();
		web.window("{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_GenerateEmployeeAttritionReport_0183.UID}}").setText(uid);
		web.textBox("{{obj.HCM_GenerateEmployeeAttritionReport_0183.UID}}").pressTab();
		web.textBox("{{obj.HCM_GenerateEmployeeAttritionReport_0183.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_GenerateEmployeeAttritionReport_0183.Sign_In}}").click();
		web.window("{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window}}").waitForPage(150, true);
		
	}
	
	
	public void finish() throws Exception {
		//SignOut
		info(web.window(165, "{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window_1}}").getTitle());
		web.window(165, "{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window_1}}").close();
		{
			think(0.771);
		}
		web.window(640, "{{obj.HCM_GenerateEmployeeAttritionReport_0183.web_window}}").close();		

	}
}