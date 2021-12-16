package com.seleniumPractice;
public class NowLoginNopCommernce {
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

      driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
      Thread.sleep(500L);
driver.findElement(By.id("Email")).sendKeys("lightyear9461@gmail.com");
Thread.sleep(500L);
driver.findElement(By.id("Password")).sendKeys("M630ela1");
Thread.sleep(500L);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

        System.out.println(driver.getTitle());
        Thread.sleep(1500L);

    }
    @After
    public void tearDown(){
driver.close();
}
}
