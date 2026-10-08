import java.util.Random;
import java.util.Scanner;

public class TestDivisibility {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(scan.nextLong());
        int n = rand.nextInt(600-2 + 1) + 2;
        System.out.println("n = " + n);
        if ( (n % 5) == 0 ) {
            if ( (n % 30) == 0 ) {
                if ( (n % 2) == 0 ) {
                    System.out.println("n is divisible by 30");
                } else {
                    System.out.println("n is divisible by 30, but not 2");
                }
            } else if ( (n % 15) == 0 ) {
                if ( (n % 2) == 0 ) {
                    System.out.println("n is divisible by 15");
                } else {
                    System.out.println("n is divisible by 15, but not 2");
                }
            } else if ( (n % 10) == 0 ) {
                if ( (n % 3) == 0 ) {
                    System.out.println("n is divisible by 10");
                } else {
                    System.out.println("n is divisible by 10, but not 3");
                }
            } else if ( (n % 6 )  == 0 ) {
                if ( (n % 3) == 0 ) {
                    System.out.println("n is divisible by 6"); // unfin
                } else if ( (n % 2) == 0) {
                    System.out.println("n is divisible by 6, but not 2");
                } else {
                    System.out.println("n is divisible by 6, but not 2 or 3");
                }
            } else {
                System.out.println("n is divisible by 5 but not 2 or 3");
            }

        } else if ( (n % 3) == 0 ) {
            if ( (n % 30) == 0 ) {
                System.out.println("n is divisible by 30");
            } else if ( (n % 15) == 0 ) {
                System.out.println("n is divisible by 15");
            } else if ( (n % 10) == 0 ) {
                System.out.println("n is divisible by 10");
            } else if ( (n % 6 )  == 0 ) {
                System.out.println("n is divisible by 6");
            } else {
                System.out.println("n is divisible by 3 but not 2 or 5");
            }

        } else if ( (n % 2) == 0 ) {
            if ( (n % 30) == 0 ) {
                System.out.println("n is divisible by 30");
            } else if ( (n % 15) == 0 ) {
                System.out.println("n is divisible by 15");
            } else if ( (n % 10) == 0 ) {
                System.out.println("n is divisible by 10");
            } else if ( (n % 6 )  == 0 ) {
                System.out.println("n is divisible by 6");
            } else {
                System.out.println("n is divisible by 2 but not 3 or 5");
            }

        } else {
            System.out.println("n is not divisible by 2, 3, or 5");
        }
    }
}
