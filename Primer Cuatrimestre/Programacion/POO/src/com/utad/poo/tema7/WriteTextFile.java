package com.utad.poo.tema7;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/* Ejercicio1
* The FileWriter is used for writing to the character
based files.
* FileWriter provides methods for writing to a new file,
* and appending to an existing file.
*/
public class WriteTextFile {
	public static void main(String[] args) {
		String fileName = "\\files\\dataOut.txt";
		File currentDir = new File(System.getProperty ("user.dir") );
		try {
			System.out.println(currentDir.getCanonicalPath());
			File fileToWrite = new File(currentDir.getCanonicalPath()+fileName);
			FileWriter fileWriter = new FileWriter(fileToWrite, fileToWrite.exists());
			fileWriter.append("Hello File!\n");
			fileWriter.append("This is the second line\n");
			fileWriter.append("This is the third line\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
