package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.grid.Main;

public class Amazon_login
{
public static void main(String[] args) 
{
	EdgeDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
	WebElement dd= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
	dd.sendKeys(Keys.ARROW_DOWN);
	dd.sendKeys(Keys.ARROW_DOWN);
	dd.sendKeys(Keys.ARROW_DOWN);
	dd.sendKeys(Keys.ARROW_DOWN);
	dd.sendKeys(Keys.ARROW_DOWN);
	dd.sendKeys(Keys.ARROW_DOWN);
	dd.sendKeys(Keys.ARROW_DOWN);
	dd.sendKeys(Keys.ARROW_DOWN);
	dd.sendKeys(Keys.ARROW_DOWN);
	dd.sendKeys(Keys.ARROW_DOWN);
	//dd.sendKeys(Keys.ARROW_DOWN);

	
	dd.click();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("men");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}
}

