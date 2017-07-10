package com.kgfsl.log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.*;
public class simple {
static{
init();
}

private final static Logger logger = Logger.getLogger(simple.class);


public static void main(String[] args)
{

logger.debug("My Debug Log");
logger.info("My Info Log");
logger.warn("My Warn Log");
logger.error("My error log");
logger.fatal("My fatal log");

}
private static void init() {
PropertyConfigurator.configure("D://Suriyan//java//log4jtest//src//main//resources//log4j.properties");
}
}