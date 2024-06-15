package Test;

import java.util.concurrent.TimeUnit;


public class WebDriver {

	public WebDriver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void main1(final String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
        final WebDriver driver = (WebDriver)new WebDriver();
        ((WebDriver) ((WebDriver) driver.manage()).timeouts()).implicitlyWait(20, TimeUnit.SECONDS);
        
        final WebDriver driver1 = (WebDriver)new WebDriver();
        ((WebDriver) ((WebDriver) driver1.manage()).timeouts()).implicitlyWait(5L, TimeUnit.SECONDS);
        driver1.get("https://jqueryui.com/droppable/");
        ((WebDriver) driver1.manage()).deleteAllCookies();
}

	void implicitlyWait(long l, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

	Object timeouts() {
		// TODO Auto-generated method stub
		return null;
	}

	void deleteAllCookies() {
		// TODO Auto-generated method stub
		
	}

	void get(String string) {
		// TODO Auto-generated method stub
		
	}

	Object manage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void frame(int i) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}

