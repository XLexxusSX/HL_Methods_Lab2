package com.AlexeyPopov1984;

import java.util.Scanner;

public class Table {
    private Scanner scanner = new Scanner(System.in);
    private int inputIcount = 0;
    private int inputJcount = 0;
    private String input;
    private int[][] arrTable;

    Table () {

        do {
            System.out.print("Vvedite chislo strok (10 >= I > 0): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                input = "0";
                inputIcount = 0;
                inputJcount = 0;
                break;
            }

            try {
                inputIcount = Integer.parseInt(input);

                if (inputIcount > 0 && inputIcount <= 10)
                    break;
                else {
                    System.out.println("Uslovie kolichectva strok: 10 >= I > 0!");
                    inputIcount = 0;
                    continue;
                }


            } catch (NumberFormatException e) {
                System.out.println("Neverniy vvod ili slishkom bol'shoe chislo (diapazon: ot " + Integer.MIN_VALUE + " do " + Integer.MAX_VALUE + "). Prodolzhayte ('q' - zakonchit'): ");
            }
        } while (true);

        if (!input.equals("0"))
            do {
                System.out.print("Vvedite chislo stolbtsov (10 >= J > 0): ");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")) {
                    input = "0";
                    inputIcount = 0;
                    inputJcount = 0;
                    break;
                }

                try {
                    inputJcount = Integer.parseInt(input);

                    if (inputJcount > 0 && inputJcount <= 10)
                        break;
                    else {
                        System.out.println("Uslovie kolichectva stolbtsov: 10 >= J > 0!");
                        inputJcount = 0;
                        continue;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Neverniy vvod ili slishkom bol'shoe chislo (diapazon: ot " + Integer.MIN_VALUE + " do " + Integer.MAX_VALUE + "). Prodolzhayte ('q' - zakonchit'): ");
                }
            } while (true);

        arrTable = new int[inputIcount][inputJcount];
    }
    void dataEntryTask_5() {
        System.out.println("\nZADACHA 5:");
        System.out.println("\nTablitsa (rows = " + inputIcount + ", cols = " + inputJcount + "):");

        for (int i = 0; i < inputIcount; i++) {
            for (int j = 0; j < inputJcount; j++) {
                arrTable[i][j] = 0;
                System.out.print(arrTable[i][j] + "\t\t\t");
            }
            System.out.println();
        }


        do {
            System.out.println("\n1. Napishite klass knopki \"Button\", ekzemplyary kotorogo budut izmeryat' kolichestvo nazhatiy...");
            System.out.println("2. Napishite klass \"Balance\" dlya opisaniya vesov s dvumya chashami...");
            System.out.println("3. Napishite klass \"Bell\", kotoriy pri vyzove metoda \"sound\" pechataet...");
            System.out.println("4. Napishite klass \"OddEvenSeparator\", v kotoriy mozhno dobavlyat' chisla...");
            System.out.println("5. Realizuyte klass \"Table\", kotoriy hranit tselye chisla v dvumernoy tablitse...");
            System.out.println("6. Realizovat' sleduyuschie pakety...\n");
            System.out.print("Vvedite nomer zadachi (ot 1 do 5) ili 'q' dlya vyhoda: ");

            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q"))
                break;
            else if (input.equals("1"))
                ;
            else if (input.equals("2"))
               ;
            else if (input.equals("3"))
                ;
            else if (input.equals("4"))
               ;
            else if (input.equals("5"))
                ;
            else
                System.out.println("\n\nNeverniy vvod. Poprobuyte snova");
        } while (true);
    }

    @Override
    public String toString() {
        return "";
    }

    private int rows() {

        return ;
    }

    private int cols() {

        return ;
    }
}
