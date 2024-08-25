package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_From_File {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("E:/Udemy/Selenium_Practics/File/FileRead.txt");
		BufferedReader br = new BufferedReader(fr);
		String str =" ";
	
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}

}
