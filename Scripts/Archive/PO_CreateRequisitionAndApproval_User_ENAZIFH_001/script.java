import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.formsFT.api.*;
import oracle.oats.scripting.modules.applet.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.applet.api.AppletService applet;
	@ScriptService oracle.oats.scripting.modules.formsFT.api.FormsService forms;

	public void initialize() throws Exception {
		browser.launch();
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		web.window(84,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_window_0}}")
				.navigate(
						"http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE");
		web.window(85,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_window_0_1}}")
				.waitForPage(null);
		{
			think(1.039);
		}
		web.textBox(
				88,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_input_text_unamebean}}")
				.click();
		
		web.textBox(
				89,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_input_text_unamebean}}")
				.setText("ENAZIFH");
		
		web.textBox(
				90,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_input_text_unamebean}}")
				.pressTab();
		
		web.textBox(
				91,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.textBox(
				92,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(93,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_window_0_2}}")
				.waitForPage(180,true);
		
		web.link(
				97,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.Requisition}}")
				.click();
		web.window(98,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_window_0_3}}")
				.waitForPage(null);
		{
			think(0.014);
		}
		web.button(101,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_button_Approve}}")
				.click();
		web.window(102,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_window_0_2}}")
				.waitForPage(null);
		{
			think(0.013);
		}
		web.link(106,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_a_Logout}}")
				.click();
		web.window(107,
				"{{obj.PO_CreateRequisitionAndApproval_User_ENAZIFH_001.web_window_0_1}}")
				.waitForPage(null);
		

	}

	public void finish() throws Exception {
		
	}
}
