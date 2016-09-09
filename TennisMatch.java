import java.util.Scanner;
import java.io.File;
public class TennisMatch {
  public static void main(String args[]) throws Exception{
    int a = 0;
    int b = 0;
    Scanner in = new Scanner(new File("MatchResults.txt"));
    System.out.println("INPUT:");
    while (in.hasNextLine()){
      String line = in.nextLine();
      System.out.println(line);
    }
  }
}
