
import java.util.Scanner;

public class hailsequence {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int val = scnr.nextInt();
      System.out.print(val + "\t");
      int onLine = 1;
      while (val != 1) {
         //System.out.print(" online: " + onLine + " ");
         if ((val % 2) == 0 ) {
            val /= 2;
         } else {
            val *=3;
            val ++;
         }
         System.out.print(val + "\t");
         onLine++;
         if (onLine == 5 && val != 1) {
            onLine = 0;
            System.out.print('\n');
         }
      }
      System.out.print('\n');
   }
}
