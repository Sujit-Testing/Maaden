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
	String url,uid,pwd,legislative_Input_For_Search,effective_Start_Date,gradeName,gradeCode,grade_MIN_Value,grade_MAX_Value,grade_Value = null;
	
	public void initialize() throws Exception {
		browser.launch();		
	}
		
	public void run() throws Exception {
		  
		//getDatabank("HCM_ManageGradeRates_CreateGradeRates_0050").getNextDatabankRecord();
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageGradeRates_CreateduplicateGradeRates_0051.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		legislative_Input_For_Search=(String) datatable.getValue("DataSheet", 0, "Legislative_Input_For_Search");
		info("Legislative Input For Search is : "+legislative_Input_For_Search);
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective Start Date is : "+effective_Start_Date);
		gradeName=(String) datatable.getValue("DataSheet", 0, "GradeName");
		info("Grade Name is : "+gradeName);
		gradeCode=(String) datatable.getValue("DataSheet", 0, "GradeCode");
		info("Grade code is : "+gradeName);
		grade_MIN_Value=(String) datatable.getValue("DataSheet", 0, "Grade_MIN_Value");
		info("Grade MIN Value is : "+grade_MIN_Value);
		grade_MAX_Value=(String) datatable.getValue("DataSheet", 0, "Grade_MAX_Value");
		info("Grade MAX Value is : "+grade_MAX_Value);
		grade_Value=(String) datatable.getValue("DataSheet", 0, "Grade_Value");
		info("Grade Value is : "+grade_Value);
		
		//LogIn the application
		
		web.window(8, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_window}}").navigate(url);
		web.window(10, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_window}}").waitForPage(30, true);	
		web.textBox(11, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_input_text_userid}}").setText(uid);
		web.textBox(12, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_input_text_userid}}").pressTab();
		web.textBox(13,"{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_input_password_password}}").setPassword(pwd);
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_input_password_password}}").pressEnter();
		{
			think(3.019);
		}
		//Handle New Home Page
		if(web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a_You_have_a_new_home_page_}}").exists(120, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a_You_have_a_new_home_page_}}").click();
			web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a_You_have_a_new_home_page_}}").dblClick();
		}
		web.window(18, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_window}}").waitForPage(60, true);
		web.link(4,"{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a_My_Client_Groups}}").click();
		{
			think(1.019);
		}
		web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a_Workforce_Structures}}").click();
		web.window("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_window}}").waitForPage(null);
		{
			think(1.019);
		}
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.SignOutIcon}}").focus();
		{
			think(.026);
		}
		web.element(10,"{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_h2_Grades}}").focus();
		{
			think(1.639);
		}
		web.element(11,"{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.GradeRatesIcon}}").focus();
		{
			think(1.731);
		}
		web.link(12,"{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Manage_Grade_Rates}}").click();
		web.link(12,"{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Manage_Grade_Rates}}").dblClick();
		{
			think(1.341);
		}
		
		 //Click on Create Button
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_span_Create}}").click();
		{
			think(1.34);
		}
		//Provide Legislative Data Group details
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Legislative_Input}}").click();
		web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Legislative_DropDown}}").click();
		{
			think(1.494);
		}
		web.link(16,"{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Legislative_Search}}").click();
		{
			think(0.894);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Legislative_Input_For_Search}}").click();
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Legislative_Input_For_Search}}").setText(legislative_Input_For_Search);
		web.button("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Legislative_Button_For_Search}}").click();
		{
			think(1.349);
		}
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Select_Legislative_Data_Group}}").click();
		{
			think(1.864);
		}
		web.button("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Legislative_button_OK}}").click();
		{
			think(1.277);
		}
		web.button("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Legislative_button_OK1}}").click();
		{
			think(2.782);
		}		
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.effective_date}}").click();
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.effective_date}}").setText(effective_Start_Date);
		{
			think(0.782);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.GradeName}}").click();
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.GradeName}}").setText(gradeName);
		web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.RateType_DropDown}}").click();
		{
			think(0.096);
		}
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Select_Salary}}").click();
		{
			think(0.604);
		}
		web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Status_DropDown}}").click();
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Select_Active}}").click();
		{
			think(0.729);
		}
		web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a__FOpt1__FOr1_0__FOSritemN_2}}").click();
		{
			think(0.692);
		}
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_li_Annually}}").click();
		{
			think(1.478);
		}
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Submit}}").click();
		{
			think(1.414);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.GradeName}}").click();
		{
			think(1.414);
		}
		web.window(27, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_window}}").capturePage();
		/*
		//Add Grade Rate Values details

		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.GradeRateValues_Add_Row}}").click();
		{
			think(0.174);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.GradeName}}").click();
		{
			think(3.628);
		}
		web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a__FOpt1__FOr1_0__FOSritemN_3}}").click();
		{
			think(2.712);
		}
		web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a__FOpt1__FOr1_0__FOSritemN_4}}").click();
		{
			think(3.355);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.GradeCode}}").click();
		{
			think(0.785);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.GradeCode}}").setText(gradeCode);
		{
			think(1.903);
		}
		web.button("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_button__FOpt1__FOr1_0__FOSritemN}}").click();
		{
			think(3.41);
		}
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_span_S1}}").click();
		{
			think(1.769);
		}
		web.button("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_button__FOpt1__FOr1_0__FOSritemN_1}}").click();
		{
			think(2.683);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Grade_MIN1_Value}}").click();
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Grade_MIN1_Value}}").setText(grade_MIN_Value);
		{
			think(1.683);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Grade_MIN1_Value}}").pressTab();
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Grade_MAX1_Value}}").setText(grade_MAX_Value);
		{
			think(1.683);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Grade_MAX1_Value}}").pressTab();
		//web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Grade_MIN1_Value}}").pressTab();
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Grade_Value}}").setText(grade_Value);
		{
			think(0.683);
		}
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Grade_Value}}").pressTab();		

		web.button("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.WarningDalog_YES}}").click();
		{
			think(2.006);
		}
		web.button("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Confirm_OK}}").click();
		{
			think(1.393);
		}
		
		//Validate the newly created rates details
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Search_GradeRate_Input}}").click();
		web.textBox("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Search_GradeRate_Input}}").setText(gradeName);
		web.button("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Search_GradeRate_Button}}").click();
		{
			think(2.084);
		}
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_span_Leg3}}").dblClick();
		{
			think(2.118);
		}
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Validation_Legislative_Data_Group}}").focus();
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Validate_GradeName}}").focus();
		info("After created Grade Name is :"+web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Validate_GradeName}}").getDisplayText());
		if(gradeName.equalsIgnoreCase(web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Validate_GradeName}}").getDisplayText())){
			info("The test Case pass, search grade name is exactly same as created. ");
		}else fail("Fail the Test Cases as both created grade name and search name are not same");
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Validate_Salary}}").focus();
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Validate_Status}}").focus();
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_span_Annually}}").focus();
		{
			think(1.703);
		}
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_span_Modified_S1}}").focus();
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Validate_MIN_Value}}").focus();
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Validate_MAX_Value}}").focus();
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_span_15_00}}").focus();
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.Validate_GradeValue}}").focus();
		web.window(27, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_window}}").capturePage();
		{
			think(1.716);
		}
		web.link("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a_Done}}").click();
		*/
		
	}
	
	public void finish() throws Exception {
		web.element("{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_svg_pt1__UIScmil1u__icon}}").click();
		{
			think(2.094);
		}
		web.link(21, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_a_Sign_Out}}").click();
		web.window(22, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_window}}").waitForPage(30, true);		
		//web.button(23, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_button_Confirm}}").click();
		web.window(24, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_window}}").waitForPage(30, true);
		web.window(27, "{{obj.HCM_ManageGradeRates_CreateduplicateGradeRates_0051.web_window}}").close();
	}
}
