package testBaidu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tbaidu{
	@Test
	public void openchrome() throws InterruptedException {
		   //�ȸ������
		  
	System.setProperty("webdriver.chrome.driver",".//tools//chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://www.baidu.com");
}
}