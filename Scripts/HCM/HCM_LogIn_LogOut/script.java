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
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		
	
		getDatabank("HCM_Search_ManagePosition_ByName_EmployeeCode_003").getNextDatabankRecord();
		web.window("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_window}}").navigate("{{db.HCM_Search_ManagePosition_ByName_EmployeeCode_003.HCM_URL,https://ejop-test.login.em2.oraclecloud.com/}}");
		web.window("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_window}}").waitForPage(180,true);
		//Maximizwe the Browser.
		web.window("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_window}}").maximize();
		//LogIn the application
		web.textBox("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.UID}}").setText("{{db.HCM_Search_ManagePosition_ByName_EmployeeCode_003.UserId,Sujit.swain}}");	
		web.textBox("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Password}}").setPassword("{{db.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Password,{{@deobfuscate(ZHLjwGuLQyMgupEPdJt44w==)}}}}");	
		web.button("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Sign_In}}").click();
		
		web.window("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_window}}").waitForPage(180,true);
		//Welcome Screen
		if(web.link("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.WelcomeScreen}}").exists()){
		web.link("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.WelcomeScreen}}").click();
		}
		web.window("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_window}}").waitForPage(null);
		
	}
	
	public void finish() throws Exception {
		
		//LogOut and close the application
	web.element("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.LogOutIcon}}").click();
	{
		think(2.07);
	}
	web.link("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.Sign_Out}}").click();
	web.window("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_window}}").waitForPage(180,true);
	web.window("{{obj.HCM_Search_ManagePosition_ByName_EmployeeCode_003.web_window}}").close();
		}
}
