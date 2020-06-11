import java.util.concurrent.TimeUnit;

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
		web.window(70,
				"{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_window}}").navigate("http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE");
		web.window(71,
				"{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_window}}").waitForPage(null);
		{
			think(6.688);
		}
		web.textBox(
				74,
				"{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_input_UID}}").click();
		
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_input_UID}}").setText("LAOE ");
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_input_Password}}").click();
		
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_input_Password}}").setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.button("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_button_LogInButton}}").click();
		web.window("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_window_0_2}}").waitForPage(null);
		{
			think(8.327);
		}
		web.link("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_a_Purchase_Requisition_7118}}").click();
		web.window("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_window}}").waitForPage(180,true);
		{
			think(0.464);
		}
		if(web.button("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_button_Approve}}").exists(180, TimeUnit.SECONDS))
		{
		web.button("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_button_Approve}}").click();
		}
		web.window(87,
			
				"{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_window_0_2}}")
				.waitForPage(180,true);
		{
			think(4.288);
		}
		web.link(90,
				"{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_a_Logout}}")
				.click();
		web.window(111,
				"{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_window}}")
				.waitForPage(null);
		{
			think(3.057);
		}
		
		
	}

	public void finish() throws Exception {
		web.window("{{obj.PO_CreateRequisitionAndApproval_User_LAOE_001.web_window}}").close();
	}
}
