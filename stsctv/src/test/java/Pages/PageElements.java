package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageElements {
	WebDriver driver;
	
	String subscription_type_litte=driver.findElement(By.id("name-lite")).getText();
	 String subcription_currency_litte=driver.findElement(By.id("currency-lite")).getText();
	 String subscription_type_classic=driver.findElement(By.id("name-classic")).getText();
	 String subscription_currency_classic=driver.findElement(By.id("currency-classic")).getText();
	 String subscription_type_premium=driver.findElement(By.id("name-premium")).getText();
	 String subscription_currency_premium=driver.findElement(By.id("currency-premium")).getText();
	 public PageElements(WebDriver driver){
		 this.driver=driver;
	 }

}
