package org.apache.cordova;

import java.io.StringReader;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import com.ashera.utils.FileUtils;

public class ConfigXmlUtils {
	public static XmlPullParser getConfigXml() {
		XmlPullParser parser;
		try {
			String xml = FileUtils.getFileFromClassPath("res/xml/config.xml");
//			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
//			factory.setNamespaceAware(true);
			parser = new org.xmlpull.mxp1.MXParser();
			parser.setInput(new StringReader(xml));
		} catch (XmlPullParserException e) {
			System.out.println(e.getMessage());
			 throw new RuntimeException(e);
		}
		return parser;
	}
}
