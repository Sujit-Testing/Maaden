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
	String person_Number = null;
	String national_Id = null;
	String employee_Name = null;
	String errorText = "No results found.";
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
	
		//LogIn the application
		hCM_LogIn_LogOut.run();
		
		// Get the data from excel sheet not from Data Bank
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM_PersonalManagement_MandatoryField_0021.xlsx", true);
		
		//Get the Employee Number from the excel data
		person_Number =(String) datatable.getValue("DataSheet", 0, "Person_Number");
		info("person_Number--> "+person_Number);
		//Get the National id
		national_Id =(String) datatable.getValue("DataSheet", 0, "National_Id");
		info("National Id--> "+national_Id);
		
		//Click on MyClientGroups
		web.link("{{obj.HCM_PersonalManagement_MandatoryField_0021.MyClientGroups}}").click();
		if(web.link("{{obj.HCM_PersonalManagement_MandatoryField_0021.PersonManagement}}").exists(30, TimeUnit.SECONDS)){
			//Click on Persona Managment
			web.link("{{obj.HCM_PersonalManagement_MandatoryField_0021.PersonManagement}}").click();
		}
		
		web.window(6, "{{obj.HCM_PersonalManagement_MandatoryField_0021.web_window}}").waitForPage(180,true);
		//Set the Name,personal number,person number
		//web.textBox("{{obj.HCM_PersonalManagement_MandatoryField_0021.PersonManagment_Name}}").setText(employee_Name);		
		web.textBox("{{obj.HCM_PersonalManagement_MandatoryField_0021.PersonManagement_PersonalNumber}}").setText(person_Number);
		{
			think(2.869);
		}
		web.button("{{obj.HCM_PersonalManagement_MandatoryField_0021.SearchButton}}").dblClick();
		{
			think(2.869);
		}
//		web.textBox("{{obj.HCM_PersonalManagement_MandatoryField_0021.PersonManagement_National_ID}}").setText(national_Id);
//		{
//			think(3.869);
//		}
		
		//Click on Search Button
//		web.button("{{obj.HCM_PersonalManagement_MandatoryField_0021.SearchButton}}").dblClick();
//		{
//			think(2.869);
//		}
		//Click on Search Results
		web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.SearchResults}}").dblClick();
		web.window(6, "{{obj.HCM_PersonalManagement_MandatoryField_0021.web_window}}").capturePage();
		
		String errorText_AfterSearch = web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.SearchResults}}").getDisplayText();
		info(errorText_AfterSearch);
	
		web.window(17, "{{obj.HCM_PersonalManagement_MandatoryField_0021.web_window}}").waitForPage(180,true);
		{
			think(5.578);
		}
		web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Name_AfterSearch}}").focus();
		//Validate the Emplyee Name
		String AfterSearchName =  web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Name_AfterSearch}}").getDisplayText();
		info("After search the Name displayed is : "+AfterSearchName);
		String[] modifiedName =AfterSearchName.split(":" );
		for(int i=0;i<modifiedName.length;i++){
			System.out.println("Name is : "+modifiedName[i]);
				info("Name is : "+modifiedName[i]);
				break;
		}
		//Validate the personal number
		web.element(20, "{{obj.HCM_PersonalManagement_MandatoryField_0021.PersonalNumber_AfterSearch}}").focus();
		String afterSearchPersonalNumber = web.element(20, "{{obj.HCM_PersonalManagement_MandatoryField_0021.PersonalNumber_AfterSearch}}").getDisplayText();
		info("After search the personal number displayed is : "+afterSearchPersonalNumber);
	
		//Print the Position,job,grade,location,FTE,Employee Type and employee Time
		web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Position}}").focus();
		info("Position is : "+web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Position}}").getDisplayText());
		web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Job}}").focus();
		info("Job : "+web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Job}}").getDisplayText());
		web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Grade}}").focus();
		info("Grade : "+web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Grade}}").getDisplayText());
		web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Location}}").focus();
		info("Locaton : "+web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.Location}}").getDisplayText());
		web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.FTE}}").focus();
		info("FTE : "+web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.FTE}}").getDisplayText());
		web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.RegularORTemporary}}").focus();
		info("Employeement Type : "+web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.RegularORTemporary}}").getDisplayText());
		web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.FullTimeORPartTime}}").focus();
		info("Employeement Time : "+web.element("{{obj.HCM_PersonalManagement_MandatoryField_0021.FullTimeORPartTime}}").getDisplayText());
		// Person Number validation
		if(afterSearchPersonalNumber.equalsIgnoreCase(person_Number)){
			info("Test Case Pass as validation sucessfull for Personal Number field. ");
		}else{
			fail("Test fail as validation fail for Personal Number field.");
		
		}
		//Click on Done Button
		web.button("{{obj.HCM_PersonalManagement_MandatoryField_0021.DoneButton}}").click();
		//Click on Close Button
		web.button("{{obj.HCM_PersonalManagement_MandatoryField_0021.CloseButton}}").click();
		
		web.window("{{obj.HCM_PersonalManagement_MandatoryField_0021.web_window}}").close();
		}
		
//		web.window(36,
//				"{{obj.HCM_PersonalManagement_MandatoryField_0021.web_window_0}}")
//				.close();
	
		

	
	
	public void finish() throws Exception {
		//hCM_LogIn_LogOut.finish();
	}
}
