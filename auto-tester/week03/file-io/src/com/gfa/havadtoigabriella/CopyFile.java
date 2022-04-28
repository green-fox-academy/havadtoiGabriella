package com.gfa.havadtoigabriella;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  /*Write a function that copies the contents of a file into another file
It should take two filenames (string) as parameters:
path and name of the source file
path and name of the target file
It should return a boolean that shows if the copy was successful
   */
  public static void main(String[] args) {
    System.out.println(copyFiles("src/my-file.txt", "src/copy-of-my-file.txt"));
  }

  private static boolean copyFiles(String copyFrom, String copyTo) {
    Path pathOfTheOriginal = Paths.get(copyFrom);
    Path pathOfTheCopy = Paths.get(copyTo);
    boolean success = true;
    try {
      Files.copy(pathOfTheOriginal, pathOfTheCopy);
    } catch (IOException e) {
      success = false;
      System.err.println("Unable to copy file.");
    }
    return success;
  }
}
