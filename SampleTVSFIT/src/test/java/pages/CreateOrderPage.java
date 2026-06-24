package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateOrderPage {

    WebDriver driver;

    public CreateOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createOrder() {

        driver.findElement(
            By.xpath("//h5[text()='Create Order'][1]"))
            .click();

        driver.findElement(
            By.xpath("//span[text()='Repo'][1]"))
            .click();

        driver.findElement(
            By.xpath("//span[text()='Without RC']"))
            .click();

        driver.findElement(
            By.xpath("//span[text()='Old Vehicle Number']"))
            .click();

        driver.findElement(
            By.xpath("//input[@Class='form-control  mgt-5']"))
            .sendKeys("TN25P1212");

        driver.findElement(
            By.xpath("//button[text()='proceed']"))
            .click();

        // Continue remaining order creation steps...
    }
}