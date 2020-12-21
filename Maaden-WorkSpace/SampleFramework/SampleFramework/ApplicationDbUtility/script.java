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
	
	public void initialize() throws Exception {
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {

	}
	
	public void finish() throws Exception {
		
		
	}
	
	
	

	/**
	*Function_Name: databaseConnection
	*Purpose: To connect to DB
	*Parameters: alias,driverNAME,Url,Username,Password
	*Returns: True if connection is estabilished other False
	*Example: int additionResult = addNumbers(2,5);
	 * @throws Exception 
	*/
	public boolean databaseConnection(String alias,String driverNAME,String Url,String Username,String Password) throws Exception{
	try {
			info("Inside databaseConnection() function");
			info("Given Value of alias = "+alias);
			info("Given Value of driverNAME = "+driverNAME);
			info("Given Value of Url = "+Url);
			
			//Step 1 -Define
			utilities.getSQLService().define(alias, driverNAME, Url, Username, Password);
			
			
			//Step 2 - Connect
			utilities.getSQLService().connect(alias);
			info("Connected to database");

		return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		warn("Execption Occured inside databaseConnection(), Returning false ");
		e.printStackTrace();
		return false;
	}
		
	}
	
	
	
	/**
	*Function_Name: fetchQuery
	*Purpose: To query the Database
	*Parameters: query,alias
	*Returns: Table which contains your query result
	*Example:
	 * @throws Exception 
	*/
	public Table fetchQuery(String alias,String query) throws Exception{
	try {
			
		Table results = null;
			info("Inside fetchQuery() function");
			info("Given Value of alias = "+alias);
			info("Given SQL query = "+query);
			info("Executing above SQL query");
			
			//Step 3 -Query
			results = utilities.getSQLService().query(alias, query);
			
			if(results.getRowCount()>0){
				info("Data found , Total number of rows are = "+results.getRowCount());
			}else warn("NO data found after exeuting above query");
		
			//Step 3.1 -Insert/Delete/Update
			//utilities.getSQLService().executeUpdate("alias", "update tablName set columna = '12143' where ID = 34356");
			
			
		return results;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		warn("Execption Occured inside databaseConnection(), Returning false ");
		e.printStackTrace();
		return null;
	}
		
	}
	
	
	

	
	
	/**
	*Function_Name: dataReader
	*Purpose: To read the data from excel sheet
	*Parameters: SheetLocation, ColoumName, RowNumber
	*Returns: Nothing
	*Example:
	 * @throws Exception 
	*/
	public String dataReader(String sheetLocation, String coloumName,int rowNumber) throws Exception{
	try {
			
			info("Inside dataReader() function");
			info("Given sheetLocation = "+sheetLocation);
			info("Importing test data sheet ");
			//Step 1 - Import the sheet you want to read
			datatable.importExcel(sheetLocation, true);
			String readedData = "NO DATA FOUND";
			//Read the sheet
			readedData = (String) datatable.getValue("INPUT_DATA", rowNumber, coloumName);
			
			return readedData;
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		warn("Execption Occured inside dataReader()");
		e.printStackTrace();
		return null;
	}
		
	}
	
	
	
	
	
	
	/**
	*Function_Name: databaseDisConnection
	*Purpose: To discconect from DB
	*Parameters: alias
	*Returns: Nothing
	*Example:
	 * @throws Exception 
	*/
	public void databaseDisConnection(String alias) throws Exception{
	try {
			
			info("Inside databaseDisConnection() function");
			info("Given Value of alias = "+alias);
		    info("Disconnecting from above Database");
			
			//Step 4 -Disconnect
		    utilities.getSQLService().disconnect(alias);
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		warn("Execption Occured inside databaseDisConnection()");
		e.printStackTrace();
		
	}
		
	}
	
}
