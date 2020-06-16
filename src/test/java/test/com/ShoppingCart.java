/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShoppingCart {
     private WebDriver driver;
    private String baseUrl;
    
    public ShoppingCart() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vitali\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.etsy.com/listing/716335827/rail-steel-nordic-hatchet-ash-handle"
                + "?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query"
                + "=axe&ref=sc_gallery-1-3&plkey=77fdd82e5578f00f30765683856cf54e208fdb33%3A716335827&pro"
                + "=1&frs=1";
        
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.manage().window().maximize();
       
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }

    
     @Test
     
public void test1ShoppingCart1() throws InterruptedException{
driver.get(baseUrl);
driver.manage().window().maximize();
Select font = new Select (driver.findElement(By.id("inventory-variation-select-0")));
font.selectByValue("1181109600");
Thread.sleep(2000);
//driver.findElement(By.xpath("//span[@class='wt-content-toggle--btn__icon']")).click();
driver.findElement(By.id("personalization-input")).click();
driver.findElement(By.id("personalization-input")).clear();
driver.findElement(By.id("personalization-input")).sendKeys("ALL LIVES MATTER");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()[normalize-space()='Add to cart']]")).click();
//driver.findElement(By.xpath("//a[@data-selector='atc-overlay-go-to-cart-button']")).click();
String pageTitle5 = driver.getTitle();
assertEquals(pageTitle5,"Etsy - Shopping Cart");
     
}
@Test
public void test2RemovingItemFromShoppingCart() throws InterruptedException{
driver.get(baseUrl);
driver.manage().window().maximize();
Select font = new Select (driver.findElement(By.id("inventory-variation-select-0")));
font.selectByValue("1181109600");
Thread.sleep(2000);
//driver.findElement(By.xpath("//span[@class='wt-content-toggle--btn__icon']")).click();
driver.findElement(By.id("personalization-input")).click();
driver.findElement(By.id("personalization-input")).clear();
driver.findElement(By.id("personalization-input")).sendKeys("ALL LIVES MATTER");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()[normalize-space()='Add to cart']]")).click();

driver.findElement(By.linkText("Remove")).click();
String pageTitle1=driver.getTitle();
assertEquals(pageTitle1,"Etsy - Shopping Cart");


}
}

     
     
     
     
