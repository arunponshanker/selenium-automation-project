package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeStatusPage {

    WebDriver driver;

    public ChangeStatusPage(WebDriver driver) {
        this.driver = driver;
    }

    public void updateStatus() {

        driver.findElement(
          By.xpath("(//h4[@class='m-0'])[2]"))
          .click();

        driver.findElement(
          By.xpath("//span[@id='select2-status_option-container']"))
          .click();

        // Remaining status update logic...
    }
}