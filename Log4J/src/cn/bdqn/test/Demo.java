package cn.bdqn.test;

import org.apache.log4j.Logger;

public class Demo {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Demo.class);
		logger.fatal("fatal  MSG ");
		logger.error("error  MSG ");
		logger.warn("warn  MSG ");
		logger.info("info  MSG ");
		logger.debug("debug  MSG ");
		logger.trace("trace  MSG ");

	}
}
