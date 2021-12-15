package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class NopCommernceRegister {
    WebDriver driver;
    String LINK_URL="https://www.nopcommerce.com/en/demo";
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
driver.findElement(By.xpath("//*[@id=\"demo-page\"]/body/div[7]/header/div/div[3]/div[1]/ul/li[2]/ul/li[2]/a")).click();
driver.findElement(By.name("FirstName")).sendKeys("Dev");
Thread.sleep(1000L);
driver.findElement(By.name("LastName")).sendKeys("Patel");
Thread.sleep(1000L);
driver.findElement(By.name("Email")).sendKeys("lightyear9461@gmail.com");
Thread.sleep(500L);
driver.findElement(By.name("ConfirmEmail")).sendKeys("lightyear9461@gmail.com");
driver.findElement(By.name("Username")).sendKeys("Megha");
Thread.sleep(500L);

driver.findElement(By.name("Password")).sendKeys("AVADH@2009");
driver.findElement(By.id("ConfirmPassword")).sendKeys("AVADH@2009");


    }
    @After
    public void tearDown(){
driver.close();

    }
}
