package EX_02;
import java.util.*;

public class Triangle {

    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1:");
        side1 = sc.nextDouble();
        System.out.println("Enter side 2:");
        side2 = sc.nextDouble();
        System.out.println("Enter side 3:");
        side3 = sc.nextDouble();
    }


    public void display() {
        System.out.println("Sides of the triangle: " + side1 + " , " + side2 + " , " + side3);
    }


    public boolean isValid() {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }


    public double calcPeri() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {

        Triangle[] arr = new Triangle[2];
        double side1 = 0.0;
        double side2 = 0.0;
        double side3 = 0.0;


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("For Triangle " + (i + 1) + ":");
            arr[i] = new Triangle(side1,side2,side3); 
            arr[i].accept(); 
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nTriangle " + (i + 1) + ":");
            if (arr[i].isValid()) {
                System.out.println("Valid Triangle");
                arr[i].display();
                System.out.println("Perimeter: " + arr[i].calcPeri());
            } else {
                System.out.println("Invalid Triangle");
            }
        }

        sc.close();
    }
}
