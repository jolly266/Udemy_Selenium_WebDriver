package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_into_File {

	public static void main(String[] args) throws IOException {
		
		
		String path = "E:/Udemy/Selenium_Practics/File/FileWrite.txt";
		File fi = new File(path);
		FileWriter fw = new FileWriter(fi);
		
		BufferedWriter brw = new BufferedWriter(fw);
		brw.write("I am a Boy");
		brw.newLine();
		brw.write(12);
		brw.newLine();
		brw.newLine();
		brw.newLine();
		brw.write("I am a Girl");
		brw.flush();
		brw.close();
	}

}
