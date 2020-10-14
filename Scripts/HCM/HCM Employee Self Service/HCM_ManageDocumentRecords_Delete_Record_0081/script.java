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
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ManageDocumentRecords_Delete_Record_0081.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");		
		
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").maximize();
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.Sign_In}}").click();
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		//Click on Me Tab
		if(web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.Me}}").click();
		{
			think(3.147);
		}
		}
		//Click on Document record
		web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_a_Document_Records}}").click();
		
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").waitForPage(90, true);
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").capturePage();
		//Verify Page Title
		String pageTitle = web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").getTitle();
		info("Page title is -> "+pageTitle);
				
		if(pageTitle.equalsIgnoreCase(title)){
			info("Test Case pass, as page title is return correctly.");
		}else fail("Test Case fail, as page title is return inCorrectly.");
		{
			think(2.166);
		}
		//Clck on Exit_Interview_Questionna_1 to edit
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_span_Exit_Interview_Questionna_1}}").focus();
		{
			think(0.166);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_span_Exit_Interview_Questionna_1}}").click();
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_span_Exit_Interview_Questionna_1}}").click();
		{
			think(1.166);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_span_Delete}}").click();
		{
			think(2.968);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_span_K}}").click();
		/*
		//Click on Edit button
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_svg_true_4}}").click();
		{
			think(2.269);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_a__FOpt1__FOr1_0__FONSr2_0__30}}").click();
		{
			think(0.27);
		}
		//Change the value
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_li_Strongly_agree}}").click();
		{
			think(0.603);
		}
		//Save the value
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_span_Save}}").click();
		
		*/
		 //Submit the request for approval, approval message is dsplayed
		//web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_We_are_submitting_your_ch}}").focus();
	//	web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").capturePage();
		//Click on < button
		//web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_svg_true_5}}").click();
		{
			think(2.371);
		}
		//Click on < button
		web.element(615,"{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_svg_true_8}}").click();
		web.window(616,"{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").waitForPage(null);
		{
			think(2.371);
		}
		//Clik on document record
		web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_a_Document_Records}}").click();
		//web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_a_Document_Records_2}}").click();
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window_0}}").waitForPage(null);
		

		//Capture the confirmation message
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_span_Approval_in_progress_}}").dblClick();
		web.window(616,"{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").capturePage();
		{
			think(0.049);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_a__FOpt1__FOr1_0__FONSr2_0__31}}").click();
		{
			think(5.035);
		}
		//Capture the message details
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_b_Updated_Record}}").dblClick();
		web.window(616,"{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").capturePage();
		{
			think(0.027);
		}		
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_html_1_3}}").click();
		{
			think(0.049);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_strong__1_1}}").dblClick();	
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").capturePage();
		{
			think(0.044);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_html_1_3}}").click();
		web.window(616,"{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window}}").capturePage();
		
		
		
		//web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_Withdraw}}").click();
		
	
		
			
		
	}
	public void finish() throws Exception {
		//SignOut

		web.element("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_svg_true_3}}").click();
		if(web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_a__FOpt1__UISlg1_1}}").exists(15, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_a__FOpt1__UISlg1_1}}").click();
		}
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window_0}}").waitForPage(90,true);
		web.window("{{obj.HCM_ManageDocumentRecords_Delete_Record_0081.web_window_0}}").close();
		

	}
}