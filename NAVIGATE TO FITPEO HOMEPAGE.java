import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class NavigateToFitPeo {
    public static void main(String[] args) {
 
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
 
        // Navigate to the FitPeo homepage as mentioned in task one
         driver.get("https://www.fitpeo.com");
        	
        // Close the browser
        driver.quit();
    }
}