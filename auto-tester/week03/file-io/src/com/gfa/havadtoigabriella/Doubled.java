package com.gfa.havadtoigabriella;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubled {
  //Create a method that decrypts the duplicated-chars.txt.
  //Decryption is the process reversing an encryption, i.e. the process which converts encrypted data into its original form.

  public static void main(String[] args) {
    //Read from file
    List<String> contentOfFileToDecrypt = readFromFile("src/duplicated-chars.txt");
    //Decryption
    String decryptedText = decryption(contentOfFileToDecrypt.toString());
    //Write to file
    writeToFile("src/decrypted-chars.txt", decryptedText);
  }

  public static List<String> readFromFile(String nameOfFileToDecrypt) {
    Path pathOfFile = Paths.get(nameOfFileToDecrypt);
    List<String> contentOfFile = new ArrayList<>();
    try {
      contentOfFile = Files.readAllLines(pathOfFile);
    } catch (IOException e) {
      System.out.println("Unable to read file.");
    }
    return contentOfFile;
  }

  public static String decryption(String contentToDecrypt) {
    String[] textToChars = contentToDecrypt.split("");
    List<String> decrypted = new ArrayList<>();
    for (int i = 0; i < textToChars.length; i += 2) {
      decrypted.add(textToChars[i]);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < decrypted.size(); i++) {
      sb.append(decrypted.get(i));
      if (decrypted.get(i).equals(".")) {
        sb.append("\n");
      }
    }
    String fulltext = sb.toString();
    return fulltext;
  }

  public static void writeToFile(String nameOfFileToWrite, String content) {
    List<String> writeableFormat = Arrays.asList(content);
    Path pathOfDecryptedFile = Paths.get(nameOfFileToWrite);
    try {
      Files.write(pathOfDecryptedFile, writeableFormat);
    } catch (IOException e) {
      System.out.println("Unable to write file.");
    }
  }
}

