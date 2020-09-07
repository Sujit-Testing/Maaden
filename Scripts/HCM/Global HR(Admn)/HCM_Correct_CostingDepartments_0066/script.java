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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_Correct_CostingDepartments_0066.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		percentge=(String) datatable.getValue("DataSheet", 0, "Percentge");
		department = (String) datatable.getValue("DataSheet", 0, "Department");
		location =  (String) datatable.getValue("DataSheet", 0, "Location");
		company=(String) datatable.getValue("DataSheet", 0, "Company");
		division = (String) datatable.getValue("DataSheet", 0, "Division");
		costOfCenter =  (String) datatable.getValue("DataSheet", 0, "CostOfCenter");
		
		web.window("{{obj.HCM_Correct_CostingDepartments_0066.web_window}}").maximize();
		web.window("{{obj.HCM_Correct_CostingDepartments_0066.web_window}}").navigate(url);
		web.window("{{obj.HCM_Correct_CostingDepartments_0066.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.UID}}").pressTab();
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Correct_CostingDepartments_0066.Sign_In}}").click();
		web.window("{{obj.HCM_Correct_CostingDepartments_0066.web_window}}").waitForPage(50, true);
		
		web.link("{{obj.HCM_Correct_CostingDepartments_0066.AccountingDistribution}}").click();
		web.window(168, "{{obj.HCM_Correct_CostingDepartments_0066.web_window}}").waitForPage(150, true);
		{
			think(9.686);
		}
		web.image("{{obj.HCM_Correct_CostingDepartments_0066.Tasks}}").focus();
		{
			think(1.686);
		}
		web.image("{{obj.HCM_Correct_CostingDepartments_0066.Tasks}}").click();
		{
			think(3.686);
		}
		if(web.link("{{obj.HCM_Correct_CostingDepartments_0066.CostingOfDepartments}}").exists(120, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_Correct_CostingDepartments_0066.CostingOfDepartments}}").click();
		}
		{
			think(3.686);
		}
		
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Department}}").setText(department);
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Location}}").click();
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Location}}").setText(location);
		{
			think(0.015);
		}
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.LegislativeDataGroup}}").click();
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.web_li_SA_Legislative_Data_Group}}").click();
		{
			think(0.38);
		}
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.EffectiveAsOfDate}}").showContextMenu();		
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.EffectiveAsOfDate}}").click();
		web.button("{{obj.HCM_Correct_CostingDepartments_0066.Search}}").click();
		{
			think(3.022);
		}
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.web_span_111}}").click();
		{
			think(5.022);
		}
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.CostAccount_Percentage}}").focus();
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.CostAccount_Company}}").focus();
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.CostAccount_Division}}").focus();
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.CostAccount_CostCenter}}").focus();
		web.window("{{obj.HCM_Correct_CostingDepartments_0066.web_window}}").capturePage();
		{
			think(0.709);
		}
		web.link("{{obj.HCM_Correct_CostingDepartments_0066.Edit_DropDown}}").click();
		{
			think(0.994);
		}
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.Correct}}").click();
		{
			think(0.379);
		}
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_Percentage}}").click();
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_Percentage}}").click();
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_Percentage}}").setText(percentge);
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_Percentage}}").pressTab();
		
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_Company}}").setText(company);
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_Company}}").pressTab();
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_Division}}").setText(division);
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_Division}}").pressTab();
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_CostOfCenter}}").setText(costOfCenter);
		web.textBox("{{obj.HCM_Correct_CostingDepartments_0066.Input_CostOfCenter}}").pressTab();
		
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.web_span_Submit_1}}").click();
		{
			think(2.609);
		}
		if(web.button("{{obj.HCM_Correct_CostingDepartments_0066.Continue_Button}}").exists(10, TimeUnit.SECONDS)){
		web.button("{{obj.HCM_Correct_CostingDepartments_0066.Continue_Button}}").click();
		{
			think(4.526);
		}
		}
		web.link("{{obj.HCM_Correct_CostingDepartments_0066.SelectSearchResults}}").click();
		{
			think(5.37);
		}
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.CostAccount_Percentage}}").focus();
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.CostAccount_Company}}").focus();
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.CostAccount_Division}}").focus();
		web.element("{{obj.HCM_Correct_CostingDepartments_0066.CostAccount_CostCenter}}").focus();
		web.window("{{obj.HCM_Correct_CostingDepartments_0066.web_window}}").capturePage();		
		
	}
	public void finish() throws Exception {
	
	web.element("{{obj.HCM_Correct_CostingDepartments_0066.SignOutDropDown}}").click();
		{
			think(3.366);
		}
	web.link("{{obj.HCM_Correct_CostingDepartments_0066.web_a__FOpt1__UISlg1_1}}").click();
	
	web.window("{{obj.HCM_Correct_CostingDepartments_0066.web_window}}").waitForPage(null);
	web.window("{{obj.HCM_Correct_CostingDepartments_0066.web_window}}").close();
	
	}
}









