package com.eastsoft.logbacktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.net.SimpleSocketServer;

public class LogbackTest {

	public static final Logger LOGGER=LoggerFactory.getLogger(LogbackTest.class);
	public static void main(String[] args) {
//		String [] params={"6000","src/main/resources/logback.xml"};
		try {
			SimpleSocketServer.main(args);
		} catch (Exception e) {			
			e.printStackTrace();
		}

	}

}
