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
		
		//Define database connection details
		
		utilities.getSQLService().define("alias", "driver", "url", "username", "password");
		//eg:-  utilities.getSQLService().define("myOracleDB","oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@mySystem:1521:mySystem", "username",decrypt("ZSL2IzF3WpLh8ydBZYDV3Q=="));
		
		//establish the connection
		utilities.getSQLService().connect("alias");
		//eg:- utilities.getSQLService().connect("myOracleDB");
		
		//query SQL statement
		String query = "Select * from Employee";
		 Table table = utilities.getSQLService().query("myOracleDB", query);
		 
		//print table
		 for (int i=0; i<table.getRowCount(); i++) {
		  Row row = table.getRow(i);
		 String [] rowValue = row.getAll();
		 String rowContent = "";
		 for (int col=0; col<rowValue.length; col++)
		   rowContent += rowValue[col] + "  ";
		 info(rowContent);
		 }
		 
		 //disconnect from database
		 utilities.getSQLService().disconnect("myOracleDB");
		 
	}
	
	public void finish() throws Exception {
	}
}
