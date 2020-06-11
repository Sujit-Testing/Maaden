import java.util.concurrent.TimeUnit;

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
import lib.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.applet.api.AppletService applet;
	@ScriptService oracle.oats.scripting.modules.formsFT.api.FormsService forms;
	@FunctionLibrary("PO_ReceivingAndDeliver_Receiving_010") lib.maaden.orackeEBS.PO_ReceivingAndDeliver_Receiving_010 pO_ReceivingAndDeliver_Receiving_010;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;

	public void initialize() throws Exception {
		browser.launch();
	}

	/**
	 * Consider those PO number which Receipt Routing is Standard Receipt 
	 * Step to make the PO with Standard Receipt 
	 *  PO Summary->provide the PO-> Find->Shipment->Receiving Control->Miscellaneous->Receipt Routing ->Standared Receipt
 
	 */
	public void run() throws Exception {
		
		getDatabank("PO_ReceivingAndDeliver_010").getNextDatabankRecord();
		 String PO_Receipt  =null;
		 
	         DataTableService parDatatable = datatable.getGlobalDatatable(); 
	         //Store the value in the data table using setValue() method.(1-> Row number, A-> colomn number, abc-> value which need to store)
	       
		web.window(2, "{{obj.PO_ReceivingAndDeliver_010.web_window}}").navigate("{{db.PO_ReceivingAndDeliver_010.URL,http://riysoaclone.maaden.com:8010/}}");
		web.window(5, "{{obj.PO_ReceivingAndDeliver_010.web_window}}").waitForPage(null);
		
		web.textBox(8,
				"{{obj.PO_ReceivingAndDeliver_010.web_input_text_unamebean}}").click();		
		web.textBox(9,
				"{{obj.PO_ReceivingAndDeliver_010.web_input_text_unamebean}}").setText("{{db.PO_ReceivingAndDeliver_010.UID,PEETHAMBARANS}}");
	
		web.textBox(10,
				"{{obj.PO_ReceivingAndDeliver_010.web_input_text_unamebean}}").pressTab();
		
		web.textBox(11,
				"{{obj.PO_ReceivingAndDeliver_010.web_input_password_pwdbean}}").setPassword("{{db.PO_ReceivingAndDeliver_010.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		
		web.button(12,
				"{{obj.PO_ReceivingAndDeliver_010.web_button_SubmitButton}}").click();
		web.window(13, "{{obj.PO_ReceivingAndDeliver_010.web_window}}").waitForPage(null);
		
		web.link("{{obj.PO_ReceivingAndDeliver_010.web_a_MWSPC_PURCHASING_SUPERUSE}}").click();
		web.window(339, "{{obj.PO_ReceivingAndDeliver_010.web_window}}").waitForPage(180,true);

		
		web.link(345, "{{obj.PO_ReceivingAndDeliver_010.web_a_Receiving}}").click();
		web.window(346, "{{obj.PO_ReceivingAndDeliver_010.web_window}}").waitForPage(180,true);
		
		web.link(349, "{{obj.PO_ReceivingAndDeliver_010.web_a_Receipts_1}}").click();
		web.window(350, "{{obj.PO_ReceivingAndDeliver_010.web_window}}").waitForPage(180,true);

		if(web.alertDialog(29,"{{obj.PO_ReceivingAndDeliver_010.web_dialog_alert_Syntax_error}}").exists()){
			web.alertDialog(29,"{{obj.PO_ReceivingAndDeliver_010.web_dialog_alert_Syntax_error}}").clickOk();
		}
		
		web.window(30, "{{obj.PO_ReceivingAndDeliver_010.web_window_1}}").waitForPage(180,true);
	
		forms.window(31,
				"{{obj.PO_ReceivingAndDeliver_010.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(33);
		{
			think(0.217);
		}
		if(forms.listOfValues(34,"{{obj.PO_ReceivingAndDeliver_010.forms_listOfValues}}").exists(180, TimeUnit.SECONDS)){
		forms.listOfValues(34,"{{obj.PO_ReceivingAndDeliver_010.forms_listOfValues}}").select("MWP|Waad S Phospate Inventory Organization");
		}
		
		forms.captureScreenshot(71);
		
		forms.textField(72,"{{obj.PO_ReceivingAndDeliver_010.PO_Number}}").setText("{{db.PO_ReceivingAndDeliver_010.PO_Number,741802819}}");
		forms.textField("{{obj.PO_ReceivingAndDeliver_010.PO_Number}}").invokeSoftKey("NEXT_FIELD");
		forms.textField("{{obj.PO_ReceivingAndDeliver_010.PO_LineNumber}}").setText("{{db.PO_ReceivingAndDeliver_010.Line_Number,4}}");
		
		forms.button("{{obj.PO_ReceivingAndDeliver_010.forms_button_FIND_FIND_0}}").click();
		{
			think(2.954);
		}
		forms.window("{{obj.PO_ReceivingAndDeliver_010.forms_window_RECEIPTS}}").activate(true);
		forms.captureScreenshot(76);
		
		forms.checkBox("{{obj.PO_ReceivingAndDeliver_010.forms_checkBox_RCV_TRANSACTION_LINE_CHKB}}").check(true);
		
		if(forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").exists()){
		forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
		}
		
		forms.window("{{obj.PO_ReceivingAndDeliver_010.forms_window_RECEIPTS}}").clickToolBarButton("Save");
		
		if(forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").exists()){
			forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
			}
		
		forms.button("{{obj.PO_ReceivingAndDeliver_010.forms_button_RCV_CONTROL_HEADER_BUT_0}}").click();
		forms.captureScreenshot(251);
		if(forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").exists()){
			forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
			}
		
		forms.textField(252,"{{obj.PO_ReceivingAndDeliver_010.forms_textField_HEADER_RECEIPT_NUM_0}}").setFocus();
		// Getting the PO_Receipt
		PO_Receipt = forms.textField(252,"{{obj.PO_ReceivingAndDeliver_010.forms_textField_HEADER_RECEIPT_NUM_0}}").getText();
		info(PO_Receipt);
		
		//Stored value in the DB
		parDatatable.setValue(1, "A", PO_Receipt);
		
		
		forms.captureScreenshot(255);
		forms.window(253,"{{obj.PO_ReceivingAndDeliver_010.forms_window_HEADER}}").close();
		forms.captureScreenshot(255);
		if(forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").exists()){
			forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
			}
		forms.checkBox(256,"{{obj.PO_ReceivingAndDeliver_010.forms_checkBox_RCV_TRANSACTION_LINE_CHKB}}").setFocus();
		
		forms.window("{{obj.PO_ReceivingAndDeliver_010.forms_window_RECEIPTS}}").close();
		if(forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").exists()){
			forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
			}
		forms.captureScreenshot(259);
		
		forms.close(260);
		forms.captureScreenshot(262);
		
		forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
		
		web.window(325, "{{obj.PO_ReceivingAndDeliver_010.web_window}}").close();
		
		web.window(326, "{{obj.PO_ReceivingAndDeliver_010.web_window_1}}").close();
		browser.launch();
		pO_ReceivingAndDeliver_Receiving_010.run();
				/*
		
		web.link("{{obj.PO_ReceivingAndDeliver_010.web_a_Receiving_Transactions}}").click();
		web.window(265, "{{obj.PO_ReceivingAndDeliver_010.web_window_1}}").waitForPage(180,true);
		if(web.alertDialog(29,"{{obj.PO_ReceivingAndDeliver_010.web_dialog_alert_Syntax_error}}").exists()){
			web.alertDialog(29,"{{obj.PO_ReceivingAndDeliver_010.web_dialog_alert_Syntax_error}}").clickOk();
		}else if(forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").exists()){
			forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
			web.link("{{obj.PO_ReceivingAndDeliver_010.web_a_Receiving_Transactions}}").click();
			}
		
		
		forms.window(268,"{{obj.PO_ReceivingAndDeliver_010.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(270);
		{
			think(0.301);
		}
		if(forms.listOfValues(271,"{{obj.PO_ReceivingAndDeliver_010.forms_listOfValues}}").exists(180, TimeUnit.SECONDS)){
		forms.listOfValues(271,"{{obj.PO_ReceivingAndDeliver_010.forms_listOfValues}}").select("MWP|Waad S Phospate Inventory Organization");
		}
		if(forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").exists()){
			forms.choiceBox(263,"{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
			web.link("{{obj.PO_ReceivingAndDeliver_010.web_a_Receiving_Transactions}}").click();
			}
		if(forms.alertDialog(338, "//forms:alertDialog").exists()){
			forms.alertDialog(338, "//forms:alertDialog").clickYes();
			web.link("{{obj.PO_ReceivingAndDeliver_010.web_a_Receiving_Transactions}}").click();
		}
		
		forms.captureScreenshot(273);
		forms.textField("{{obj.PO_ReceivingAndDeliver_010.forms_textField_FIND_RECEIPT_NUM_0}}").setText("PO_Receipt");
//		if(forms.textField(274,"{{obj.PO_ReceivingAndDeliver_010.forms_textField_FIND_RECEIPT_NUM_0}}").exists()){
//			forms.textField(274,"{{obj.PO_ReceivingAndDeliver_010.forms_textField_FIND_RECEIPT_NUM_0}}").setText("751919105");//PO_Receipt);
//			forms.captureScreenshot();
//		}		
		
		forms.button("{{obj.PO_ReceivingAndDeliver_010.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(277);
		
		forms.checkBox(278,"{{obj.PO_ReceivingAndDeliver_010.forms_checkBox_RCV_TRANSACTION_LINE_CHKB}}").check(true);
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010.forms_textField_RCV_TRANSACTION_SUBINVENT}}").click();
		forms.textField("{{obj.PO_ReceivingAndDeliver_010.forms_textField_RCV_TRANSACTION_SUBINVENT}}").openDialog();
		
		forms.window("{{obj.PO_ReceivingAndDeliver_010.forms_window_TRANSACTIONS}}").activate(true);
		
		forms.listOfValues(281,	"{{obj.PO_ReceivingAndDeliver_010.forms_listOfValues}}").select("MWP COMP|MWP Completion Warehouse");
		
		forms.captureScreenshot(283);
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010.forms_textField_RCV_TRANSACTION_LOCATOR_D}}").setText("{{db.PO_ReceivingAndDeliver_010.Locator,NEW.01.COM}}");
		{
			think(0.021);
		}
		forms.window("{{obj.PO_ReceivingAndDeliver_010.forms_window_TRANSACTIONS}}").clickToolBarButton("Save");
		{
			think(0.422);
		}
		forms.statusBar("{{obj.PO_ReceivingAndDeliver_010.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value","FRM-40400: Transaction complete: 1 records applied and saved.",MatchOption.Exact, 0);
		forms.captureScreenshot(288);
		
		forms.close(289);
		forms.captureScreenshot(291);
		
		forms.choiceBox("{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
	
		web.link("{{obj.PO_ReceivingAndDeliver_010.web_a_Receiving_Transactions_Su}}").click();
		if(web.alertDialog(29,"{{obj.PO_ReceivingAndDeliver_010.web_dialog_alert_Syntax_error}}").exists()){
			web.alertDialog(29,"{{obj.PO_ReceivingAndDeliver_010.web_dialog_alert_Syntax_error}}").clickOk();
		}
		
		web.window(301, "{{obj.PO_ReceivingAndDeliver_010.web_window_1}}")
				.waitForPage(180,true);
		{
			think(31.761);
		}
		forms.window(304,"{{obj.PO_ReceivingAndDeliver_010.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(306);
		{
			think(0.221);
		}
		forms.listOfValues(307,"{{obj.PO_ReceivingAndDeliver_010.forms_listOfValues}}").select("MWP|Waad S Phospate Inventory Organization");
		forms.captureScreenshot(309);
		if(forms.alertDialog(338, "//forms:alertDialog").exists()){
			forms.alertDialog(338, "//forms:alertDialog").clickYes();
			web.link("{{obj.PO_ReceivingAndDeliver_010.web_a_Receiving_Transactions_Su}}").click();
		}
		forms.textField("{{obj.PO_ReceivingAndDeliver_010.forms_textField_FIND_RECEIPT_NUM_0}}").setText(PO_Receipt);
		//forms.textField("{{obj.PO_ReceivingAndDeliver_010.forms_textField_FIND_RECEIPT_NUM_0}}").setText("751919105");
		
		forms.button(311,
				"{{obj.PO_ReceivingAndDeliver_010.forms_button_FIND_FIND_0}}")
				.click();
		forms.captureScreenshot(313);
		
		forms.button(314,
				"{{obj.PO_ReceivingAndDeliver_010.forms_button_HEADERS_FOLDER_TX_HISTORY}}").click();
		forms.captureScreenshot(316);
		
		forms.textField(317,
				"{{obj.PO_ReceivingAndDeliver_010.forms_textField_LINES_FOLDER_DISPLAYED_TR}}").setFocus();
		
		forms.textField("{{obj.PO_ReceivingAndDeliver_010.forms_textField_LINES_FOLDER_DISPLAYED_TR_1}}").setFocus();
		forms.captureScreenshot(320);
		
		forms.close(321);
		forms.captureScreenshot(323);
		
		forms.choiceBox("{{obj.PO_ReceivingAndDeliver_010.forms_choiceBox}}").clickButton("OK");
		
		web.window(325, "{{obj.PO_ReceivingAndDeliver_010.web_window}}").close();
		
		web.window(326, "{{obj.PO_ReceivingAndDeliver_010.web_window_1}}").close();
*/
		
	}

	public void finish() throws Exception {
	}
}
