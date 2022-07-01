package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/login");
    }


    @Test
    public void test(){
        driver.findElement(By.name("email")).sendKeys("joqlcfzrqp@upperemails.com");
        driver.findElement(By.name("password")).sendKeys("Avis3101");
        driver.findElement(By.name("password")).sendKeys("Avis3101");
        driver.findElement(By.xpath("//button[@type='submit']/span[text()='Login']")).click();
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
