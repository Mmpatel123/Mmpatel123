package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class NopCommernceRegister {
    WebDriver driver;
    String LINK_URL="https://demo.nopcommerce.com/";
    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    @Test
    public void openhome() throws InterruptedException {
driver.get(LINK_URL);

       driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
       driver.findElement(By.id("gender-female")).click();
       Thread.sleep(1000L);
       driver.findElement(By.id("FirstName")).sendKeys("megha");
       Thread.sleep(500L);
       driver.findElement(By.id("LastName")).sendKeys("patel");
        Thread.sleep(500L);
        driver.findElement(By.id("Email")).sendKeys("lightyear9461@gmail.com");
        Thread.sleep(500L);
        driver.findElement(By.id("Company")).sendKeys("megha & Sons");
        Thread.sleep(500L);
        driver.findElement(By.name("Password")).sendKeys("M630ela1");
        Thread.sleep(500L);
        driver.findElement(By.name("ConfirmPassword")).sendKeys("M630ela1");
        Thread.sleep(500L);
        driver.findElement(By.id("register-button")).click();
        System.out.println(    driver.getTitle());



    }
    @After
    public void tearDown(){
driver.close();

    }
}
