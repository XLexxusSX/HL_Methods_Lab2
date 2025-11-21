package com.AlexeyPopov1984;

import java.util.Scanner;

class Button {
    static int butPressed = 0;

    static void dataEntryTask_1() {
        butPressed = 0;
        System.out.println("\nZADACHA 1:");
        Scanner scannerPressButton = new Scanner(System.in);

        do {
            System.out.print("Vvedite 'B' ili 'b' dlya nazhatiya knopki ('q' - dlya vyhoda): ");
            String input = scannerPressButton.nextLine();

            if (input.equalsIgnoreCase("b")) {
                System.out.print("\nKolichestvo nazhatiy knopki: " + click() + "\n");
            }

            if (input.equalsIgnoreCase("q"))
                break;

        } while (true);
    }

    private static int click() {
        butPressed++;
        return butPressed;
    }
}