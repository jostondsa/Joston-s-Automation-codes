package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class jio_hotstar {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com");
		driver.findElement(By.xpath("(//*[@class='_1CSTLo7uotP5mTlp3jKun7'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("icon-sports-fill soul-icon NAV_ICON_FONT_SIZE")).click();
		driver.findElement(By.xpath("(//*[@class='_1CSTLo7uotP5mTlp3jKun7'])[2]")).click();
	}

}
