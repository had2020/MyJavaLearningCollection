import java.util.Scanner;
public class PatternPractice {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in ) ;

        /*
        System.out.println("Please input triganle size:");
        int n = scan.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        // Experiment : Testing if the program will parse 8 even if there is a char after it
        // Input tested : 8I
        // What I expected : outputs the triangle with a size of 8.
        // What actually happened : An execption that nextInt could not parse into a int.
        // What I learned : Inputs that are parsed by nextInt(), must be sperated by whitespace.


        // Activity 2: Repeated Number Pattern
        /*
        System.out.println("Please input triganle size:");
        int n = scan.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=0;j<i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }*/
        // Experiment: Testing if zero will result in 0 or noting being printed.
        // Input tested: 0
        // What I changed: inputed 0
        // What I expected: nothing was printed.
        // What actually happened: nothing was printed as expected.
        // What I learned: Loops will only run first, onace the condition is met.
        //

        // Activity 3: Modify the Pattern:
        /*
        System.out.println("Please input triganle size:"); // This line is printed first.
        int n = scan.nextInt();
        for (int i=n;i>0;i--) {
            for (int j=i;j>0;j--) {
                System.out.print(i);
            }
            System.out.println(); // on the last iteration this line is printed last.
        }*/
        // The loop will print 5 cols, with each row being 1 less than the first.

        // Activity 4: Use a while Loop
        int n = scan.nextInt();
        int i=n, j=0;
        while (i>0) {
            j = i;
            while(j>0) {
                System.out.print(i);
                j--;
            }
            System.out.println();
            i--;
        }

        /*Step 1: Predict
        1.) 5 lines should be printed with the input of 5
        2.) 1 asterick would be printed.
        3.) 2 asterisks would be printed on line 2.
        4.) 5 asterisks would be printed on line 5.
        5.) i controls the lines.
        6.) j controls the number of asterisks.

        Step 2: Trace
        Line Number | Asterisks | Out
        Line 1:     |  1        | *
        Line 2:     |  2        | **
        Line 3:     |  3        | ***
        Line 4:     |  4        | ****


        */

        scan.close();
    }
}
