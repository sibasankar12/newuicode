package Com.testing.Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Startone {

	public static void main(String[] args) throws InterruptedException 
	{
	  ChromeDriver driver = new  ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("sibasankar");
	  driver.findElement(By.name("lastname")).sendKeys("sahu");
	  driver.findElement(By.name("reg_email__")).sendKeys("sahusibasankar28@gmail.com");
	  driver.findElement(By.name("reg_passwd__")).sendKeys("12Rtfe");
	    WebElement day =driver.findElement(By.name("birthday_day"));
	   Select s=new Select(day);
	    s.selectByValue("14");
	   WebElement month =  driver.findElement(By.name("birthday_month"));
	    Select s1= new Select(month);
	    s1.selectByVisibleText("Oct");
	    WebElement year = driver.findElement(By.name("birthday_year"));
	    Select s2=new Select(year);
	    s2.selectByVisibleText("1994");
	    driver.findElement(By.xpath("//label[.='Male']")).click();
	    driver.findElement(By.name("websubmit")).submit();
	    driver.quit();
	  
	 
	  

	}

}
