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
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.You have a new home page}}").click();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").waitForPage(null);
		{
			think(4.387);
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
		//Clik on Add button
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_Add}}").focus();
		{
			think(2.741);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_Add}}").click();
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_Add}}").dblClick();
		{
			think(5.741);
		}
		//Select document type
		if(web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__1}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__1}}").click();
		}
		
		{
			think(2.741);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_div__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(2.482);
		}
		
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_div__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(2.415);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_div_Exit_Interview_Questionna}}").click();
		{
			think(3.762);
		}
		//Select Context Value
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__2}}").click();
		{
			think(1.983);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Exit_Interview_Questionna}}").click();
		{
			think(0.071);
		}
		// Provided all of the mandatory details
		
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__3}}").click();
		{
			think(0.563);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree}}").click();
		{
			think(2.163);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__4}}").click();
		{
			think(0.667);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_1}}").click();
		{
			think(2.698);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__5}}").click();
		{
			think(0.498);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_2}}").click();
		{
			think(2.23);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__6}}").click();
		{
			think(0.634);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_3}}").click();
		{
			think(2.308);
		}
		web.textBox("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_input_text__FOpt1__FOr1_0__FONSr2_0__9}}").pressTab();
		{
			think(0.761);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__7}}").click();
		{
			think(1.607);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_td__}}").click();
		{
			think(2.177);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__8}}").click();
		{
			think(1.846);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_25_}}").click();
		{
			think(2.456);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__9}}").click();
		{
			think(1.921);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_td__}}").click();
		{
			think(2.961);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__10}}").click();
		{
			think(2.14);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_25__1}}").click();
		{
			think(2.951);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__11}}").click();
		{
			think(2.673);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_25__2}}").click();
		{
			think(4.413);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__12}}").click();
		{
			think(1.893);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_25__3}}").click();
		{
			think(2.184);
		}
		
		web.textBox("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_input_text__FOpt1__FOr1_0__FONSr2_0__10}}").pressTab();
		{
			think(0.234);
		}
		
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__13}}").click();
		{
			think(2.321);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_td___1}}").click();
		{
			think(2.4);
		}
		
		//Resume academic studies
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__14}}").click();
		{
			think(2.785);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_25__4}}").click();
		{
			think(3.141);
		}
		
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__15}}").click();
		{
			think(3.425);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_td___1}}").click();
		{
			think(3.24);
		}
		
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__16}}").click();
		{
			think(2.497);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_25__5}}").click();
		{
			think(3.544);
		}
		
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_html_1_1}}").click();
		{
			think(2.805);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__17}}").click();
		{
			think(1.601);
		}
		
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_31_Dec_2021}}").click();
		{
			think(2.437);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__18}}").click();
		{
			think(2.337);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_4}}").click();
		{
			think(1.98);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__19}}").click();
		{
			think(1.604);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_5}}").click();
		{
			think(2.048);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__20}}").click();
		{
			think(1.61);
		}
		web.element(541,
						"{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_6}}").click();
		{
			think(3.333);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__21}}").click();
		{
			think(1.73);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_7}}").click();
		{
			think(2.214);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__22}}").click();
		{
			think(1.535);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_8}}").click();
		{
			think(2.661);
		}
		web.textBox("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_input_text__FOpt1__FOr1_0__FONSr2_0__11}}").pressTab();
		{
			think(0.023);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__23}}").click();
		{
			think(2.679);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__24}}").click();
		{
			think(1.728);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_9}}").click();
		{
			think(3.602);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__23}}").click();
		{
			think(1.761);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_10}}").click();
		{
			think(2.984);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__25}}").click();
		{
			think(1.395);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_11}}").click();
		{
			think(2.282);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__26}}").click();
		{
			think(1.56);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_12}}").click();
		{
			think(2.935);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__27}}").click();
		{
			think(1.347);
		}
		web.element(557,"{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_13}}").click();
		{
			think(2.11);
		}
		web.textBox("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_input_text__FOpt1__FOr1_0__FONSr2_0__12}}").pressTab();
		{
			think(0.023);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__28}}").click();
		{
			think(0.864);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_li_Agree_14}}").click();
		{
			think(2.383);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_html_1_1}}").click();
		{
			think(1.631);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_m}}").click();
		{
			think(7.001);
		}
		//Submit the request for approval, approval message is dsplayed
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_We_are_submitting_your_ch}}").focus();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").capturePage();
		//Click on < button
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_svg_true_2}}").click();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").waitForPage(90, true);
		//Click on document record again
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a_Document_Records_1}}").focus();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").capturePage();
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a_Document_Records_1}}").click();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").waitForPage(90, true);
		//Approval message  
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__29}}").focus();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").capturePage();
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__FOr1_0__FONSr2_0__29}}").click();
		
		{
			think(9.298);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_b_100026}}").focus();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").capturePage();
		{
			think(0.027);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_Exit_Interview_Questionna}}").focus();
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").capturePage();
		{
			think(0.016);
		}
//		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_Exit_Interview_Questionna}}").click();
//		{
//			think(0.048);
//		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_html_1_2}}").click();
		{
			think(0.39);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_strong__1}}").focus();
		info("Approver details screen shot attached below..");
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").capturePage();
		{
			think(0.014);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_strong__1}}").click();
		{
			think(3.547);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_html_1_2}}").click();
		
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").capturePage();
		{
			think(2.889);
		}
		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_span_Withdraw}}").click();

			
		
	}
	public void finish() throws Exception {
		//SignOut

		web.element("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_svg_true_3}}").click();
		{
		think(5.819);
		}
		web.link("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_a__FOpt1__UISlg1_1}}").click();		
		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").waitForPage(90, true);
		{
			think(5.819);
		}

		web.window("{{obj.HCM_ManageDocumentRecords_Add_Record_0077.web_window}}").close();
		

	}
}