import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.datatable.api.DataTableService;
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
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;

	public void initialize() throws Exception {
		browser.launch();
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		
		String PO_Receipt = null ;
		DataTableService parDatatable = datatable.getGlobalDatatable();
		
		PO_Receipt= parDatatable.getValue(1, "A").toString();
		
		web.window(292,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window}}").navigate("http://riysoaclone.maaden.com:8010");
		web.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window}}").waitForPage(180,true);
		
		web.textBox("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_input_text_unamebean}}").setText("PEETHAMBARANS");
		web.textBox("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_input_password_pwdbean}}").setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));		
		web.textBox("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_input_password_pwdbean}}").pressEnter();
				
		web.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window}}").waitForPage(180,true);
		
		web.link("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_a_MWSPC_PURCHASING_BUYER_I}}").click();
		web.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window}}").waitForPage(180,true);
		
		web.link("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_a_Receipts}}").click();
		web.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window}}").waitForPage(180,true);
		
		web.link("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_a_Receiving_Transactions}}").click();
		web.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window}}").waitForPage(180,true);
		
		web.link("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_a_Receiving_Transactions}}").click();
		web.window(323,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window_1}}").waitForPage(180,true);
		
		forms.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(329);
		
		forms.listOfValues(330,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_listOfValues}}").select("MWP|Waad S Phospate Inventory Organization");
		forms.captureScreenshot(332);
		if(forms.alertDialog("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_alertDialog}}").exists()){
			forms.alertDialog("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_alertDialog}}").clickYes();
			forms.captureScreenshot(389);
			{
				think(0.30);
			}
			web.link("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_a_Receiving_Transactions}}").click();
		}
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_FIND_RECEIPT_NUM_0}}").setText(PO_Receipt);
		
		forms.button(334,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(336);
		
		forms.checkBox("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_checkBox_RCV_TRANSACTION_LINE_CHKB}}").check(true);
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_RCV_TRANSACTION_SUBINVENT}}").openDialog();
		
		forms.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_window_TRANSACTIONS}}").activate(true);
		
		forms.listOfValues("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_listOfValues}}").select("MWP COMP|MWP Completion Warehouse");
		forms.captureScreenshot(342);
	
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_RCV_TRANSACTION_SUBINVENT}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_RCV_TRANSACTION_LOCATOR_D}}").setText("NEW.01.COM");
		
		forms.window(345,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_window_TRANSACTIONS}}").clickToolBarButton("Save");
		
		forms.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_window_TRANSACTIONS}}").close();
		
		web.link("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_a_Receiving_Transactions_Su}}").click();
		web.window(349,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window}}").waitForPage(180,true);
		forms.captureScreenshot(354);
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_FIND_RECEIPT_NUM_0}}").setText(PO_Receipt);
		
		forms.button("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(358);
		
		forms.button("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_button_HEADERS_FOLDER_TX_HISTORY}}").click();
		forms.captureScreenshot(361);
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_DISPLAYED_TR}}").setFocus();
		info("Receive-> "+forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_DISPLAYED_TR}}").getText());
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_DISPLAYED_DE}}").setFocus();
		info("Receiving -> "+forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_DISPLAYED_DE}}").getText());
		
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_DISPLAYED_DE_1}}").setFocus();
		info("Inventory -->"+forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_DISPLAYED_DE_1}}").getText());
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_PLUS_MINUS_0}}").click();
		
//		forms.statusBar(366,
//				"{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_statusBar}}")
//				.assertText(
//						"FormsFT AutoValidation: Verify StatusBar text value",
//						"FRM-40100: At first record.", MatchOption.Exact, 0);
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_DISPLAYED_TR}}").setFocus();
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_PLUS_MINUS_0}}").click();
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_textField_LINES_FOLDER_DISPLAYED_TR}}").setFocus();
		
		forms.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_window_LINES}}").close();
		forms.captureScreenshot(372);
		
		forms.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_window_HEADERS}}").close();
		
		web.link("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_a_Logout}}").click();
		
		web.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window}}").waitForPage(180,true);
		
		web.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window}}").close();
		web.window("{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window_1}}").close();
		//forms.close(380);
		/*
		web.window(391,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window_0}}")
				.navigate(
						"http://riysoaclone.maaden.com:8010/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE##");
		web.window(392,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window_0}}")
				.navigate(
						"http://riysoaclone.maaden.com:8010/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE##");
		{
			think(24.995);
		}
		forms.window(393,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_window_NAVIGATOR}}")
				.activate(true);
		forms.captureScreenshot(395);
		{
			think(0.308);
		}
		forms.alertDialog(396,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.forms_alertDialog}}")
				.clickYes();
		forms.captureScreenshot(398);
		{
			think(25.761);
		}
		web.link(399,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.web_a_Receiving_Transactions_1}}")
				.click();
		web.window(400,
				"{{obj.PO_ReceivingAndDeliver_010_Receiving.web_window_0}}")
				.waitForPage(null);
		*/
		
		
	}

	public void finish() throws Exception {
	}
}
