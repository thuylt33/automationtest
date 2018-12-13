package buoi2;



import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.List;

public class buoi45 {
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Setup\\Eclipse\\selenium\\chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--start-maximized");
//        driver = new ChromeDriver(chromeOptions);
      driver = new ChromeDriver();

        //---
//        System.setProperty("webdriver.gecko.driver", "D:\\Setup\\Eclipse\\selenium\\geckodriver.exe");
//        FirefoxOptions options;
//        options = new FirefoxOptions();
//        options.addArguments("--start-maximized");
//        driver = new FirefoxDriver(options);


//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        FirefoxOptions options = new FirefoxOptions();
//        options.addPreference("log", "{level: trace}");
//
//        capabilities.setCapability("marionette", true);
//        capabilities.setCapability("moz:firefoxOptions", options);

      //  System.setProperty("webdriver.gecko.driver", "D:\\Setup\\Eclipse\\selenium\\geckodriver.exe");

       //driver = new FirefoxDriver();

        // driver.get("http://testmaster.vn/");
        driver.get("https://www.lazada.vn/#");
        driver.manage().window().maximize();

        Thread.sleep(3000);
    }

    // @Test
    public void Bai1() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='footer']//input")).sendKeys("thuy2011ptit@gmail.com");
        driver.findElement(By.xpath("//div[@class='footer']//button")).click();
        Thread.sleep(5000);
        //Form thong tin mo
        driver.findElement(By.xpath("//div[@class='modal fade popover-dialog form extra-subscription-form in']//p/input")).sendKeys("họ ten");

        String lbGioiTinhMD = driver.findElement(By.xpath("//div[@class='modal fade popover-dialog form extra-subscription-form in']//button[@id='ddlGender']/span[1]")).getText();
        Assert.assertEquals(lbGioiTinhMD, "Không xác định");
        String lbLoaiTinMD = driver.findElement(By.xpath("//div[@class='modal fade popover-dialog form extra-subscription-form in']//button[@id='ddlNewsType']/span[1]")).getText();
        Assert.assertEquals(lbLoaiTinMD, "Nhận tất cả các loại tin");


    }

    @Test
    public void Bai2() throws InterruptedException {
        String keyTimKiem = "áo";
        driver.findElement(By.xpath("//div/input[@id='q']")).sendKeys(keyTimKiem);
        Thread.sleep(1000);
        //div/div[@class='suggest-list--3Tm8']/a
        List<WebElement> suggestions = driver.findElements(By.xpath("//div/div[@class='suggest-list--3Tm8']/a"));
        int i = suggestions.size();
        System.out.println("ktra 10 sussgetion " + i);

        //check dispplay 10 suggest
        Assert.assertEquals(10, i);
        //div/button[@class='search-box__button--1oH7']
        driver.findElement(By.xpath("//div/button[@class='search-box__button--1oH7']")).click();


        //listResult = driver.findElements(By.xpath("//div[@data-qa-locator='product-item']//div[2]/div/a"));
//next page
       // driver.findElement(By.xpath("//a[@class='ant-pagination-item-link']"));

       // driver.findElement(By.xpath("//li[@title='Next Page']/a[@class='ant-pagination-item-link']"));
int k=0;

        //JavascriptExecutor js = (JavascriptExecutor) driver;

        //to perform Scroll on application using  Selenium

        //js.executeScript("window.scrollBy(0,0-document.body.scrollHeight)");
        //up scroll
        Thread.sleep(3000);
        System.out.println("cho doi11222");
      //  ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, (document.body.scrollHeight)*5/7)");

        //js.executeScript("window.scrollBy(0,3000)", "");
        Thread.sleep(10000);
       WebElement e= driver.findElement(By.xpath("//div[@id='root']//div//li[@title='Next Page']"));//Next Page
        WebElement e1=driver.findElement(By.xpath("//div//h3[@class='cP0KIr']"));
        Thread.sleep(10000);
        System.out.println("cho 4554545");
        //(JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
       //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
          ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, (document.body.scrollHeight)*14/16)");

e.getAttribute("title");
        System.out.println("cho êrrr");

        Thread.sleep(10000);
        e.click();

     /*   do {
            List<WebElement>    listResults = driver.findElements(By.xpath("//div[@data-qa-locator='product-item']//div[2]/div/a"));

            for (WebElement listResult : listResults) {
                Thread.sleep(2000);

                System.out.println(k+"STT   "+listResult.getText());k++;
//                if (listResult.getText().contains(keyTimKiem)) {
//                    Assert.assertTrue(true);
//                } else {
//                    Assert.assertTrue(false);
//                    break;
//                }


         }
//Click nexxt page
            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, (document.body.scrollHeight)*4/5)");


            WebElement a=driver.findElement(By.xpath("//div//li[@title='Next Page']/a"));
            System.out.println(k+"STT eee" );

            Thread.sleep(9000);



        }
        while (driver.findElement(By.xpath("//li[@title='Next Page']")).getAttribute("aria-disabled").equals("false"));
*/
    }
}
