public class MethodLab {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static int square(int number) {
        return number * number;
    }
    public static void printStars(int count) {
        for (int i=count;i>0;i--) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printRightAngleTriangle(int rows) {
        for (int i = 1;i<=rows;i++) {
            printStars(i);
        }
    }
    public static void printWelcome(String name) {
        System.out.println("Welcome, " + name + "!");
    }
    public static void changeNumber(int number) {
        number = number + 10;
        System.out.println("Inside method: " + number);
    }
    public static void main(String[] args) {
        printWelcome("Alex");
        printWelcome("Sam");

        printStars(3);
        printStars(5);
        printStars(1);

        int result = square(4);
        System.out.println(result);

        System.out.println(square(5));

        int total = square(3) + 10;
        System.out.println(total);

        System.out.println("test your method: " + max(-4,-1));

        printRightAngleTriangle(6);

        int value = 5;
        System.out.println("Before call: " + value);
        changeNumber(value);
        System.out.println("After call: " + value);
    }
}

/*
Part 1: Why Use Methods?
Discuss: In the last lab we printed alot of stuff, we could have put all those
recurring prints within a method.

Part 2: Define and Call a Method
Your Turn:
1. I predict that the line Welcome to CS 150L! will output first in the terminal
and then the second line Today we are learning methods.

Part 3: Pass Information into a Method.
Your Turn: Code DONE above.

Part 4: Predict the three output lines.
1.) 16
2.) 25
3.) 19
Your Turn: Find the Larger Number (in max function above.)
Check your understanding: printStars does not need to return a value,
since print would inherently print to the console without expection,
and their is no other data we require from that subroutine.

Part 5: Combine Methods with Loops
The loop within the printRightTriangleMethod has the loop handles.

Part 6: Does Changing a Parameter Change the Original Variable?
Output label | My Prediction
Before | 5
Inside method | 5
After call | 5

Check your understanding: The value does not change, unless
the caller assigns the value of the callee return value.

Part 7: Check, Commit, and Submit.


*/
