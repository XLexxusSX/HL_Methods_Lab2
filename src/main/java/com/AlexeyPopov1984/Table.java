package com.AlexeyPopov1984;

import java.util.Scanner;

public class Table {
    final Scanner scanner = new Scanner(System.in);
    int inputIcount = 0;
    int inputJcount = 0;
    String input = "";
    int[][] arrTable;
    boolean onceTask5 = true;

    public Table() {
    }

    Table(int rows, int cols) {
        inputIcount = rows;
        inputJcount = cols;
        arrTable = new int[inputIcount][inputJcount];
    }

    int setRows() {
        do {
            System.out.println("\nZADACHA 5:");
            System.out.print("Vvedite chislo strok (10 >= Rows > 0) ili 'q' dlya vyhoda: ");
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
                    System.out.println("Uslovie kolichectva strok: 10 >= Rows > 0!");
                    inputIcount = 0;
                }

            } catch (NumberFormatException e) {
                System.out.println("Neverniy vvod. Prodolzhayte ('q' - zakonchit'): ");
            }
        } while (true);
        return inputIcount;
    }

    int setCols() {
        if (inputIcount > 0)
            do {
                System.out.print("Vvedite chislo stolbtsov (10 >= Cols > 0) ili 'q' dlya vyhoda: ");
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
                        System.out.println("Uslovie kolichectva stolbtsov: 10 >= Cols > 0!");
                        inputJcount = 0;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Neverniy vvod. Prodolzhayte ('q' - zakonchit'): ");
                }
            } while (true);

        return inputJcount;
    }

    int choiceRow() {
        int choiceRow;
        do {
            System.out.print("\nVvedite nomer stroki (" + inputIcount + " > Row >= 0): ");

            input = scanner.nextLine();

            try {
                choiceRow = Integer.parseInt(input);

                if (choiceRow >= 0 && choiceRow < inputIcount)
                    break;
                else {
                    System.out.println("Uslovie vybora nomera stroki: " + inputIcount + " > Row >= 0!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Neverniy vvod. Prodolzhayte: ");
            }
        } while (true);
        return choiceRow;
    }

    int choiceCol() {
        int choiceCol;
        do {
            System.out.print("\nVvedite nomer stolbetsa (" + inputJcount + " > Col >= 0): ");

            input = scanner.nextLine();

            try {
                choiceCol = Integer.parseInt(input);

                if (choiceCol >= 0 && choiceCol < inputJcount)
                    break;
                else {
                    System.out.println("Uslovie vybora nomera stroki: " + inputJcount + " > Col >= 0!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Neverniy vvod. Prodolzhayte: ");
            }
        } while (true);
        return choiceCol;
    }

    int getValue(int row, int col) {
        return arrTable[row][col];
    }

    void setValue(int rowChoice, int colChoice, int value) {

        arrTable[rowChoice][colChoice] = value;

        for (int i = 0; i < inputIcount; i++) {
            for (int j = 0; j < inputJcount; j++) {
                System.out.print(arrTable[i][j] + "\t\t\t");
            }
            System.out.println();
        }
    }

    int rows() {
        return inputIcount;
    }

    int cols() {
        return inputJcount;
    }

    @Override
    public String toString() {
        StringBuilder tableString = new StringBuilder();
        for (int i = 0; i < inputIcount; i++)
            for (int j = 0; j < inputJcount; j++) {
                tableString.append(arrTable[i][j]).append("\t\t\t");
            }

        return tableString.toString();
    }

    double average() {
        double averageVar = 0d;
        for (int i = 0; i < inputIcount; i++)
            for (int j = 0; j < inputJcount; j++)
                averageVar += arrTable[i][j];

        averageVar = averageVar / (inputIcount * inputJcount);

        return Math.round(averageVar * 100) / 100.0;
    }
}