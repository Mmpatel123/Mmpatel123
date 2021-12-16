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

        WebElement staticDropdown =driver.findElement(By.className("menu-toggle"));
        Select dropdown=new Select(staticDropdown);
        //   dropdown.selectByIndex(3);
        //   System.out.println(  dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("Desktops");



    }
    @After
    public void tearDown(){
//driver.close();

    }
}
