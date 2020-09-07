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
	String url,uid,pwd,percentge,department,location,company,division,costOfCenter = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageCostingDepartments_0063.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		percentge=(String) datatable.getValue("DataSheet", 0, "Percentge");
		department = (String) datatable.getValue("DataSheet", 0, "Department");
		location =  (String) datatable.getValue("DataSheet", 0, "Location");			
		company=(String) datatable.getValue("DataSheet", 0, "Company");
		division = (String) datatable.getValue("DataSheet", 0, "Division");
		costOfCenter =  (String) datatable.getValue("DataSheet", 0, "CostOfCenter");
		
		web.window("{{obj.HCM_ManageCostingDepartments_0063.web_window}}").maximize();
		web.window("{{obj.HCM_ManageCostingDepartments_0063.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageCostingDepartments_0063.web_window}}").waitForPage(50,true);
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageCostingDepartments_0063.Sign_In}}").click();
		web.window("{{obj.HCM_ManageCostingDepartments_0063.web_window}}").waitForPage(50,true);
		
		web.link("{{obj.HCM_ManageCostingDepartments_0063.AccountingDistribution}}").click();
		web.window(168, "{{obj.HCM_ManageCostingDepartments_0063.web_window}}").waitForPage(150,true);
		{
			think(3.686);
		}
		web.image("{{obj.HCM_ManageCostingDepartments_0063.Tasks}}").focus();
		{
			think(2.686);
		}
		web.image("{{obj.HCM_ManageCostingDepartments_0063.Tasks}}").click();
		{
			think(3.686);
		}
		if(web.link("{{obj.HCM_ManageCostingDepartments_0063.CostingOfDepartments}}").exists(120, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_ManageCostingDepartments_0063.CostingOfDepartments}}").click();
		}
		{
			think(3.686);
		}
		
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Department}}").setText(department);
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Location}}").click();
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Location}}").setText(location);
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.LegislativeDataGroup}}").click();
		web.element("{{obj.HCM_ManageCostingDepartments_0063.web_li_SA_Legislative_Data_Group}}").click();
		{
			think(0.38);
		}
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.EffectiveAsOfDate}}").showContextMenu();		
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.EffectiveAsOfDate}}").click();
		web.button("{{obj.HCM_ManageCostingDepartments_0063.Search}}").click();
		{
			think(1.022);
		}
		web.element("{{obj.HCM_ManageCostingDepartments_0063.web_span_111}}").click();
		{
			think(0.881);
		}
		web.image("{{obj.HCM_ManageCostingDepartments_0063.CreateCostCostingDetails}}").click();
		{
			think(3.837);
		}
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.CreatedDate}}").click();
		{
			think(0.837);
		}
		web.button("{{obj.HCM_ManageCostingDepartments_0063.Continue}}").click();
		{
			think(5.489);
		}
		//Click on Create button
		web.image("{{obj.HCM_ManageCostingDepartments_0063.Create}}").click();
		{
			think(3.489);
		}
		//Provide the Accounts values 
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.percentage}}").click();
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.percentage}}").setText(percentge);
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.percentage}}").pressTab();
		
		//web.textBox("{{obj.HCM_ManageCostingDepartments_0063.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").pressTab();
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Input_Company}}").setText(company);
		{
			think(0.041);
		}
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Input_Company}}").pressTab();
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Input_Division}}").setText(division);
		{
			think(0.032);
		}
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Input_Division}}").pressTab();
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Input_CostOfCenter}}").setText(costOfCenter);
		{
			think(0.032);
		}
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Input_CostOfCenter}}").pressTab();
		//Click Submit button
		web.element("{{obj.HCM_ManageCostingDepartments_0063.web_span_Submit}}").click();
		{
			think(0.013);
		}
		//Click Continue button
		if(web.button("{{obj.HCM_ManageCostingDepartments_0063.ContinueButton}}").exists(50, TimeUnit.SECONDS)){
		web.button("{{obj.HCM_ManageCostingDepartments_0063.ContinueButton}}").click();
		{
			think(0.013);
		}
		}
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Department}}").click();
		web.textBox("{{obj.HCM_ManageCostingDepartments_0063.Department}}").setText(department);
		web.button("{{obj.HCM_ManageCostingDepartments_0063.Search}}").click();
		{
			think(2.61);
		}
		web.element("{{obj.HCM_ManageCostingDepartments_0063.web_span_111}}").click();
		{
			think(2.881);
		}
				
		web.element("{{obj.HCM_ManageCostingDepartments_0063.Validate_Deptartment}}").focus();
		web.element("{{obj.HCM_ManageCostingDepartments_0063.Validate_Company}}").focus();
		//web.element("{{obj.HCM_ManageCostingDepartments_0063.Validate_Division}}").focus();
		web.element("{{obj.HCM_ManageCostingDepartments_0063.Validate_Division}}").dblClick();
		web.element("{{obj.HCM_ManageCostingDepartments_0063.Validate_CostOfCenter}}").focus();
	
		web.window("{{obj.HCM_ManageCostingDepartments_0063.web_window}}").capturePage();	
		
	
	}
	public void finish() throws Exception {
	
	web.element("{{obj.HCM_ManageCostingDepartments_0063.SignOutDropDown}}").click();
		{
			think(3.366);
		}
	web.link("{{obj.HCM_ManageCostingDepartments_0063.web_a__FOpt1__UISlg1_1}}").click();
	//web.link("{{obj.HCM_ManageCostingDepartments_0063.Sign_Out}}").click();
	web.window("{{obj.HCM_ManageCostingDepartments_0063.web_window}}").waitForPage(null);
	//web.button("{{obj.HCM_ManageCostingDepartments_0063.web_button_Confirm}}").click();
	//Clikc on Yes button from warning pop-up 
	web.button("{{obj.HCM_ManageCostingDepartments_0063.web_button__FOpt1__FOr1_0__FONSr2_0__1}}").click();
	web.window("{{obj.HCM_ManageCostingDepartments_0063.web_window}}").waitForPage(null);
	{
		think(3.366);
	}
	web.window("{{obj.HCM_ManageCostingDepartments_0063.web_window}}").close();
	
	}
}









