import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		
		driver.findElement(By.xpath("(//*[@id='header']/section/div/ul[1]/li[1]/a)")).click();
		String Help="how do i track my order status ";
		driver.findElement(By.xpath("//*[@id=\'help-center-search-input\']")).sendKeys(Help);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/form/div/button")).click();
       
	}

}
