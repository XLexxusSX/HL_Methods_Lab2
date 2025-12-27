package com.AlexeyPopov1984.geometry2d;

import com.AlexeyPopov1984.exceptions.InvalidRadiusException;
import java.util.Scanner;

public class Circle implements Figure {
    private Scanner scannerTask_6 = new Scanner(System.in);
    private String inputRadius;
    private double radius;

    public Circle() throws InvalidRadiusException {
        do {
            System.out.print("Vvedite radius kruga ili \"q\" dlya vyhoda: ");
            inputRadius = scannerTask_6.nextLine();
            if (inputRadius.equalsIgnoreCase("q")) {
                break;
            }
            else {
                try {
                    radius = Double.parseDouble(inputRadius);
                    if (radius <= 0) {
                        throw new InvalidRadiusException();
                    }
                    System.out.print("\nPloschad' kruga: " +  (double) Math.round(area() * 1000) / 1000);
                    System.out.print("\nDlina okruzhnosti: " +  (double) Math.round(perimeter() * 1000) / 1000);
                    System.out.print("\n" + toString());
                    System.out.println();
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("\nNeverniy vvod, povtorite. ");
                }
            }
        } while (true);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Radius okruzhnosti: " + radius;
    }
}