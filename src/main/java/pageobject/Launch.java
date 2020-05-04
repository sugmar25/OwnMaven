package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/786516/Downloads/ui_automation-Team_OmniRPS_KPC_Features/src/test/resources/Drivers/chromedriver");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.google.com/");
	    System.out.println(driver.getTitle());
	    driver.close();
	
	}
	

}
