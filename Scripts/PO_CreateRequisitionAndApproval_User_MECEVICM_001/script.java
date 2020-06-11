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
		web.window(30,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_window_0}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		{
			think(0.028);
		}
		web.window(31,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_window_0}}")
				.navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(32,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_window_0_2}}")
				.waitForPage(180,true);
		{
			think(9.16);
		}
		web.textBox(
				35,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_input_text_unamebean}}")
				.click();
		{
			think(0.611);
		}
		web.textBox(
				36,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_input_text_unamebean}}")
				.setText("MECEVICM ");
		{
			think(0.719);
		}
		web.textBox(
				37,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_input_password_pwdbean}}")
				.click();
		{
			think(0.74);
		}
		web.textBox(
				38,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		{
			think(1.04);
		}
		web.button(
				39,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_button_SubmitButton}}")
				.click();
		web.window(40,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_window_0_3}}")
				.waitForPage(180,true);
		{
			think(2.784);
		}
		web.link(
				43,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_a_Purchase_Requisition_7118}}")
				.click();
		web.window(44,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_window_0_4}}")
				.waitForPage(180,true);
		{
			think(2.148);
		}
		web.button(48,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_button_Approve}}")
				.click();
		web.window(49,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_window_0_3}}")
				.waitForPage(180,true);
		{
			think(2.884);
		}
		web.link(52,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_a_Logout}}")
				.click();
		web.window(53,
				"{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_window_0_2}}").waitForPage(180,true);
		

	}

	public void finish() throws Exception {
		web.window("{{obj.PO_CreateRequisitionAndApproval_User_MECEVICM_001.web_window_0_2}}").close();
	}
}
