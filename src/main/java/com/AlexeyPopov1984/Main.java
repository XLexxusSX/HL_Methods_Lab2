package com.AlexeyPopov1984;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Vvedite 'B' ili 'b' dlya nazhatiya knopki (q - dlya vyhoda): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("b")) {
                Button button = new Button();
                System.out.print("\nKnoka nazhata " + button.click(button.butPressed) + " raz\n");
            }

            if (input.equalsIgnoreCase("q"))
                break;

        } while (true);
    }
}

