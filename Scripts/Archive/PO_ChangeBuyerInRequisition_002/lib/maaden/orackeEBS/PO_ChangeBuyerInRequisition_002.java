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

public class PO_ChangeBuyerInRequisition_002 extends FuncLibraryWrapper
{

	public void initialize() throws AbstractScriptException {
		checkInit();
		callFunction("initialize");
	}

	/**
	 * Changing the Buyer Name from the approved Requestion Number
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

