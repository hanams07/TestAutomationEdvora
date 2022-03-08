package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_Login{

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the website
		wd.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		Thread.sleep(10000);
		
		//Type username in text box
		wd.findElement(By.xpath("/html/body/div/div/main/div/div/div[1]/div/input")).sendKeys("hana");
		
		//Type password in text box
		wd.findElement(By.xpath("/html/body/div/div/main/div/div/div[2]/div/input")).sendKeys("hana1");
		
		
		//Type xpath to click button Login
		wd.findElement(By.xpath("/html/body/div/div/main/div/div/button")).click();
		Thread.sleep(5000);
		
		//Close the driver
		wd.quit();
		
		//Print message to the screen
		System.out.println("Successfully login the website");

	}

}
