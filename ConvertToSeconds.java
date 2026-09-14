
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      int seconds;
      int minutes;
      int hours;
      
      Scanner scanner = new Scanner(System.in);

      seconds = scanner.nextInt();
      minutes = scanner.nextInt();
      hours = scanner.nextInt();

      System.out.println(( ( ( hours * 60 ) * 60 ) + (minutes * 60) + seconds ) + " seconds");
      
   }
}
