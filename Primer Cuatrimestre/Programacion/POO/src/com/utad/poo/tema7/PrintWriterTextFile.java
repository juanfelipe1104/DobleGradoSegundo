package com.utad.poo.tema7;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/*
* Ejercicio2. The FileWriter is used for writing to the
character based files. FileWriter provides methods for
writing to a new file, and appending to an existing file.
*/
public class PrintWriterTextFile {
	public static void main(String[] args) {
		String fileName = "\\files\\dataPrintOut.txt";
		File currentDir = new File(System.getProperty ("user.dir") );
		try {
			System.out.println(currentDir.getCanonicalPath());
			File fileToWrite = new File(currentDir.getCanonicalPath()+fileName);
			System.out.println(fileToWrite.getName());
			//TODO adaptar el constructor para saber si se escribe
			//sobre un fichero existente.
			FileWriter fileWriter = new FileWriter(fileToWrite, fileToWrite.exists());
			PrintWriter printWriter = new PrintWriter(fileWriter);
			fileWriter.append("Hello File!\n");
			printWriter.println("Hello File!");
			//fileWriter.append("This is the second line\n");
			printWriter.println("This is the second line");
			//fileWriter.append("This is the third line\n");
			printWriter.println("This is the third line");
			//fileWriter.close();
			printWriter.close();
			//fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}