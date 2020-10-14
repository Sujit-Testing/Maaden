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
	String url,uid,pwd = null;
	String title =  "Document Records - - Oracle Applications";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ManageDocumentRecords_Add_Record_0077.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");		
		
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").maximize();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.Sign_In}}").click();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		//Click on Me Tab
		if(web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.Me}}").click();
		{
			think(3.147);
		}
		}
		//Click on Document record
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a_Document_Records}}").click();
		
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").waitForPage(90, true);
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").capturePage();
		//Verify Page Title
		String pageTitle = web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").getTitle();
		info("Page title is -> "+pageTitle);
				
		if(pageTitle.equalsIgnoreCase(title)){
			info("Test Case pass, as page title is return correctly.");
		}else fail("Test Case fail, as page title is return inCorrectly.");
		
	}
	public void finish() throws Exception {
		//SignOut

		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_svg_true_3}}").click();
		if(web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__UISlg1_1}}").exists(15, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__UISlg1_1}}").click();
		}
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window_0}}").waitForPage(90,true);
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window_0}}").close();
		

	}
}