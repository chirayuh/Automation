import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
WebDriver ex = new  ChromeDriver();
		//WebDriver ex= new FirefoxDriver();
ex.manage().window().maximize();
ex.get("https://www.facebook.com");

//Thread.sleep(5000);

ex.findElement(By.xpath(".//*[@id='email']")).sendKeys("username");
ex.findElement(By.xpath(".//*[@id='pass']")).sendKeys("password");
ex.findElement(By.xpath(".//*[@id='loginbutton']")).click();
Thread.sleep(5000);

/*Actions a = new Actions(ex);
a.moveToElement(abc).contextClick().keyDown(Keys.DOWN).keyUp(Keys.DOWN).build().perform();
a.perform();*/
Thread.sleep(5000);
ex.close();
	}

}

