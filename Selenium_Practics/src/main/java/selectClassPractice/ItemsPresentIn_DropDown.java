package selectClassPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ItemsPresentIn_DropDown {

	public static void main(String[] args) {

		boolean itemPresent = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		WebElement allBtnEle = driver.findElement(By.cssSelector("#searchDropdownBox"));
		Select dropDown = new Select(allBtnEle);

		List<WebElement> allOption = dropDown.getOptions();
		for (WebElement eachallOption : allOption) {
			String each = eachallOption.getText();
			if (each.equalsIgnoreCase("Books")) {
				itemPresent = true;
				break;
			}
		}

		if (itemPresent) {
			System.out.println("Item Present");
		} else {
			System.out.println("Item Not Present ");
		}
		driver.quit();
	}
}
