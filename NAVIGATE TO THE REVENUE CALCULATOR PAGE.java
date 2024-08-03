package myproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class NavigateToRevenueCalculator {
    public static void main(String[] args) {
       

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();
 
        try {
            // Navigate to the revenue calculator page as given in second task
            driver.get("https://fitpeo.com/revenue-calculator");
 
            WebElement revenueCalculatorLink = driver.findElement(By.linkText("Revenue Calculator"));
            revenueCalculatorLink.click();
 
         
            // at final step to close the browser we need to use quit.
         driver.quit();
        }
    }
}