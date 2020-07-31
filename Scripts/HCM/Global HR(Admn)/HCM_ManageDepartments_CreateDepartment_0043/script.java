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
	String locationName,departmentName,classificationName =  null;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageDepartments_CreateDepartment_0043.xlsx", true);
		departmentName=(String) datatable.getValue("DataSheet", 0, "DepartmentName");
		info("DepartmentName is : "+departmentName);
		classificationName=(String) datatable.getValue("DataSheet", 0, "ClassificationName");
		info("ClassificationName is : "+classificationName);
		locationName=(String) datatable.getValue("DataSheet", 0, "LocationName");
		info("LocationName is : "+locationName);
		
		
		
		hCM_LogIn_LogOut.run();
		
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.My Client Groups}}").click();		
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageDepartments_CreateDepartment_0043.web_window}}").waitForPage(null);
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SignOut}}").focus();
		{
			think(2.862);
		}
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Organizations}}").focus();
		//web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Organizations}}").pressTab();
		{
			think(3.862);
		}
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Dept_Icon}}").focus();
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Manage Departments}}").click();
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Manage Departments}}").dblClick();
		{
			think(1.862);
		}
		
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Create}}").click();
		{
			think(1.684);
		}
		//Click on Create New radio button
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Create_new_RadioButton}}").click();
		//Provide DepartmentName
		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.DepartmentName}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.DepartmentName}}").setText(departmentName);
		//Select Status
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.StatusDropDown}}").click();		
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SelectActiveOption}}").click();
		{
			think(3.684);
		}

		// Add Classification Details
		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.ClassificationInput}}").click();
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Classification_Dropdown}}").click();
		{
			think(1.373);
		}
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Classification_Search}}").click();
		{
			think(1.308);
		}
		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.ClassificationName}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.ClassificationName}}").setText(classificationName);
		web.button("{{obj.HCM_ManageDepartments_CreateDepartment_0043.ClassificationNameSearch}}").click();
		{
			think(0.042);
		}
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SelectSearchText}}").click();
		web.button("{{obj.HCM_ManageDepartments_CreateDepartment_0043.ClassificationSearch_OK}}").click();
		{
			think(1.308);
		}
		
		
		//Add Location

		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.LocationName}}").click();
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.LocationName_Dropdown}}").click();
		{
			think(1.108);
		}
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.LocationName_search}}").click();
		{
			think(3.46);
		}
		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.LocationName_InputBox}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.LocationName_InputBox}}").setText(locationName);
		web.button("{{obj.HCM_ManageDepartments_CreateDepartment_0043.LocationName_Search_button}}").click();
		{
			think(2.854);
		}
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SelectLocationName}}").click();
		web.button("{{obj.HCM_ManageDepartments_CreateDepartment_0043.LocationName_OK}}").click();	
		{
			think(1.622);
		}
		
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.web_span_Next}}").click();
		{
			think(2.462);
		}
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Submit}}").click();
		{
			think(3.306);
		}
		//Confirmation Pop-Up -> Yes 
		web.button("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Confirmation_Yes_Button}}").click();
		{
			think(2.251);
		}
		//Confirmation Pop-Up -> OK 
		web.button("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Confirmation_OK_Button}}").click();
		{
			think(2.368);
		}
		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SearchText}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SearchText}}").setText(departmentName);
		web.button("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SearchButton}}").click();
		{
			think(2.034);
		}
		web.link("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SelectSearchText1}}").dblClick();
		{
			think(2.371);
		}
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Dept_Name}}").focus();
		info("Post creation  Department Name is : "+web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Dept_Name}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Dept_Status}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Dept_Status}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SearchLocaton}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.SearchLocaton}}").getDisplayText());
		web.window("{{obj.HCM_ManageDepartments_CreateDepartment_0043.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageDepartments_CreateDepartment_0043.Done}}").click();
		{
			think(4.314);
		}
		
		web.window("{{obj.HCM_ManageDepartments_CreateDepartment_0043.web_window}}").close();

	}
	
	public void finish() throws Exception {
	}
}
