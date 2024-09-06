package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
	
	FileInputStream fis  = new FileInputStream(System.getProperty("user.dir")+"/PropertyFile.properties");
				
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("user1"));
		System.out.println(prop.getProperty("user2"));
		

	}

}
