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
	
	public void initialize() throws Exception {
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		String s = "Hamoud Jassar Al-Hajri: Person Management";
		String s2 ="Hamoud Jassar Al-Hajri";
		String[] s1 =s.split(":" );

		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i]);
			if(s1[i].equalsIgnoreCase(s2)){
				
				info("Test Case Pass as both search before and after ");
			}else{
				fail("Fail");
			}
			break;
		}
		
		

	}
	
	public void finish() throws Exception {
	}
}
