package zelDocker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SelDocker1 {
	DesiredCapabilities dc = new DesiredCapabilities();

	@Parameters("browser")
	@Test
	public void firstTest(String browser) throws MalformedURLException {
		if (browser.equals("chrome")) {
			dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			dc.setPlatform(Platform.LINUX);
		}
		else if(browser.equals("firefox")) {
			dc.setCapability(CapabilityType.BROWSER_NAME, "firefox");
			dc.setPlatform(Platform.LINUX);
		}
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://github.com/Nagesh2018");		
		System.out.println("Title of Page "+ driver.getTitle());
		driver.quit();
	}
}
