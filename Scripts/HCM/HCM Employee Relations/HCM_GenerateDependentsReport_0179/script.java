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
		web.link("{{obj.HCM_GenerateDependentsReport_0179.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_GenerateDependentsReport_0179.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_GenerateDependentsReport_0179.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on ER Reports Tab
		if(web.link("{{obj.HCM_GenerateDependentsReport_0179.ER Reports}}")
				.exists(30, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_GenerateDependentsReport_0179.ER Reports}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_GenerateDependentsReport_0179.ER Reports}}").click();
			{
				think(3.147);
			}
		}	
		//Click on Employment Certificate
		web.link("{{obj.HCM_GenerateDependentsReport_0179.web_a_Dependents_Report}}").click();
		web.window("{{obj.HCM_GenerateDependentsReport_0179.web_window_1}}").waitForPage(150, true);
		//Search Business Unit
		web.textBox("{{obj.HCM_GenerateDependentsReport_0179.Business_Unit}}").click();
		{
			think(1.09);
		}
		web.element("{{obj.HCM_GenerateDependentsReport_0179.Business_Unit_Search_Button}}").click();
		{
			think(1.818);
		}
		web.image("{{obj.HCM_GenerateDependentsReport_0179.web_img_Remove_All}}").click();
		{
			think(0.833);
		}
		web.textBox("{{obj.HCM_GenerateDependentsReport_0179.BusinessUnit_Input_Search}}").click();
		web.textBox("{{obj.HCM_GenerateDependentsReport_0179.BusinessUnit_Input_Search}}").setText(businessUnit_Input_Search);
		{
			think(0.736);
		}
		web.button("{{obj.HCM_GenerateDependentsReport_0179.BusinessUnit_Input_searchDialog_button}}").click();
		{
			think(1.83);
		}
		web.element("{{obj.HCM_GenerateDependentsReport_0179.web_div_Saudi_Arabian_Mining_Comp_1}}").click();
		{
			think(1.976);
		}

		web.image("{{obj.HCM_GenerateDependentsReport_0179.web_img_Move_3}}").dblClick();

		{
			think(2.922);
		}
		web.button("{{obj.HCM_GenerateDependentsReport_0179.web_button_2}}").click();
		{
			think(0.722);
		}
		web.textBox("{{obj.HCM_GenerateDependentsReport_0179.Department}}").click();
		{
			think(2.313);
		}
		web.element("{{obj.HCM_GenerateDependentsReport_0179.Dept_Search}}").click();
		{
			think(1.802);
		}
		web.image("{{obj.HCM_GenerateDependentsReport_0179.web_img_Remove_All_1}}").click();
		{
			think(0.917);
		}
		web.textBox("{{obj.HCM_GenerateDependentsReport_0179.Dept_Input_Search}}").click();
		web.textBox("{{obj.HCM_GenerateDependentsReport_0179.Dept_Input_Search}}").setText(dept_Input_Search);
		{
			think(0.614);
		}
		web.button("{{obj.HCM_GenerateDependentsReport_0179.Dept_Input_searchDialog_button}}").dblClick();
		{
			think(4.367);
		}
		web.element("{{obj.HCM_GenerateDependentsReport_0179.web_div_Ar_Rjum_Project}}").click();
		{
			think(1.396);
		}
		web.image("{{obj.HCM_GenerateDependentsReport_0179.web_img_Move_1}}").dblClick();
		{
			think(1.577);
		}
		web.button("{{obj.HCM_GenerateDependentsReport_0179.web_button_5}}").click();
		{
			think(1.546);
		}


		web.button("{{obj.HCM_GenerateDependentsReport_0179.web_button_reportViewApply}}").click();
		{
			think(5.624);
		}
		web.element("{{obj.HCM_GenerateDependentsReport_0179.web_span_Saudi_Arabian_Mining_Comp}}").focus();
		{
			think(1.654);
		}
		web.element("{{obj.HCM_GenerateDependentsReport_0179.web_span_Ar_Rjum_Project}}").focus();
		web.window(165, "{{obj.HCM_GenerateDependentsReport_0179.web_window_1}}").capturePage();	
	
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_GenerateDependentsReport_0179.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");			
		businessUnit_Input_Search=(String) datatable.getValue("DataSheet", 0, "BusinessUnit_Input_Search");	
		dept_Input_Search=(String) datatable.getValue("DataSheet", 0, "Dept_Input_Search");	
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_GenerateDependentsReport_0179.web_window}}").navigate(url);
		web.window("{{obj.HCM_GenerateDependentsReport_0179.web_window}}").maximize();
		web.window("{{obj.HCM_GenerateDependentsReport_0179.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_GenerateDependentsReport_0179.UID}}").setText(uid);
		web.textBox("{{obj.HCM_GenerateDependentsReport_0179.UID}}").pressTab();
		web.textBox("{{obj.HCM_GenerateDependentsReport_0179.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_GenerateDependentsReport_0179.Sign_In}}").click();
		web.window("{{obj.HCM_GenerateDependentsReport_0179.web_window}}").waitForPage(150, true);
		
	}
	
	
	public void finish() throws Exception {
		//SignOut
		web.window(165, "{{obj.HCM_GenerateDependentsReport_0179.web_window_1}}").close();
		{
			think(0.771);
		}
		web.window(640, "{{obj.HCM_GenerateDependentsReport_0179.web_window}}").close();		

	}
}