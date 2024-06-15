package HomeLoanPages;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.support.FindBy;

	public class HLApplicationform extends Base {
		
		@FindBy(xpath="\"//*[@id=\\\"monthlyIncome\\\"]\"")
		private WebElement entermonthlyincome;
		
		@FindBy(xpath="//*[@id=generate-otp]")
		private WebElement checkeligibility;
		
		@FindBy(xpath="//*[@id=\\\"hlname\\\"]")
		private WebElement clearname;
		
		@FindBy(xpath="//*[@id=\\\"hlname\\\"]")
		private WebElement entername;
		
		@FindBy(xpath="//*[@id=\\\"loanAmount\\\"]")
		private WebElement loanamount;
		
		
		@FindBy(xpath="//*[@id=\\\"shortlistedY\\\"]")
		private WebElement propertyshortlistedY;
		
		@FindBy(xpath="//*[@id=\\\"NameCityOnly\\\"]")
		private WebElement city;
		
		@FindBy(xpath="//*[@id=\\\"NameCityOnly\\\"]")
		private WebElement propertycity;
		
		@FindBy(xpath="//*[@id=\\\"cityDropdownWebList\\\"]/li")
		private WebElement citydropdown;
		
		@FindBy(xpath="//*[@id=\\\"propValue\\\"]")
		private WebElement propertyvalue;
		
		@FindBy(xpath="//*[@id=\\\"formSections\\\"]/div[12]/div/div[12]/a[2]")
		private WebElement continuebutton;
		
		@FindBy(xpath="//*[@id=\\\"emailId\\\"]")
		private WebElement clearemail;
		
		@FindBy(xpath="//*[@id=\\\"emailId\\\"]")
		private WebElement email;
		
		@FindBy(xpath="//*[@id=\"age\"]")
		private WebElement clearage;
		
		@FindBy(xpath="//*[@id=\"age\"]")
		private WebElement age;
		
		@FindBy(xpath="//*[@id=\\\"genderM\\\"]")
		private WebElement gender;
		
		@FindBy(xpath="//*[@id=\\\"formSections\\\"]/div[12]/div/div[12]/a[2]")
		private WebElement secondcontinue;
		
		@FindBy(xpath="//*[@id=\\\"empType16121\\\"]")
		private WebElement employmenttype;
		
		@FindBy(xpath="//*[@id=\\\"ongoingEMI\\\"]")
		private WebElement ongoingemi;
		
		@FindBy(xpath="//*[@id=\\\"creditScoreExistsY\\\"]")
		private WebElement creditscoreY;
		
		@FindBy(xpath="//*[@id=\\\"creditScore\\\"]")
		private WebElement entercreditscore;
		
		@FindBy(xpath="//*[@id=\\\"coapplicantExistsY\\\"]")
		private WebElement coapplicantN;
		
		@FindBy(xpath="//*[@id=\\\"formSections\\\"]/div[12]/div/div[12]/a[2]")
		private WebElement submitbutton;
		
//		public void homeloanmainpage()
//		{
//			
//			driver.get("https://www.magicbricks.com/homeloan/home");
//		}
		
		public HLApplicationform(WebDriver driver)
		
		{
			
				PageFactory.initElements(driver, this);
			
		}
		
			public void entermonthlyincome() {
				entermonthlyincome.sendKeys("100000");
			}
			public void checkeligibility() {
				checkeligibility.click();
			}
			public void clearname() {
				clearname.clear();
			}
			public void entername() {
				entername.sendKeys("kush sharma");
			}
			public void loanamount() {
				loanamount.sendKeys("100000");
			}
			public void propertyshortlistedY() {
				propertyshortlistedY.click();
			}
			public void city() {
				city.clear();
			}
			public void propertycity() {
				propertycity.sendKeys("ghaziab");
			}
			public void citydropdown() {
				citydropdown.click();
			}
			public void propertyvalue() {
				propertyvalue.sendKeys("5000000");
			}
			public void continuebutton() {
				continuebutton.click();
			}
			public void clearemail() {
				clearemail.clear();
			}
			public void email() {
				email.sendKeys("kushsharma232@gmail.com");
			}
			public void clearage() {
				clearage.clear();
			}
			public void age() {
				age.sendKeys("30");
			}
			public void gender() {
				gender.click();
			}
			public void secondcontinue() {
				secondcontinue.click();
			}
			public void employmenttype() {
				employmenttype.click();
			}
			public void ongoingemi() {
				ongoingemi.sendKeys("10000");
			}
			public void creditscoreY() {
				creditscoreY.click();
			}
			public void entercreditscore() {
				entercreditscore.sendKeys("877");
			}
			public void coapplicantN() {
				coapplicantN.click();
			}
			public void submitbutton() {
				submitbutton.click();
			}
			
		}
		
