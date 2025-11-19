package com.AlexeyPopov1984;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Раз условие задачи говорит об экземплярАХ (мн. число), то я, Алексей Александрович Попов,
        // буду создавать каждый раз новый экземпляр класса Button и вызывать метод click();, также
        // переменная-счётчик будет static.

        do {
            System.out.print("Vvedite 'B' ili 'b' dlya nazhatiya knopki (q - dlya vyhoda): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("b")) {
                Button button = new Button();
                button.click();
            }

            if (input.equalsIgnoreCase("q"))
                break;

        } while (true);
    }
}

