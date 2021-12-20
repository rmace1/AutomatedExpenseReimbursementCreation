import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TicketCreation {
    EdgeDriver driver;
    public TicketCreation(EdgeDriver driver){
        this.driver = driver;
    }

    public void run(){
        driver.get("http://localhost:9000");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement usernameElem = driver.findElement(By.id("userName"));
        usernameElem.sendKeys("drolli");

        WebElement passwordElem = driver.findElement(By.id("password"));
        passwordElem.sendKeys("Password#1");

        WebElement loginBtn = driver.findElement(By.id("login-btn"));
        loginBtn.click();

        try{
            wait.until(ExpectedConditions.urlContains("employee"));
        }catch (Exception e){

        }

        WebElement createTicket = driver.findElement(By.id("createTicket"));
        createTicket.click();

        try{
            wait.until(ExpectedConditions.urlContains("createTicket"));
        }catch (Exception e){

        }

        WebElement amount = driver.findElement(By.id("amount"));
        amount.sendKeys("1234.56");

        WebElement description = driver.findElement(By.id("description"));
        description.sendKeys("Humpty Dumpty piece.   " +
                "\n\nBrought to you by atomic element 34.");

        WebElement type = driver.findElement(By.id("food-type"));
        type.click();

        WebElement submitBtn = driver.findElement(By.id("create-ticket-btn"));
        submitBtn.click();

    }



}
