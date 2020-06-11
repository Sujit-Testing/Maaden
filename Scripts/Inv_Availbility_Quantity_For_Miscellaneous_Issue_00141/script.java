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
	 * 1	Login to Oracle Application
2	Open the Inventory Responsibility
3	Click on On_hand__Availability
4	Select MRK from the list
5	Provide SubInventory details,Item Number and find
6	Select and expand Organizations
7	Select and expand MRK 
8	Select and expand On-hand
9	Select and expand Child to child node 
10	Get the value e,g: item, SubInventory,Locator,Quantity and Lot

	 */
	public void run() throws Exception {
		//Added Data Bank
		getDatabank("Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141").getNextDatabankRecord();
		//Login the application
		web.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_window}}").navigate("{{db.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.URL,http://riysoaclone.maaden.com:8010/}}");
		web.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_window}}").waitForPage(180,true);
		web.textBox("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.UserID}}").setText("{{db.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.UID,PEETHAMBARANS}}");		
		web.textBox("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.Pasword}}").setPassword("{{db.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");		
		web.button("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_button_SubmitButton}}").click();
		web.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_window}}").waitForPage(180,true);
		
		//Click on CORP_INVENTORY
		web.link("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_a_CORP_INVENTORY}}").click();
		web.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_window}}").waitForPage(180,true);
		//Click on On_hand__Availability
		web.link("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_a_On_hand__Availability}}").click();
		web.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_window}}").waitForPage(180,true);
		web.link("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_a_On_hand_Quantity}}").click();
		web.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_window_1}}").waitForPage(180,true);
		
		//forms.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_window_APPTREE}}").activate(true);
		forms.captureScreenshot(120);
//		{
//			think(5.0);
//		}
		
		//Select MRK from the list
		forms.listOfValues("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_listOfValues}}").select("MRK|MRK: CORP ALU-SBU Inventory Organization");
		forms.captureScreenshot(123);
		forms.textField("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_textField_MATERIAL_QF_QUERY_NAME_0}}").setFocus();
		//Provide SubInventory details
		forms.textField("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.SubInventory}}").setText("{{db.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.SubInventory,STD%JUB}}");
		forms.textField("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.SubInventory}}").invokeSoftKey("NEXT_FIELD");		
		//Provide item number
		forms.textField("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.Item}}").setText("{{db.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.Item,MS0031}}");		
		//Click Find Button
		forms.button("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_button_MATERIAL_QF_FIND_0}}").click();
		forms.captureScreenshot(130);	
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").focusRow(1);
	
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").setFocus();
	
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		//Select and expand Organizations
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations");		
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations");
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").activateNode("Organizations");
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").expandNode("Organizations");
		{
			think(4.283);
		}
		//Select and expand MRK 
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations|MRK");
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").focusRow(1);
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations|MRK");
		
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").activateNode("Organizations|MRK");
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").expandNode("Organizations|MRK");
		{
			think(4.283);
		}
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		//Select and expand On-hand
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations|MRK|On-hand");
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").focusRow(1);
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations|MRK|On-hand");
		
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").activateNode("Organizations|MRK|On-hand");
		
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").expandNode("Organizations|MRK|On-hand");
		{
			think(8.937);
		}
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);	
		//Select and expand Child node STD-M-JUB
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations|MRK|On-hand|STD-M-JUB");
		
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").focusRow(1);		
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations|MRK|On-hand|STD-M-JUB");
		
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").activateNode("Organizations|MRK|On-hand|STD-M-JUB");
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").expandNode("Organizations|MRK|On-hand|STD-M-JUB");
		{
			think(4.283);
		}
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		//Select and expand Child to child node 
		if(forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").exists(120, TimeUnit.SECONDS )){
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations|MRK|On-hand|STD-M-JUB|M.SJ.B125");
		}
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").focusRow(1);
		
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
//		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations|MRK|On-hand|STD-M-JUB|M.SJ.B119");
//		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").activateNode("Organizations|MRK|On-hand|STD-M-JUB|M.SJ.B119");
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").expandNode("Organizations|MRK|On-hand|STD-M-JUB|M.SJ.B125");
		{
			think(4.167);
		}
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);	
		if(forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").exists(120, TimeUnit.SECONDS)){
		forms.tree("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_tree_APPTREE_NAV_TREE_NAVIGATO}}").selectNode("Organizations|MRK|On-hand|STD-M-JUB|M.SJ.B125|MS0031");
		}
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").focusRow(1);
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").selectRows(1, 1);
		//Get the value e,g: item, SubInventory,Locator,Quantity and Lot
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").doubleClick(1, 4);
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").focusCell(1, 4);
		info("Item ->  "+forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").getCell(1, 4));
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").doubleClick(1, 2);	
		info("Sub Inventory ->  "+forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").getCell(1, 2));
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").doubleClick(1, 3);	
		info("Locator ->  "+forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").getCell(1, 3));
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").doubleClick(1, 8);	
		info("Availablity Quantity ->  "+forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").getCell(1, 8));
		applet.scrollBar(196,"{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.applet_TJavaScrollbar_0}}").setPosition(1);		
		applet.scrollBar(218,"{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.applet_TJavaScrollbar_0}}").setPosition(3);		
		applet.scrollBar(240,"{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.applet_TJavaScrollbar_0}}").setPosition(5);		
		forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").doubleClick(1, 20);
		info("Lot ->  "+forms.spreadTable("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_spreadTable_RESULTS_GRID_0}}").getCell(1, 20));
		forms.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.forms_window_APPTREE}}").close();
		
		web.link("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_a_Logout}}").click();
		web.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_window}}").waitForPage(180,true);
		
		web.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_window}}").close();
		forms.close(250);
		web.window("{{obj.Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141.web_window_1}}").close();
		
	}

	public void finish() throws Exception {
	}
}
