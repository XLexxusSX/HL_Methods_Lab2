package com.AlexeyPopov1984;

import java.util.Scanner;

public class Main {
    static void main() {
        ConsoleMenu();
    }

    private static void ConsoleMenu() {

        Scanner menuScanner = new Scanner(System.in);

        do {
            System.out.println("\nZADACHI (Laba #2): ");
            System.out.println("1. Napishite klass knopki \"Button\", ekzemplyary kotorogo budut izmeryat' kolichestvo nazhatiy...");
            System.out.println("2. Napishite klass \"Balance\" dlya opisaniya vesov s dvumya chashami...");
            System.out.println("3. Esli kvadratnoe uravnenie imeet veschestvennye korni...");
            System.out.println("4. Vychislit' summu ryada...");
            System.out.println("5. Vychislit' summu ryada...");
            System.out.println("6. Proverit' yavlyaetsya li stroka polindromom...\n");
            System.out.print("Vvedite nomer zadachi (ot 1 do 5) ili 'q' dlya vyhoda: ");

            String input = menuScanner.nextLine();

            if (input.equalsIgnoreCase("q"))
                break;
            else if (input.equals("1"))
                Button.dataEntryTask_1();
            else if (input.equals("2"))
                Balance.dataEntryTask_2();
            else
                System.out.println("\nNeverniy vvod. Poprobuyte snova");
        } while (true);
    }
}