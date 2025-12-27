package com.AlexeyPopov1984.geometry2d;

import java.util.Scanner;

import com.AlexeyPopov1984.exceptions.InvalidRadiusException;
import com.AlexeyPopov1984.exceptions.InvalidWidthOrLengthException;

public class Rectangle implements Figure {
    private Scanner scannerTask_6 = new Scanner(System.in);
    private double shirina;
    private double dlina;
    private String inputDlina;
    private String inputShirina;

    public Rectangle() throws InvalidWidthOrLengthException {
        do {
            System.out.print("Vvedite shirinu pryamougol'nika ili \"q\" dlya vyhoda: ");
            inputShirina = scannerTask_6.nextLine();
            if (inputShirina.equalsIgnoreCase("q")) {
                break;
            } else {
                try {
                    shirina = Double.parseDouble(inputShirina);
                    if (shirina <= 0) {
                        throw new InvalidWidthOrLengthException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("\nNeverniy vvod, povtorite. ");
                }
            }
        } while (true);

        do {
            System.out.print("Vvedite dlinu pryamougol'nika ili \"q\" dlya vyhoda: ");
            inputDlina = scannerTask_6.nextLine();
            if (inputDlina.equalsIgnoreCase("q")) {
                break;
            } else {
                try {
                    dlina = Double.parseDouble(inputDlina);
                    if (dlina <= 0) {
                        throw new InvalidWidthOrLengthException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("\nNeverniy vvod, povtorite. ");
                }
            }
        } while (true);
        System.out.println("\nPloschad' pryamougol'nika: " + area());
        System.out.println("Perimetr pryamougol'nika: " + perimeter());
        System.out.println(toString());
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