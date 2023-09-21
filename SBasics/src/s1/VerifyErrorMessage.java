package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//open the browser
		
		ChromeDriver driver = new ChromeDriver();
		//navigate to application
		
		driver.get("https://www.facebook.com/");
		//enter invalid username
		driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");
		//enter invalid pasword
		driver.findElement(By.id("pass")).sendKeys("pass@123");
		
		//click login button
		driver.findElement(By.name("login")).click();
		//verify user sees the error meesage
		String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		//String actualErrMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@class,'ay')])[3]")).getText();
		
		System.out.println(expectedErrMsg);
		System.out.println(actualErrMsg);
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		//close the browser
		driver.quit();
		//driver.findElements(By.tagName("a")); -->bytagname
	}

}
//// for css---->xpath creation  --->(//div[contains(@class,'ay')])[3]
//tagname[contains(@attribute,'value')]
