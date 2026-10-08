/*
Author: Hadrian Lazic
Assignment: Lab 05 - Loops
*/

public class NumberCruncher {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 5) {
            sum = sum + count;
            count = count + 1;
        }
        System.out.println("Sum 1 to 5: " + sum);

        int product = 1;
        for (int i = 1; i <= 4; i++) {
            product = product * i;
        }
        System.out.println("4 factorial: " + product);

        // from mission 3: Extend the Requirement
        int acc = 0;
        for (int i = 1; i <= 20; i++) {
            if ((i % 2) == 0) {
                acc++;
            }
        }
        System.out.println("Mission 3: " + acc);
    }
}

/*
Mission 2: Trace Before- Running

Pass | count | sum | condition checked next |
start| 1     | 0   |     1 <=5 T
1    | 2     |  3  |     2 <= 5 T
2    | 3    | 6     |    3 <= 5 T
3    | 4    | 10    |    4 <= 5 T
4    | 5    | 15    |    5 <= 5 T
5    | 6    | 21    |    6 <= 5 F

Mission 3: Extend the Requirement

1.) this task is fit for a 'for' loop since we know the range
of the iterations ahead of time.

2.) Implemented in the code above after the original code.

3.) Hand-calculated 10, actual 10

*/
