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
		getDatabank("PO_ExpressReceive_011").getNextDatabankRecord();
		web.window(72, "{{obj.PO_ExpressReceive_011.web_window}}").navigate("http://riysoaclone.maaden.com:8010/");
		{
			think(0.063);
		}
		//web.window(73, "{{obj.PO_ExpressReceive_011.web_window}}").navigate("http://riysoaclone.maaden.com:8010/");
		web.window(74, "{{obj.PO_ExpressReceive_011.web_window}}").waitForPage(null);
		{
			think(10.964);
		}
		web.textBox(77,
				"{{obj.PO_ExpressReceive_011.web_UID}}").click();
		
		web.textBox(78,
				"{{obj.PO_ExpressReceive_011.web_UID}}").setText("{{db.PO_ExpressReceive_011.UID,ALHARBIK}}");
		
		web.textBox(79,
				"{{obj.PO_ExpressReceive_011.web_UID}}")
				.pressTab();
		{
			think(0.032);
		}
		web.textBox(80,
				"{{obj.PO_ExpressReceive_011.web_Password}}")
				.setPassword("{{db.PO_ExpressReceive_011.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		{
			think(1.578);
		}
		web.button(81, "{{obj.PO_ExpressReceive_011.web_LogInSubmitButton}}")
				.click();
		web.window(82, "{{obj.PO_ExpressReceive_011.web_window}}")
				.waitForPage(null);
		{
			think(5.437);
		}
		web.link(85, "{{obj.PO_ExpressReceive_011.web_a_MPC_IPROCUREMENT}}")
				.click();
		web.window(86, "{{obj.PO_ExpressReceive_011.web_window}}")
				.waitForPage(null);
		{
			think(2.093);
		}
		web.link(89,
				"{{obj.PO_ExpressReceive_011.web_a_iProcurement_Home_Page}}")
				.click();
		web.window(90, "{{obj.PO_ExpressReceive_011.web_window}}")
				.waitForPage(null);
		{
			think(4.344);
		}
		web.link(93, "{{obj.PO_ExpressReceive_011.web_a_Receiving}}").click();
		web.window(94, "{{obj.PO_ExpressReceive_011.web_window}}").waitForPage(null);
		{
			think(12.877);
		}
		if(web.element(97, "{{obj.PO_ExpressReceive_011.web_RequestionNumber}}").exists(5, TimeUnit.SECONDS)){	
		info("Requisition number is: "+web.element(97, "{{obj.PO_ExpressReceive_011.web_RequestionNumber}}").getDisplayText());
		//web.element(97, "{{obj.PO_ExpressReceive_011.web_RequestionNumber}}").click();
		
		}
		{
			think(3.594);
		}
		web.image(98, "{{obj.PO_ExpressReceive_011.web_img_Express_Receive}}")
				.click();
		web.window(99, "{{obj.PO_ExpressReceive_011.web_window}}")
				.waitForPage(null);
		{
			think(2.203);
		}
		web.button(102,
				"{{obj.PO_ExpressReceive_011.web_SubmitButton}}")
				.click();
		web.window(103, "{{obj.PO_ExpressReceive_011.web_window}}")
				.waitForPage(null);
		{
			think(6.627);
		}
		info(web.element("{{obj.PO_ExpressReceive_011.web_b_Receipt_52519008081_}}").getDisplayText());
		web.element(106,
				"{{obj.PO_ExpressReceive_011.web_b_Receipt_52519008081_}}").click();
		{
			think(6.516);
		}
		info("web_ReceiptNumber is : "+web.element(107, "{{obj.PO_ExpressReceive_011.web_ReceiptNumber}}").getDisplayText());
		web.element(107, "{{obj.PO_ExpressReceive_011.web_ReceiptNumber}}").click();
		{
			think(10.826);
		}
		web.window(108, "{{obj.PO_ExpressReceive_011.web_window}}").close();
		{
			think(0.031);
		}
		web.window(109, "{{obj.PO_ExpressReceive_011.web_window_1}}").close();
		
		

	}

	public void finish() throws Exception {
	}
}
