package com.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class How_to_iterate {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Selenium_project\\src\\Driver\\msedgedriver.exe");

		WebDriver drive = new EdgeDriver();

		drive.get("https://www.amazon.com/s?i=electronics-intl-ship&bbn=16225009011&rh=n%3A502394%2Cn%3A172435%2Cn%3A13535371&dc&qid=1654658353&rnid=1248877011&ref=sr_nr_p_72_1&ds=v1%3A%2FelTY0RA%2BVUoiVPKcR%2B4CPGXzW3FV0grrg3LSxe4na4");

		WebElement fourstar = drive.findElement(By.xpath("//span[text()='4 Stars & Up']"));
		
		fourstar.click();
		
		WebElement adapters = drive.findElement(By.xpath("//span[text()='Adapters']"));
		
		adapters.click();
		
		List<WebElement> list = drive.findElements(By.xpath("//ul[@aria-labelledby='p_89-title']/li"));
		
		for (WebElement allitems : list) {
			
			if (allitems.equals("Dericam")) {
				
				allitems.click();
				
			}
			
		}	
	}

}
