package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		//in above codes we used chrome driver so we are continuing same.
		WebDriver driver = new ChromeDriver();
                // here we use maximize keyword to maximize the page
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/revenue-calculator");
		WebElement element = driver.findElement(By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p']"));
		WebElement element1 = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"));
		element1.clear();
                // i tried to run the value 820 as mentioned but it automacially regains the value to "2000".
		element1.sendKeys("2000");
                 // so i tried to run the value with 2000
		 
        }

	}

