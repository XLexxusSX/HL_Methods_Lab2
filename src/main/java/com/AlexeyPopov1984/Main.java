package com.AlexeyPopov1984;

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
            System.out.print("Vvedite nomer zadachi (ot 1 do 5) ili 'q' dlya vyhoda: ");

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
            }
            else if (input.equals("5")) {
                //Чтобы не забыть, немного поясню (сегодня 23 ноября 2025г.): у меня 2 метода инициализируют таблицу
                //при выборе задания 5 лабораторной 2. Методы: setRows() и setCols(). Так как нет возможности создать
                //один объект класса Table с помощью одного конструктора, принимающего в качестве параметров эти 2 метода
                // этого же класса, чтобы соблюсти условия задачи (), то пришлось изощриться так, как это сделано ниже.
                // Условие задачи: "при инициализации Table(rows, cols) экземпляру передаются число строк и столбцов в таблице"
                Table tableInit = new Table();
                Table table = new Table(tableInit.setRows(), tableInit.setCols());
                table.dataEntryTask_5();
            }
            else
                System.out.println("\nNeverniy vvod. Poprobuyte snova");
        } while (true);
    }
}