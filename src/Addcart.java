import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.urbanladder.com");
				driver.findElement(By.xpath("//*[@id=\'head-alert\']/div/div/div/div")).click();
				
				driver.findElement(By.id("search")).sendKeys("sofa");
				driver.findElement(By.id("search_button")).click();
				
				driver.findElement(By.xpath("//*[@id=\'search-results\']/div[3]/ul/li[5]/div/a[1]/img")).click();
				
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.navigate().back();
				
				}

}
