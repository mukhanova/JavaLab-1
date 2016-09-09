import java.util.Scanner;
import java.io.File;
public class TennisMatch {
  public static void main(String args[]) throws Exception{
    int a = 0;
    int b = 0;
    int aa = 0;
    int bb = 0;
    String aaa = "PLAYER1";
    String bbb = "PLAYER2";
    Scanner in = new Scanner(new File("MatchResults.txt"));
    System.out.println("INPUT:");
    while (in.hasNextLine()){
      String line = in.nextLine();
      if (line.equals(aaa)) {
        a+=15;
      } else { b+=15;}
      if (a >= 60){
        aa++;
        b = 0;
        a = 0;
      } else if (b >= 60) {
        bb++;
        a = 0;
        b = 0;
      }
      System.out.println(line);
    }
    System.out.println("OUTPUT:");
    System.out.println(aa + ":" + bb+" | " + a + ":" + b);
  }
}
