//WARNING!
//This file was created by Oracle OpenScript.
//Don't change it.

package lib.myCompany.myTeam;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.basic.api.internal.FuncLibraryWrapper;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;

public class ApplicationDbUtility extends FuncLibraryWrapper
{

	public void initialize() throws AbstractScriptException {
		checkInit();
		callFunction("initialize");
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws AbstractScriptException {
		checkInit();
		callFunction("run");
	}

	public void finish() throws AbstractScriptException {
		checkInit();
		callFunction("finish");
	}

	/**
	 * Function_Name: databaseConnection Purpose: To connect to DB Parameters: alias,driverNAME,Url,Username,Password Returns: True if connection is estabilished other False Example: int additionResult = addNumbers(2,5);
	 * @throws Exception  
	 */
	public boolean databaseConnection(String alias, String driverNAME,
			String Url, String Username, String Password)
			throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("databaseConnection", alias, driverNAME,
				Url, Username, Password);
	}

	/**
	 * Function_Name: fetchQuery Purpose: To query the Database Parameters: query,alias Returns: Table which contains your query result Example:
	 * @throws Exception  
	 */
	public Table fetchQuery(String alias, String query)
			throws AbstractScriptException {
		checkInit();
		return (Table) callFunction("fetchQuery", alias, query);
	}

	/**
	 * Function_Name: dataReader Purpose: To read the data from excel sheet Parameters: SheetLocation, ColoumName, RowNumber Returns: Nothing Example:
	 * @throws Exception  
	 */
	public String dataReader(String sheetLocation, String coloumName,
			int rowNumber) throws AbstractScriptException {
		checkInit();
		return (String) callFunction("dataReader", sheetLocation, coloumName,
				rowNumber);
	}

	/**
	 * Function_Name: databaseDisConnection Purpose: To discconect from DB Parameters: alias Returns: Nothing Example:
	 * @throws Exception  
	 */
	public void databaseDisConnection(String alias)
			throws AbstractScriptException {
		checkInit();
		callFunction("databaseDisConnection", alias);
	}

}

