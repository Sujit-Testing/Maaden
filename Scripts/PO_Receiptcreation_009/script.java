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
		getDatabank("PO_ReceiptCreation_009").getNextDatabankRecord();
		web.window(125, "{{obj.PO_ReceiptCreation_009.web_window}}").navigate("{{db.PO_ReceiptCreation_009.URL,http://riyoramgbm02.maaden.com:8050/}}");		{
			think(0.479);
		}
	//	web.window(126, "{{obj.PO_ReceiptCreation_009.web_window}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(127, "{{obj.PO_ReceiptCreation_009.web_window}}").waitForPage(null);
		{
			think(0.514);
		}
		web.textBox(130,
				"{{obj.PO_ReceiptCreation_009.web_UID}}").click();
		
		web.textBox(131,
				"{{obj.PO_ReceiptCreation_009.web_UID}}").setText("{{db.PO_ReceiptCreation_009.UID,PEETHAMBARANS}}");
		
		web.textBox(132,
				"{{obj.PO_ReceiptCreation_009.web_UID}}").pressTab();
		
		web.textBox(133,
				"{{obj.PO_ReceiptCreation_009.web_Password}}").setPassword("{{db.PO_ReceiptCreation_009.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		
		web.button(134,
				"{{obj.PO_ReceiptCreation_009.web_button_SubmitButton}}").click();
		web.window(135, "{{obj.PO_ReceiptCreation_009.web_window}}").waitForPage(180,true);
		
		web.link(138,
				"{{obj.PO_ReceiptCreation_009.MIMC_PURCHASING_BUYER}}").click();
		web.window(139, "{{obj.PO_ReceiptCreation_009.web_window}}").waitForPage(180,true);
		
		
		web.link(143, "{{obj.PO_ReceiptCreation_009.web_a_Receipts}}").click();
		web.window(144, "{{obj.PO_ReceiptCreation_009.web_window}}").waitForPage(180,true);
		
		
		web.link(147, "{{obj.PO_ReceiptCreation_009.web_a_Receipts_1}}").click();
		web.window(148, "{{obj.PO_ReceiptCreation_009.web_window_1}}").waitForPage(180,true);
		
		forms.window(151,
				"{{obj.PO_ReceiptCreation_009.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(153);
		{
			think(0.285);
		}
		forms.listOfValues(154,
				"{{obj.PO_ReceiptCreation_009.forms_listOfValues}}").select("MGS|MIMC Magnesite Inventory Organization");
		forms.captureScreenshot(156);
		{
			think(0.794);
		}
		forms.textField(157,
				"{{obj.PO_ReceiptCreation_009.forms_textField_FIND_PO_NUM_0}}")
				.setText("{{db.PO_ReceiptCreation_009.PO_Number,841800719}}");
		
		forms.button(158,
				"{{obj.PO_ReceiptCreation_009.forms_button_FIND_FIND_0}}").click();
		{
			think(1.775);
		}
		forms.window(159,
				"{{obj.PO_ReceiptCreation_009.forms_window_FIND_WINDOW}}").activate(true);
		{
			think(0.614);
		}
		forms.button(160,
				"{{obj.PO_ReceiptCreation_009.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(162);
	
		forms.textField(163,"{{obj.PO_ReceiptCreation_009.forms_ReceiptNumber}}").setFocus();		
		{
			think(0.0);
		}
		forms.window(164, "{{obj.PO_ReceiptCreation_009.forms_window_HEADER}}").close();
		forms.captureScreenshot(166);
		
		forms.checkBox(167,
				"{{obj.PO_ReceiptCreation_009.forms_CheckBox}}").check(true);
		{
			think(1.642);
		}
		forms.window(168,
				"{{obj.PO_ReceiptCreation_009.forms_window_RECEIPTS}}").clickToolBarButton("Save");
		{
			think(0.621);
		}
//		forms.statusBar(169, "{{obj.PO_ReceiptCreation_009.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value","FRM-40400: Transaction complete: 2 records applied and saved.",MatchOption.Exact, 0);
//		{
//			think(5.798);
//		}
		forms.button(170,
				"{{obj.PO_ReceiptCreation_009.forms_button_RCV_CONTROL_HEADER_BUT_0}}").click();
		
		String receipt_Number = forms.textField(163,"{{obj.PO_ReceiptCreation_009.forms_ReceiptNumber}}").getText();
		info("receipt_Number : "+receipt_Number);
		forms.captureScreenshot();
		
		web.link(171, "{{obj.PO_ReceiptCreation_009.web_a_Logout}}").click();
		web.window(172, "{{obj.PO_ReceiptCreation_009.web_window}}").waitForPage(180,true);
		{
			think(0.242);
		}
		web.window(175, "{{obj.PO_ReceiptCreation_009.web_window_1}}").close();
		web.window(172, "{{obj.PO_ReceiptCreation_009.web_window}}").close();
		
	}

	public void finish() throws Exception {
	}
}
