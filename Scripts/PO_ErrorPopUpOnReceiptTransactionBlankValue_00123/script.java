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
	 * Scenario-  Receipt Shipment Mode Value needs to be required if Po returned to supplier
	 * 
	 * "1) Open the Browser
2) Login with correct user
3) Click on MWSPC_PURCHASING_SUPERUSE-> Receiving->Returns
4) Provide the PO number and Click on Find->Select the first row-> Provide the quantity and Supplier->Click  Save 
5) Error encountered, saying Receipt Transaction 
6) LogOut and Close the browser"

	 */
	public void run() throws Exception {
		getDatabank("PO_ErrorPopUpOnReceiptTransactionBlankValue_00123").getNextDatabankRecord();
		web.window(100, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_0}}").navigate("http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE");
		web.window(102, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_0_1}}").waitForPage(180,true);
		web.textBox(106,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_input_text_unamebean}}").click();		
		web.textBox("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_input_text_unamebean}}").setText("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.UID,PEETHAMBARANS}}");		
		web.textBox("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_input_text_unamebean}}").pressTab();
		
		web.textBox("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_input_password_pwdbean}}").setPassword("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		
		web.textBox(110,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_input_password_pwdbean}}").pressEnter();
		web.window(111, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_0_2}}").waitForPage(180,true);
	
		web.link(115,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_a_MWSPC_PURCHASING_SUPERUSE}}").click();
		web.window(116, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_0_2}}").waitForPage(10,true);
		if(web.alertDialog("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_dialog_alert_Syntax_error}}").exists()){
			web.alertDialog("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_dialog_alert_Syntax_error}}").clickOk();
			}
		
		
