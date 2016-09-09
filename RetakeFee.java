import java.util.Scanner;
public class RetakeFee{
  public static void main(String[] args){

    Scanner inp = new Scanner(System.in);

    System.out.println("Number of credits: ");
    int credits=inp.nextInt();

    System.out.println("Retakes taken before: ");
    int retakes=inp.nextInt();


    if (retakes == 1) {
      int res = (credits*20000)/2;
      System.out.println("Output: "+res);
    }
    else if (retakes == 2) {
      int res = (credits*20000*1)/4;
      System.out.println("Output: "+res);
    }
  }

  }
