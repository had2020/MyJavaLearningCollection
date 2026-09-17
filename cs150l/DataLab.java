public class DataLab {
  public static void main(String[] args) {
    int total = 17; // a 32bit register stores the literal value 17
    int count = 5; // another 32bit register stores the literal value 5

    double averageA = total / count;
    // /\ result of the intergar divison operation 3 is stored as 5.0

    // averageA and averageB differ, because one used interager division
    // while the other used floating point division

    double averageB = (double) total / count;
    // /\ the result of the floating point division of 17.0 / 5.0 = 3.4

    int remainder = total % count;
    // /\ result of the remainder of the intergar divison of 17 and 5 will result in
    // and store the remainder 3

    double root = Math.sqrt(total);
    // /\ will return the sqrt of 17.0 which is 4.12310562562 inside the variable
    // root

    int rounded = (int) Math.round(root);
    // /\ will return 4

    System.out.println(averageA); // 5.0
    System.out.println(averageB); // 3.4
    System.out.println(remainder); // 3
    System.out.println(root); // 4.12310562562
    System.out.println(rounded); // 4

    int abs = Math.abs(-5);
    double maxR = Math.pow(2.0, 3.0);

    System.out.println(abs); // will return 5
    System.out.println(maxR); // will return 8.0, because 2 to the power of 3 = 8

    total += 3; // will result in 20, because 17+3=20
    System.out.println(total);

    // compiler error example:
    // int failed = 3.0;
    // Runtime error example:
    // int fa = 5 / 0;
    // Logic error example:
    System.out.println((root % 5) ^ 67); // bcause XOR is a bitwise operations for non-floating point

  }
}
