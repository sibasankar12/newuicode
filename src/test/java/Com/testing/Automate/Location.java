package Com.testing.Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
      int user=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).getLocation().getX();
     int pass=driver.findElement(By.xpath("//input[@placeholder='Password']")).getLocation().getX();
     
     System.out.println(user);
     System.out.println(pass);
     if (user==pass)
     {
    	 System.out.println("its in correct position");
     }
     else
     {
    	 System.out.println("its not in correct position");
     }
     driver.quit();
     
	}

}
