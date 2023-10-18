package view;

import java.util.Scanner;

import model.Shape;

public class CalculatorMenu {
    private Scanner scanner;

    public CalculatorMenu() {
        scanner = new Scanner(System.in);
    }

    public double inputDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public int displayMenu() {
        System.out.println("===== Calculator Shape Program =====");
        System.out.println("1. Calculate Rectangle");
        System.out.println("2. Calculate Circle");
        System.out.println("3. Calculate Triangle");
        System.out.println("4. Exit");
        System.out.print("Please select an option: ");
        return scanner.nextInt();
    }

    public void displayShapeInfo(Shape shape) {
        System.out.println("-----" + shape.getInfo() + "-----");
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }

    public void closeScanner() {
        scanner.close();
    }

}
