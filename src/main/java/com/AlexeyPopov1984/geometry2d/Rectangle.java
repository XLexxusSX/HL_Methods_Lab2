package com.AlexeyPopov1984.geometry2d;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Shirina i vysota dolzhny byt' > 0!");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Shirina pryamougol'nika: " + width + "\nVysota pryamougol'nika: " + height;
    }
}