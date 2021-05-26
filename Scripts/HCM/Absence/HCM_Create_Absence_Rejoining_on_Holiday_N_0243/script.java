import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.datatable.api.DataTableService;
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
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	String url,uid,pwd,date,firstName,emergencyContact_FirstName,familyName,emergencyContact_FamilyName,middleName,grandFatherName,comments,startDate,
	legalEmployer_SerchInput,national_ID,personNumber,endDate,adjustmentAmount,re_JoiningDate= null;
	@FunctionLibrary("HCM_Aprove_Request") lib.myCompany.myTeam.HCM_Aprove_Request hCM_Aprove_Request;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		/*
		String approval_Request = "Approval of Sick Leave Absence Request for Mazhar Usmani Mohammad Ayub Khan from 2021-05-19 to 2021-05-19";
		// String abc= "123";
		   DataTableService parDatatable = datatable.getGlobalDatatable(); 
			//Store the value in the data table using setValue() method.(1-> Row number, A-> colomn number, abc-> value which need to store)
		   parDatatable.setValue(1, "A", approval_Request);

		hCM_Aprove_Request.run();
		*/
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Me}}").click();
		web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Time_and_Absences}}").click();
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").waitForPage(null);
		{
			think(3.602);
		}
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_html_1}}").click();
//		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_div__FOpt1__FOr1_0__FONSr2_0__1}}").dblClick();
//		{
//			think(3.602);
//		}
//		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_div__FOpt1__FOr1_0__FONSr2_0__1}}").dblClick();
		
//		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_span_Create_Absence}}").focus();
//		{
//			think(0.602);
//		}
//		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_span_Create_Absence}}").click();
//		{
//			think(0.602);
//		}
//		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_span_Create_Absence}}").dblClick();
//		{
//			think(0.602);
//		}
//		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_span_Create_Absence}}").pressEnter();
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Create_Absence}}").focus();
		{
			think(0.895);
		}
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Create_Absence}}").dblClick();
		{
			think(0.895);
		}
		
		if(web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Absence_Type}}").exists(5, TimeUnit.SECONDS)){
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Absence_Type}}").click();
		{
			think(5.23);
		}
		} else {
			web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Create_Absence}}").dblClick();
			{
				think(5.351);
			}
			//Add Absence

			web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Absence_Type}}").click();
		}
		//web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Absence_Type}}").click();
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Absence_Type}}").setText("Sick Leave");
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Absence_Type}}").click();
		//web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_div__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(2.485);
		}
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Select_Absence_Type_Sick_Leave}}").click();
		{
			think(5.527);
		}
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Start Date}}").setText(startDate);
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").capturePage();
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Start Date}}").pressTab();
		{
			think(1.83);
		}
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.End Date}}").click();
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.End Date}}").setText(endDate);
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.End Date}}").pressTab();
		{
			think(4.634);
		}
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Attachement}}").click();
		{
			think(1.815);
		}
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Add_File}}").click();
		{
			think(3.803);
		}
		/////////////////Robot Class implementation//////////////////////////////
	      Robot robot = new Robot();

	    //Copy the file path into the clipboard like (Control+c)
	    		StringSelection str = new StringSelection("C:\\Users\\SUJITSWAIN\\Desktop\\HCM_Test.txt");
	    		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

	    //pressing (Control+c)
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_V);
	    //Relesing (Control+v)
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_V);
	    		
	    //Pressing Enter
	    		robot.keyPress(KeyEvent.VK_ENTER);
	    //Releasing Enter
	    		robot.keyRelease(KeyEvent.VK_ENTER);
	    		
/////////////////Robot Class implementation End//////////////////////////////
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Re_Joining Date}}").click();
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Re_Joining Date}}").setText(re_JoiningDate);
		{
			think(4.952);
		}
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Start Date}}").setText(startDate);
		{
			think(0.952);
		}
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Submit}}").click();
		{
			think(2.952);
		}
		info("Error screenshot attached below..");
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").capturePage();
		/*
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Home}}").click();
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").waitForPage(null);
		
		//Click on Tool->WorkList->My_Tasks-Initiated_Tasks->Click on request list
		web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Tools}}").click();
		{
			think(2.712);
		}
		web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Worklist}}").click();
		{
			think(2.727);
		}
		web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.My_Tasks}}").click();
		{
			think(2.516);
		}
		web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Initiated_Tasks}}").click();
		{
			think(2.21);
		}
		String approval_Request = web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_a_Approval_of_Sick_Leave_Ab}}").getDisplayText();
		info(approval_Request );
		
		web.link("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_a_Approval_of_Sick_Leave_Ab}}").click();
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window_1}}").waitForPage(null);
		{
			think(2.181);
		}
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window_1}}").maximize();
		//web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_div_pglscroll}}").click();		
		
		
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_strong__1}}").focus();
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_strong__1_1}}").focus();
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_strong__1_2}}").focus();
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_strong__1_3}}").focus();
		web.element("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_strong__1_4}}").focus();
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window_1}}").capturePage();
		*/
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\Absence\\HCM_Create_Absence_Rejoining_on_Holiday_N_0243.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
		startDate=(String) datatable.getValue("DataSheet", 0, "StartDate");	
		endDate=(String) datatable.getValue("DataSheet", 0, "EndDate");
		re_JoiningDate=(String) datatable.getValue("DataSheet", 0, "Re_JoiningDate");
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").navigate(url);
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").maximize();
		//web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").navigate(url);
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.UID}}").pressTab();
		web.textBox("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.Sign_In}}").click();
		web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").waitForPage(150, true);
		
	}


	public void finish() throws Exception {
		//SignOut
		//web.window("{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window_1}}").close();
		{
			think(1.21);
		}
		web.window(640, "{{obj.HCM_Create_Absence_Rejoining_on_Holiday_N_0243.web_window}}").close();		

	}
}