package launchthebrowser;


import java.lang.classfile.ClassFile.ShortJumpsOption;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class PlaywithTab 
{

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dassault-aviation.com/en/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.dassault-aviation.com/en/group/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.dassault-aviation.com/en/defense/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.dassault-aviation.com/en/civil/");
	Set<String> allTab= driver.getWindowHandles();
	System.out.println(allTab.size());
	for(String Tab : allTab)
	{
		String TabTitle = driver.switchTo().window(Tab).getTitle();
		System.out.println("TabTitle=" +TabTitle);
		if(TabTitle.equals("Dassault Aviation, a major player to aeronautics"))
		{
			System.out.println("parent Tab");
			System.out.println("URL of Parent TAB: https://www.dassault-aviation.com/en/");
			System.out.println();
		}
		
		else if (TabTitle.equals("News and information on the Dassault Aviation Group")) 
		{
			System.out.println("First childs TAb");
			System.out.println("GET POSITION OF SECOND TAB");
			int childTabXAxis = driver.manage().window().getPosition().getX();
			System.out.println("childTabXAxis:=" +" "+childTabXAxis);
			int childTabYAxis = driver.manage().window().getPosition().getY();
			System.out.println("childWindowYAxis:=" +" " +childTabYAxis);
			System.out.println();
		}
		else if (TabTitle.equals("Defense - Dassault Aviation")) 
		{
			System.out.println("Second childs Tab");
			System.out.println("CAPTURED SIZE OF THIRD TAB");
			int childTabHeight = driver.manage().window().getSize().getHeight();
			System.out.println("childTabHeight:="+" " +childTabHeight);
			int childTabWidth = driver.manage().window().getSize().getWidth();
			System.out.println("childTabWidth:=" +" "+childTabWidth);
		
	     }

		else if (TabTitle.equals("Civil: All Falcon business jets, in service throughout the world.")) 
		{
			Dimension definedSize = new Dimension(800,500);
			driver.manage().window().setSize(definedSize);
			 org.openqa.selenium.Point definedPosition = new org.openqa.selenium.Point(180, 170);
			driver.manage().window().setPosition(definedPosition);
			System.out.println();
		}
		
	}

	 driver.manage().window().minimize();
	}
}

