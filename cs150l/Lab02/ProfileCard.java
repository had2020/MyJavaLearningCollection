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

    // This was added for Mission 6: Partner Requirement
    System.out.println("What is your second favorite number");

    int secondNum = input.nextInt(); // asks for one additional favorite item.

    number += secondNum; // My prediction is that this line will
    // assign number with the result of number + secondNum.

    System.out.println(number); // This will print the number stored in
    // the number variable.

    // End of mission 6 addition

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
 * "git status" shows me that my current code changes are up to date
 * with my repo for this lab on github, however it can see their is
 * now a new untracked file that I have yet to add to git's tracking System
 *
 * "git add ." I added all files in the directory to gits tracking system,
 * including the new untracked file from today.
 *
 * "git commit -m "Create Profile card program"" this bash command I
 * I entered commits all the tracked code changes into the local
 * git repo with the -m message in the quotes after.
 *
 * "git push" pushed the changes from my local git repo into my
 * github repo for this project.
 *
 * "git log --oneline" shows me my recent commits for this repo.
 *
 * "git status" running that git status bash command agian, now teells
 * me that mey code changes are now ahead of my orgin, which means
 * I messed up and forgot to git pull my code changes from another machine
 * I just decided my other machines code changes were not important
 * and just did "git push --force"
 *
 * Lastly I used git diff after writing all this to see the uncommited, code
 * changes.
 */
