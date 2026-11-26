public class ArrayPractice {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i=0;i<numbers.length;i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static int findMaximum(int[] numbers) {
        int maximum = numbers[0];

        for (int i =1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }

    public static boolean containsValues(int[] numbers, int target) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == target) {
                return true;
            }
        }
        return false;
    }

    /*
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i=0; i<numbers.length -1; i++) {
            sum + sum + numbers[i];
        }
        return sum;
    }*/

    public static int countPassingScores(int[] scores) {
        int r = 0;
        for (int i = 0; i<scores.length; i++) {
            if (scores[i] >= 70) {
                r++;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] scores = {72, 85, 91, 64, 88};

        System.out.println("Number of scores: " + scores.length);
        System.out.println("First score: " + scores[0]);
        System.out.println("Last score: " + scores[scores.length - 1]);

        // Added for Part 3.1
        System.out.println("Score at index 1: " + scores[1]);
        System.out.println("Score at index 2: " + scores[2]);

        // Added for 3.4
        scores[3] = 70;
        System.out.println("Updated scores at index 3: " + scores[3]);

        // Added for Part 4.0
        System.out.println("All scores:");
        for (int i=0;i<scores.length; i++) {
            //System.out.println("Index " + i + ": " + scores[i]); changed for 4.3
            System.out.print(scores[i] + " ");
        }

        // Added for part 5.0
        int total = calculateSum(scores);
        double average = (double) total / scores.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " +  average);

        // Added for part 6.0
        int maximum = findMaximum(scores);
        System.out.println("Maximum: " + maximum);

        // Added for part 7.0
        System.out.println("Contains 85: " + containsValues(scores, 85));
        System.out.println("Contains 100: " + containsValues(scores, 100));

        // Added for part 9.0
        int passing = countPassingScores(scores);
        System.out.println("Passing scores: " + passing);

        int[] secondSet = {55, 70, 82, 49, 91};
        System.out.println("Passing scores in second set: " + countPassingScores(secondSet));



    }
}

/*
2 1. What is the first valid index of a Java array ?
3
4 Answer : 0
5
6
7 2. Why is the loop condition usually
8 i < numbers . length instead of
9 i <= numbers . length ?
10
11 Answer : Because length is one off by the last index
12
13
14 3. What did the debugger help you discover
15 in Part 8?
16
17 Answer : the debugger the count of i
18
19
20 4. What was the most challenging part
21 of this lab ?
22
23 Answer : Time management!
24
25 */

/*
Part 2: Create the Java Class

Number of scores: 5
First score: 72
Last score: 88

After testing the program works as expected.

Part 3: Access and Modify Array Elements

After adding the following lines in 1, I predict
that the output will be:
Score at index 1: 85
Score at index 2: 91

After adding the line after the modification in 5

6.)
    1. Originally the value stored at index 3, was 64
    2. After the modification it is the value 70
    3. The reason that the last element is accessed using scores[scores.length -1]
    instead of scores[scores.length] is because .length property stores
    the amount of elements and not the last index which is one less, as indexs start count at 0.

Part 4: Use a Loop to Print Every Element

1. I ran the program
2.) Every element has been printed
3.) Changed the loop to print only the values

Part 6: Find the Largest Value

Maximum begins with numbers[0] instead of zero, because
our array might have numbers less than zero as the datatype is int.

Part 7: Search for a Value.

Part 8: Debug an Array Program.

Part 9: Final Challenge

*/
