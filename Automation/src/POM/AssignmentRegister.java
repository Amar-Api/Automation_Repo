package POM;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AssignmentRegister
{
	//declaration
	@FindBy(id="gender-male")   //@FindBy एनोटेशन: यह Selenium को यह बताता है कि वेब पेज पर कौन से 
	                               //एलिमेंट्स को कैसे ढूंढा जाए।
	private WebElement maleradiobutton;
	
    @FindBy(name="FirstName") 
	private WebElement fnametextfield;
    
    @FindBy(id="LastName")
    private WebElement lnametextfield;
    
    @FindBy(id="Email")
    private WebElement emailtextfield;
    
    @FindBy(id="Password")
    private WebElement passwordtextfield;
    
    @FindBy(id="ConfirmPassword")
    private WebElement cnfmpasswordtextfield;
    
    @FindBy(id="register-button")
    private WebElement registerbutton;
    
    @FindBy (xpath="//div[@class='result']")
    private WebElement resultfield;
    
    
    //initialization

	public AssignmentRegister(WebDriver driver)
	//constructor call==> driver को इस क्लास से जोड़ना और 
    //PageFactory.initElements(driver, this) के  
    //माध्यम से @FindBy से जुड़े WebElements को इन्शियलाइज करना।
    {
		//this.driver = driver;
    	PageFactory.initElements(driver, this); //scans the class for these annotations and initializes
    	                                        //the corresponding WebElement or List<WebElement> objects.
    	//यह Selenium को बताता है कि इसे WebElements को ढूंढने और इनकी जानकारी को 
    	//इस क्लास में एकीकृत करने की आवश्यकता है।
        //The PageFactory.initElements(driver, this) call in the constructor 
    	//initializes all the @FindBy annotated WebElements.
    }

	
    //getter
	
	public WebElement getMaleradiobutton() {
		return maleradiobutton;
	}
    
	public WebElement getFnametextfield() {
		return fnametextfield;
	}

	public WebElement getLnametextfield() {
		return lnametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getCnfmpasswordtextfield() {
		return cnfmpasswordtextfield;
	}
    
   
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	
	

	public WebElement getResultfield() {
		return resultfield;
	}

    /*
      Selenium का PageFactory क्लास को स्कैन करता है और उसमें दिए गए @FindBy एनोटेशन वाले फील्ड्स को ढूंढता है।
      यह उन फील्ड्स के लिए प्रॉक्सी ऑब्जेक्ट्स बनाता है, जो दिए गए WebDriver इंस्टेंस का उपयोग करके काम करते हैं।
      जब आप किसी WebElement के साथ इंटरैक्ट करते हैं, तो Selenium उस प्रॉक्सी को वास्तविक (actual) 
      वेब पेज पर मौजूद एलिमेंट में रिज़ॉल्व करता है।

      इस  प्रक्रिया का मतलब है कि वेब एलिमेंट्स तभी ब्राउज़र से इंटरैक्ट करते हैं, जब वे वास्तव में उपयोग किए जाते हैं। 
      इससे कोड अधिक कुशल और डाइनामिक बनता है।
     */
    

}
