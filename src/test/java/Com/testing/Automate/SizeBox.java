package Com.testing.Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeBox {

	public static void main(String[] args) 
	{
	ChromeDriver driver =new ChromeDriver();	
	driver.get("https://www.facebook.com/");
    int height = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).getSize().getHeight();
    int width = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).getSize().getWidth();
    
    System.out.println(height);
    System.out.println(width);
    driver.quit();
	}

}
