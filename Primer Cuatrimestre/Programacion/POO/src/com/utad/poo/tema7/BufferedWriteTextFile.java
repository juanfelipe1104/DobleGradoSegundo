package com.utad.poo.tema7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
* Ejercicio3
The BufferedWriter maintains an internal buffer of 8192
characters. During the write operation, the characters are
written to the internal buffer instead of the disk. Once
the buffer is filled or the writer is closed, the whole
characters in the buffer are written to the disk.
Hence, the number of communication to the disk is reduced.
This is why writing characters is faster using
BufferedWriter.
*/
public class BufferedWriteTextFile {
	public static void main(String[] args) {
		String fileName = "\\files\\dataBufferOut.txt";
		File currentDir = new File(System.getProperty("user.dir"));
		try {
			System.out.println(currentDir.getCanonicalPath());
			File fileToWrite = new File(currentDir.getCanonicalPath() + fileName);
			System.out.println(fileToWrite.getName());
			FileWriter fileWriter = new FileWriter(fileToWrite);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			//fileWriter.append("Hello File!\n");
			bufferedWriter.write("Hello File in a buffered writter!");
			bufferedWriter.newLine();
			//fileWriter.append("This is the second line\n");
			bufferedWriter.write("This is the second line");
			bufferedWriter.newLine();
			//fileWriter.append("This is the third line\n");
			bufferedWriter.write("This is the third line");
			bufferedWriter.newLine();
			//Required in Buffered
			bufferedWriter.flush();
			fileWriter.close();
			//fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}