import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Tools\\Selenium\\edgedriver_win64\\msedgedriver.exe");

        EdgeDriver driver = new EdgeDriver();
        TicketCreation autoTicket = new TicketCreation(driver);

        autoTicket.run();

        driver.quit();
    }
}
