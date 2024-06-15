package mb_HomeLoan;

import java.util.concurrent.TimeUnit;

public class practice {

	public practice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		public static void main1(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = (WebDriver)new WebDriver();
	        ((WebDriver) ((WebDriver) (((WebDriver) driver).manage())).timeouts()).implicitlyWait(5L, TimeUnit.SECONDS);
	        driver.get("https://jqueryui.com/droppable/");
	        ((WebDriver) ((WebDriver) driver).manage()).deleteAllCookies();

	

}
}