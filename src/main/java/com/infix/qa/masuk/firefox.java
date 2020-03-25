package com.infix.qa.masuk;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {


    public static void main(String[]args){
        firefoxhw();


    }
    public static void firefoxhw(){
        System.setProperty("webdriver.gecko.driver","/Users/mdrahman/projects/driver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.macys.com/");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);




    }
}
