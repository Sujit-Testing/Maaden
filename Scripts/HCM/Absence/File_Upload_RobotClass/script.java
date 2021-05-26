import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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

       //C:\\Users\\SUJITSWAIN\\Desktop\\Git\\GitPassword.txt
		



	}
	
	public void finish() throws Exception {
	}
	public void fileUpload(String path) throws Exception {
		Robot robot = new Robot();

        //Copy the file path into the clipboard like (Control+c)

		StringSelection str = new StringSelection(path);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

		//pressing (Control+c)

		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_V);

		//Relesing (Control+v)

		robot.keyRelease(KeyEvent.VK_CONTROL);
		

		robot.keyRelease(KeyEvent.VK_V);

		//Pressing Enter

		robot.keyPress(KeyEvent.VK_ENTER);
		{
			think(1.0);
		}
		//Releasing Enter

		robot.keyRelease(KeyEvent.VK_ENTER);
		{
			think(1.0);
		}

	}
}
