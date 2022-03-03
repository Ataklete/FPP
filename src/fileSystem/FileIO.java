package fileSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO {
	//First create and write to a file named "MyText.txt".
	//Then read in that file and print contents to the console.
	public static void main(String[] args) {
		//Step 1: Create a file MyText.txt and 
		//use a FileWriter, together with a PrintWriter to
		//write the text "my text" to your file
		try {
			FileWriter fw = new FileWriter("MyText.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.write("my text");
			fw.close();
			pw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}	
		
		//Step 2: After closing your writers, use a BufferedReader to
		//read the file you just created. Remember that your file will
		//be placed (by default) at the top level of your Java project
		//(To see it in the project, you must refresh the project.)
		try {
			FileReader fr = new FileReader("MyText.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			System.out.println("Read this line in MyText.txt: \n  " + line);
			fr.close();
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}	
	}

}
