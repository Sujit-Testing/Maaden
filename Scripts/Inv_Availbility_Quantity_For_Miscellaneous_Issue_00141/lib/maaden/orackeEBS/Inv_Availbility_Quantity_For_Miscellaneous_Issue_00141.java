//WARNING!
//This file was created by Oracle OpenScript.
//Don't change it.

package lib.maaden.orackeEBS;

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
import oracle.oats.scripting.modules.basic.api.internal.FuncLibraryWrapper;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;

public class Inv_Availbility_Quantity_For_Miscellaneous_Issue_00141 extends FuncLibraryWrapper
{

	public void initialize() throws AbstractScriptException {
		checkInit();
		callFunction("initialize");
	}

	/**
	 * 1	Login to Oracle Application 2	Open the Inventory Responsibility 3	Click on On_hand__Availability 4	Select MRK from the list 5	Provide SubInventory details,Item Number and find 6	Select and expand Organizations 7	Select and expand MRK  8	Select and expand On-hand 9	Select and expand Child to child node  10	Get the value e,g: item, SubInventory,Locator,Quantity and Lot
	 */
	public void run() throws AbstractScriptException {
		checkInit();
		callFunction("run");
	}

	public void finish() throws AbstractScriptException {
		checkInit();
		callFunction("finish");
	}

}

