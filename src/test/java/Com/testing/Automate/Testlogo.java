package Com.testing.Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogo {

	public static void main(String[] args) 
	{
	ChromeDriver	 driver =new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
	if (logo.isDisplayed()==true)
	{
		System.out.println("its present");
	}
	else
	{
		System.out.println("its not present");
	}
	driver.quit();
	}

}
