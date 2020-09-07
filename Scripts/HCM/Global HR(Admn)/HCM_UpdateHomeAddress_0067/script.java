import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	String url,uid,pwd,changeDate,addressLine_1,addressLine_2,city_Town,pin_Code = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_UpdateHomeAddress_0067.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		changeDate=(String) datatable.getValue("DataSheet", 0, "ChangeDate");
		addressLine_1 = (String) datatable.getValue("DataSheet", 0, "AddressLine_1");
		addressLine_2 =  (String) datatable.getValue("DataSheet", 0, "AddressLine_1");
		city_Town=(String) datatable.getValue("DataSheet", 0, "City_Town");
		pin_Code = (String) datatable.getValue("DataSheet", 0, "Pin_Code");
	
		
		web.window("{{obj.HCM_UpdateHomeAddress_0067.web_window}}").maximize();
		web.window("{{obj.HCM_UpdateHomeAddress_0067.web_window}}").navigate(url);
		web.window("{{obj.HCM_UpdateHomeAddress_0067.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.UID}}").setText(uid);
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.UID}}").pressTab();
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_UpdateHomeAddress_0067.Sign_In}}").click();
		web.window("{{obj.HCM_UpdateHomeAddress_0067.web_window}}").waitForPage(150, true);
		{
			think(5.387);
		}
		if(web.link("{{obj.HCM_UpdateHomeAddress_0067.Me}}").exists(50, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_UpdateHomeAddress_0067.Me}}").click();
		
		}
		if(web.link("{{obj.HCM_UpdateHomeAddress_0067.PersonalInformation}}").exists(50, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_UpdateHomeAddress_0067.PersonalInformation}}").click();
		}
		web.window("{{obj.HCM_UpdateHomeAddress_0067.web_window}}").waitForPage(null);
		if(web.element("{{obj.HCM_UpdateHomeAddress_0067.Contact_Info}}").exists(50, TimeUnit.SECONDS)){
			web.element("{{obj.HCM_UpdateHomeAddress_0067.Contact_Info}}").click();
		}
		if(web.image(251, "{{obj.HCM_UpdateHomeAddress_0067.Edit}}").exists(50, TimeUnit.SECONDS)){
		web.image(251, "{{obj.HCM_UpdateHomeAddress_0067.Edit}}").click();
		
		}
		{
			think(5.387);
		}
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.ChangeDate}}").click();
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.ChangeDate}}").setText(changeDate);
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.ChangeDate}}").pressTab();
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.AddressLine_1}}").setText(addressLine_1);
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.AddressLine_1}}").pressTab();
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.AddressLine_2}}").setText(addressLine_2);
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.AddressLine_2}}").pressTab();
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.City_Town}}").setText(city_Town);
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.City_Town}}").pressTab();
		web.textBox("{{obj.HCM_UpdateHomeAddress_0067.Pin_Code}}").setText(pin_Code);
		web.element(262, "{{obj.HCM_UpdateHomeAddress_0067.web_span_Submit}}").click();
		{
			think(2.216);
		}
		web.element("{{obj.HCM_UpdateHomeAddress_0067.web_label_af_panelLabelAndMessage_l}}").click();
		{
			think(4.882);
		}
		web.element(264, "{{obj.HCM_UpdateHomeAddress_0067.web_html_1}}").click();
		
		web.window("{{obj.HCM_UpdateHomeAddress_0067.web_window}}").capturePage();
		
		
	}
	public void finish() throws Exception {
	
	web.window("{{obj.HCM_UpdateHomeAddress_0067.web_window}}").close();
	
	}
}









