import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Chrome 
		
		//ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vradhakrish8\\Downloads\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String displayText = "Registration Successful";
		
		driver.get("https://buggy.justtestit.org/");
		driver.findElement(By.xpath("/html/body/my-app/header/nav/div/my-login/div/form/a")).click();
		
		//driver.get("https://buggy.justtestit.org/register");
		
	driver.findElement(By.id("username")).sendKeys("preeti123");
	driver.findElement(By.cssSelector("#firstName")).sendKeys("preeti");
	driver.findElement(By.cssSelector("#lastName")).sendKeys("qa");
	driver.findElement(By.cssSelector("#password")).sendKeys("Awesome@123");
	driver.findElement(By.cssSelector("#confirmPassword")).sendKeys("Awesome@123");
	driver.findElement(By.xpath("/html/body/my-app/div/main/my-register/div/div/form/button")).click();
	System.out.println(" "+ displayText);
	
	}

}
