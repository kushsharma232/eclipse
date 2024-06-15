package shivam.practice;

import java.time.Clock;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverwait extends WebDriverWait {

	public webDriverwait(WebDriver driver, Duration timeOutInSeconds) {
		super(driver, timeOutInSeconds);
		// TODO Auto-generated constructor stub
	}

	public webDriverwait(WebDriver driver, long timeOutInSeconds, long sleepInMillis) {
		super(driver, timeOutInSeconds, sleepInMillis);
		// TODO Auto-generated constructor stub
	}

	public webDriverwait(WebDriver driver, Clock clock, Sleeper sleeper, long timeOutInSeconds, long sleepTimeOut) {
		super(driver, clock, sleeper, timeOutInSeconds, sleepTimeOut);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
