package com.infix.qa.masuk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterChrome {
    public static void main(String[]args) throws InterruptedException {
        chromehw();



    }
    public static void chromehw() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mdrahman/projects/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
        driver.findElement(By.xpath("//*[@id=\"customer.emailAddress\"]")).sendKeys("masukssa9@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("masuk");
        driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("rahman");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/div[4]/div[2]/input")).sendKeys("Michigan123");
        driver.findElement(By.xpath("//*[@id=\"passwordConfirm\"]")).sendKeys("Michigan123");
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/button")).click();






        System.out.println("click to register");



    }
}
