//WARNING!
//This file was created by Oracle OpenScript.
//Don't change it.

package lib.myCompany.myTeam;

import oracle.oats.scripting.modules.basic.api.internal.*;
import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.http.api.*;
import oracle.oats.scripting.modules.http.api.HTTPService.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.basic.api.internal.FuncLibraryWrapper;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;

public class PerformanceDemo1 extends FuncLibraryWrapper
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

}

