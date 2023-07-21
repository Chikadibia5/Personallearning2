package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver_win32");
		WebDriver d = new ChromeDriver();
		d.get("https://www.linkedin.com");
		d.findElement(By.id("session_key")).sendKeys("oyohemmanuel@rocketmail.com");
		d.findElement(By.id("session_password")).sendKeys("Treasure@4003");
		d.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		String u=d.getCurrentUrl();
		if(u.equals("https://www.linkedin.com/login"));
	
		{
	
		System.out.println("Test Case Passed");
}
		
	}
}
	