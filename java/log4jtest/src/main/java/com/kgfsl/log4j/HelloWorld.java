package com.kgfsl.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloWorld {

	static final Logger logger = Logger.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
	}
}
