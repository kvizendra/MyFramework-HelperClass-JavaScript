package com.myFramework.CompanyName.ProjectName.Helper.javaScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.myFramework.CompanyName.ProjectName.Helper.logger.LoggerHelper;

public class JavaScriptHelper {
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(JavaScriptHelper.class);

	public JavaScriptHelper(WebDriver driver) {
		this.driver = driver;

	}

	public Object executeScript(String script) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		return exe.executeScript(script);

	}

	public Object executeScript(String script, Object... arg) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		return exe.executeScript(script);

	}

	public void scrollToTheElement(WebElement element) {
		executeScript("window.scrollTo(arguments[0],arguments[1]", element.getLocation().x, element.getLocation().y);
		log.info("Scroll to Webelement");

	}

	/**
	 * in this method we a actually calling the method scrollToTheElement by
	 * passing the argument element. So by doing this we at the element now we
	 * just need to click on the element.
	 * 
	 * @param element
	 */
	public void clickToTheElement(WebElement element) {
		scrollToTheElement(element);
		element.click();
		log.info("Element is clicked");

	}

	public void scrollIntoView(WebElement element) {
		executeScript("arguments[0].scrollIntoView()", element);
		log.info("Scro;; till the webelement is presetn");

	}

	public void scrollIntoViewAndClick(WebElement element) {
		scrollIntoView(element);
		element.click();
		log.info("Element is clicked after getting scrolled");

	}

	public void scrollDownVertically(WebElement element) {
		executeScript("window.scrollTo(0,document.body.scrollHeight)");
		log.info("Scroll down vertically");
	}

	public void scrollUpVertically(WebElement element) {
		executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		log.info("Scroll down vertically");
	}

	public void scrollDownByPixel(int pixel) {
		executeScript("window.scrollBY(0," + pixel + ")");
		log.info("scroll down the pixel ");
	}

	public void scrollUpByPixel(int pixel) {
		executeScript("window.scrollBYS(0,-" + pixel + ")");
		log.info("scroll up the pixel ");
	}

	public void zoomInBy100Percentage() {
		executeScript("document.body.style.zoom='100%'");
		log.info("This wil zoom in the window by 100%");
	}

	public void zoomInBy60Percentage() {
		executeScript("document.body.style.zoom='60%'");
		log.info("This wil zoom in the window by 60 %");
	}

	public void clickElement(WebElement element) {
		executeScript("argument[0].click()", element);
		log.info("This will click any general element");
	}
}
