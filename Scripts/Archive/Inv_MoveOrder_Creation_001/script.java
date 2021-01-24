import java.io.File;
import java.io.FileOutputStream;
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
import lib.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.applet.api.AppletService applet;
	@ScriptService oracle.oats.scripting.modules.formsFT.api.FormsService forms;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	
	String DataTablePath = "C:\\OracleATS\\OFT\\Maaden\\Test Data\\Inv_MoveOrder_Creation_001.xlsx";
	@FunctionLibrary("PO_CreateRequisitionAndApproval_User_LAOE_001") lib.maaden.orackeEBS.PO_CreateRequisitionAndApproval_User_LAOE_001 pO_CreateRequisitionAndApproval_User_LAOE_001;

	
	public void initialize() throws Exception {
		browser.launch();
		
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		getDatabank("Inv_MoveOrder_Creation_DataBank_001").getNextDatabankRecord();
		datatable.importExcel(DataTablePath, true);
		
		web.window("{{obj.Inv_MoveOrder_Creation_001.web_window}}").navigate("{{db.Inv_MoveOrder_Creation_DataBank_001.URL,http://riyoramgbm02.maaden.com:8050/}}");
		{
			think(0.276);
		}
		web.window(59, "{{obj.Inv_MoveOrder_Creation_001.web_window}}").waitForPage(null);
		{
			think(9.34);
		}
		/*
		 * LogIn the form to get the home page
		 */
		web.textBox("{{obj.Inv_MoveOrder_Creation_001.logInID}}").click();
		web.textBox("{{obj.Inv_MoveOrder_Creation_001.logInID}}").clearText();
		web.textBox("{{obj.Inv_MoveOrder_Creation_001.logInID}}").setText("{{db.Inv_MoveOrder_Creation_DataBank_001.UserId,swainsw}}");
		web.textBox("{{obj.Inv_MoveOrder_Creation_001.password}}").click();
		web.textBox("{{obj.Inv_MoveOrder_Creation_001.password}}").clearText();
		web.textBox("{{obj.Inv_MoveOrder_Creation_001.password}}").setPassword("{{db.Inv_MoveOrder_Creation_DataBank_001.Password,{{@deobfuscate(dzpvm14k/ONNdv66/asezg==)}}}}");
		web.button("{{obj.Inv_MoveOrder_Creation_001.click_logInButton}}").click();
		///////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////////
		web.window("{{obj.Inv_MoveOrder_Creation_001.web_window}}").waitForPage(null);
		web.window("{{obj.Inv_MoveOrder_Creation_001.web_window}}").close();
		browser.launch();
		pO_CreateRequisitionAndApproval_User_LAOE_001.run();
		
		
		//web.window("{{obj.Inv_MoveOrder_Creation_001.web_window}}").maximize();
		/*if(web.image("{{obj.Inv_MoveOrder_Creation_001.web_img_Expand}}").exists(30,TimeUnit.SECONDS)){
		web.image("{{obj.Inv_MoveOrder_Creation_001.web_img_Expand}}").click();
		}
		web.window("{{obj.Inv_MoveOrder_Creation_001.web_window}}").waitForPage(120);
		web.image("{{obj.Inv_MoveOrder_Creation_001.web_img_Expand_1}}").click();	
		if(web.image("{{obj.Inv_MoveOrder_Creation_001.web_img_Expand_1}}").exists(30, TimeUnit.SECONDS)){
			web.image("{{obj.Inv_MoveOrder_Creation_001.web_img_Expand_1}}").click();	
		}
		
		web.window("{{obj.Inv_MoveOrder_Creation_001.web_window}}").waitForPage(null);
		{
			think(1.453);
		}
		web.link("{{obj.Inv_MoveOrder_Creation_001.click_Move_Orders}}").exists(30, TimeUnit.SECONDS);
		web.link("{{obj.Inv_MoveOrder_Creation_001.click_Move_Orders}}").click();
		web.window("{{obj.Inv_MoveOrder_Creation_001.web_window_1}}").waitForPage(null);
		forms.captureScreenshot(84);
		{
			think(43.192);
		}
		if(forms.listOfValues("{{obj.Inv_MoveOrder_Creation_001.search_RPM}}")
				.exists(60, TimeUnit.SECONDS)){
			forms.listOfValues("{{obj.Inv_MoveOrder_Creation_001.search_RPM}}").find("{{db.Inv_MoveOrder_Creation_DataBank_001.RPM,%rpm}}");
		}
		
		forms.captureScreenshot(87);
		{
			think(12.054);
		}
		if(forms.textField("{{obj.Inv_MoveOrder_Creation_001.moveOrderNumber}}").exists(60, TimeUnit.SECONDS)){
			forms.textField("{{obj.Inv_MoveOrder_Creation_001.moveOrderNumber}}").click();
			
		}
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.moveOrderNumber}}").invokeSoftKey("NEXT_FIELD");
		{
			think(7.756);
		}
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.moveOrderNumber}}").setFocus();
		{
			think(19.715);
		}
		
		String number = forms.textField("{{obj.Inv_MoveOrder_Creation_001.moveOrderNumber}}").getText();
		System.out.println("number------->"+number);
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.moveOrderStatus}}").setFocus();
		{
			think(9.771);
		}
		
		String status = forms.textField("{{obj.Inv_MoveOrder_Creation_001.moveOrderStatus}}").getText();	
		
		
		 * Validation code for checking the status as Incomplete
		 
		String moveOrderStatus= (String) datatable.getValue("DataSheet", 0, "MoveOrderStatus_Incomplete");
		if(moveOrderStatus.equals(status)){
			System.out.println("status from DataTable------->"+status);
		}
		
		
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_Transaction_Type}}").setText("{{db.Inv_MoveOrder_Creation_DataBank_001.Transaction_ype,Move Order Transfer}}");
		
//		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_textField_TOMAI_MAIN_HEADER_BLK_TO__1}}").setText("MAIN");
//		{
//			think(7.464);
//		}
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_SourceSubInv}}").setText("{{db.Inv_MoveOrder_Creation_DataBank_001.Source_SubInventory,MAIN}}");
		
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_DestinationSubInv}}").setText("{{db.Inv_MoveOrder_Creation_DataBank_001.Destination_Sub_nventory,Chem WH}}");
		
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_ItemNumber}}").setText("{{db.Inv_MoveOrder_Creation_DataBank_001.Item,1000134166}}");
		
		forms.textField(96,"{{obj.Inv_MoveOrder_Creation_001.forms_Quantity}}").setText("{{db.Inv_MoveOrder_Creation_DataBank_001.PrimeryQuantity,100}}");
		
		forms.tab("{{obj.Inv_MoveOrder_Creation_001.forms_tab_Source}}").select("Source");
		forms.captureScreenshot(99);
	
		if(forms.choiceBox("{{obj.Inv_MoveOrder_Creation_001.forms_ErrorPopUp}}")
				.exists(10, TimeUnit.SECONDS)){
			forms.choiceBox("{{obj.Inv_MoveOrder_Creation_001.forms_ErrorPopUp}}").clickButton("OK");
		}
		forms.captureScreenshot(102);
		
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_Source_Locator}}").setText("{{db.Inv_MoveOrder_Creation_DataBank_001.Source_Locator,089.56.58}}");
		
		forms.tab("{{obj.Inv_MoveOrder_Creation_001.forms_tab_Source}}").select("Destination");
		
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_DestinationLocator}}").setText("{{db.Inv_MoveOrder_Creation_DataBank_001.Destination_Locator,CW.01.01}}");
		
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_textField_TOMAI_MAIN_HEADER_BLK_DES_1}}").setFocus();
		
		forms.statusBar("{{obj.Inv_MoveOrder_Creation_001.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value","FRM-40202: Field must be entered.", MatchOption.Exact,0);
		
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_Reference}}").setText("OATS Testing");
		
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_textField_TOMAI_MAIN_HEADER_BLK_DES_1}}").setFocus();
		forms.captureScreenshot(111);
		
		forms.flexWindow("{{obj.Inv_MoveOrder_Creation_001.forms_flexWindow}}").setTextAndClickOk("Site Reference", "", "{{db.Inv_MoveOrder_Creation_DataBank_001.Transfer_Order_Header,RI}}");
		forms.captureScreenshot(114);
		
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.forms_ItemNumber}}").setFocus();
		{
			think(0.007);
		}
		forms.button("{{obj.Inv_MoveOrder_Creation_001.forms_button_TOMAI_MAIN_HEADER_BLK_DON}}").click();
		{
			think(0.701);
		}
		forms.statusBar("{{obj.Inv_MoveOrder_Creation_001.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value",	"FRM-40400: Transaction complete: 2 records applied and saved.",MatchOption.Exact, 0);
		{
			think(12.438);
		}
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.moveOrderNumber}}").setFocus();
		{
			think(7.85);
		}
		forms.textField("{{obj.Inv_MoveOrder_Creation_001.moveOrderStatus}}").setFocus();
		forms.captureScreenshot(121);
		{
			think(0.163);
		}
		forms.close(122);
		forms.captureScreenshot(124);
		{
			think(7.706);
		}
		forms.choiceBox("{{obj.Inv_MoveOrder_Creation_001.forms_ErrorPopUp}}").clickButton("OK");
		web.window(128, "{{obj.Inv_MoveOrder_Creation_001.web_window}}")
				.navigate("http://riyoramgbm02.maaden.com:8050/");
		{
			think(0.479);
		}
		web.window(129, "{{obj.Inv_MoveOrder_Creation_001.web_window_0_1}}")
				.navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(130, "{{obj.Inv_MoveOrder_Creation_001.web_window_0_2}}")
				.waitForPage(null);
		{
			think(13.52);
		}
		web.textBox(133, "{{obj.Inv_MoveOrder_Creation_001.logInID}}").click();
		{
			think(1.131);
		}
		web.textBox(134, "{{obj.Inv_MoveOrder_Creation_001.logInID}}").setText(
				"sswainsw");
		{
			think(0.132);
		}
		web.textBox(135, "{{obj.Inv_MoveOrder_Creation_001.logInID}}")
				.pressTab();
		{
			think(1.518);
		}
		web.textBox(136, "{{obj.Inv_MoveOrder_Creation_001.password}}")
				.setPassword(deobfuscate("dzpvm14k/ONNdv66/asezg=="));
		{
			think(0.14);
		}
		web.textBox(137, "{{obj.Inv_MoveOrder_Creation_001.password}}")
				.pressEnter();
		web.window(138, "{{obj.Inv_MoveOrder_Creation_001.web_window_0_2}}")
				.waitForPage(null);
		{
			think(2.42);
		}
		web.textBox(141, "{{obj.Inv_MoveOrder_Creation_001.logInID}}").click();
		{
			think(0.586);
		}
		web.textBox(142, "{{obj.Inv_MoveOrder_Creation_001.logInID}}").setText(
				"SWAINSW");
		{
			think(1.503);
		}
		web.textBox(143, "{{obj.Inv_MoveOrder_Creation_001.password}}")
				.setPassword(deobfuscate("dzpvm14k/ONNdv66/asezg=="));
		{
			think(0.235);
		}
		web.textBox(144, "{{obj.Inv_MoveOrder_Creation_001.password}}").click();
		{
			think(0.813);
		}
		web.textBox(145, "{{obj.Inv_MoveOrder_Creation_001.password}}")
				.setPassword(deobfuscate("eU1WiGP5elhCWztaQuPMAiRSIAKbS38M2um0GGnK9vM="));
		{
			think(1.603);
		}
		web.button(146, "{{obj.Inv_MoveOrder_Creation_001.click_logInButton}}")
				.click();
		web.window(147, "{{obj.Inv_MoveOrder_Creation_001.web_window_0_2}}")
				.waitForPage(null);
		{
			think(4.734);
		}
		web.notificationBar(150,
				"{{obj.Inv_MoveOrder_Creation_001.web_window_0_2}}")
				.clickButton("No");
		{
			think(5.004);
		}
		web.textBox(151, "{{obj.Inv_MoveOrder_Creation_001.password}}").click();
		{
			think(0.708);
		}
		web.textBox(152, "{{obj.Inv_MoveOrder_Creation_001.password}}")
				.setPassword(deobfuscate("dzpvm14k/ONNdv66/asezg=="));
		{
			think(4.091);
		}
		web.textBox(153, "{{obj.Inv_MoveOrder_Creation_001.password}}").click();
		{
			think(1.049);
		}
		web.textBox(154, "{{obj.Inv_MoveOrder_Creation_001.password}}").dblClick();
		{
			think(1.955);
		}
		web.textBox(155, "{{obj.Inv_MoveOrder_Creation_001.password}}").click();
		{
			think(5.334);
		}
		web.textBox(156, "{{obj.Inv_MoveOrder_Creation_001.password}}").click();
		{
			think(2.22);
		}
		web.button(157, "{{obj.Inv_MoveOrder_Creation_001.click_logInButton}}")
				.click();
		web.window(158, "{{obj.Inv_MoveOrder_Creation_001.web_window_0}}")
				.waitForPage(null);
		{
			think(6.357);
		}
		web.image(161, "{{obj.Inv_MoveOrder_Creation_001.web_img_Expand_2}}")
				.click();
		web.window(162, "{{obj.Inv_MoveOrder_Creation_001.web_window_0}}")
				.waitForPage(null);
		{
			think(1.772);
		}
		web.image(165, "{{obj.Inv_MoveOrder_Creation_001.web_img_Collapse}}")
				.click();
		web.window(166, "{{obj.Inv_MoveOrder_Creation_001.web_window_0}}")
				.waitForPage(null);
		{
			think(1.449);
		}
		web.image(169, "{{obj.Inv_MoveOrder_Creation_001.web_img_Expand_3}}")
				.click();
		web.window(170, "{{obj.Inv_MoveOrder_Creation_001.web_window_0}}")
				.waitForPage(null);
		{
			think(6.261);
		}
		web.element(173, "{{obj.Inv_MoveOrder_Creation_001.web_body_0}}")
				.click();
		{
			think(3.392);
		}
		web.image(174, "{{obj.Inv_MoveOrder_Creation_001.web_img_Expand_4}}")
				.click();
		web.window(175, "{{obj.Inv_MoveOrder_Creation_001.web_window_0}}")
				.waitForPage(null);
		{
			think(2.383);
		}
		web.element(178, "{{obj.Inv_MoveOrder_Creation_001.web_body_0}}")
				.click();
		{
			think(2.901);
		}
		web.link(179, "{{obj.Inv_MoveOrder_Creation_001.web_a_Move_Orders}}")
				.click();
		*/
		

	}

	public void finish() throws Exception {
		web.window("{{obj.Inv_MoveOrder_Creation_001.web_window}}").close();
		
		
	}
}
