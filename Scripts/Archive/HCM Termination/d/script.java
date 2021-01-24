import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.adf.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.adf.api.ADFService adf;
	
	public void initialize() throws Exception {
		
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		String s = "Sujit is a good man";
		String a[]=s.split(" ");
		String s1 = a[1]+a[2];
		info(s1);
//		for(int i=0;i<a.length;i++){
//		info(a[1]);
//		}

	}
	
	public void finish() throws Exception {
	}
}
