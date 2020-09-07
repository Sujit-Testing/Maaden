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
	String url,uid,pwd,percentge,department,location = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_Delete_CostingDepartments_0065.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		percentge=(String) datatable.getValue("DataSheet", 0, "Percentge");
		department = (String) datatable.getValue("DataSheet", 0, "Department");
		location =  (String) datatable.getValue("DataSheet", 0, "Location");
		
		web.window("{{obj.HCM_Delete_CostingDepartments_0065.web_window}}").maximize();
		web.window("{{obj.HCM_Delete_CostingDepartments_0065.web_window}}").navigate(url);
		web.window("{{obj.HCM_Delete_CostingDepartments_0065.web_window}}").waitForPage(50,true);
		web.textBox("{{obj.HCM_Delete_CostingDepartments_0065.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Delete_CostingDepartments_0065.UID}}").pressTab();
		web.textBox("{{obj.HCM_Delete_CostingDepartments_0065.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Delete_CostingDepartments_0065.Sign_In}}").click();
		web.window("{{obj.HCM_Delete_CostingDepartments_0065.web_window}}").waitForPage(50,true);
		
		web.link("{{obj.HCM_Delete_CostingDepartments_0065.AccountingDistribution}}").click();
		web.window(168, "{{obj.HCM_Delete_CostingDepartments_0065.web_window}}").waitForPage(150,true);
		{
			think(9.686);
		}
		web.image("{{obj.HCM_Delete_CostingDepartments_0065.Tasks}}").focus();
		{
			think(3.686);
		}
		web.image("{{obj.HCM_Delete_CostingDepartments_0065.Tasks}}").click();
		{
			think(3.686);
		}
		if(web.link("{{obj.HCM_Delete_CostingDepartments_0065.CostingOfDepartments}}").exists(120, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_Delete_CostingDepartments_0065.CostingOfDepartments}}").click();
		}
		{
			think(3.686);
		}
		
		web.textBox("{{obj.HCM_Delete_CostingDepartments_0065.Department}}").setText(department);
		web.textBox("{{obj.HCM_Delete_CostingDepartments_0065.Location}}").click();
		web.textBox("{{obj.HCM_Delete_CostingDepartments_0065.Location}}").setText(location);
		{
			think(0.015);
		}
		web.textBox("{{obj.HCM_Delete_CostingDepartments_0065.LegislativeDataGroup}}").click();
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.web_li_SA_Legislative_Data_Group}}").click();
		{
			think(0.38);
		}
		web.textBox("{{obj.HCM_Delete_CostingDepartments_0065.EffectiveAsOfDate}}").showContextMenu();		
		web.textBox("{{obj.HCM_Delete_CostingDepartments_0065.EffectiveAsOfDate}}").click();
		web.button("{{obj.HCM_Delete_CostingDepartments_0065.Search}}").click();
		{
			think(3.022);
		}
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.web_span_111}}").click();
		{
			think(5.022);
		}
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.CostAccount_Percentage}}").focus();
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.CostAccount_Company}}").focus();
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.CostAccount_Division}}").focus();
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.CostAccount_CostCenter}}").focus();
		web.window("{{obj.HCM_Delete_CostingDepartments_0065.web_window}}").capturePage();
		{
			think(0.709);
		}
		web.link("{{obj.HCM_Delete_CostingDepartments_0065.Edit_DropDown}}").click();
		{
			think(0.994);
		}
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.DeleteRecord}}").click();
		{
			think(0.379);
		}

		if(web.button("{{obj.HCM_Delete_CostingDepartments_0065.DeleteRecord_Confirmation_Yes}}").exists(10, TimeUnit.SECONDS)){
		web.button("{{obj.HCM_Delete_CostingDepartments_0065.DeleteRecord_Confirmation_Yes}}").click();
		{
			think(2.526);
		}
		}
		web.link("{{obj.HCM_Delete_CostingDepartments_0065.SelectSearchResults}}").click();
		{
			think(5.37);
		}
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.CostAccount_Percentage}}").focus();
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.CostAccount_Company}}").focus();
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.CostAccount_Division}}").focus();
		web.element("{{obj.HCM_Delete_CostingDepartments_0065.CostAccount_CostCenter}}").focus();
		web.window("{{obj.HCM_Delete_CostingDepartments_0065.web_window}}").capturePage();

		
	}
	public void finish() throws Exception {
	
	web.element("{{obj.HCM_Delete_CostingDepartments_0065.SignOutDropDown}}").click();
		{
			think(3.366);
		}
	web.link("{{obj.HCM_Delete_CostingDepartments_0065.web_a__FOpt1__UISlg1_1}}").click();	
	web.window("{{obj.HCM_Delete_CostingDepartments_0065.web_window}}").waitForPage(null);
	web.window("{{obj.HCM_Delete_CostingDepartments_0065.web_window}}").close();
	
	}
}









