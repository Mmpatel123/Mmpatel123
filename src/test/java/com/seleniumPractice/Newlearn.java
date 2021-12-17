package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Newlearn {
 public String LINK_URL="https://www.youtube.com/watch?v=i0_m90T04uw";
    public static void main(String[] args) throws InterruptedException {
     WebDriver driver;
     WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.youtube.com/");
  driver.findElement(By.xpath("//*[@aria-label='Agree to the use of cookies and other data for the purposes described']")).click();
//driver.findElement(By.id("search")).sendKeys("kamariya");
driver.manage().window().maximize();
driver.findElement(By.name("search_query")).sendKeys("kamariya");
driver.findElement(By.id("search-icon-legacy")).click();
driver.findElement(By.id("play")).click();


        Thread.sleep(500L);
       // driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
       // ChromeOptions options = new ChromeOptions();
     //   options.addArguments("--disable-print-preview");




}
}
