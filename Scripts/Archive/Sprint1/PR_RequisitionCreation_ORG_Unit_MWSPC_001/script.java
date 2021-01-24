import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;
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
	//@FunctionLibrary added to call the reusable script
	@FunctionLibrary("PO_CreateRequisitionAndApproval_User_LAOE_001") lib.maaden.orackeEBS.PO_CreateRequisitionAndApproval_User_LAOE_001 pO_CreateRequisitionAndApproval_User_LAOE_001;
	@FunctionLibrary("PO_CreateRequisitionAndApproval_User_MECEVICM_001") lib.maaden.orackeEBS.PO_CreateRequisitionAndApproval_User_MECEVICM_001 pO_CreateRequisitionAndApproval_User_MECEVICM_001;
	@FunctionLibrary("PO_CreateRequisitionAndApproval_User_ENAZIFH_001") lib.maaden.orackeEBS.PO_CreateRequisitionAndApproval_User_ENAZIFH_001 pO_CreateRequisitionAndApproval_User_ENAZIFH_001;
	@FunctionLibrary("PO_CreateRequisitionAndApproval_User_SHANGITIU_001") lib.maaden.orackeEBS.PO_CreateRequisitionAndApproval_User_SHANGITIU_001 pO_CreateRequisitionAndApproval_User_SHANGITIU_001;

	
	String uidName;
	String requestion_Number;
	static int time = 180;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	
	public void initialize() throws Exception {
		browser.launch();
				
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 * @throws Exception 
	 */
	
	public void run() throws Exception {
	

		getDatabank("PO_CreateRequisitionAndApproval_001").getNextDatabankRecord();
		
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").navigate("{{db.PO_CreateRequisitionAndApproval_001.URL,http://riyoramgbm02.maaden.com:8050/}}");
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time, true);
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").maximize();
		
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").click();
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").clearText();
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").setText("{{db.PO_CreateRequisitionAndApproval_001.UID,FAREEDM}}");		
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_UID}}").getAttribute("value");		
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_password}}").click();
		web.textBox("{{obj.PO_CreateRequisitionAndApproval_001.web_input_password}}").setPassword("{{db.PO_CreateRequisitionAndApproval_001.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		web.button("{{obj.PO_CreateRequisitionAndApproval_001.web_button_LoginButton}}").click();
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time,true);
		web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_MWSPC_PURCHASING_PREPARER}}").click();
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time,true);
		{
			think(2.678);
		}
		web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisition}}").click();
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window}}").waitForPage(time,true);
		
		web.link("{{obj.PO_CreateRequisitionAndApproval_001.web_a_Requisitions_2}}").click();
		if(web.alertDialog(26,	"/web:dialog_alert[@text='Syntax error' and @index='0']").exists(4,TimeUnit.SECONDS)){
			web.alertDialog(26,	"/web:dialog_alert[@text='Syntax error' and @index='0']").clickOk();
			info("Alert Occured and move ahead after clicking the OK button");
		}
		
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window_1}}").waitForPage(time,true);
		forms.captureScreenshot(634);		
		if(forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_ServiceType}}").exists(4,TimeUnit.SECONDS))
			{
			info("forms_textField_ServiceType1");
			forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_ServiceType}}").click();
			info("forms_textField_ServiceType2");
			forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_ServiceType}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Type,Service}}");		

			info("forms_textField_ServiceType3");
			}
		forms.captureScreenshot();
		{
			think(2.678);
		}
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Catagory}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Category,MISC.MISC}}");
		if(forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Description}}").exists())
			{
			info("Desc1");
			forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Description}}").setText("Application Engineer's Service Charge");
			}
		
		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_UOM}}").setText("{{db.PO_CreateRequisitionAndApproval_001.UOM,Daily}}");
		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Quantity}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Quantity,1}}");
		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Quantity}}").invokeSoftKey("NEXT_FIELD");		
		
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Price}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Price,660}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Price}}").invokeSoftKey("NEXT_FIELD");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_NeedByDate}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Need by Date,30-JUL-2021 00:00:00}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Organization}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Organization,PAW:MWSPC Phosphoric Acid Plant Warehouse}}");
		{
			think(2.678);
		}
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Location}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Location,Turaif PAP}}");
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Supplier}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Supplier,Nalco Saudi Company Limited}}");
		{
			think(2.678);
		}
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_Site}}").setText("{{db.PO_CreateRequisitionAndApproval_001.Site,DAMMAM_SAR}}");

		// save it from save button
		{
			think(4.678);
		}
		forms.window("{{obj.PO_CreateRequisitionAndApproval_001.forms_window_SaveButton}}").clickToolBarButton("Save");
		{
			think(2.678);
		}


		// capture the requsition number here
		forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_RequisitionNumber}}").setFocus();
		
		requestion_Number = forms.textField("{{obj.PO_CreateRequisitionAndApproval_001.forms_textField_RequisitionNumber}}").getText();		
		
		info("requestion_Number--------------->"+requestion_Number);

		
		
		web.window(694,	"{{obj.PO_CreateRequisitionAndApproval_001.web_window_0}}").close();

		
	}

	public void finish() throws Exception {
		web.window("{{obj.PO_CreateRequisitionAndApproval_001.web_window_0_1}}").close();
	}
}
