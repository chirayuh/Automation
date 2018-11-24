import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
WebDriver ex = new  ChromeDriver();
		//WebDriver ex= new FirefoxDriver();
ex.manage().window().maximize();
ex.get("https://www.google.com/intl/en-GB/gmail/about/");

//Thread.sleep(5000);
ex.findElement(By.xpath("html/body/nav/div/a[2]")).click();
ex.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("chirayuh69@gmail.com");
ex.findElement(By.xpath(".//*[@id='identifierNext']")).click();
Thread.sleep(3000);
/*ex.findElement(By.xpath(".//*[@id='password']")).click();*/
ex.findElement(By.xpath(".//*[@id='password']")).sendKeys("chirayu@9986676756");
ex.findElement(By.xpath(".//*[@id='passwordNext']")).click();


Thread.sleep(2000);

/*Actions a = new Actions(ex);
a.moveToElement(abc).contextClick().keyDown(Keys.DOWN).keyUp(Keys.DOWN).build().perform();
a.perform();*/

ex.close();
	}

}

