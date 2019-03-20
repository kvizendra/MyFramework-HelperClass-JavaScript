package com.myFramework.CompanyName.ProjectName.Helper.logger;

import org.apache.log4j.PropertyConfigurator;

import com.myFramework.CompanyName.ProjectName.Helper.resource.ResourceHelper;

import org.apache.log4j.Logger;

public class LoggerHelper {

	private static boolean root = false;

	public static Logger getLogger(Class cls) {
		if (root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator
				.configure(ResourceHelper.getResourcePath("src/main/resources/configFile/log4j.properties"));
		root = true;
		return Logger.getLogger(cls);
	}

	public static void main(String[] args) {
		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
		log.info("Logger is configured");
		log.info("Logger is configured");
		log.info("Logger is configured");
		log.info("Logger is configured");
	}
}
