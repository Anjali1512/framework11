//login to facebook application using css 
	package a;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ex
	{
	 public static void main(String[] args) throws Throwable
	 {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.cssSelector("input[id='email']")).sendKeys("anjali");
	   driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("anjali");
	   driver.findElement(By.cssSelector("label[id='loginbutton']")).click();
	 }
	}
