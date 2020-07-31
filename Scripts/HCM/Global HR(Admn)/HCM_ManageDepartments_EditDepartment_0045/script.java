import java.util.concurrent.TimeUnit;

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
	String effective_Start_Date,locationName,departmentName,classificationName,internalAddress =  null;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/*
	 * Please run Create the new division(HCM_ManageJobs_CreateNewDivision_0039) before run it to get the data(not mandatory, if you have data)
	*/
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageDepartments_EditDepartment_0045.xlsx", true);
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective_Start_Date is : "+effective_Start_Date);
		departmentName=(String) datatable.getValue("DataSheet", 0, "DepartmentName");
		info("DepartmentName is : "+departmentName);
		internalAddress=(String) datatable.getValue("DataSheet", 0, "InternalAddress");
		info("InternalAddress is : "+internalAddress);
		
		
		
		hCM_LogIn_LogOut.run();
		
		web.link("{{obj.HCM_ManageDepartments_EditDepartment_0045.My Client Groups}}").click();		
		web.link("{{obj.HCM_ManageDepartments_EditDepartment_0045.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_window}}").waitForPage(null);
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.SignOut}}").focus();
		{
			think(2.862);
		}
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Organizations}}").focus();
		//web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Organizations}}").pressTab();
		{
			think(3.862);
		}
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Dept_Icon}}").focus();
		web.link("{{obj.HCM_ManageDepartments_EditDepartment_0045.Manage Departments}}").click();
		web.link("{{obj.HCM_ManageDepartments_EditDepartment_0045.Manage Departments}}").dblClick();
		{
			think(3.862);
		}
		
//		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Create}}").dblClick();
//		{
//			think(1.684);
//		}
//		
//		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Select an existing organization to define as a Department}}").click();
//		{
//			think(2.998);
//		}
//		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.OrganizationName}}").click();
//		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.OrganizationName}}").setText(departmentName);
//		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.OrganizationName_Search}}").click();
//		{
//			think(0.049);
//		}
//		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.SelectedValue}}").click();
//		{
//			think(1.003);
//		}
//		web.image("{{obj.HCM_ManageDepartments_EditDepartment_0045.SelectImage}}").click();
//		{
//			think(2.458);
//		}
//		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.Date}}").click();
//		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.Date}}").setText(effective_Start_Date);
//		{
//			think(0.462);
//		}
//		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_span_Next}}").click();
//		{
//			think(2.462);
//		}
//		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Submit}}").click();
//		{
//			think(3.306);
//		}
//		//Confirmation Pop-Up -> Yes 
//		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.Confirmation_Yes_Button}}").click();
//		{
//			think(2.251);
//		}
//		//Confirmation Pop-Up -> OK 
//		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.Confirmation_OK_Button}}").click();
//		{
//			think(2.368);
//		}
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchText}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchText}}").setText(departmentName);
		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchButton}}").click();
		{
			think(2.034);
		}
		web.link("{{obj.HCM_ManageDepartments_EditDepartment_0045.SelectSearchText1}}").dblClick();
		{
			think(2.371);
		}
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Dept_Name}}").focus();
		info("Post creation  Department Name is : "+web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Dept_Name}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Dept_Status}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Dept_Status}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchLocaton}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchLocaton}}").getDisplayText());
		web.window("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_window}}").capturePage();
		//web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Done}}").click();
		
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Edit}}").click();
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Update}}").click();
		{
			think(0.67);
		}
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.Update_Date}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.Update_Date}}").setText(effective_Start_Date);
		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.DatePopUp_OK}}").click();
		{
			think(0.35);
		}
		if(web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.Warnning_MSG_Yes}}").exists(3, TimeUnit.SECONDS)){
		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.Warnning_MSG_Yes}}").click();
		}
		{
			think(0.734);
		}
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.InternalAddress}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.InternalAddress}}").setText(internalAddress);
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_input_text__FOpt1__FOr1_0__FOSritemN_3}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_input_text__FOpt1__FOr1_0__FOSritemN_4}}").click();
		{
			think(1.924);
		}
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_span_Submit_1}}").click();
		{
			think(2.924);
		}
	//	Confirmation Pop-Up -> Yes 
		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_button__FOpt1__FOr1_0__FOSritemN}}").click();
		{
			think(4.39);
		}
		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_button__FOpt1__FOr1_0__FOSritemN_4}}").click();
//		
//		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.Confirmation_Yes_Button}}").click();
//		{
//			think(2.251);
//		}
//		//Confirmation Pop-Up -> OK 
//		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.Confirmation_OK_Button}}").click();
		{
			think(2.368);
		}
		//Validate the edited value
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchText}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchText}}").setText(departmentName);
		web.button("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchButton}}").click();
		{
			think(2.034);
		}
		web.link("{{obj.HCM_ManageDepartments_EditDepartment_0045.SelectSearchText1}}").dblClick();
		{
			think(2.371);
		}
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Dept_Name}}").focus();
		info("Post creation  Department Name is : "+web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Dept_Name}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Dept_Status}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Dept_Status}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchLocaton}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.SearchLocaton}}").getDisplayText());
		web.window("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageDepartments_EditDepartment_0045.Done}}").click();
		web.window("{{obj.HCM_ManageDepartments_EditDepartment_0045.web_window}}").close();
		
	
	}
	
	public void finish() throws Exception {
	}
}
