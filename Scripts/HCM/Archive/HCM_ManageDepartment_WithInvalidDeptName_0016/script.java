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
	String locationCode = null;
	String departmentName = null;
	final String result = "No results found." ;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.i
	 */
	public void run() throws Exception {
		
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM_ManageDepartment_WithInvalidDeptName_0016.xlsx", true);
		//Get the Name from the excel data
		departmentName=(String) datatable.getValue("DataSheet", 0, "Departments_Name");
		info("Name from data sheet is : --> "+departmentName);				
		
		//Login in the application
		hCM_LogIn_LogOut.run();
		
		//Click on My Client Groups
		web.link("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.My Client Groups}}").click();
		//Click on Workforce Structures
		web.link("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_window}}").waitForPage(180,true);
		info("Title of the page is : "+web.window("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_window}}").getTitle());
		web.element(28,"{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.Log Out con}}").focus();
		{
			think(0.1);
		}
	
		//Capture the acreen shot of the page
		//web.window("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_window}}").capturePage();
		
		//web.element("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_path_svg_outline}}").click();
		//web.link("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_a__FOpt1__FOr1_0__FOSritemN_2}}").focus();
		web.link("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_a__FOpt1__FOr1_0__FOSritemN_2}}").click();
		{
			think(0.279);
		}
				
		//Capture the acreen shot of the page
		//web.window("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_window}}").capturePage();
		//Click on Manage Department link
		web.link("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.Manage Department}}").dblClick();
		{
			think(2.352);
		}
		web.textBox("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.ManageDepartmentName}}").click();
		web.textBox("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.ManageDepartmentName}}").setText(departmentName);
		
		web.button("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.Search}}").click();
		{
			think(1.416);
		}
		//Click on Search Results
		//web.link("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.SearchResults}}").click();
		web.element("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_div__FOpt1__FOr1_0__FOSritemN}}").focus();
		String searchResults= web.element("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_div__FOpt1__FOr1_0__FOSritemN}}").getDisplayText();
		info("Search Result is : "+searchResults);
		if(result.equalsIgnoreCase(searchResults)){
			info("Test Case Pass");			
		}else{
			fail("Test case fail. ");
		}
		//Capture the acreen shot of the page
		web.window("{{obj.HCM_ManageDepartment_WithInvalidDeptName_0016.web_window}}").capturePage();
		
		
	}
	
	public void finish() throws Exception {
		//LogOut the applcation
		hCM_LogIn_LogOut.finish();
	}
}
