package com.company;

import javax.swing.text.StyledEditorKit;

public class Rectangle {
    public double x;
    public double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;

    }

    public double calculateArea() {
        return x * y;
    }

    void printArea() {
        System.out.println(this.calculateArea());
    }

    void printRectangleKind() {
        if (x == y) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
    }

    public boolean isTheSameRectangle(Rectangle R) {
        if (this.x == R.x && this.y == R.x) {
            return true;
        } else return false;
    }
}
