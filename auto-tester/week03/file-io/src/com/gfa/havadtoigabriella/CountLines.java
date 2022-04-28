package com.gfa.havadtoigabriella;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
  /*Write a function that takes a filename as string as a parameter
It returns the number of lines the file contains.
It should return zero if it can't open the file
And should not raise any error.
   */
  public static void main(String[] args) {
    System.out.println(lineCounter("src/my-file.txt"));
  }

  private static int lineCounter(String filename) {
    Path filePath = Paths.get(filename);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      return 0;
    }
    return lines.size();
  }
}
