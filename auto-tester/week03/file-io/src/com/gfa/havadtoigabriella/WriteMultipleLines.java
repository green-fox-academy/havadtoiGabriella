package com.gfa.havadtoigabriella;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteMultipleLines {
  /*Create a function that takes 3 parameters: a path, a word and a number and is able to write into a file.
The path parameter should be a string that describes the location (path & name) of the file you wish to modify.
The word parameter should also be a string that will be written to the file as individual lines.
The number parameter should describe how many lines the file should have.
If the word is 'apple' and the number is 5, it should write 5 lines into the file and each line should read 'apple'.
The function should not raise any errors if it could not write the file.
   */
  public static void main(String[] args) {
    writeMulitpleLines("src/my-file.txt", "apple", 10);
  }

  private static void writeMulitpleLines(String writeTo, String whatToWrite, int howManyLines) {
    Path whereToWrite = Paths.get(writeTo);
    List<String> listOfContent = new ArrayList<>();
    for (int j = 0; j < howManyLines; j++) {
      listOfContent.add(whatToWrite);
    }
    try {
      Files.write(whereToWrite, listOfContent);
    } catch (IOException e) {
      System.err.println("Unable to write file");
    }
  }
}
