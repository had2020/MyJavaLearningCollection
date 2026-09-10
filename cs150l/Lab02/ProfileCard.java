/*
Author: Hadrian Lazic
Assignment: Lab 02 – Profile Card and Git
*/

import java.util.Scanner;

public class ProfileCard {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.print("Enter your favorite whole number: ");
    int number = input.nextInt();
    System.out.println("Hello, " + name + "!");
    System.out.println("Your number is " + number + ".");
    input.close(); // I didn't fully understand this line until after running.
    // Once I did run the code, I was able to visuable see it stop taking input.
  }
}

/*
 * Before running (What I predicted):
 * From reading my program before running it, I can assume that the program
 * 1.) Ask for a name input and store the entire line input.
 * 2.) Ask the user for a favorite number input, and collect the entire line
 * input.
 * 3.) print a line saying hello (name the user inputed)! (new line)
 * 4.) print on another line from the first output Your number is (number
 * inputed).
 * 5.) prevent the terimal from awaiting input from the user.
 */

/*
 * (Difference between [modified], [staged], and [committed])
 * modified: source code data updated by text editor, IDE, or other means,
 * Staged: Code that is apart of a current to be committed source code change,
 * committed: Source code already apart of a commit.
 *
 */

/*
 * Mission 5: Change, Inspect, Record
 */
