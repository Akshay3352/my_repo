import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String configpath="‪E:\\chromedriver_win32\\chromedriver.exe";
		
		 
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver HR= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) HR;
		
		
		HR.manage().window().maximize();
	//	HR.get("https://www.bigbasket.com/");
		HR.get("https://demoqa.com/");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350)","");
		HR.findElement(By.xpath("//div[@class='card mt-4 top-card'][2]")).click();
		Thread.sleep(3000);
		HR.findElement(By.xpath("(//*[@class='header-right'])[1]")).click();
		HR.findElement(By.xpath("(//*[@id='item-0'])[1]")).click();
		HR.findElement(By.id("userName")).sendKeys("Akshay");
		HR.findElement(By.id("userEmail")).sendKeys("AAA@gmail.com");
		HR.findElement(By.id("currentAddress")).sendKeys("Pune");
		HR.findElement(By.id("permanentAddress")).sendKeys("Bhosari");
		js.executeScript("window.scrollBy(0,420)","");
		HR.findElement(By.xpath("//button[@id='submit']")).click();
		
		WebElement Empname=HR.findElement(By.id("name"));
		System.out.println(Empname.getText());
		WebElement Empemail=HR.findElement(By.id("email"));
		System.out.println(Empemail.getText());
		Thread.sleep(1000);
		WebElement Empcaddress=HR.findElement(By.id("currentAddress"));
		System.out.println(Empcaddress.getText());
		Thread.sleep(1000);
		WebElement Emppaddress=HR.findElement(By.id("permanentAddress"));
		System.out.println(Emppaddress.getText());
		
	}

}
