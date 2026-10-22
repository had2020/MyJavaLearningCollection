import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void printWelcome() {
        System.out.println("Welcome to the Calculator");
    }
    public static DecimalFormat decimalFormat() {
        // set up the output format of the result
        return new DecimalFormat("#,###,###.##");
    }
    public static double getOperand(Scanner scan) {
        System.out.print("Enter an operand: ");
        return scan.nextDouble();
    }
    public static void printMenu() {
        // print a menu, then prompt for the operation
        System.out.println("\nOperations are: "
                + "\n\t ADD or + for addition"
                + "\n\t SUBTRACT or - for subtraction"
                + "\n\t MULTIPLY or * for multiplication"
                + "\n\t DIVIDE or / for division");
        System.out.print("Enter your selection: ");
    }
    public static String getOperation(Scanner scan) {
        return scan.next().toUpperCase();
    }
    public static void doCalculation(String operation, DecimalFormat twoDecimals, double fp1, double fp2) {
        // perform the operation and print the result
                if (operation.equals("ADD") || operation.equals("+")) {
                    System.out.println("The sum is " + twoDecimals.format(fp1 + fp2));
                } else if (operation.equals("SUBTRACT") || operation.equals("-")) {
                    System.out.println("The difference is " + twoDecimals.format(fp1 - fp2));
                } else if (operation.equals("MULTIPLY") || operation.equals("*")) {
                    System.out.println("The product is " + twoDecimals.format(fp1 * fp2));
                } else if (operation.equals("DIVIDE") || operation.equals("/")) {
                    if (fp2 == 0.0)
                        System.out.println("Dividing by 0 is not allowed");
                    else
                        System.out.println("The quotient is " + twoDecimals.format(fp1 / fp2));
                } else {
                    System.out.println(operation + " is not valid.");
                }
    }
    public static void main(String[] args) {
        double fp1, fp2;
        String operation;

        printWelcome();

        DecimalFormat twoDecimals = decimalFormat();

        Scanner scan = new Scanner(System.in);
        fp1 = getOperand(scan);
        fp2 = getOperand(scan);

        printMenu();

        operation = getOperation(scan);

        doCalculation(operation, twoDecimals, fp1, fp2);
    }
}
