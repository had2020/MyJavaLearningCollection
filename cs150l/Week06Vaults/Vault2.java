import java.util.Scanner;

public class Vault2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key1 = scan.nextInt();
        int key2 = scan.nextInt();

        if (key1 >= 1 && key1 <= 100 && key2 >= 1 && key2 <= 100) {
            if (key1 + key2 == 100) {
                if (key1 > key2) {
                    System.out.println("Vault opened!");
                } else {
                    System.out.println("Locked: key order failed.");
                }
            } else {
                System.out.println("Locked: total check failed.");
            }
        } else {
            System.out.println("Locked: key range failed.");
        }

        /*
        1.) Two input pairs that would opne the vault are: 99 1, and 98 2.

        2.) A pair that would pass the range check, but fail on the total check,
        is 45 5.

        3.) A pair that would pass the range and total checks, but fail key-order check.
        is the input pair 1 99, as while the add up to 100, the first input is less than the second,
        which fails the branch check.

        4.) When both keys are 50, the Vault will fail the range check,
        and that is what happens with I test it.

        5.) Any pair of inputs where both add up to 100, the first one is bigger,
        and the first is between 0-100 exclusive, and the second it between 1-100 exclusive.
        */
    }
}
