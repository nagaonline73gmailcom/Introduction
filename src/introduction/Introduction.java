package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagao\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@data-testid,\"October-2022\")]//div[text()=\"8\"]")).click();
		Thread.sleep(3000);

		driver.quit();

		// TODO Auto-generated method stub

	}

}
