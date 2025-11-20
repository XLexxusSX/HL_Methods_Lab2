package com.AlexeyPopov1984;

import java.util.Scanner;

class Balance {
    private static double rightWeight = 0;
    private static double leftWeight = 0;
    private static boolean tag = true;

    public static void dataEntryTask_2() {

        rightWeight = 0;
        leftWeight = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            if (tag) {
                System.out.println("\nVes chashy L = " + leftWeight);
                System.out.println("Ves chashy R = " + rightWeight);
                tag = false;
            }
            System.out.print("\nNa kakuyu chashu dobavit'/ubrat' ves (vvedite 'l', 'r' ili 'q' dlya vyhoda)?: ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("l")) {
                System.out.print("\nDobavit'/ubrat' ves na L: ");
                input = scanner.nextLine();

                do {
                    try {
                        double checkNum = Double.parseDouble(input);
                        if (leftWeight + checkNum >= 0) {
                            System.out.println("\nVes chashy L = " + addLeft(checkNum));
                            System.out.println("Ves chashy R = " + rightWeight);
                            System.out.println("Resultat: " + result());
                            break;
                        } else input = "Error. Weight < 0";
                    } catch (NumberFormatException e) {
                        System.out.print("\nNevernoe chislo ili ves stal < 0, povtorite vvod L: ");
                        input = scanner.nextLine();
                    }
                } while (true);
            } else if (input.equalsIgnoreCase("r")) {
                System.out.print("\nDobavit'/ubrat' ves na R: ");
                input = scanner.nextLine();

                do {
                    try {
                        double checkNum = Double.parseDouble(input);
                        if (rightWeight + checkNum >= 0) {
                            System.out.println("\nVes chashy L = " + leftWeight);
                            System.out.println("Ves chashy R = " + addRight(checkNum));
                            System.out.println("Resultat: " + result());
                            break;
                        } else input = "Error. Weight < 0";
                    } catch (NumberFormatException e) {
                        System.out.print("\nNevernoe chislo ili ves stal < 0, povtorite vvod R: ");
                        input = scanner.nextLine();
                    }
                } while (true);
            } else if (input.equalsIgnoreCase("q"))
                break;
            else System.out.print("Neverniy vvod. Povtorite snova.\n");

        } while (true);
    }

    private static double addRight(double weight) {
        rightWeight += weight;
        return rightWeight;
    }

    private static double addLeft(double weight) {
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