package com.infix.qa.masuk;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {


    public static void main(String[]args){
        chromehw();


    }
    public static void chromehw(){
        System.setProperty("webdriver.chrome.driver","/Users/mdrahman/projects/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        driver.quit();



    }
}
