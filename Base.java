public class Main {
  public static void main(String[] args) {
    
    // Data types
    int signednumsonly = -10;
    double price = 9.99;
    char grade = 'A';
    boolean passed_flag = true;

    String greeting = "Hello"; // comes with java.lang
    int[] numarray = {1, 2, 4, 8, 16, 32, 64};

    int greetLength = greeting.length();

    System.out.println("len: " + (greetLength - 1));

    int okaytooeasy = add(128, 128);
    System.out.println(okaytooeasy);

    // branches
    if (okaytooeasy == 256) {
      System.out.println("I love base 2!");
    } else if (okaytooeasy == 255) {
      System.out.println("Thats the uint_8 max in C 0-255!");
    } else {
      System.out.println("Not quite.");
    }

    // for loop 
    for (int i = 0; i > numarray.length; i++) {
      System.out.println("i: " + i + " n[i]: " + numarray[i]);
    }

    // switch statements
    switch(okaytooeasy) {
      case 256: {
        System.out.println("fav num: 256");
        break;
      }
      case 128: {
        System.out.println("Thats half of what, I was expecting!");
        break;
      }
      default: {
        System.out.println("This is kinda a small switch statement to be honest.");
      }
    }

  }

  // methods 
  public static int add(int a, int b) {
    return a + b;
  }
}
