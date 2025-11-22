package com.AlexeyPopov1984;

import java.util.Scanner;

public class Table {
    private final Scanner scanner = new Scanner(System.in);
    private int inputIcount = 0;
    private int inputJcount = 0;
    private String input = "";
    private int[][] arrTable;

    Table() {

    }

    Table(int rows, int cols) {
        inputIcount = rows;
        inputJcount = cols;
        arrTable = new int[inputIcount][inputJcount];
    }

    void dataEntryTask_5() {

        System.out.println("\nZADACHA 5:");
        System.out.println("Tablitsa (rows = " + inputIcount + ", cols = " + inputJcount + "):");

        if (inputIcount != 0 && inputJcount != 0)
            for (int i = 0; i < inputIcount; i++) {
                for (int j = 0; j < inputJcount; j++) {
                    arrTable[i][j] = 0;
                    System.out.print(arrTable[i][j] + "\t\t\t");
                }
                System.out.println();
            }

        if (inputIcount != 0 && inputJcount != 0)
            do {
                System.out.println("\nMetody ob'ekta \"table\" klassa \"Table\":");
                System.out.println("1. table.getValue(row, col)...");
                System.out.println("2. table.setValue(row, col, value)...");
                System.out.println("3. table.rows()...");
                System.out.println("4. table.cols()...");
                System.out.println("5. table.toString()...");
                System.out.println("6. table.average()...\n");
                System.out.print("Vvedite nomer metoda (ot 1 do 6) ili 'q' dlya vyhoda: ");

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
                else if (input.equals("6"))
                    ;
                else
                    System.out.println("\n\nNeverniy vvod. Poprobuyte snova");
            } while (true);
    }

    @Override
    public String toString() {
        return "";
    }

    int rows() {
        do {
            System.out.print("Vvedite chislo strok (10 >= I > 0) ili 'q' dlya vyhoda: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
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
                    //continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("Neverniy vvod ili slishkom bol'shoe chislo (diapazon: ot " + Integer.MIN_VALUE + " do " + Integer.MAX_VALUE + "). Prodolzhayte ('q' - zakonchit'): ");
            }
        } while (true);
        return inputIcount;
    }

    int cols() {
        if (inputIcount > 0)
            do {

                System.out.print("Vvedite chislo stolbtsov (10 >= J > 0) ili 'q' dlya vyhoda: ");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")) {
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
                        //continue;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Neverniy vvod ili slishkom bol'shoe chislo (diapazon: ot " + Integer.MIN_VALUE + " do " + Integer.MAX_VALUE + "). Prodolzhayte ('q' - zakonchit'): ");
                }
            } while (true);

        return inputJcount;
    }
}
