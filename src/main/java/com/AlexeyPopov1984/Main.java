package com.AlexeyPopov1984;

import com.AlexeyPopov1984.geometry2d.Circle;
import com.AlexeyPopov1984.exceptions.InvalidRadiusException;
import com.AlexeyPopov1984.exceptions.InvalidWidthOrLengthException;
import com.AlexeyPopov1984.geometry2d.Rectangle;

import java.util.Scanner;

class Main {
    static void main() {
        ConsoleMenu();
    }

    private static void ConsoleMenu() {

        Scanner menuScanner = new Scanner(System.in);

        do {
            System.out.println("\nZADACHI (Laba #2): ");
            System.out.println("1. Napishite klass knopki \"Button\", ekzemplyary kotorogo budut izmeryat' kolichestvo nazhatiy...");
            System.out.println("2. Napishite klass \"Balance\" dlya opisaniya vesov s dvumya chashami...");
            System.out.println("3. Napishite klass \"Bell\", kotoriy pri vyzove metoda \"sound\" pechataet...");
            System.out.println("4. Napishite klass \"OddEvenSeparator\", v kotoriy mozhno dobavlyat' chisla...");
            System.out.println("5. Realizuyte klass \"Table\", kotoriy hranit tselye chisla v dvumernoy tablitse...");
            System.out.println("6. Realizovat' sleduyuschie pakety...\n");
            System.out.print("Vvedite nomer zadachi (ot 1 do 6) ili 'q' dlya vyhoda: ");

            String input = menuScanner.nextLine();

            if (input.equalsIgnoreCase("q"))
                break;
            else if (input.equals("1"))
                Button.dataEntryTask_1();
            else if (input.equals("2"))
                Balance.dataEntryTask_2();
            else if (input.equals("3"))
                Bell.dataEntryTask_3();
            else if (input.equals("4")) {
                OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();
                oddEvenSeparator.dataEntryTask_4();
            } else if (input.equals("5")) {
                //Чтобы не забыть, немного поясню (сегодня 23 ноября 2025г.): у меня 2 метода инициализируют таблицу
                //при выборе задания 5 лабораторной 2. Методы: setRows() и setCols(). Так как нет возможности создать
                //один объект класса Table с помощью одного конструктора, принимающего в качестве параметров эти 2 метода
                // этого же класса, чтобы соблюсти условия задачи (), то пришлось изощриться так, как это сделано ниже.
                // Условие задачи: "при инициализации Table(rows, cols) экземпляру передаются число строк и столбцов в таблице"
                // В первом варианте данной программы поля и методы класса Table имели модификатор private, т.е. была
                // реализована инкапсуляция. Это второй вариант с возможностью обращаться к полям и методам через объект
                // table (как в условии задачи 5 лабы 2) {А.А. Попов}.

                Table tableInit = new Table();
                Table table = new Table(tableInit.setRows(), tableInit.setCols());

                System.out.println("\nTablitsa (rows = " + table.inputIcount + ", cols = " + table.inputJcount + "):");

                if (table.inputIcount != 0 && table.inputJcount != 0)
                    for (int i = 0; i < table.inputIcount; i++) {
                        for (int j = 0; j < table.inputJcount; j++) {
                            table.arrTable[i][j] = 0;
                            System.out.print(table.arrTable[i][j] + "\t\t\t");
                        }
                        System.out.println();
                    }

                if (table.inputIcount != 0 && table.inputJcount != 0)
                    do {
                        System.out.println("\nMetody ob'ekta \"table\" klassa \"Table\":");
                        System.out.println("1. table.getValue(row, col)...");
                        System.out.println("2. table.setValue(row, col, value)...");
                        System.out.println("3. table.rows()...");
                        System.out.println("4. table.cols()...");
                        System.out.println("5. table.toString()...");
                        System.out.println("6. table.average()...\n");
                        System.out.print("Vvedite nomer metoda (ot 1 do 6) ili 'q' dlya vyhoda: ");

                        input = table.scanner.nextLine();

                        if (input.equalsIgnoreCase("q"))
                            break;
                        else if (input.equals("1")) {

                            System.out.println("METOD: \"table.getValue(row, col)\"");
                            System.out.println();

                            for (int i = 0; i < table.inputIcount; i++) {
                                for (int j = 0; j < table.inputJcount; j++) {

                                    if (table.onceTask5) {
                                        table.arrTable[i][j] = 0;
                                        table.onceTask5 = false;
                                    }
                                    System.out.print(table.arrTable[i][j] + "\t\t\t");
                                }
                                System.out.println();
                            }

                            int rowChoice = table.choiceRow(), colChoice = table.choiceCol();
                            System.out.println("\nZnachenie v yacheyke: Table[" + rowChoice + "][" + colChoice + "] = " + table.getValue(rowChoice, colChoice));

                        } else if (input.equals("2")) {

                            System.out.println("METOD: \"table.setValue(row, col, value)\"");
                            int rowChoice = table.choiceRow(), colChoice = table.choiceCol(), value;

                            if (table.onceTask5) {
                                for (int i = 0; i < table.inputIcount; i++) {
                                    for (int j = 0; j < table.inputJcount; j++) {
                                        table.arrTable[i][j] = 0;
                                    }
                                }
                                table.onceTask5 = false;
                            }

                            do {
                                System.out.print("\nVvedite tseloe chislo (ot -999 do 999): ");

                                input = table.scanner.nextLine();

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

                            table.setValue(rowChoice, colChoice, value);
                        } else if (input.equals("3")) {
                            System.out.println("METOD: \"table.rows()\"");
                            System.out.println("\nNasha tablitsa: ");
                            for (int i = 0; i < table.inputIcount; i++) {
                                for (int j = 0; j < table.inputJcount; j++) {
                                    System.out.print(table.arrTable[i][j] + "\t\t\t");
                                }
                                System.out.println();
                            }
                            System.out.println("\nChislo strok v tekuschey tablitse: " + table.rows());

                        } else if (input.equals("4")) {
                            System.out.println("METOD: \"table.cols()\"");
                            System.out.println("\nNasha tablitsa: ");
                            for (int i = 0; i < table.inputIcount; i++) {
                                for (int j = 0; j < table.inputJcount; j++) {
                                    System.out.print(table.arrTable[i][j] + "\t\t\t");
                                }
                                System.out.println();
                            }
                            System.out.println("\nChislo stolbtsov v tekuschey tablitse: " + table.cols());

                        } else if (input.equals("5")) {
                            System.out.println("METOD: \"table.toString()\"");
                            System.out.println("\nTekuschaya tablitsa v vide stroki: ");
                            System.out.println("\n" + table.toString());
                        } else if (input.equals("6")) {
                            System.out.println("METOD: \"table.average()\"");
                            System.out.println("\nNasha tablitsa: ");
                            for (int i = 0; i < table.inputIcount; i++) {
                                for (int j = 0; j < table.inputJcount; j++) {
                                    System.out.print(table.arrTable[i][j] + "\t\t\t");
                                }
                                System.out.println();
                            }
                            System.out.println("\nSrednee arifmeticheskoe vseh elementov tablitsy: " + table.average());
                        } else
                            System.out.println("\n\nNeverniy vvod. Poprobuyte snova");
                    } while (true);
            } else if (input.equals("6")) {
                Scanner scannerTask_6 = new Scanner(System.in);
                String inputDlinPryam, inputShirPryam, inputOsnTsil, inputHeightTsil;
                do {
                    System.out.println("\nVYCHISLENIE PARAMETROV FIGURY");
                    System.out.println("1. Ploschad' kruga");
                    System.out.println("2. Ploschad' pryamougol'nika");
                    System.out.println("3. Ob'em tsilindra");

                    System.out.print("\nVvedite nomer ot 1 do 3 ili 'q' dlya vyhoda: ");

                    input = scannerTask_6.nextLine();

                    if (input.equalsIgnoreCase("q"))
                        break;

                    else if (input.equals("1")) {

                        try {
                            Circle circle = new Circle();
                        } catch (InvalidRadiusException e) {
                            System.out.println(e.getMessage());
                        }

                    } else if (input.equals("2")) {

                        try {
                            Rectangle rectangle = new Rectangle();
                        } catch (InvalidWidthOrLengthException e) {
                            System.out.println(e.getMessage());
                        }

                    } else if (input.equals("3")) {

                        System.out.println("VVOD OSNOVANIYA I VYSOTY TSILINDRA");
                        System.out.println();
                        inputHeightTsil = scannerTask_6.nextLine();
                        inputOsnTsil = scannerTask_6.nextLine();

                    } else
                        System.out.println("\n\nNeverniy vvod. Poprobuyte snova");
                } while (true);
            } else
                System.out.println("\nNeverniy vvod. Poprobuyte snova");
        } while (true);
    }
}