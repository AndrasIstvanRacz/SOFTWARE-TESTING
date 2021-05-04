package test.navigationbar;

import test.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class NavigationBarStepDefinitions {

    WebDriverWait wait = new WebDriverWait(Setup.driver,40);

    @Given("the user press the {string} button")
    public void buttonPressed(String btnXpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnXpath)));
        Setup.driver.findElement(By.xpath(btnXpath)).click();
    }

    @Then("the {string} page should be loaded")
    public void testLinkLoaded(String link) {
        assertEquals(Setup.driver.getCurrentUrl(), link);
    }

    @Then("the {string} should showed")
    public void testContact(String popupXpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popupXpath)));
        assertEquals("modal fade show", Setup.driver.findElement(By.xpath(popupXpath)).getAttribute("class"));

    }

}

