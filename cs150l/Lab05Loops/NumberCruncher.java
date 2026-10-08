/*
Author: Hadrian Lazic
Assignment: Lab 05 - Loops
*/

public class NumberCruncher {
    public static void main(String[] args) {
        int sum 0;
        int count 1;
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



*/
