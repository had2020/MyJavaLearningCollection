import java.util.Random;
import java.util.Scanner;

public class TestDivisibility {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(scan.nextLong());
        int n = rand.nextInt(598) + 2;
        if (((n % 15) == 0 ) && ((n % 2) != 0)) {
            System.out.println("n is divisible by 15 but not 2");
        } else if
            (
                (
                    ( (n % 2) != 0 ) &&
                    ( (n % 3) != 0 )
                )
                ||
                ( (n % 5) != 0 )
            )
        {
            System.out.println("n is not divisible by 2, 3, or 5");
        } else if ( ( (n % 10) == 0 ) && ( (n % 3) != 0 ) ) {
            System.out.println("n is divisible by 10 but not 3");
        } else if ( ( (n % 5) == 0 ) && ( (n % 6) != 0 ) ) {
            System.out.println("n is divisible by 5 but not 6");
        } else if ( ( (n % 5) == 0 ) && ( (n % 6) != 0 ) )
    }
}
