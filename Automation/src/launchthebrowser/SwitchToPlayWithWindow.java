package launchthebrowser;

import java.awt.Point;
import java.lang.classfile.ClassFile.ShortJumpsOption;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToPlayWithWindow 
{
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com/signup");
	Set<String> allWid= driver.getWindowHandles();
	System.out.println(allWid.size());
    //driver.manage().window().getSize().getHeight();
	//for each loop....
	for(String wid : allWid)
	{
		String widTitle = driver.switchTo().window(wid).getTitle();
		System.out.println("WidTitle=" +widTitle);
		
		if(widTitle.equals("Facebook – log in or sign up"))
		{
			System.out.println("parent Window");
		}
		
		else if (widTitle.equals("Sign up for Facebook")) 
		{
			System.out.println("child Window");
			int childWindowHeight = driver.manage().window().getSize().getHeight();
			System.out.println("childWindowHeight:="+" " +childWindowHeight);
			int childWindowWidth = driver.manage().window().getSize().getWidth();
			System.out.println("childWindowWidth:=" +" "+childWindowWidth);
			int childWindowXAxis = driver.manage().window().getPosition().getX();
			System.out.println("childWindowXAxis:=" +" "+childWindowXAxis);
			int childWindowYAxis = driver.manage().window().getPosition().getY();
			System.out.println("childWindowYAxis:=" +" " +childWindowYAxis);
			//set the size of child window
			Dimension definedSize = new Dimension(800,500);
			driver.manage().window().setSize(definedSize);
			 org.openqa.selenium.Point definedPosition = new org.openqa.selenium.Point(180, 170);
			driver.manage().window().setPosition(definedPosition);
		} 
			
	   }
	}

}
