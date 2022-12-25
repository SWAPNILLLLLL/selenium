package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trainticketbooking {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\testing\\chromedriver.exe");
        
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.makemytrip.com/railways/");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body")).click();
	   Thread.sleep(1000);   
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]/label/span")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).sendKeys("Mumbai");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/p[2]/span")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")).sendKeys("manglore");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/p[2]/span")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"travelDate\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[1]")).click();
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/label/span")).click();
       Thread.sleep(4000); 
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/ul/li[2]")).click();
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a")).click();
      
		

	}

}
