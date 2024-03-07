package org.omrbranch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vino8278@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Vino17@kobe");
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();
		WebElement welcome = driver.findElement(By.xpath("//a[contains(@data-testid,'us')]"));
		String text = welcome.getText();
		System.out.println(text);
		
		WebElement hotelbooking = driver.findElement(By.xpath("//h3[text()='Hotel Booking']"));
		hotelbooking.click();
		WebElement explorehotels = driver.findElement(By.xpath("//h5[text()='Explore Hotels']"));
		String text2 = explorehotels.getText();
		System.out.println(text2);
		
		WebElement state = driver.findElement(By.id("state"));
		Select select=new Select(state);
		select.selectByVisibleText("Tamil Nadu");
//		WebElement city = driver.findElement(By.className("select2-dropdown select2-dropdown--below"));
		Select select2=new Select(city);
		select2.selectByVisibleText("Chennai");
	}

}
