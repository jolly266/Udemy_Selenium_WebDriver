package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile2 {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"/PropertyFile.properties"));
		System.out.println(prop.getProperty("user1"));

	}

}
