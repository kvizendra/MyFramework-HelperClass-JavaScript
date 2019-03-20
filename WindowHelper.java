package com.myFramework.CompanyName.ProjectName.Helper.window;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.myFramework.CompanyName.ProjectName.Helper.Switch.FrameHelper;
import com.myFramework.CompanyName.ProjectName.Helper.logger.LoggerHelper;

public class WindowHelper {
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(WindowHelper.class);

	public WindowHelper(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * defaultContect will move to the parent window.
	 */
	public void switchToParentWindow() {
		driver.switchTo().defaultContent();
		log.info("Window moved to the parent window");

	}

	public void switchToWindow(int Index) {
		Set<String> windows = driver.getWindowHandles();
		int i=1;
		for (String window:windows){
			if(i== Index);
			driver.switchTo().frame(window);
		}
		else {
			i++;
		}

	public void closeAllTabsAndSwitchToMainWindow() {
		Set<String> windows = driver.getWindowHandles();
		String mainWindow = driver.getWindowHandle();
		for (String window : windows) {
			if (!window.equalsIgnoreCase(mainWindow))
				;
			driver.close();

		}
		driver.switchTo().window(mainWindow);
		log.info("All the tabs closed and moved to Main window");

	}

	public void navigateBack() {
		driver.navigate().back();
		log.info("windows navigated back");
	}

	public void navigateForward() {
		driver.navigate().forward();
		log.info("windows navigated forward");
	}
}
