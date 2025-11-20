package com.AlexeyPopov1984;

import java.util.Scanner;

class Bell {
    private static int soundCount = 0;
    static void dataEntryTask_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nZADACHA 3:");

        do {
            System.out.print("\nVvedite kolichestvo slov \"ding\" i \"dong\" v stroke ('q' - dlya vyhoda): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q"))
                break;

            try {
                soundCount = Integer.parseInt(input);

                if (soundCount < 0) {
                    throw new NumberFormatException("");
                } else {
                    System.out.println("\nOtvet:");
                    System.out.println(sound(soundCount));
                }
            } catch (NumberFormatException e) {
                System.out.println("\nNeverniy vvod, povtorite");
            }
        } while (true);
    }

    private static String sound(int soundCount) {
        String soundString = "", soundVar = "";
        for (int i = 1; i <= soundCount; i++) {
            if (i % 2 == 1)
                soundVar = "ding ";
            else soundVar = "dong ";

            soundString += soundVar;
        }

        return soundString;
    }
}
