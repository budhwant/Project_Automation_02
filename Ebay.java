package AT_Project_Ebay_Online_shoping;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//a[@title='Advanced Search']")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[1]/div[1]/span/span/input")).sendKeys("Watch");
		driver.findElement(By.xpath("/html/body/div[2]/div/main/form/fieldset[1]/div[3]/span/input")).sendKeys("Camara");
		
		driver.findElement(By.xpath("//*[@id=\"s0-1-17-5[1]-[0]-LH_TitleDesc\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"s0-1-17-5[1]-[1]-LH_Complete\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"s0-1-17-5[1]-[2]-LH_Sold\"]")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[3]/div/div/span[2]/span/input")).sendKeys("1000");
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[3]/div/div/span[5]/span/input")).sendKeys("10000");
		
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[4]/div[1]/span/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[5]/div[1]/span/input")).click();
		
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[6]/div[1]/span/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[6]/div[2]/span/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[6]/div[3]/span/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[6]/div[4]/span/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[6]/div[5]/span/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[6]/div[6]/span/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[6]/div[7]/span/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[6]/div[8]/span/input")).click();
		
		driver.findElement(By.xpath("//option[@text='Started within']")).click();
		driver.findElement(By.xpath("//option[@text='7 days']")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/main/form/fieldset[7]/div[1]/span/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/form/fieldset[7]/div[2]/span/input")).click();
		driver.findElement(By.xpath("//option[@text='India']")).click();
		
	}

}
