package s1;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)open the browser
ChromeDriver driver = new ChromeDriver();

//2)navigate to application
driver.get("https://www.facebook.com/");
//3)verify the visitor on the page and he verifys the title
String expectedTitle = "Facebook – log in or sign up";
String actualTitle = driver.getTitle();
System.out.println(expectedTitle);
System.out.println(actualTitle);
if(expectedTitle.equals(actualTitle)) {
	System.out.println("test case pass");
}
else {
	System.out.println("test case failed");
}
//4)close the browser
driver.quit();
	}

}
