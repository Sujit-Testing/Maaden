import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import lib.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@FunctionLibrary("HCM_LogIn_LogOut") lib.maaden.orackeEBS.HCM_LogIn_LogOut hCM_LogIn_LogOut;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	String legislativeDataGroup = null;
	String rateType = null;
	String code = null;
	String name = null;
	final String result = "No results found." ;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.i
	 */
	public void run() throws Exception {
		
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM_ManageGrade_InvalidParameter_0012.xlsx", true);
		//Get the Name from the excel data
		name=(String) datatable.getValue("DataSheet", 0, "Name");
		info("Name from data sheet is : --> "+name);
		//Get the Grade Code from the excel data
		code=(String) datatable.getValue("DataSheet", 0, "Code");
		info("Grade from data sheet is : "+code);
		
		
		//Login in the application
		hCM_LogIn_LogOut.run();
		
		//Click on My Client Groups
		web.link("{{obj.HCM_ManageGradeRates_InvalidCode_0010.My Client Groups}}").click();
		//Click on Workforce Structures
		web.link("{{obj.HCM_ManageGradeRates_InvalidCode_0010.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageGradeRates_InvalidCode_0010.web_window}}").waitForPage(180,true);
		info("Title of the page is : "+web.window("{{obj.HCM_ManageGradeRates_InvalidCode_0010.web_window}}").getTitle());
		web.element(28,"{{obj.HCM_ManageGradeRates_InvalidCode_0010.Log Out con}}").focus();
		//Click on Manage Grade Icon
		web.element(115, "{{obj.HCM_ManageGrade_InvalidParameter_0012.GradesSection}}").dblClick();
		web.link("{{obj.HCM_ManageGrade_InvalidParameter_0012.Manage_Grades}}").focus();
		//Click on Manage Grade Link
		web.link("{{obj.HCM_ManageGrade_InvalidParameter_0012.Manage_Grades}}").dblClick();
		{
			think(3.271);
		}
		web.textBox("{{obj.HCM_ManageGrade_InvalidParameter_0012.ManageGrade_Name}}")	.click();		
		web.textBox("{{obj.HCM_ManageGrade_InvalidParameter_0012.ManageGrade_Name}}").setText(name);		
		web.textBox("{{obj.HCM_ManageGrade_InvalidParameter_0012.ManageGrade_Name}}").pressTab();
		web.textBox("{{obj.HCM_ManageGrade_InvalidParameter_0012.ManageGrade_Code}}").setText(code);
		
		web.window("{{obj.HCM_ManageGradeRates_InvalidCode_0010.web_window}}").capturePage();
		
//		web.textBox("{{obj.HCM_ManageGrade_InvalidParameter_0012.ManageGrade_GradeSet}}").click();
//		web.link("{{obj.HCM_ManageGrade_InvalidParameter_0012.web_a__FOpt1__FOr1_0__FOSritemN_1}}").click();
//		web.element("{{obj.HCM_ManageGrade_InvalidParameter_0012.web_span_Common_Set}}").click();

		//Click Search
		web.button("{{obj.HCM_ManageGrade_InvalidParameter_0012.web_button__FOpt1__FOr1_0__FOSritemN}}").click();
		{
			think(0.271);
		}
		//Click Search Results
		web.element("{{obj.HCM_ManageGradeRates_InvalidCode_0010.ResultsLink}}").dblClick();
		
		web.window("{{obj.HCM_ManageGradeRates_InvalidCode_0010.web_window}}").capturePage();
		
		info("Result fount after search : "+web.element("{{obj.HCM_ManageGradeRates_InvalidCode_0010.ResultsLink}}").getDisplayText());
		
		if(result.equalsIgnoreCase(web.element("{{obj.HCM_ManageGradeRates_InvalidCode_0010.ResultsLink}}").getDisplayText())){
			info("The Test Case pass as expected and actual results are same on this negative scenario.");
			
		}else{
			info("The Test Case fail as expected and actual results are not same on this negative scenario.");
		}
/*
		web.element(104, "{{obj.HCM_ManageGrade_InvalidParameter_0012.GradeDetails_Name}}").focus();
		info("Displayed Name is : "+web.element(104, "{{obj.HCM_ManageGrade_InvalidParameter_0012.GradeDetails_Name}}").getDisplayText());
		if(code.equalsIgnoreCase(web.element(104, "{{obj.HCM_ManageGrade_InvalidParameter_0012.GradeDetails_Name}}").getDisplayText())){
			info("The Test Case is pass, as input code and out put code are same. The input code is : " +code +
				"and the out put code is : " + web.element(104, "{{obj.HCM_ManageGrade_InvalidParameter_0012.GradeDetails_Name}}").getDisplayText());
			
		}else{
			info("The test case fail as both input and output code does not matched...");
		}
		web.element("{{obj.HCM_ManageGrade_InvalidParameter_0012.GradeDetails_Code}}").focus();
		info("Grage Code is : "+web.element("{{obj.HCM_ManageGrade_InvalidParameter_0012.GradeDetails_Code}}").getDisplayText());
		web.element("{{obj.HCM_ManageGrade_InvalidParameter_0012.web_span_Active}}").focus();		
		info("Status : "+web.element(106, "{{obj.HCM_ManageGrade_InvalidParameter_0012.web_span_Active}}").getDisplayText());
		web.element("{{obj.HCM_ManageGrade_InvalidParameter_0012.web_span_Saudi_National}}").focus();	
		info("Grade Type : "+web.element("{{obj.HCM_ManageGrade_InvalidParameter_0012.web_span_Saudi_National}}").getDisplayText());
		web.element("{{obj.HCM_ManageGrade_InvalidParameter_0012.BasicDetails_GradeSet}}").focus();
		info("Grade Set : "+web.element("{{obj.HCM_ManageGrade_InvalidParameter_0012.BasicDetails_GradeSet}}").getDisplayText());
		web.window("{{obj.HCM_ManageGradeRates_InvalidCode_0010.web_window}}").capturePage();
		//Clck Done Button
		web.link(109, "{{obj.HCM_ManageGrade_InvalidParameter_0012.web_a_Done}}").click();	
		*/
		
		
		
	}
	
	public void finish() throws Exception {
		//LogOut the applcation
		hCM_LogIn_LogOut.finish();
	}
}
