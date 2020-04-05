package com.infix.qa.masuk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginChrome {

    public static void main(String[] args) throws InterruptedException {
        Loginhw();
    }

    public static void Loginhw() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mdrahman/projects/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
        driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[1]/form/div[1]/div/input")).sendKeys("masukssa9@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Michigan123");
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
        System.out.println("click to login");

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/div/div[2]/h4")).click();
        System.out.println("click to green goust");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[4]/div[1]/form/div/div[1]/button")).click();
        System.out.println("Add to chart");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[4]/div[1]/form/div/div[3]/a")).click();
        System.out.println("click to veiw in cart");
         driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div[2]/h4/a")).click();
        System.out.println("At to cart");

        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul[2]/li[4]/ul/li[4]/a")).click();
        System.out.println("click to view in cart");

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div[2]/div[5]/div[1]/a")).click();
        System.out.println("click to checkout");

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div/div[1]/div/div/div[1]/div/div/input")).sendKeys("masuk");
        System.out.println("type first name");




    }

}