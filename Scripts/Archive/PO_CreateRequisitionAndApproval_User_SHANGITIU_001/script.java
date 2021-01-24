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
		web.window(2,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_window_0}}")
				.navigate(
						"http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE");
		web.window(4,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_window_0_2}}")
				.waitForPage(null);
		{
			think(0.142);
		}
		web.textBox(
				7,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_input_text_unamebean}}")
				.click();
		{
			think(1.289);
		}
		web.textBox(
				8,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_input_text_unamebean}}")
				.setText("SHANGITIU");
		{
			think(1.048);
		}
		web.textBox(
				9,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_input_text_unamebean}}")
				.pressTab();
		{
			think(0.751);
		}
		web.textBox(
				10,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		{
			think(0.198);
		}
		web.textBox(
				11,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(12,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_window_0_3}}")
				.waitForPage(null);
		{
			think(1.628);
		}
		web.link(
				15,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_a_Purchase_Requisition_7119}}")
				.click();
		web.window(16,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_window_0_4}}")
				.waitForPage(null);
		{
			think(1.597);
		}
		web.button(19,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_button_Approve}}")
				.click();
		web.window(20,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_window_0_3}}")
				.waitForPage(null);
		{
			think(1.994);
		}
		web.link(23,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_a_Logout}}")
				.click();
		web.window(24,
				"{{obj.PO_CreateRequisitionAndApproval_User_SHANGITIU_001.web_window_0_2}}")
				.waitForPage(null);

	}

	public void finish() throws Exception {
	}
}
