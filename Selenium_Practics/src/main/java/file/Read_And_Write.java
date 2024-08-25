package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_And_Write {

	public static void main(String[] args) throws IOException {
		
		File fi = new File("E:/Udemy/Selenium_Practics/File/ReadAndWrite.txt");
		FileWriter fw = new FileWriter(fi);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Give Me Some Sun Shine");
		bw.newLine();
		bw.write("Give Me Some Rays");
		bw.newLine();
		bw.write("Give Me Another Chance");
		bw.newLine();
		bw.write("To Grow Up Once Again");
		bw.close();
		
		FileReader fr = new FileReader("E:/Udemy/Selenium_Practics/File/ReadAndWrite.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}
}
