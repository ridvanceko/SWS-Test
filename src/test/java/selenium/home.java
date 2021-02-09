package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {


    @Test
        public void homeWrap () {
            WebDriverManager.chromedriver().setup();
             WebDriver  driver = new ChromeDriver();
            driver.get("https://www.spirewebsolutions.com");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[@href='https://www.spirewebsolutions.com/contact.html']"));
//        WebElement contactButton = driver.findElement(By.xpath("//a[@href='https://www.spirewebsolutions.com/contact.html']"));
//        contactButton.click();

    }

    @Test
    public void alertContact() {
        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.get("https://www.spirewebsolutions.com");
        WebElement contactNav = driver.findElement(By.xpath("//a[@href='/contact.html']"));
        contactNav.click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ridvan");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ceko@gmail.com");
        driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("I want to have a website");
      //  driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("I want to have a website immediately");
        WebElement contactSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        contactSubmit.click();



    }


}
