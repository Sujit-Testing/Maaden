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
	String effective_Start_Date,locationName,departmentName,classificationName =  null;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/*
	 * Please run Create the new division(HCM_ManageJobs_CreateNewDivision_0039) before run it to get the data(not mandatory, if you have data)
	*/
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageDepartments_Create_ExistingDepartment_0044.xlsx", true);
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");
		info("Effective_Start_Date is : "+effective_Start_Date);
		departmentName=(String) datatable.getValue("DataSheet", 0, "DepartmentName");
		info("DepartmentName is : "+departmentName);
		
		
		
		hCM_LogIn_LogOut.run();
		
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.My Client Groups}}").click();		
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Workforce Structures}}").click();
		web.window("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_window}}").waitForPage(null);
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SignOut}}").focus();
		{
			think(2.862);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Organizations}}").focus();
		//web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Organizations}}").pressTab();
		{
			think(3.862);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Dept_Icon}}").focus();
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Manage Departments}}").click();
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Manage Departments}}").dblClick();
		{
			think(3.862);
		}
		
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Create}}").dblClick();
		{
			think(1.684);
		}
		/*
		//Click on Create New radio button
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Create_new_RadioButton}}").click();
		//Provide DepartmentName
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.DepartmentName}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.DepartmentName}}").setText(departmentName);
		//Select Status
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.StatusDropDown}}").click();		
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SelectActiveOption}}").click();
		{
			think(3.684);
		}

		// Add Classification Details
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.ClassificationInput}}").click();
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Classification_Dropdown}}").click();
		{
			think(1.373);
		}
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Classification_Search}}").click();
		{
			think(1.308);
		}
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.ClassificationName}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.ClassificationName}}").setText(classificationName);
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.ClassificationNameSearch}}").click();
		{
			think(0.042);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SelectSearchText}}").click();
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.ClassificationSearch_OK}}").click();
		{
			think(1.308);
		}
		
		
		//Add Location

		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.LocationName}}").click();
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.LocationName_Dropdown}}").click();
		{
			think(1.108);
		}
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.LocationName_search}}").click();
		{
			think(3.46);
		}
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.LocationName_InputBox}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.LocationName_InputBox}}").setText(locationName);
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.LocationName_Search_button}}").click();
		{
			think(2.854);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SelectLocationName}}").click();
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.LocationName_OK}}").click();	
		{
			think(1.622);
		}
		
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_span_Next}}").click();
		{
			think(2.462);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Submit}}").click();
		{
			think(3.306);
		}
		//Confirmation Pop-Up -> Yes 
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Confirmation_Yes_Button}}").click();
		{
			think(2.251);
		}
		//Confirmation Pop-Up -> OK 
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Confirmation_OK_Button}}").click();
		{
			think(2.368);
		}
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchText}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchText}}").setText(departmentName);
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchButton}}").click();
		{
			think(2.034);
		}
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SelectSearchText1}}").dblClick();
		{
			think(2.371);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Dept_Name}}").focus();
		info("Post creation  Department Name is : "+web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Dept_Name}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Dept_Status}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Dept_Status}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchLocaton}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchLocaton}}").getDisplayText());
		web.window("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Done}}").click();
		{
			think(4.314);
		}
		
		web.window("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_window}}").close();
		
		*/
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Select an existing organization to define as a Department}}").click();
		{
			think(2.998);
		}
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.OrganizationName}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.OrganizationName}}").setText(departmentName);
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.OrganizationName_Search}}").click();
		{
			think(0.049);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SelectedValue}}").click();
		{
			think(1.003);
		}
		web.image("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SelectImage}}").click();
		{
			think(2.458);
		}
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Date}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Date}}").setText(effective_Start_Date);
		{
			think(0.462);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_span_Next}}").click();
		{
			think(2.462);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Submit}}").click();
		{
			think(3.306);
		}
		//Confirmation Pop-Up -> Yes 
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Confirmation_Yes_Button}}").click();
		{
			think(2.251);
		}
		//Confirmation Pop-Up -> OK 
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Confirmation_OK_Button}}").click();
		{
			think(2.368);
		}
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchText}}").click();
		web.textBox("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchText}}").setText(departmentName);
		web.button("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchButton}}").click();
		{
			think(2.034);
		}
		web.link("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SelectSearchText1}}").dblClick();
		{
			think(2.371);
		}
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Dept_Name}}").focus();
		info("Post creation  Department Name is : "+web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Dept_Name}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Dept_Status}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Dept_Status}}").getDisplayText());
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchLocaton}}").focus();
		info("Post creation Department Status is : "+web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.SearchLocaton}}").getDisplayText());
		web.window("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.Done}}").click();
		{
			think(4.314);
		}
		
		web.window("{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_window}}").close();
		/*
		
		web.element(92,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_span_Next_1}}")
				.click();
		{
			think(5.372);
		}
		web.element(93,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_span_Submit}}")
				.click();
		{
			think(4.25);
		}
		web.button(
				94,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_button__FOpt1__FOr1_0__FOSritemN_1}}")
				.click();
		{
			think(6.956);
		}
		web.button(
				95,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_button__FOpt1__FOr1_0__FOSritemN_2}}")
				.click();
		{
			think(5.412);
		}
		web.textBox(
				96,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_input_text__FOpt1__FOr1_0__FOSritemN_2}}")
				.click();
		{
			think(1.179);
		}
		web.textBox(
				97,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_input_text__FOpt1__FOr1_0__FOSritemN_2}}")
				.setText("Sujit_Diviion_1");
		{
			think(0.026);
		}
		web.button(
				98,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_button__FOpt1__FOr1_0__FOSritemN_3}}")
				.click();
		{
			think(0.032);
		}
		web.textBox(
				99,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_input_text__FOpt1__FOr1_0__FOSritemN_2}}")
				.click();
		{
			think(0.045);
		}
		web.textBox(
				100,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_input_text__FOpt1__FOr1_0__FOSritemN_2}}")
				.setText("Sujit_Division_1");
		{
			think(0.017);
		}
		web.button(
				101,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_button__FOpt1__FOr1_0__FOSritemN_3}}")
				.click();
		{
			think(0.029);
		}
		web.link(
				102,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_a__FOpt1__FOr1_0__FOSritemN}}")
				.click();
		{
			think(0.7);
		}
		web.element(103,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_span_7_17_20}}")
				.dblClick();
		{
			think(0.545);
		}
		web.element(
				104,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_span_Common_Set}}")
				.dblClick();
		{
			think(0.878);
		}
		web.element(
				105,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_span_Sujit_Division_1_1}}")
				.dblClick();
		{
			think(3.339);
		}
		web.element(106,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_span_Done}}")
				.click();
		{
			think(4.977);
		}
		web.window(107,
				"{{obj.HCM_ManageDepartments_Create_ExistingDepartment_0044.web_window}}")
				.close();
	*/
	}
	
	public void finish() throws Exception {
	}
}
