package tests;

import org.testng.annotations.Test;

import pages.CreateOrderPage;
import pages.ChangeStatusPage;
import pages.LoginPage;
import utils.BaseClass;

public class TVSFITTest extends BaseClass {

    @Test
    public void createOrderAndUpdateStatus() {

        LoginPage login = new LoginPage(driver);

        login.login("username", "password");

        CreateOrderPage order =
                new CreateOrderPage(driver);

        order.createOrder();

        ChangeStatusPage status =
                new ChangeStatusPage(driver);

        status.updateStatus();
    }
}