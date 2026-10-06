import java.util.Scanner;
public class Solution {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String c1 = scnr.next();
      StringBuilder output1 = new StringBuilder();

      int i = 0;
      while (i < c1.length()) {
          if (c1.charAt(i) == 'A') {
              output1.append('B');
          } else {
              output1.append('A');
          }
          i++;
      }

      System.out.println(c1 + " converts to " + output1.toString());
  }
}
