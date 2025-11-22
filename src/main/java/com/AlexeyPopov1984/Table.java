package com.AlexeyPopov1984;

import java.util.Scanner;

public class Table {
    private final Scanner scanner = new Scanner(System.in);
    private int inputIcount = 0;
    private int inputJcount = 0;
    private String input = "";
    private int[][] arrTable;
    private boolean onceTask5 = true;

    Table() {
    }

    Table(int rows, int cols) {
        inputIcount = rows;
        inputJcount = cols;
        arrTable = new int[inputIcount][inputJcount];
        onceTask5 = true;
    }

    void dataEntryTask_5() {


        System.out.println("\nTablitsa (rows = " + inputIcount + ", cols = " + inputJcount + "):");

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
                else if (input.equals("1")) {

                    System.out.println("METOD: \"table.getValue(row, col)\"");
                    System.out.println();

                    for (int i = 0; i < inputIcount; i++) {
                        for (int j = 0; j < inputJcount; j++) {

                            if (onceTask5) {
                                arrTable[i][j] = 0;
                                onceTask5 = false;
                            }
                            System.out.print(arrTable[i][j] + "\t\t\t");
                        }
                        System.out.println();
                    }

                    int rowChoice = choiceRow(), colChoice = choiceCol();
                    System.out.println("\nZnachenie v yacheyke: Table[" + rowChoice + "][" + colChoice + "] = " + getValue(rowChoice, colChoice));

                } else if (input.equals("2")) {

                    System.out.println("METOD: \"table.setValue(row, col, value)\"");
                    int rowChoice = choiceRow(), colChoice = choiceCol(), value = 0;

                    if (onceTask5) {
                        for (int i = 0; i < inputIcount; i++) {
                            for (int j = 0; j < inputJcount; j++) {
                                arrTable[i][j] = 0;
                            }
                        }
                        onceTask5 = false;
                    }

                    do {
                        System.out.print("\nVvedite tseloe chislo (ot -999 do 999): ");

                        input = scanner.nextLine();

                        System.out.println();

                        try {
                            value = Integer.parseInt(input);

                            if (value >= -999 && value <= 999)
                                break;
                            else {
                                System.out.println("Neverniy vvod (diapazon: ot -999 do 999)");
                            }

                        } catch (NumberFormatException e) {
                            System.out.println("Neverniy vvod (diapazon: ot -999 do 999)");
                        }
                    } while (true);

                    setValue(rowChoice, colChoice, value);
                } else if (input.equals("3")) {
                    System.out.println("METOD: \"table.rows()\"");
                    System.out.println("\nNasha tablitsa: ");
                    for (int i = 0; i < inputIcount; i++) {
                        for (int j = 0; j < inputJcount; j++) {
                            System.out.print(arrTable[i][j] + "\t\t\t");
                        }
                        System.out.println();
                    }
                    System.out.println("\nChislo strok v tekuschey tablitse: " + rows());

                } else if (input.equals("4")) {
                    System.out.println("METOD: \"table.cols()\"");
                    System.out.println("\nNasha tablitsa: ");
                    for (int i = 0; i < inputIcount; i++) {
                        for (int j = 0; j < inputJcount; j++) {
                            System.out.print(arrTable[i][j] + "\t\t\t");
                        }
                        System.out.println();
                    }
                    System.out.println("\nChislo stolbtsov v tekuschey tablitse: " + cols());

                } else if (input.equals("5")) {
                    System.out.println("METOD: \"table.toString()\"");
                    System.out.println("\nTekuschaya tablitsa v vide stroki: ");
                    System.out.println("\n" + toString());
                }
                else if (input.equals("6")) {
                    System.out.println("METOD: \"table.average()\"");
                    System.out.println("\nNasha tablitsa: ");
                    for (int i = 0; i < inputIcount; i++) {
                        for (int j = 0; j < inputJcount; j++) {
                            System.out.print(arrTable[i][j] + "\t\t\t");
                        }
                        System.out.println();
                    }
                    System.out.println("\nSrednee arifmeticheskoe vseh elementov tablitsy: " + average());
                }
                else
                    System.out.println("\n\nNeverniy vvod. Poprobuyte snova");
            } while (true);
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
        int choiceRow = 0;
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
        int choiceCol = 0;
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

    private int getValue(int row, int col) {
        return arrTable[row][col];
    }

    private void setValue(int rowChoice, int colChoice, int value) {

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
