package com.myFramework.CompanyName.ProjectName.Helper.resource;

public class ResourceHelper {
	public static String getResourcePath(String path) {
		String basePath = System.getProperty("user.dir");
		return basePath + path;
	}

}
