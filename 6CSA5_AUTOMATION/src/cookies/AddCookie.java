package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookie {
	public static void main(String[] args) {
		WebDriver   driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		Cookie cooky=new Cookie("simple","123456");
		driver.manage().addCookie(cooky);
		
	}

}