//		web.link(126,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_a_Purchase_Order_Summary}}").click();
//		web.window(127, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_1}}").waitForPage(180,true);
//		if(web.alertDialog("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_dialog_alert_Syntax_error}}").exists()){
//			web.alertDialog("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_dialog_alert_Syntax_error}}").clickOk();
//			}
//		web.window(127, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_1}}").waitForPage(180,true);
//		forms.captureScreenshot(132);
//		
//		
//		//forms.textField(133,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
//		if(forms.textField(134,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_FIND_PO_NUM_0}}").exists(180, TimeUnit.SECONDS)){
//		forms.textField(134,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_FIND_PO_NUM_0}}").setText("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.PO_Number,741903124}}");
//		}
//		forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_FIND_LINE_NUM_0}}").setText("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.PO_LineNumber,3}}");
//		
//		if(forms.button("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_button_FIND_FIND_0}}").exists(10, TimeUnit.SECONDS)){
//		forms.button("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_button_FIND_FIND_0}}").click();
//		}
//		forms.captureScreenshot(138);
//	
//		forms.button("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_button_LINES_FOLDER_CONTROL_SHIP}}").click();
//		forms.captureScreenshot(141);
//		
//		//Quantity_Due
//		forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_SHIPMENTS_FOLDER_QUANTITY}}").setFocus();
//		info("Quantity_Due  before Return -> "+forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_SHIPMENTS_FOLDER_QUANTITY}}").getText());
//		
//		//Quantity_Receive
//		forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_SHIPMENTS_FOLDER_QUANTITY_1}}").setFocus();
//		info("Quantity_Receive before Return -> "+forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_SHIPMENTS_FOLDER_QUANTITY_1}}").getText());
//		forms.captureScreenshot(145);
//		
//		forms.close(146);
//		forms.captureScreenshot(148);
//		
//		forms.choiceBox(149, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_choiceBox}}").clickButton("OK");
//		
//		web.element(150,
//				"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_div_menuLayout_div}}").click();
//		{
//			think(5.791);
//		}
		web.link(151, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_a_Receiving}}").click();
		web.window(152, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_0_2}}").waitForPage(180,true);
		

		web.link(235, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_a_Returns}}").click();
		web.window(236, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_1}}").waitForPage(180,true);
		if(web.alertDialog("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_dialog_alert_Syntax_error}}").exists()){
			web.alertDialog("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_dialog_alert_Syntax_error}}").clickOk();
			}
	
		{
			think(0.282);
		}
		forms.window("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(243);
		if(forms.listOfValues("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_listOfValues}}").exists(30, TimeUnit.SECONDS)){
		forms.listOfValues("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_listOfValues}}").select("MWP|Waad S Phospate Inventory Organization");
		}
		forms.captureScreenshot(246);
		
		forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_FIND_PO_NUM_0}}").setText("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.PO_Number,741903124}}");
		
		forms.textField(248,
				"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_FIND_PO_LINE_0}}").setText("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.PO_LineNumber,3}}");
		
		forms.button(249,
				"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(251);
		
		forms.checkBox("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_checkBox_RCV_TRANSACTION_LINE_CHKB}}").setFocus();
		
		forms.tab("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_tab_ALTER_REGION_CONTROL}}").select("Order Information");
		
		forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_RCV_TRANSACTION_TRANSACTI}}").setText("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.Returned_Qty,2}}");
		
		forms.tab("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_tab_ALTER_REGION_CONTROL}}").select("Transactions");
		
		forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_RCV_TRANSACTION_RETURN_TO}}").setText("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.Returned_To,Supplier}}");
		
		forms.window("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_window_TRANSACTIONS}}").clickToolBarButton("Save");
		
		forms.captureScreenshot();
		
		/*
		//Receiving Transaction Pop-Up error handling 
		
		if(forms.choiceBox("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_choiceBox}}").exists()){
			forms.choiceBox("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_choiceBox}}").clickButton("OK");
			forms.captureScreenshot(336);
			
			forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_RCV_TRANSACTION_DESCFLEX_}}").setFocus();
			forms.captureScreenshot(339);
			
			forms.flexWindow("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_flexWindow}}").openDialog("Receipt Shipment Mode", "");
			
			forms.captureScreenshot(373);
			
			forms.listOfValues(374,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_listOfValues}}").find("%Ship");
			
			forms.listOfValues("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_listOfValues}}").select("Ship|Ship");
			forms.captureScreenshot(377);
		
			forms.flexWindow(378,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_flexWindow}}").clickOk();
			forms.window("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_window_TRANSACTIONS}}").clickToolBarButton("Save");
			}
//		
//		forms.statusBar(258, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_statusBar}}").assertText(	"FormsFT AutoValidation: Verify StatusBar text value",
//						"FRM-40400: Transaction complete: 1 records applied and saved.",
//						MatchOption.Exact, 0);
		forms.captureScreenshot(260);
		
		forms.close(261);
		forms.captureScreenshot(263);
		
		forms.choiceBox(264, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_choiceBox}}").clickButton("OK");
		
		web.link(265,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_a_Purchase_Order_Summary}}").click();
		web.window(266, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_1}}").waitForPage(180,true);
		if(web.alertDialog("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_dialog_alert_Syntax_error}}").exists()){
			web.alertDialog("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_dialog_alert_Syntax_error}}").clickOk();
			}
		
		forms.captureScreenshot(271);		
	
		if(forms.textField(134,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_FIND_PO_NUM_0}}").exists(180, TimeUnit.SECONDS)){
			forms.textField(134,"{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_FIND_PO_NUM_0}}").setText("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.PO_Number,741903124}}");
			forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_FIND_LINE_NUM_0}}").setText("{{db.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.PO_LineNumber,3}}");	
		}
				
		forms.button("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(277);
		
		forms.button("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_button_LINES_FOLDER_CONTROL_SHIP}}").click();
		forms.captureScreenshot(280);
		//Quantity_Due
		forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_SHIPMENTS_FOLDER_QUANTITY}}").setFocus();
		info("Quantity_Due after Return ->"+forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_SHIPMENTS_FOLDER_QUANTITY}}").getText());
		
		//Quantity_Receive
		forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_SHIPMENTS_FOLDER_QUANTITY_1}}").setFocus();
		info("Quantity_Receive after Return "+forms.textField("{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_textField_SHIPMENTS_FOLDER_QUANTITY_1}}").getText());
		
		forms.captureScreenshot(284);
		
		forms.close(285);
		forms.captureScreenshot(287);
		
		forms.choiceBox( "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.forms_choiceBox}}").clickButton("OK");
		*/
		
		web.window(289, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_0_2}}").close();		
		web.window(290, "{{obj.PO_ErrorPopUpOnReceiptTransactionBlankValue_00123.web_window_1}}").close();

		
	}

	public void finish() throws Exception {
	}
}
