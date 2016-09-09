import java.util.Scanner;
import java.io.File;
public class ReadFile {
  public static void main(String args[]) throws Exception{
    Scanner in = new Scanner(new File("in.txt"));
    while (in.hasNextLine()){
      String line = in.nextLine();
      System.out.println(line);
    }
  }
}
