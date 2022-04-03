package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;

public class MoneyCorp extends BaseClass {

	public void selectLang() {
		driver.findElement(By.id("language-dropdown-flag")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nav-inner']/ul/li[1]/a")));
	    driver.findElement(By.xpath("//div[@class='nav-inner']/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void searchPayment() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='navigation-search icon']")));
		driver.findElement(By.xpath("//button[@class='navigation-search icon']")).sendKeys("international payments");
		driver.findElement(By.xpath("//button[@class='navigation-search icon']")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	}
		

}
