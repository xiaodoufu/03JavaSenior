package cn.bdqn.util;

import org.apache.log4j.Logger;

public class Demo {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Demo.class);
		logger.fatal("fatal  MSG   Demo");
		logger.error("error  MSG Demo");
		logger.warn("warn  MSG Demo");
		logger.info("info  MSG Demo");
		logger.debug("debug  MSG Demo");
		logger.trace("trace  MSG Demo");
	}

}
