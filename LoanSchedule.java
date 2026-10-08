/*
 * Description: Loan Amortization Schedule
 * Date:  10/8/2026
 * CS 150, Section 4
 * @author: Hadrian Lazic
 */

import java.util.Scanner;

public class LoanSchedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //FIXME: Get loan info from user, ensure you use the proper data types
        System.out.print("Loan Amount: ");
        int loanAmount = scan.nextInt();

        System.out.print("Number of Years: ");
        int numberOfYears = scan.nextInt();

        System.out.print("Annual Interest Rate: ");
        int annualInterestRate = scan.nextInt();


        //Monthly interest rate and number of payments
        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfPayments = numberOfYears * 12;

        //Monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate
            / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfPayments));
        System.out.println()

        //FIXME: Display loan information, round to the nearest 2nd digit after the decimal
        //Do 'Monthly Payment' first, followed by 'Total Payment', each on their own line
        System.out.printf("Monthly Payment: %.2f \n", monthlyPayment);
        System.out.printf("Total Payment: %.2f \n", (monthlyPayment*numberOfPayments) );

        /*
        //FIXME: List columns of schedule in order of Payment#, Interest, Principal, and Balance
        //HINT: \t to help format nicely
        System.out...

        double balance = loanAmount;

        //FIXME: Choose the right range for the for loop
        for (//int...) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;

            balance = balance - principal;

            //Prevents negative value caused by double rounding
            if (balance < 0) {
                balance = 0;
            }

            //FIXME: Print out the table row, format correctly, and in the right order
            ...
        }

        */
    }
}
