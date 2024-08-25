package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteIntoFile_From_CapturedWebText {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/");
		String str1 = driver.findElement(By.cssSelector("p[class='intro']")).getText();
		String str2 = driver.findElement(By.cssSelector("[id='content'] div:nth-child(4) a ")).getText();
		
		File fi = new File("E:/Udemy/Selenium_Practics/File/ExternalFileWrite.txt");
		FileWriter fr = new FileWriter(fi);
		BufferedWriter bw = new BufferedWriter(fr);
		
		bw.write(str1);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(str2);
		bw.flush();
		
		bw.close();
		

	}

}
