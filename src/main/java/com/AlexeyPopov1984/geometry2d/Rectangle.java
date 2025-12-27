package com.AlexeyPopov1984.geometry2d;

import java.util.Scanner;

public class Rectangle implements Figure {
    private Scanner scannerTask_6 = new Scanner(System.in);
    private double shirina;
    private double dlina;
    private String inputDlina;
    private String inputShirina;

    public Rectangle() {
        do {
            System.out.print("Vvedite shirinu pryamougol'nika ili \"q\" dlya vyhoda: ");
            inputShirina = scannerTask_6.nextLine();
            if (inputShirina.equalsIgnoreCase("q")) {
                break;
            }
            else {
                try {
                    shirina = Double.parseDouble(inputShirina);
//                    if (shirina <= 0 || dlina <= 0) {
//                        throw new InvalidWidthOrLengthException();
//                    }
                    System.out.print("\nPloschad' pryamougol'nika: " +  (double) Math.round(area() * 1000) / 1000);
                    System.out.print("\nDlina perimetra: " +  (double) Math.round(perimeter() * 1000) / 1000);
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
        return shirina * dlina;
    }

    @Override
    public double perimeter() {
        return 2 * (shirina + dlina);
    }

    @Override
    public String toString() {
        return "Shirina pryamougol'nika: " + shirina + "\nDlina pryamougol'nika: " + dlina;
    }
}