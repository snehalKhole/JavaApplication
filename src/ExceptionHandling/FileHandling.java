package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandling {

	public static void main(String[] args) {
	
		
			try {
				FileReader fr=new FileReader("E:\\snehal.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
