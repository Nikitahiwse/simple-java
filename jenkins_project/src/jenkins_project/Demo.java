package jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException 
	{
		
		
			WebDriver wd;
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			wd=new ChromeDriver();
			wd.get("http://automationpractice.com/index.php");
			Thread.sleep(5000);
			system.out.println("changes from nikita1");
			wd.manage().window().maximize();
			
			Thread.sleep(3000);
		
//system
		
		// TODO Auto-generated method stub
		
	}

}
