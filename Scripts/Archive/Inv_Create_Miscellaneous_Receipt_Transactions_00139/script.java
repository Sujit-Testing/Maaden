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
	 * 1	Login to Oracle Application
2	Open the Inventory Responsibility
3	Open Transactions menu
4	Open Miscellaneous Transactions
5 	Select the respective organizations
6	Enter Date, Enter Transaction Type=Miscellaneous Receipt, Select the Adjustment Account
Account-
7	Press the Transaction Lines button
8	Enter Item, Sub inventory, Locator, Lot, Quantity, Reference and SAVE.
9	Open Material Transactions menu
10	Enter Transaction Dates, Item, Lot # and FIND
11	Open Distribution button 
12	Open Lot Button

	 */
	public void run() throws Exception {
		getDatabank("Inv_Create_Miscellaneous_Receipt_Transactions_00139")
				.getNextDatabankRecord();
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window}}").navigate("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.URL,http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE}}");
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window}}").waitForPage(180,true);		
		web.textBox("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.User_Id}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.UID,PEETHAMBARANS}}");
		web.textBox("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Password}}").setPassword("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		web.textBox("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Password}}").pressEnter();
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window}}").waitForPage(180,true);
		
		web.link("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.CORP_INVENTORY}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window}}").waitForPage(180,true);
		
		web.link("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Transactions}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window}}").waitForPage(180,true);
	
		web.link("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Miscellaneous_Transaction}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window_1}}").waitForPage(180,true);		
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(33);
		
		forms.listOfValues("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_listOfValues}}").select("MRK|MRK: CORP ALU-SBU Inventory Organization");
		forms.captureScreenshot(36);
		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.TRANSACTION_TYPE}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Type,Miscellaneous Receipt}}");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.TRANSACTION_TYPE}}").invokeSoftKey("NEXT_FIELD");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_MISC_TRX_TRANSACTION_SOUR}}").invokeSoftKey("NEXT_FIELD");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Account_Id}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Account,01.01.100.30.0000.1265.00000}}");	
		forms.button("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.TransactionLineButton}}").click();		
		forms.captureScreenshot(43);		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Item}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Item,7M0560R63}}");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Item}}").invokeSoftKey("NEXT_FIELD");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.SubInventory}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Sub_inventory,BIL-M-JUB}}");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.SubInventory}}").invokeSoftKey("NEXT_FIELD");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Locator}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Locator,M.BJ.A101}}");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Locator}}").invokeSoftKey("NEXT_FIELD");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Lot}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Lot,Automation}}");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Quantity}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Quantity,40}}");		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Reference}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Reference,Automation Test}}");
	
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_MTL_TRX_LINE}}").clickToolBarButton("Save");
		forms.captureScreenshot(55);
		
		forms.choiceBox("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_choiceBox}}").clickButton("OK");
		forms.captureScreenshot(59);
		//View Request to check the status
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_MTL_TRX_LINE}}").selectMenu("View|Requests");
		forms.captureScreenshot(62);		
		forms.button("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_button_JOBS_QF_FIND_0}}").click();		
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_JOBS}}").activate(true);
		forms.captureScreenshot(66);		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_JOBS_REQUEST_ID_0}}").setFocus();		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_JOBS_PHASE_0}}").setFocus();		
		forms.button("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_button_JOBS_REFRESH_0}}").click();
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_JOBS_REQUEST_ID_0}}").setFocus();
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_JOBS_PHASE_0}}").setFocus();	
		String completed_Status = forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_JOBS_PHASE_0}}").getText();
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_JOBS}}").close();
	
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_MTL_TRX_LINE}}").activate(true);
		forms.captureScreenshot(75);
		
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_MTL_TRX_LINE}}").close();
		forms.captureScreenshot(78);
		
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_MTL_TRX_HEADER}}").close();
		
		web.link("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Material_Transactions}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window}}").waitForPage(180,true);
		forms.captureScreenshot(86);
	
		forms.button("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_button_FINDSCREEN_CLEAR_0}}").setFocus();
		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_FINDSCREEN_FROM_DATE_0}}").setFocus();
		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_FINDSCREEN_ITEM_0}}").setText("{{db.Inv_Create_Miscellaneous_Receipt_Transactions_00139.Item,7M0560R63}}");
		
		forms.button("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_button_FINDSCREEN_FIND_BUTTON_0}}").click();
		forms.captureScreenshot(92);
		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_RESULTS_MIRROR_TRX_QUANTI}}").setFocus();
		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_RESULTS_ITEM_0}}").invokeSoftKey("NEXT_FIELD");
		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_RESULTS_SUBINVENTORY_CODE}}").invokeSoftKey("NEXT_FIELD");
	
		forms.button("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_button_CONTROL_LOT_SERIAL_0}}").click();
		forms.captureScreenshot(98);
		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_MTL_TRANSACTION_LOT_NUMBE}}").setFocus();
	
		forms.textField("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_textField_MTL_TRANSACTION_LOT_NUMBE_1}}").setFocus();
		
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_MTL_TRANSACTION_LOT_NUMBE}}").close();
		forms.captureScreenshot(103);
		
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_RESULTS_WINDOW}}").close();
		
		forms.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(107);	
		forms.close(108);
		forms.captureScreenshot(110);		
		forms.choiceBox("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.forms_choiceBox}}").clickButton("OK");
		
		web.link("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_a_Logout}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window}}").waitForPage(180,true);
	
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window}}").close();
		web.window("{{obj.Inv_Create_Miscellaneous_Receipt_Transactions_00139.web_window_1}}").close();

	}

	public void finish() throws Exception {
	}
}
