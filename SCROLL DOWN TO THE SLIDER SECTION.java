package myproject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class ScrollToSlider {
    public static void main(String[] args) {
        
      
        // Initialize WebDriver instance
        WebDriver driver = new ChromeDriver();
 
        try {
            // Navigate to the Fitpeo homepage
            driver.get("https://fitpeo.com/revenue-calculator");
 
            // Wait for the page to load completely (we might need to use WebDriverWait for a more robust solution) 
        // here we use wait to fetch the data in-case there is a data is not fetched at the time of compling it rewaits back and search for data as requried.
            Thread.sleep(2000); // This is a simple wait, consider using WebDriverWait for a more robust approach // i have taken 2000sec because it's not mentioned.
 
            // Locate the revenue calculator slider element
            WebElement sliderElement = driver.findElement(By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p']")); // Replace with the actual ID of the slider element
 
            // Scroll the page until the slider element is visible completely.
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sliderElement);
 
            // Additional actions can be performed as if needed.
 
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the current web-browser
 //           driver.quit();
        }
    }
}
