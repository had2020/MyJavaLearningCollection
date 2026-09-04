
import java.util.Scanner;

public class PaintAWall {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    double wallHeight = scnr.nextDouble();
    double wallWidth = scnr.nextDouble();
    double paintCanCost = scnr.nextDouble();

    double wallArea = wallHeight * wallWidth;
    System.out.printf("Wall area: %.1f sq ft\n", wallArea);

    System.out.printf("Paint needed: %.3f gallons\n", (wallArea / 350.0));

    int paintCansNeeded = (int) Math.ceil(wallArea / 350.0);
    System.out.println("Cans needed: " + paintCansNeeded + " can(s)");

    double paintCost = (paintCanCost * paintCansNeeded);
    System.out.printf("Paint cost: $%.2f\n", paintCost);

    double salesTax = paintCost * 0.07;
    System.out.printf("Sales tax: $%.2f\n", salesTax);

    System.out.printf("Total cost: $%.2f\n", (salesTax + paintCost));
  }
}
