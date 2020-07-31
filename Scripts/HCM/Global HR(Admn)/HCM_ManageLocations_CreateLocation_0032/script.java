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
	String LocationName,LocationCode,LocationDescription,CountryName,Address_Line_1,Street,	City,PostalCode = null;

	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		
		hCM_LogIn_LogOut.run();
		//Import Test Data
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\Global HR(Admn)\\HCM_ManageLocations_CreateLocation_0032.xlsx", true);
		LocationName=(String) datatable.getValue("DataSheet", 0, "LocationName");
		LocationCode=(String) datatable.getValue("DataSheet", 0, "LocationCode");
		LocationDescription=(String) datatable.getValue("DataSheet", 0, "LocationDescription");
		CountryName=(String) datatable.getValue("DataSheet", 0, "CountryName");
		Address_Line_1=(String) datatable.getValue("DataSheet", 0, "Address_Line_1");
		Street=(String) datatable.getValue("DataSheet", 0, "Street");
		City=(String) datatable.getValue("DataSheet", 0, "City");
		PostalCode=(String) datatable.getValue("DataSheet", 0, "PostalCode");
		
		////Click on My Client Groups
		web.link("{{obj.HCM_ManageLocations_CreateLocation_0032.My Client Groups}}").click();	
		//Click on Workforce Structures
		web.link("{{obj.HCM_ManageLocations_CreateLocation_0032.Workforce Structures}}").dblClick();
		web.window("{{obj.HCM_ManageLocations_CreateLocation_0032.web_window}}").waitForPage(100,true);
		web.element("{{obj.HCM_ManageLocations_CreateLocation_0032.web_h2_Locations}}").dblClick();
		{
			think(3.309);
		}
		//Click on Manage Locaton
		web.link("{{obj.HCM_ManageLocations_CreateLocation_0032.Manage Location}}").dblClick();
		{
			think(3.309);
		}
		//Click on Create
		web.element("{{obj.HCM_ManageLocations_CreateLocation_0032.Create}}").click();
		{
			think(1.618);
		}
		//Provide Location detals
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.LocationName}}").click();
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.LocationName}}").setText(LocationName);
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.LocatonCode}}").click();
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.LocatonCode}}").setText(LocationCode);
		web.textArea("{{obj.HCM_ManageLocations_CreateLocation_0032.LocationDescription}}").setText(LocationDescription);

		web.link("{{obj.HCM_ManageLocations_CreateLocation_0032.web_a__FOpt1__FOr1_0__FOSritemN_1}}").click();
		web.link("{{obj.HCM_ManageLocations_CreateLocation_0032.web_a__FOpt1__FOr1_0__FOSritemN_2}}").click();
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.LocationCountry}}").click();
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.LocationCountry}}").click();
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.LocationCountry}}").setText(CountryName);
		web.button("{{obj.HCM_ManageLocations_CreateLocation_0032.CountrySearch}}").click();
		{
			think(3.886);
		}
		web.element("{{obj.HCM_ManageLocations_CreateLocation_0032.web_span_Saudi_Arabia}}").click();
		
		web.button("{{obj.HCM_ManageLocations_CreateLocation_0032.web_button__FOpt1__FOr1_0__FOSritemN_1}}").click();
		{
			think(2.515);
		}
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.Address Line 1}}").click();
		{
			think(0.908);
		}
		//Provide address details
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.Address Line 1}}").setText(Address_Line_1);
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.Street}}").setText(Street);
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.City}}").setText(City);		
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.PostalCode}}").setText(PostalCode);
		web.link("{{obj.HCM_ManageLocations_CreateLocation_0032.TimeZoneCode_DropDown}}").click();
		{
			think(0.016);
		}
		web.element("{{obj.HCM_ManageLocations_CreateLocation_0032.AlaskaTime}}").click();
		
		////Click on Submit Button
		web.element("{{obj.HCM_ManageLocations_CreateLocation_0032.Submit}}").click();
		{
			think(3.874);
		}
		//Click on yes pop-up button
		web.button("{{obj.HCM_ManageLocations_CreateLocation_0032.YesButton}}").click();
		//Click on No Button
		web.button("{{obj.HCM_ManageLocations_CreateLocation_0032.OKButton}}").click();
		{
			think(1.276);
		}
		//Validate the new Create location 
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.NewlyCreated_LocationCode}}").click();
		{
			think(1.741);
		}
		web.textBox("{{obj.HCM_ManageLocations_CreateLocation_0032.NewlyCreated_LocationCode}}").setText(LocationCode);
		web.button("{{obj.HCM_ManageLocations_CreateLocation_0032.Search_UsingCode}}").click();
		{
			think(0.506);
		}
		web.element(47,"{{obj.HCM_ManageLocations_CreateLocation_0032.web_span_004}}").focus();
		web.element(48,"{{obj.HCM_ManageLocations_CreateLocation_0032.web_span_Ram_Mandir}}").focus();
		web.element(49,
				"{{obj.HCM_ManageLocations_CreateLocation_0032.web_span_Kolkata}}").focus();
		web.window("{{obj.HCM_ManageLocations_CreateLocation_0032.web_window}}").capturePage();
	}
	
	public void finish() throws Exception {
		//LogOut and close applicaton
	
		web.element("{{obj.HCM_ManageLocations_CreateLocation_0032.SignOut_DropDown}}").click();
		{
			think(1.283);
		}
		web.link("{{obj.HCM_ManageLocations_CreateLocation_0032.SignOut}}").click();
		web.window("{{obj.HCM_ManageLocations_CreateLocation_0032.web_window}}").waitForPage(100,true);
		web.window("{{obj.HCM_ManageLocations_CreateLocation_0032.web_window}}").close();
		

	}
}
