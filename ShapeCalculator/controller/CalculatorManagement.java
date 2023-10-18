package controller;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;
import view.CalculatorMenu;

public class CalculatorManagement {
    private CalculatorMenu view;

    public CalculatorManagement() {
        view = new CalculatorMenu();
    }

    public void runCalculator() {
        while (true) {
            int choice = view.displayMenu();

            if (choice == 1) {
                double rectWidth = view.inputDouble("Please input side width of Rectangle: ");
                double rectLength = view.inputDouble("Please input length of Rectangle: ");
                Shape rectangle = new Rectangle(rectWidth, rectLength);
                view.displayShapeInfo(rectangle);
            } else if (choice == 2) {
                double circleRadius = view.inputDouble("Please input radius of Circle: ");
                Shape circle = new Circle(circleRadius);
                view.displayShapeInfo(circle);
            } else if (choice == 3) {
                double triSideA = view.inputDouble("Please input side A of Triangle: ");
                double triSideB = view.inputDouble("Please input side B of Triangle: ");
                double triSideC = view.inputDouble("Please input side C of Triangle: ");
                Shape triangle = new Triangle(triSideA, triSideB, triSideC);
                view.displayShapeInfo(triangle);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        view.closeScanner();
    }
}
