import java.util.Scanner;

public class Vault3 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int code = scan.nextInt();

        if (code >= 400 && code <= 500) {
            System.out.println("Vault opened: regular access.");
        }
        if (code == 450) {
            System.out.println("Vault opened: special access.");
        } else {
            System.out.println("Vault locked.");
        }

        /*
        1.) Two different key value inputs that open the vault are:
        401, and 402.

        2.) The exact output for 450 is "Vault locked."

        3.) This is incorrect as the first branch will run,
        short-circuiting the second.

        4.) No it cannot as the input 450 would be shortcircuited by the first input.

        5.) All inputs that open this vault are inputs within the inclusive range of 400-500.

        6.) fixed removed the else and sperated the if statement.
        */
    }
}
