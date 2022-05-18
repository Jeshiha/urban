import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		WebElement login=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span"));
        Actions action= new Actions(driver);
        action.moveToElement(login).build().perform();
        
        driver.findElement(By.xpath("(//a[normalize-space()='Log In'])[1]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[@id='password-credentials']//input[@id='spree_user_email']")).sendKeys("jeshihas@gmail.com");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).sendKeys("Abcd@1008");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"ul_site_login\"]")).click();
        
        
	}
	
}
