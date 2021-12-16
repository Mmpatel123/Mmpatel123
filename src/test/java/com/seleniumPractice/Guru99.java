package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Guru99 {
    WebDriver driver;
    String LINK_URL="http://demo.guru99.com/test/login.html";
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
driver.findElement(By.id("email")).sendKeys("lightyear9461@gmail.com");
driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Avadh@2009");
driver.findElement(By.id("passwd")).sendKeys("Avadh@2009");
driver.findElement(By.name("SubmitLogin")).click();

    }
    @After
    public void tearDown(){
driver.close();

    }
}
