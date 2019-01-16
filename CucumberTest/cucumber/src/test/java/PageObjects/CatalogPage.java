package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage {
	
	private static WebElement element = null;
	
	//Body Tag
	public static WebElement tag_body(WebDriver driver) {
		element = driver.findElement(By.tagName("body"));
		return element;
	}
	//Page Title
	public static WebElement lbl_pagetitle(WebDriver driver) {
		element =driver.findElement(By.xpath("/html/body/div/section/main/div/div/sp-page-row/div/div[1]"));
		return element;
	}
	
	//Catlog Items Area Title
	public static WebElement div_catlogitems(WebDriver driver) {
		element =driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/sp-page-row/div/div[2]"));
		return element;
	}
	//Bucket Resource Link
	public static WebElement link_bucketresource(WebDriver driver) {
		element =driver.findElement(By.xpath("//*[@id=\"x4c6cbea60b212200eff7ef9bb4673a29\"]/div/div/div[2]/div[2]"));
		return element;
	}	

	//Create Snapshot Link
	public static WebElement link_snapshot(WebDriver driver) {
<<<<<<< HEAD
		element =driver.findElement(By.xpath("//*[@id=\"x4c6cbea60b212200eff7ef9bb4673a29\"]/div/div/div[2]/div[11]/div/a"));
		return element;
	}	
=======
		element =driver.findElement(By.xpath("//*[contains(text(), 'Create Snapshot')]"));
		return element;
	}	
	
	//Virtual Server Link
	public static WebElement link_createvirtualserver(WebDriver driver) {
		element =driver.findElement(By.xpath("//*[contains(text(), 'Create Virtual Server')]"));
		return element;
	}
>>>>>>> f3ed80699fd51abf36cce9bedad5c2b05a6bf21d
	
}
