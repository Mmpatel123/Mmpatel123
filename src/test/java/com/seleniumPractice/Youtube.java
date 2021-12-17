package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class Youtube {
    WebDriver driver;
  String LINK_URL="https://www.youtube.com/watch?v=i0_m90T04uw";
    @Before
    public void setUp(){

      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    @Test
    public void openhome(){

       driver.get(LINK_URL);
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("I AGREE");
       driver.findElement(By.cssSelector("#text")).click();
     //  driver.findElement(By.id("search")).sendKeys("kamariya");
//driver.findElement(By.id("search")).sendKeys("kamariya");

       // driver.findElement(By.xpath("//*[@id=\"button\"]")).submit();
    }
    @After
    public void tearDown(){
     // driver.close();


    }}

