import java.util.Random;
import java.util.Scanner;

public class Rullet {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    Random thrRng = new Random();

    boolean incorrect = true;
    
    while (incorrect) {

      System.out.println("Input a number between (0-9):");

      int inputNum = scnr.nextInt();

      if (inputNum == thrRng.nextInt(9)) {
        System.out.println("Win");
        incorrect = false;
      } else {
        System.out.println("Lose");
      }

    }
  }
}
