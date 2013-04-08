package jk.log;

import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogUtil {

	public static void init(String xmlFile){
		String resource = xmlFile;
		URL configFileResource = LogUtil.class.getResource(resource);
		DOMConfigurator.configure(xmlFile);
		
	}
	
	public static Logger getLogger(Class c){
		String loadDir = System.getProperty("user.dir");
		String resourceName = loadDir + "/config/log/log4j.xml";
		init(resourceName);
		return Logger.getLogger(c);
	}
}
