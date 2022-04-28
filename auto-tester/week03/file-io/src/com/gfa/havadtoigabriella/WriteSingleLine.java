package com.gfa.havadtoigabriella;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
//  Write a function that is able to manipulate a file by writing your name into it as a single line.
//  The file should be named "my-file.txt".
//  In case the program is unable to write the file,
//  It should print the following error message: "Unable to write file: my-file.txt".

  public static void main(String[] args) {
    Path filePath = Paths.get(("src/my-file.txt"));
    List<String> contentToAdd = Arrays.asList("Havadtői Gabriella");
    try {
      Files.write(filePath, contentToAdd);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
