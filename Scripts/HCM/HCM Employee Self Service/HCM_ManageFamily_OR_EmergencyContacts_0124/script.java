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
	String url,uid,pwd,firstName,lastName,relationship_StartDate,dOB,country,areaCode,phone_Number = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ManageFamily_OR_EmergencyContacts_0124.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");
		lastName=(String) datatable.getValue("DataSheet", 0, "LastName");
		relationship_StartDate = (String) datatable.getValue("DataSheet", 0, "Relationship_StartDate");
		dOB =  (String) datatable.getValue("DataSheet", 0, "DOB");
		country=(String) datatable.getValue("DataSheet", 0, "Country");
		areaCode = (String) datatable.getValue("DataSheet", 0, "AreaCode");
		phone_Number =  (String) datatable.getValue("DataSheet", 0, "Phone_Number");

		
		
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").maximize();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Sign_In}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.You have a new home page}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").waitForPage(null);
		
		if(web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Me}}").click();
		{
			think(3.147);
		}
		
		}
		//Clikc on Family emergency link
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_a_Family_and_Emergency_Depe}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").waitForPage(null);
		{
			think(3.703);
		}
		//Click on Add
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Add}}").click();
		{
			think(4.015);
		}
		//Select New Contact
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Create_a_New_Contact}}").click();
		{
			think(0.184);
		}
		//Provide basic details
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Title}}").click();
		{
			think(1.201);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_li_Mr_}}").click();
		{
			think(1.366);
		}
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.First Name}}").click();
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.First Name}}").setText(firstName);
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Last Name}}").click();
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Last Name}}").setText(lastName);
		{
			think(0.161);
		}
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Relationship}}").click();
		{
			think(2.389);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_li_Brother}}").click();
		{
			think(1.735);
		}
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Relationship_StartDate}}").setText(relationship_StartDate);
		{
			think(1.926);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_html_1}}").click();
		{
			think(0.568);
		}
	
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Gender}}").click();
		{
			think(0.096);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_li_Male}}").click();
		{
			think(1.638);
		}
		
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.DOB}}").setText(dOB);
		{
			think(2.759);
		}
		//Provide communication details
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Communication_PhoneType}}").click();
		{
			think(1.836);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_li_Emergency}}").click();
		{
			think(0.862);
		}
		
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Country}}").setText(country);
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Country}}").pressTab();
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.AreaCode}}").setText(areaCode);
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.PhoneNumber}}").setText(phone_Number);
		{
			think(2.807);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Submit}}").click();
		
		if(web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_span_We_are_submitting_your_ch}}").exists(15, TimeUnit.SECONDS)){
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_span_We_are_submitting_your_ch}}").focus();
		}		
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.BackButton}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").waitForPage(null);
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_a_Family_and_Emergency_Depe_1}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").waitForPage(null);
		{
			think(2.155);
		}
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.See_How_It_Going}}").click();
		{
			think(7.513);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_span_New_Contact_Details__Suji}}").focus();
		{
			think(0.037);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_html_1_1}}").click();
		{
			think(0.021);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_html_1_1}}").click();
		{
			think(0.819);
		}
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.Show Detail}}").click();
		{
			think(13.087);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_strong__1}}").focus();
		{
			think(4.05);
		}
		info("Here ie the approver list details with whom approval is pending with...");
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_html_1_1}}").click();
		{
			think(3.785);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_span_Withdraw}}").click();
		{
			think(7.725);
		}

	
	}
	public void finish() throws Exception {
		//SignOut
		web.image("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_img_Mohammad_Mahtab_Khan}}").click();
		{
			think(3.151);
		}
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_a__FOpt1__UISlg1}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").waitForPage(null);
		{
			think(2.133);
		}
		web.button("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_button_Confirm}}").click();
		{
			think(2.133);
		}
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_0124.web_window}}").close();
	
	}
}









