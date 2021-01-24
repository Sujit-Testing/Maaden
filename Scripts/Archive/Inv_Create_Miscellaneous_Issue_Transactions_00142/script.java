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
	 1	Login to Oracle Application
2	Open the Inventory Responsibility
3	Open Transactions menu
4	Open Miscellaneous Transactions
5	Select the respective organizations
6	Enter Date, Enter Transaction Type=Miscellaneous Issue, Select the Adjustment Account
7	Press the Transaction Lines button
8	Enter Item, Sub inventory, Locator, Lot, Quantity, Reference and SAVE.
9	Open Material Transactions menu
10	Enter Transaction Dates, Item, Lot # and FIND
11	Open Distribution button
12	Open Lot Button
13	Close Lot Transactions and Material Transactions form

	 */
	public void run() throws Exception {
		getDatabank("Inv_Create_Miscellaneous_Issue_Transactions_00142").getNextDatabankRecord();
		web.window(127,
				"{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window}}").navigate("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.URL,http://riysoaclone.maaden.com:8010/}}");
		web.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window}}").waitForPage(180,true);		
		web.textBox("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_input_text_unamebean}}").setText("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.UID,PEETHAMBARANS}}");		
		web.textBox("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_input_password_pwdbean}}").setPassword("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		web.textBox("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_input_password_pwdbean}}").pressEnter();
		web.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window}}").waitForPage(180,true);
		web.link("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_a_CORP_INVENTORY}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window}}").waitForPage(180,true);
		web.link("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_a_Transactions}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window}}").waitForPage(180,true);
		web.link("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_a_Miscellaneous_Transaction}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window_1}}").waitForPage(180,true);
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(158);
		forms.listOfValues("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_listOfValues}}").select("MRK|MRK: CORP ALU-SBU Inventory Organization");
		forms.captureScreenshot(161);
		{
			think(4.824);
		}
		//Set issue type, Account Number and click the transaction line button
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MISC_TRX_TRANSACTION_TYPE}}").setText("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.Type,Miscellaneous Issue}}");	
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MISC_TRX_TRANSACTION_TYPE}}").invokeSoftKey("NEXT_FIELD");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MISC_TRX_TRANSACTION_SOUR}}").invokeSoftKey("NEXT_FIELD");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MISC_TRX_DIST_ACCT_0}}").setText("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.Account,01.01.100.30.0000.1265.00000}}");
		forms.button("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_button_MISC_TRX_TRX_LINE_BUTTON_}}").click();
		forms.captureScreenshot(168);
		{
			think(2.24);
		}
		//Enter Item, Sub inventory, Locator, Lot, Quantity, Reference and SAVE
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MTL_TRX_LINE_ITEM_0}}").setText("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.Item,MS0031}}");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MTL_TRX_LINE_ITEM_0}}").invokeSoftKey("NEXT_FIELD");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.SubInventory}}").setText("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.Sub_inventory,STD-M-JUB}}");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.SubInventory}}").invokeSoftKey("NEXT_FIELD");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.locator}}").setText("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.Locator,M.SJ.B125}}");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.locator}}").invokeSoftKey("NEXT_FIELD");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.LotNumber}}").setText("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.Lot,K20S1897A-006}}");
		String lotNumber = forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.LotNumber}}").getText();
		
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.LotNumber}}").invokeSoftKey("NEXT_FIELD");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MTL_TRX_LINE_TRANSACTION__1}}").setText("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.Quantity,.01}}");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MTL_TRX_LINE_TRANSACTION__2}}").setText("6000");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MTL_TRX_LINE_TRANSACTION__3}}").setText("{{db.Inv_Create_Miscellaneous_Issue_Transactions_00142.Reference,Free Text}}");
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_MTL_TRX_LINE}}").clickToolBarButton("Save");
		forms.captureScreenshot(184);
		{
			think(2.749);
		}
		forms.choiceBox("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_choiceBox}}").clickButton("OK");
		//Select View-Request
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_MTL_TRX_LINE}}").selectMenu("View|Requests");
		forms.captureScreenshot(191);
		forms.button("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_button_JOBS_QF_FIND_0}}").click();
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_JOBS}}").activate(true);
		forms.captureScreenshot(195);
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_JOBS_REQUEST_ID_0}}").setFocus();
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_JOBS_PHASE_0}}").setFocus();
		forms.button("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_button_JOBS_REFRESH_0}}").click();
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_JOBS_REQUEST_ID_0}}").setFocus();
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_JOBS_PHASE_0}}").setFocus();
		forms.button("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_button_JOBS_REFRESH_0}}").click();
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_JOBS_REQUEST_ID_0}}").setFocus();
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_JOBS}}").close();
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_MTL_TRX_LINE}}")	.activate(true);
		forms.captureScreenshot(206);
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_MTL_TRX_LINE}}").close();
		forms.captureScreenshot(209);
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_MTL_TRX_HEADER}}").close();
		//Open Material Transactions menu
		web.link("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_a_Material_Transactions}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window}}").waitForPage(180,true);
		forms.captureScreenshot(217);
		//Set source Type and Transaction type
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_FINDSCREEN_TRANSACTION_SO}}").setText("Inventory");
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_FINDSCREEN_TRANSACTION_TY}}").setText("Miscellaneous Issue");
		forms.button("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_button_FINDSCREEN_FIND_BUTTON_0}}").click();
		forms.captureScreenshot(222);
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_RESULTS_SUBINVENTORY_CODE}}").setFocus();
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.Result_Locator}}").setFocus();
		forms.button("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_button_CONTROL_LOT_SERIAL_0}}").click();
		forms.captureScreenshot(227);
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MTL_TRANSACTION_LOT_NUMBE}}").setFocus();
		forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MTL_TRANSACTION_LOT_NUMBE_1}}").setFocus();
		String result_LotNumber  =  forms.textField("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_textField_MTL_TRANSACTION_LOT_NUMBE_1}}").getText();
		if(lotNumber.equalsIgnoreCase(result_LotNumber)){
			info("Test Case has passed as lot number are same.");
		}else {
			info("Test Case has failed as lot number is mismatched.");
		}
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_MTL_TRANSACTION_LOT_NUMBE}}").close();
		forms.captureScreenshot(232);
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_RESULTS_WINDOW}}").close();
		forms.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.forms_window_NAVIGATOR}}").activate(true);
		forms.captureScreenshot(236);
		//applet.toolBar(	1383,"{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.applet_TJavaToolbar_0}}").clickItemByIndex(3);
	
	}

	public void finish() throws Exception {
		web.link("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_a_Logout}}").click();
		web.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window}}").waitForPage(180,true);		
		forms.close(1388);
		web.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window}}").close();
		web.window("{{obj.Inv_Create_Miscellaneous_Issue_Transactions_00142.web_window_1}}").close();

	}
}
