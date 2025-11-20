package com.AlexeyPopov1984;

import java.util.Scanner;

class Balance {
    private static double rightWeight = 0;
    private static double leftWeight = 0;

    public static void dataEntryTask_2() {

        rightWeight = 0;
        leftWeight = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nNa kakuyu chashu dobavit' ves (vvedite 'l', 'r' ili 'q' dlya vyhoda)?: ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("l")) {
                System.out.print("\nVvedite ves L: ");
                input = scanner.nextLine();

                try {
                    double checkNum = Double.parseDouble(input);
                    leftWeight += checkNum;
                    System.out.println("\nVes chashy L = " + leftWeight);
                    System.out.println("Ves chashy R = " + rightWeight);
                    System.out.println("Resultat: " + result());
                } catch (NumberFormatException e) {
                    System.out.print("Chislo vvedeno neverno, povtorite snova.");
                }
            } else if (input.equalsIgnoreCase("r")) {
                System.out.print("\nVvedite ves R: ");
                input = scanner.nextLine();

                try {
                    double checkNum = Double.parseDouble(input);
                    rightWeight += checkNum;
                    System.out.println("\nVes chashy L = " + leftWeight);
                    System.out.println("Ves chashy R = " + rightWeight);
                    System.out.println("Resultat: " + result());
                } catch (NumberFormatException e) {
                    System.out.print("Chislo vvedeno neverno, povtorite snova.");
                }
            } else if (input.equalsIgnoreCase("q"))
                break;
            else System.out.print("Neverniy vvod. Povtorite snova.");

        } while (true);
    }

    private static double addRight(double weight) {
        rightWeight += weight;
        return rightWeight;
    }

    private double addLeft(double weight) {
        leftWeight += weight;
        return leftWeight;
    }

    private static String result() {

        String resVar = "";

        if (rightWeight == leftWeight)
            resVar = "=";
        else if (rightWeight > leftWeight)
            resVar = "R";
        else resVar = "L";

        return resVar;
    }
}