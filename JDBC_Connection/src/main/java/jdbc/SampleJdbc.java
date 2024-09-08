package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleJdbc {
	public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:oracle:thin:@//localhost:1521/xe"; // Update with your DB URL
        String username = "system"; // Replace with your username
        String password = "system"; // Replace with your password

        // Establish a connection
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {

            // Execute a simple query
            String query = "SELECT * FROM CRED"; // Replace with your query
            ResultSet rs = stmt.executeQuery(query);
            // Loop through 	 result set
            while (rs.next()) {
            	
            	String name = rs.getString("name");
            	String contact = rs.getString("CONTACT");
            	String email = rs.getString(3);
            	String pass = rs.getString("PASSWORD");
            	
            	System.out.println(name+" "+contact+" "+email+" "+pass);
            	  	
            	/*
            	WebDriver driver = new ChromeDriver();
            	driver.manage().window().maximize();
            	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            	driver.get("http://flights.qedgetech.com/");
        		driver.findElement(By.partialLinkText("Regi")).click();
        		driver.findElement(By.name("name")).sendKeys(rs.getString("NAME"));           
        		driver.findElement(By.id("contact")).sendKeys(rs.getString("CONTACT"));
        		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(rs.getString("EMAIL"));
        		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys(rs.getString("PASSWORD"));
        		*/
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
