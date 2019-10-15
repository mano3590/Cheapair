package objectRespostory;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class baseClass {
	public static WebDriver driver;

	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	public void loadUrl(String url)
	{
		 driver.get(url);
		 
	}
	public void functionClick(WebElement element) {
		element.click();
	}
	public void typeData(WebElement element,String data) {
		element.sendKeys(data);
		
	}
	
	public static void captureSreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot tk = (TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("D:\\Mano\\CheapAir\\Screenshot\\"+screenshotName+".png"));
		System.out.println("Screenshot taken");
	}
	

}
