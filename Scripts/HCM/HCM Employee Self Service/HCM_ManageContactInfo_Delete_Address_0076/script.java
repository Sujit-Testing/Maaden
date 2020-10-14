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
	String url,uid,pwd,country,startDate,line1,line2,pO_Box,streets,city,postalCode,comments = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ManageContactInfo_Delete_Address_0076.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");		
		
		web.window("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_window}}").maximize();
		web.window("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManageContactInfo_Delete_Address_0076.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageContactInfo_Delete_Address_0076.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Delete_Address_0076.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageContactInfo_Delete_Address_0076.Sign_In}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		
		if(web.link("{{obj.HCM_ManageContactInfo_Delete_Address_0076.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageContactInfo_Delete_Address_0076.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManageContactInfo_Delete_Address_0076.Me}}").click();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_a_Family_and_Emergency_Cont}}").click();
		web.window(360,"{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_window}}").waitForPage(null);
		web.link("{{obj.HCM_ManageContactInfo_Delete_Address_0076.My_Contact}}").focus();
		}
		{
			think(2.454);
		}
		web.link("{{obj.HCM_ManageContactInfo_Delete_Address_0076.My_Contact}}").dblClick();
	
		{
			think(5.454);
		}
		web.element("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_h2_Address_1}}").dblClick();
		{
			think(1.454);
		}
		web.image("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_img_Expand_1}}").click();
		{
			think(5.372);
		}
		web.image("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_img_Edit}}").click();
		{
			think(5.372);
		}

		//Delete the address
		web.element("{{obj.HCM_ManageContactInfo_Delete_Address_0076.Delete}}").click();
		//Submit for approval
		web.window(360,"{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_window}}").capturePage();
			
		
		
	}
	public void finish() throws Exception {
		//SignOut

		web.image("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_img_Sujit___Swain}}").click();
		{
			think(4.362);
		}
		web.link("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_a__FOpt1__UISlg1_1}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_window}}").waitForPage(null);
		{
			think(1.898);
		}
		web.button("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_button_Confirm_1}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_window}}").waitForPage(null);
		{
			think(0.458);
		}

		web.window("{{obj.HCM_ManageContactInfo_Delete_Address_0076.web_window}}").close();

	}
}