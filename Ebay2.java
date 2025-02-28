package AT_Project_Ebay_Online_shoping;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ebay2 {

			public static void main(String[] args) throws InterruptedException, IOException {
				// TODO Auto-generated method stub
				
				 System.out.println("Select a WebDriver:");
			        System.out.println("1. EdgeDriver");
			        System.out.println("2. ChromeDriver");
			        System.out.println("3. FirefoxDriver");
			        System.out.print("Enter your choice (1/2/3): ");

			        Scanner scaner= new Scanner(System.in);
					int choice = scaner.nextInt();
					WebDriver driver = null;
			        switch (choice) {
			            case 1:
			                System.out.println("Initializing EdgeDriver...");
			                driver=new EdgeDriver();
			                break;
			            case 2:
			                System.out.println("Initializing ChromeDriver...");
			                driver= new ChromeDriver();
			                
			                break;
			            case 3:
			                System.out.println("Initializing FirefoxDriver...");
			                driver=new FirefoxDriver();
			                break;
			            default:
			                System.out.println("Invalid choice.");
			                break;
			                
			              }
			        scaner.close();
			        
			        driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			        
					driver.get("https://www.ebay.com/");
					driver.findElement(By.partialLinkText("Advanced")).click();
					
					driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[1]/div[1]/span/span/input")).sendKeys("Watches");
					driver.findElement(By.id("s0-1-17-4[0]-7[1]-_in_kw")).sendKeys("All words, any order");
					driver.findElement(By.id("s0-1-17-4[0]-7[3]-_sacat")).sendKeys("All Categories");
					driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[2]/div[1]/span/input")).click();
					driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[4]/div[3]/span/input")).click();
					driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[5]/div[1]/span/input")).click();
					driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[6]/div[2]/span/input")).click();
					driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[7]/div[1]/span/input")).click();
					driver.findElement(By.xpath("html/body/div[2]/div/main/form/fieldset[8]/div[5]/span[1]/input")).click();
					driver.findElement(By.id("s0-1-17-6[7]-5[@field[]]-_salic")).sendKeys("United States");
					driver.findElement(By.id("s0-1-17-8[9]-1[0]-_sop")).sendKeys("Best match");
					driver.findElement(By.id("s0-1-17-8[9]-1[1]-_dmd")).sendKeys("Gallery view");
					driver.findElement(By.xpath("html/body/div[2]/div/main/form/div[2]/button")).click();
					driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[1]/div/a/div/span/input")).click();
					
					Thread.sleep(10000);
					
					File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(src, new File("D:\\Selenium software\\commons-io-2.16.1\\Screenshot6.png"));
					
			}
}

