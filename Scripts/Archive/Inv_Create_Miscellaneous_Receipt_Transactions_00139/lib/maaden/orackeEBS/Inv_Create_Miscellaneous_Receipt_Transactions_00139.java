//WARNING!
//This file was created by Oracle OpenScript.
//Don't change it.

package lib.maaden.orackeEBS;

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

public class Inv_Create_Miscellaneous_Receipt_Transactions_00139 extends FuncLibraryWrapper
{

	public void initialize() throws AbstractScriptException {
		checkInit();
		callFunction("initialize");
	}

	/**
	 * 1	Login to Oracle Application 2	Open the Inventory Responsibility 3	Open Transactions menu 4	Open Miscellaneous Transactions 5 	Select the respective organizations 6	Enter Date, Enter Transaction Type=Miscellaneous Receipt, Select the Adjustment Account Account- 7	Press the Transaction Lines button 8	Enter Item, Sub inventory, Locator, Lot, Quantity, Reference and SAVE. 9	Open Material Transactions menu 10	Enter Transaction Dates, Item, Lot # and FIND 11	Open Distribution button  12	Open Lot Button
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

