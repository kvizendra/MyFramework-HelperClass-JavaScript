package com.myFramework.CompanyName.ProjectName.Helper.Switch;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.myFramework.CompanyName.ProjectName.Helper.logger.LoggerHelper;
import com.myFramework.CompanyName.ProjectName.Helper.wait.WaitHelper;

public class FrameHelper {
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(FrameHelper.class);

	/**
	 * For the frame helper we have to create a constructor for the driver as we
	 * are using the driver made private to by creating the construction of
	 * driver we can initilize it to use in the other methods.
	 * 
	 * @param FrameIndex
	 */

	public FrameHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToFrame(int FrameIndex) {
		driver.switchTo().frame(FrameIndex);
		log.info("Swicthed to" + FrameIndex + "frame");

	}

	public void switchToFrame(String FrameName) {
		driver.switchTo().frame(FrameName);
		log.info("Swicthed to" + FrameName + "frame");

	}

	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
		log.info("Swicthed to frame");

	}

}
