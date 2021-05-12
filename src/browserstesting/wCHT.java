package browserstesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class wCHT {

    public static void main(String[] args) {

        String baseUrl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());
        boolean verifyTitle = title.equals("Home-Harrow Council");
        boolean verifyContains = title.contains("Harrow");
        System.out.println(verifyContains);
        System.out.println(verifyTitle);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();

    }
}
