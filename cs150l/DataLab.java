/*
Author: Hadrian Lazic
Assignment: Lab 03 – Numeric Expressions and Data Types
*/

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
    // System.out.println((root % 5) ^ 67); // bcause XOR is a bitwise operations
    // for non-floating point

    System.out.println("Virtual Bytecode Machine within a VirtualBytecode machine starting...");

    // stored within 4 bits
    enum Opcode {
      MOV, // 0
      ADD, // 1
      SUB, // 2
      MUL, // 3
      DIV, // 4
      MOD, // 5
      SQRTSELF, // 6
      POW, // 7
      ABS, // 8
      MAX, // 9
      MIN, // 10
      ROUND, // 11
      CASTRETURNDOUBLE, // 12
      CASTRETURNINT, // 13
      AND, // 14
      XOR, // 15
    }

    double[] registers = { 0, 0, 0, 0, 0, 0 };

    for (int i = 0; i < 64; i++) {
      int maskedOpcode = i & 0b00001111;
      int maskedArg0 = (byte) i & 0b11000000;
      int maskedArg1 = (byte) i & 0b00110000;

      System.out.println("" + registers);

      switch (maskedOpcode) {
        case 0: {
          registers[maskedArg0] = registers[maskedArg1];
          break;
        }
        case 1: {
          registers[maskedArg0] += registers[maskedArg1];
          break;
        }
        case 2: {
          registers[maskedArg0] -= registers[maskedArg1];
          break;
        }
        case 3: {
          registers[maskedArg0] *= registers[maskedArg1];
          break;
        }
        case 4: {
          registers[maskedArg0] /= registers[maskedArg1];
          break;
        }
        case 5: {
          registers[maskedArg0] %= registers[maskedArg1];
          break;
        }
        case 6: {
          registers[maskedArg0] = Math.sqrt((double) registers[maskedArg1]);
          break;
        }
        case 7: {
          registers[maskedArg0] = Math.pow((double) registers[maskedArg1], (double) registers[maskedArg1]);
          break;
        }
        case 8: {
          registers[maskedArg0] = Math.abs(registers[maskedArg1]);
          break;
        }
        case 9: {
          registers[maskedArg0] = Math.max(registers[maskedArg0], registers[maskedArg1]);
          break;
        }
        case 10: {
          registers[maskedArg0] = Math.max(registers[maskedArg0], registers[maskedArg1]);
          break;
        }
        case 11: {
          registers[maskedArg0] = Math.round(registers[maskedArg1]);
          break;
        }
        case 12: {
          System.out.println("" + (double) registers[maskedArg0]);
          break;
        }
        case 13: {
          System.out.println("" + (int) registers[maskedArg0]);
          break;
        }
        case 14: {
          registers[maskedArg0] = (int) registers[maskedArg0] & (int) registers[maskedArg1];
          break;
        }
        case 15: {
          registers[maskedArg0] = (int) registers[maskedArg0] ^ (int) registers[maskedArg1];
          break;
        }
      }
    }
  }
}
