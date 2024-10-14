package oops.fileio;

import java.io.*;

public class FileWriteAndRead {

  public static void main(String[] args) {
    try {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("\\image-copy.txt"));
//        bufferedWriter.write("core java");
//        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("\\image.txt"));
        String s;
        while ((s = bufferedReader.readLine()) != null){
          System.out.println(s);
          bufferedWriter.write(s + "\n");
        }
        bufferedReader.close();
      bufferedWriter.close();
      } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
  }

}
