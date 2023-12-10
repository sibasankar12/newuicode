package Com.testing.Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttontest {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		WebElement button =driver.findElement(By.linkText("Log in"));
		if(button.isEnabled()==true)
		{
			System.out.println("the button is enabled");
		}
		else
		{
			System.out.println("the button is not enabled");
		}
        driver.quit();
	}

}
