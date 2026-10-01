import java.util.Scanner;

public class Vault1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int code = scan.nextInt();

        if (code > 700 && code < 800) {
            if (code % 2 == 1) {
            System.out.println("Vault opened!");
            } else {
            System.out.println("Locked: parity check failed.");
            }
        } else {
        System.out.println("Locked: range check failed.");
        }

        /*
        Successful input: 727
        Prediction and reason: Code must be between 700-800,
        and have have a remainder of 1 once divided by 2.
        Since 726 is even adding 1 will result in a remainder of 1.
        Actual result: "Vault opened!"

        Unsuccessful input: 200
        Prediction and exact condition that rejects it: 200 is not less than 700, so the equality check will fail.
        Actual result: "Locked: range check failed."

        All accepted inputs, in plain English:
        Any number that is between 700-800, and when divided by 2,
        results in number with a remainder of 1.
        */
    }
}
