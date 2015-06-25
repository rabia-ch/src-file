package spider1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class spidercls {
	public static void main(String[]args)
	{
		WebDriver d1=new FirefoxDriver();
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.navigate().to("http://www.shophive.com/apple/mac?p=1");
		d1.manage().window().maximize();

		java.util.List<WebElement>
		priceList = d1.findElements(By.className("price-box")); 
		java.util.List<WebElement>
		productNameList = d1.findElements(By.className("product-name"));
		try{
		for(int i=0;i<=priceList.size();i++)
		{
		System.out.println("Product Number: "+i+1+ "\n Product name = " + productNameList.get(i).getText() + "\nPrice = "+priceList.get(i).getText() ); 
		}

		}catch(IndexOutOfBoundsException e)
		{
		System.out.println("The End");
		}

		d1.close();
	}

}
