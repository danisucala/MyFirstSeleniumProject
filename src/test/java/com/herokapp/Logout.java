package com.herokapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logout {
    @Test
    public void logoutTest () {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://the-internet.herokuapp.com/logout";
        driver.get(url);
        driver.manage().window().maximize();

        //enter username
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("tomsmith");

        //enter password
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("SuperSecretPassword!");

        //click login
        //WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
        WebElement loginButton = driver.findElement(By.className("radius"));
        //WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();

        //click logout
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i)"));
        logoutButton.click();


        driver.close();




    }
}
