package model;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public
    double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public
    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public
    String getInfo() {
        return "Triangle - Side A: " + sideA + ", Side B: " + sideB + ", Side C: " + sideC;
    }
}
