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
	@FunctionLibrary("HCM_EMP_SelfService_Employee_LogIn") lib.maaden.orackeEBS.HCM_EMP_SelfService_Employee_LogIn hCM_EMP_SelfService_Employee_LogIn;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 *Login with Employee (Test Data Provided by Dev Team)
	 *UID - AlMutiriH@test.com.sa
	  PWD - Welcome123
	 */
	public void run() throws Exception {
		hCM_EMP_SelfService_Employee_LogIn.run();
		//C:\Users\SUJITSWAIN\Desktop\Personal\Personal\Selenium\Browsers\ChromeDriver_64Bit_83.0.4103.116\Google_Chrome_(64bit)_v83.0.4103.116.exe
		web.link(
				4,
				"{{obj.HCM_EMP_SelfService_Add_PhoneNumber_0027.web_a_PER_HCMPEOPLETOP_FUSE_PER}}")
				.click();
		web.window(5,
				"{{obj.HCM_EMP_SelfService_Add_PhoneNumber_0027.web_window_0_1}}")
				.waitForPage(null);
		{
			think(12.283);
		}
		web.element(8,
				"{{obj.HCM_EMP_SelfService_Add_PhoneNumber_0027.web_span_Contact_Info}}")
				.click();
		{
			think(33.063);
		}
		web.image(9,
				"{{obj.HCM_EMP_SelfService_Add_PhoneNumber_0027.web_img_Collapse}}")
				.click();
		{
			think(3.918);
		}
		web.image(10,
				"{{obj.HCM_EMP_SelfService_Add_PhoneNumber_0027.web_img_Expand}}")
				.click();
		{
			think(23.681);
		}
		web.element(
				11,
				"{{obj.HCM_EMP_SelfService_Add_PhoneNumber_0027.web_svg__FOpt1__FOr1_0__FOSrPER_H}}")
				.click();
		{
			think(10.244);
		}
		web.element(12,
				"{{obj.HCM_EMP_SelfService_Add_PhoneNumber_0027.web_td_Phone_Details}}")
				.click();
	}
	
	public void finish() throws Exception {
		//hCM_EMP_SelfService_Employee_LogIn.finish();
	}
}
