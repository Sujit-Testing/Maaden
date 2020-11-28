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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.xlsx", true);
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

		
		
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").maximize();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.Sign_In}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").waitForPage(150, true);
		{
			think(3.387);
		}
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.You have a new home page}}").dblClick();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").waitForPage(null);
		
		if(web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.Me}}").click();
		{
			think(3.147);
		}
		
		}
		//Click on Family emergency link
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_a_Family_and_Emergency_Depe}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").waitForPage(null);
		{
			think(3.703);
		}
		//Click on my dependent link
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.MyDependents_Link}}").click();
		{
			think(5.864);
		}
		//Delete the dependent
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.Delete}}").click();
		
		{
			think(5.807);
		}
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").capturePage();
		//Click Back Button
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.BackButton}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").waitForPage(null);
		{
			think(5.807);
		}
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_a_Family_and_Emergency_Depe}}").click();
		//Click on my dependent link
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.MyDependents_Link}}").click();
		{
			think(5.864);
		}
		web.image("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.Communication_Expand}}").click();
		{
			think(3.843);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_span_Approval_in_progress_}}").focus();
		{
			think(0.035);
		}
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").capturePage();
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.See how it is going.}}").click();
		{
			think(10.981);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_span_001}}").focus();
		{
			think(0.449);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_span_011}}").focus();
		{
			think(0.48);
		}
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").capturePage();
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_a_BIP_NOTIF_discloseHref}}").click();
		{
			think(13.072);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_strong__1_1}}").focus();
		{
			think(0.418);
		}
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").capturePage();
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_html_1_3}}").click();
		{
			think(1.927);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_html_1_3}}").click();
		{
			think(1.373);
		}
		web.element("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_span_Withdraw_1}}").click();
		

	}
	public void finish() throws Exception {
		//SignOut
		web.image("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_img_Mohammad_Mahtab_Khan}}").click();
		{
			think(3.151);
		}
		web.link("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_a__FOpt1__UISlg1}}").click();
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").waitForPage(null);
		{
			think(2.133);
		}
		web.button("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_button_Confirm}}").click();
		{
			think(2.133);
		}
		web.window("{{obj.HCM_ManageFamily_OR_EmergencyContacts_Delete_MyDependents_0127.web_window}}").close();
	
	}
}









