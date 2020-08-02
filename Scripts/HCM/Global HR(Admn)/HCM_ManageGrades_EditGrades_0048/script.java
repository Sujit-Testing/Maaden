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
	String url,uid,pwd,effective_Start_Date,gradeName,gradeCode,modified_GradeName = null;

	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		//Import DataBase
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageGrades_EditGrades_0048.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		info("URL is : "+url);
		uid=(String) datatable.getValue("DataSheet", 0, "UID");		
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
	
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective_Start_Date is : "+effective_Start_Date);
		gradeName=(String) datatable.getValue("DataSheet", 0, "GradeName");
		info("GradeName is : "+gradeName);
		gradeCode=(String) datatable.getValue("DataSheet", 0, "GradeCode");
		info("GradeCode is : "+gradeCode);
		modified_GradeName=(String) datatable.getValue("DataSheet", 0, "Modified_GradeName");
		info("Modified Grade Name is : "+modified_GradeName);
		info("\n");
		
		//LogIn the application
		web.window("{{obj.HCM_ManageGrades_EditGrades_0048.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageGrades_EditGrades_0048.web_window}}").waitForPage(30);
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.userid}}").setText(uid);
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.userid}}").pressTab();
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageGrades_EditGrades_0048.web_button_btnActive}}").click();
		web.window("{{obj.HCM_ManageGrades_EditGrades_0048.web_window}}").waitForPage(30);
		//Handle welcome screen
		if(web.link("{{obj.HCM_ManageGrades_EditGrades_0048.WelcomeHomePage}}").exists(10, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_ManageGrades_EditGrades_0048.WelcomeHomePage}}").click();
		web.window("{{obj.HCM_ManageGrades_EditGrades_0048.web_window_0_1}}").waitForPage(null);
		}
		
		web.link("{{obj.HCM_ManageGrades_EditGrades_0048.web_a_My_Client_Groups}}").click();
		{
			think(0.998);
		}
		web.link("{{obj.HCM_ManageGrades_EditGrades_0048.web_a_Workforce_Structures}}").click();
		web.window("{{obj.HCM_ManageGrades_EditGrades_0048.web_window}}").waitForPage(30);
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.web_h2_Grades}}").dblClick();
		{
			think(1.539);
		}
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.web_path_svg_outline}}").dblClick();
		
		web.link("{{obj.HCM_ManageGrades_EditGrades_0048.web_a_Manage_Grades}}").click();
		web.link("{{obj.HCM_ManageGrades_EditGrades_0048.web_a_Manage_Grades}}").dblClick();
		{
			think(2.37);
		}
		
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.SearchInput_Code}}").click();
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.SearchInput_Code}}").setText(gradeCode);
		{
			think(0.007);
		}
		web.button("{{obj.HCM_ManageGrades_EditGrades_0048.Search}}").click();
		{
			think(3.302);
		}
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.Search_Results}}").click();
		{
			think(3.254);
		}
		//Validate the search results
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.search_GradeName}}").focus();
		info("Search GradeName is : "+web.element("{{obj.HCM_ManageGrades_EditGrades_0048.search_GradeName}}").getDisplayText());
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.search_GradeCode}}").focus();
		info("Search GradeCode is : "+web.element("{{obj.HCM_ManageGrades_EditGrades_0048.search_GradeCode}}").getDisplayText());
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.GradeStatus}}").focus();
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.effectiveDate_Validation}}").focus();		
		web.window("{{obj.HCM_ManageGrades_EditGrades_0048.web_window}}").capturePage();
		{
			think(1.502);
		}
		info("\n");
		//Edit-> Update the record
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.Edit}}").click();
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.Update}}").click();
		{
			think(0.559);
		}
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.Edit_date_PopUp}}").click();
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.Edit_date_PopUp}}").setText(effective_Start_Date);
		//web.button("{{{obj.HCM_ManageGrades_EditGrades_0048.Edit_DatePopUp_OK}}").click();

		web.button("{{obj.HCM_ManageGrades_EditGrades_0048.Edit_DatePopUp_OK_1}}").click();
		{
			think(0.95);
		}
		if(web.button("{{obj.HCM_ManageGrades_EditGrades_0048.Edit_DatePopUp_YES_1}}").exists(10,TimeUnit.SECONDS)){
		web.button("{{obj.HCM_ManageGrades_EditGrades_0048.Edit_DatePopUp_YES_1}}").click();
		}
		{
			think(1.136);
		}
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.Edit_Grade_Name}}").click();
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.Edit_Grade_Name}}").setText(modified_GradeName);
		{
			think(0.013);
		}
		web.element(74, "{{obj.HCM_ManageGrades_EditGrades_0048.web_span_m}}").click();
		{
			think(0.035);
		}
		web.button("{{obj.HCM_ManageGrades_EditGrades_0048.Edit_Dialog_YES}}").click();
		{
			think(0.031);
		}
		web.button("{{obj.HCM_ManageGrades_EditGrades_0048.Edit_Dialog_OK}}").click();
		{
			think(0.315);
		}
		
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.SearchInput_Code}}").click();
		web.textBox("{{obj.HCM_ManageGrades_EditGrades_0048.SearchInput_Code}}").setText(gradeCode);
		{
			think(0.007);
		}
		web.button("{{obj.HCM_ManageGrades_EditGrades_0048.Search}}").click();
		{
			think(3.302);
		}
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.Search_Results}}").click();
		{
			think(3.254);
		}
		//Validate the search results
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.search_GradeName}}").focus();
		info("Modified GradeName is : "+web.element("{{obj.HCM_ManageGrades_EditGrades_0048.search_GradeName}}").getDisplayText());
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.search_GradeCode}}").focus();
		info("Modified GradeCode is : "+web.element("{{obj.HCM_ManageGrades_EditGrades_0048.search_GradeCode}}").getDisplayText());
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.GradeStatus}}").focus();
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.effectiveDate_Validation}}").focus();		
		web.window("{{obj.HCM_ManageGrades_EditGrades_0048.web_window}}").capturePage();
		{
			think(1.502);
		}
		
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.Done}}").click();
		{
			think(1.13);
		}
		web.element("{{obj.HCM_ManageGrades_EditGrades_0048.SignOut_Icon}}").click();
		{
			think(0.697);
		}
		web.link("{{obj.HCM_ManageGrades_EditGrades_0048.web_a_Sign_Out}}").click();
		web.window("{{obj.HCM_ManageGrades_EditGrades_0048.web_window}}").waitForPage(30);
		web.window("{{obj.HCM_ManageGrades_EditGrades_0048.web_window}}").close();
		
		
	}
	
	public void finish() throws Exception {
	}
}
