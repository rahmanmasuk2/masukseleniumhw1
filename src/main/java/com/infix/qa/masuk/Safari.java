package com.infix.qa.masuk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {


    public static void main(String[] args) {

        safarihw();


    }

    public static void safarihw() {


        WebDriver driver = new SafariDriver();
        driver.navigate().to("https://www.espncricinfo.com");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);



    }
}