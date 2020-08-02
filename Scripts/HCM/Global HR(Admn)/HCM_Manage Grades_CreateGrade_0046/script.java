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
	String url,uid,pwd,effective_Start_Date,gradeName,gradeCode = null;

	public void initialize() throws Exception {
		browser.launch();
	}
		
	
	public void run() throws Exception {
		//Import DataBase
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_Manage Grades_CreateGrade_0046.xlsx", true);
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
		
		//LogIn the application
		web.window("{{obj.HCM_Manage Grades_CreateGrade_0046.web_window}}").navigate(url);
		web.window("{{obj.HCM_Manage Grades_CreateGrade_0046.web_window}}").waitForPage(30);
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.userid}}").setText(uid);
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.userid}}").pressTab();
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.password}}").setPassword(pwd);
		web.button("{{obj.HCM_Manage Grades_CreateGrade_0046.web_button_btnActive}}").click();
		web.window("{{obj.HCM_Manage Grades_CreateGrade_0046.web_window}}").waitForPage(30);
		//Handle welcome screen
		if(web.link("{{obj.HCM_Manage Grades_CreateGrade_0046.WelcomeHomePage}}").exists(10, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_Manage Grades_CreateGrade_0046.WelcomeHomePage}}").click();
		web.window("{{obj.HCM_Manage Grades_CreateGrade_0046.web_window_0_1}}").waitForPage(null);
		}
		
		web.link("{{obj.HCM_Manage Grades_CreateGrade_0046.web_a_My_Client_Groups}}").click();
		{
			think(0.998);
		}
		web.link("{{obj.HCM_Manage Grades_CreateGrade_0046.web_a_Workforce_Structures}}").click();
		web.window("{{obj.HCM_Manage Grades_CreateGrade_0046.web_window}}").waitForPage(30);
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.web_h2_Grades}}").dblClick();
		{
			think(1.539);
		}
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.web_path_svg_outline}}").dblClick();
		
		web.link("{{obj.HCM_Manage Grades_CreateGrade_0046.web_a_Manage_Grades}}").click();
		web.link("{{obj.HCM_Manage Grades_CreateGrade_0046.web_a_Manage_Grades}}").dblClick();
		{
			think(2.37);
		}
		
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.Create}}").click();
		{
			think(2.166);
		}
		
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.EffectiveDate}}").click();
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.EffectiveDate}}").setText(effective_Start_Date);
		{
			think(2.166);
		}
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.InputGrade_Name}}").click();
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.InputGrade_Name}}").setText(gradeName);
		{
			think(0.038);
		}
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.InputGrade_Code}}").click();
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.InputGrade_Code}}").setText(gradeCode);	

		{
			think(0.37);
		}
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.Status}}").click();
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.web_li_Active}}").click();
		{
			think(1.339);
		}
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.GradeSet}}").click();
		{
			think(3.943);
		}
		web.link(27, "{{obj.HCM_Manage Grades_CreateGrade_0046.web_a_51}}").click();
		{
			think(3.236);
		}
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.web_td_Common_Set}}").click();
		{
			think(3.054);
		}
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.Next}}").click();
		{
			think(1.86);
		}
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.Next}}").click();
		{
			think(1.234);
		}
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.Next}}").click();
		{
			think(3.501);
		}
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.Submit}}").click();
		{
			think(4.226);
		}
		web.button("{{obj.HCM_Manage Grades_CreateGrade_0046.web_button__FOpt1__FOr1_0__FOSritemN}}").click();
		{
			think(3.608);
		}
		web.button("{{obj.HCM_Manage Grades_CreateGrade_0046.web_button__FOpt1__FOr1_0__FOSritemN_1}}")	.click();
		{
			think(3.747);
		}
		
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.SearchInput_Code}}").click();
		web.textBox("{{obj.HCM_Manage Grades_CreateGrade_0046.SearchInput_Code}}").setText(gradeCode);
		{
			think(0.007);
		}
		web.button("{{obj.HCM_Manage Grades_CreateGrade_0046.Search}}").click();
		{
			think(3.302);
		}
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.Search_Results}}").click();
		{
			think(3.254);
		}
		//Validate the search results
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.search_GradeName}}").focus();
		info("Search GradeName is : "+web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.search_GradeName}}").getDisplayText());
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.search_GradeCode}}").focus();
		info("Search GradeCode is : "+web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.search_GradeCode}}").getDisplayText());
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.GradeStatus}}").focus();
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.effectiveDate_Validation}}").focus();		
		web.window("{{obj.HCM_Manage Grades_CreateGrade_0046.web_window}}").capturePage();
		{
			think(1.502);
		}
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.Done}}").click();
		{
			think(1.13);
		}
		web.element("{{obj.HCM_Manage Grades_CreateGrade_0046.SignOut_Icon}}").click();
		{
			think(0.697);
		}
		web.link("{{obj.HCM_Manage Grades_CreateGrade_0046.web_a_Sign_Out}}").click();
		web.window("{{obj.HCM_Manage Grades_CreateGrade_0046.web_window}}").waitForPage(30);
		web.window("{{obj.HCM_Manage Grades_CreateGrade_0046.web_window}}").close();
		
		
		
		
		
	}
	
	public void finish() throws Exception {
	}
}
