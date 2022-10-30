package introduction;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoitFileUpload {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagao\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://convertio.co/");
		driver.findElement(By.cssSelector("[class*='action']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\nagao\\Documents\\dummy.exe");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class*='btn-outline-dark'] i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='formats-inner']/ul/li[1]/span)[1]")).click();
		driver.findElement(By.cssSelector("[class*='btn-primary']")).click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
		driver.findElement(By.linkText("Download")).click();
		System.out.println("my name is nagarjuna");
		
}
}
