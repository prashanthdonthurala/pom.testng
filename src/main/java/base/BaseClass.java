package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver openBrowser(String browser) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://www.myntra.com/login/password?referer=https%3A%2F%2Fwww.myntra.com%2F&mobile=&show=true");
		driver.get("https://www.myntra.com/");
		return driver;
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static String getExcelData(String path, String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook w = WorkbookFactory.create(fis);
		String data = w.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	public static String getExcelData1(String path, String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		long i =  (long) wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		String s = String.valueOf(i);
		return s;
	}
}
