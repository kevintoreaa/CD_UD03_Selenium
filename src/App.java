import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
 
        try {
            driver.get("https://es.wikipedia.org");
            Thread.sleep(3000);

           System.out.println(driver.getTitle());

        } catch (InterruptedException e) {
            //TODO
            e.printStackTrace();
        }
        
        driver.quit();
    }
}