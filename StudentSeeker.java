// import java.util.*;
// import java.io.*;
// public class StudentSeeker {
//   public static void main(String args[]) throws Exception{
//     Scanner in = new Scanner(new File("students.txt"));
//     Scanner in = null;
//         try {
//             in = new Scanner(file);
//             while(in.hasNext())
//             {
//                 String line=in.nextLine();
//                 if(line.contains("man"))
//                     System.out.println(line);
//             }
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         }
//     // while (in.hasNextLine()){
//     //   String line = in.nextLine();
//     //   System.out.println(line);
//     // }
//   }
// }
import java.util.*;
import java.io.*;
    public class StudentSeeker {
        public static void main(String args[]) {
          Scanner inp = new Scanner(System.in), in = null;
          System.out.println("Enter letters: ");
          String letters = inp.next();

          File file =new File("students.txt");
          // Scanner in = null;
          try {
              in = new Scanner(file);
              while(in.hasNext())
              {
                  String line = in.nextLine();
                  String check = line.toLowerCase();
                  if(check.contains(letters))
                      System.out.println(line);
              }
          } catch (FileNotFoundException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }

        }
    }
