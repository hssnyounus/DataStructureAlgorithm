package oops.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {

  public static void main(String[] args) {
//    List<String> names = List.of("user", "user2");
//    List<String> names = new ArrayList<>();
//    for (int i = 0; i<=5; i++){
//
//    }
//    System.out.println(names);
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream("stream.txt");

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

