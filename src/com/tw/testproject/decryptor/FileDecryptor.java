package com.tw.testproject.decryptor;

import java.io.*;

/**
 * Created by vohray on 7/7/17.
 */
public class FileDecryptor {

  private String decryptString(String inputString, int translationKey) {
	 char inputArray[] = inputString.toCharArray();
	 char outputArray[] = new char[inputArray.length];
	 int idx = 0;
	 for (char ch : inputArray) {
		char translatedCh = (char) (ch - translationKey);
		outputArray[idx] = translatedCh;
		idx++;
	 }
	 String translatedString = new String(outputArray);
	 return translatedString;
  }


  public void decryptFile(File sourceFile, File destinationFile, int translationKey) throws IOException {
	 if (!sourceFile.exists()) {
		throw new FileNotFoundException("source files does not exist");
	 }

	 BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
	 BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
	 String readline = reader.readLine();

	 while (readline != null) {
		String decryptedString = decryptString(readline, translationKey);
		writer.write(decryptedString);
		writer.newLine();
		readline=reader.readLine();
	 }

	 writer.flush();
	 writer.close();
	 reader.close();

  }
}
