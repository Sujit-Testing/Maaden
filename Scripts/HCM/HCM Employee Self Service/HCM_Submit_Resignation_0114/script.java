import java.text.SimpleDateFormat;
import java.util.Date;
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
	String url,uid,pwd,lastWorkingDate,lastWorkDay,resigning= null;
	
	public void initialize() throws Exception {
		browser.launch();
	}		
	
	public void run() throws Exception {
	
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Submit_Resignation_0114.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		//employerName=(String) datatable.getValue("DataSheet", 0, "EmployerName");	
		resigning=(String) datatable.getValue("DataSheet", 0, "Resigning");	
		lastWorkingDate=(String) datatable.getValue("DataSheet", 0, "LastWorkingDate");
		lastWorkDay=(String) datatable.getValue("DataSheet", 0, "LastWorkDay");
	
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").maximize();
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").navigate(url);
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Submit_Resignation_0114.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Submit_Resignation_0114.UID}}").pressTab();
		web.textBox("{{obj.HCM_Submit_Resignation_0114.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Submit_Resignation_0114.Sign_In}}").click();
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Submit_Resignation_0114.You have a new home page!}}").focus();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_Submit_Resignation_0114.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").capturePage();
		//Clik on Me
		web.link("{{obj.HCM_Submit_Resignation_0114.Me}}").click();
		{
			think(0.868);
		}
		//Clik on More
		web.link("{{obj.HCM_Submit_Resignation_0114.Show More}}").click();
		{
			think(1.785);
		}

		//Clik on Resignation
		web.link("{{obj.HCM_Submit_Resignation_0114.Resignation}}").click();
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").waitForPage(null);

		//Providing regination details
		//Last Working Date
		web.textBox("{{obj.HCM_Submit_Resignation_0114.Last Working Date}}").click();
		web.textBox("{{obj.HCM_Submit_Resignation_0114.Last Working Date}}").setText(lastWorkingDate);
		web.textBox("{{obj.HCM_Submit_Resignation_0114.Last Working Date}}").pressTab();
		{
			think(0.044);
		}
		//Reason for let the resign
		web.element("{{obj.HCM_Submit_Resignation_0114.web_span_Why_are_you_resigning_}}").click();
		{
			think(0.083);
		}
		//web.textBox("{{obj.HCM_Submit_Resignation_0114.Why are you resigning}}").setText(resigning);
		//Clik on drop Down Box
		web.link("{{obj.HCM_Submit_Resignation_0114.web_a__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(0.149);
		}
		//Select Better Salaryt option
		web.element("{{obj.HCM_Submit_Resignation_0114.Select_Better_Salary}}").click();
		{
			think(0.579);
		}
		web.button("{{obj.HCM_Submit_Resignation_0114.Continue}}").click();
		{
			think(0.71);
		}
		web.textBox("{{obj.HCM_Submit_Resignation_0114.Notice Period Recovery}}").click();
		{
			think(0.338);
		}
		web.element(808, "{{obj.HCM_Submit_Resignation_0114.Yes}}").click();
		{
			think(0.465);
		}
		//last working date
		web.textBox("{{obj.HCM_Submit_Resignation_0114.Last Work Day}}").click();
		web.textBox("{{obj.HCM_Submit_Resignation_0114.Last Work Day}}").setText(lastWorkDay);
		{
			think(0.786);
		}
		//Clik on Submit
		web.element(811, "{{obj.HCM_Submit_Resignation_0114.Submit}}").click();
		web.window(812, "{{obj.HCM_Submit_Resignation_0114.web_window}}").waitForPage(null);	

		//Validate the regination submission details and capture the screen-shot
		//Clik on More
		web.link("{{obj.HCM_Submit_Resignation_0114.Show More}}").click();
		{
			think(5.785);
		}

		//Clik on Resignation
		web.link("{{obj.HCM_Submit_Resignation_0114.Resignation}}").click();
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").waitForPage(null);
		
		
		web.element("{{obj.HCM_Submit_Resignation_0114.web_span_Approval_in_Progress}}").dblClick();
		{
			think(0.008);
		}
		
		web.element("{{obj.HCM_Submit_Resignation_0114.web_label_af_panelLabelAndMessage_l}}").dblClick();
		{
			think(0.022);
		}
		info("Approval is under process. Here is the screenshot captured below...");
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").capturePage();	
	}
	public void finish() throws Exception {
		//SignOut
		web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").waitForPage(null);
//		//Close both wndows
		//web.window("{{obj.HCM_Submit_Resignation_0114.web_window}}").close();

	}
}