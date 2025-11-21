package com.AlexeyPopov1984;

import java.util.Scanner;

class OddEvenSeparator {
    protected String evens = "";
    protected String odds = "";

    void dataEntryTask_4() {
        System.out.println("\nZADACHA 4:");
        addNumber();
    }

    protected void addNumber() {
        String inputNum = "";
        String inputAnswer;
        StringBuilder strOfInts = new StringBuilder();
        boolean badEnter = false;
        long num = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvodite tselye chisla, posle kazhdogo nazhimaya \"Enter\" ('q' - zakonchit'): ");

            do {
                if (!badEnter)
                    inputNum = scanner.nextLine();

                if (inputNum.equalsIgnoreCase("q")) {

                    if (!badEnter) {
                        System.out.println("\nVvedennye chisla: " + strOfInts);
                        System.out.println("\nChetnye: " + evens);
                        System.out.println("\nNechetnye: " + odds);
                        System.out.print("\nDobavit' chisla ('y' ili 'n' )?  ");
                    }
                    inputAnswer = scanner.nextLine();

                    if (inputAnswer.equalsIgnoreCase("y")) {
                        System.out.println("\nProdolzhaem ryad ('q' - zakonchit'):");
                        badEnter = false;
                        continue;
                    }
                    else if (inputAnswer.equalsIgnoreCase("n")) {
                        badEnter = false;
                        break;
                    }
                    else if (!inputAnswer.equalsIgnoreCase("n") && !inputAnswer.equalsIgnoreCase("y")){
                        System.out.print("\nNeverniy vvod. Dobavit' chisla ('y' ili 'n' )? ");
                        badEnter = true;
                        continue;
                    }
                    break;
                }

                try {
                    num = Long.parseLong(inputNum);
                    strOfInts.append(num).append(" ");
                    evens = evens.concat(Even(num).toString());
                    odds = odds.concat(Odd(num).toString());
                } catch (NumberFormatException e) {
                    System.out.println("Neverniy vvod ili slishkom bol'shoe chislo (diapazon: ot " + Long.MIN_VALUE + " do " + Long.MAX_VALUE + "). Prodolzhayte ('q' - zakonchit'): ");
                }

            } while (true);
    }

    protected StringBuilder Even (Long num) {
        StringBuilder evenNums = new StringBuilder();

        if (num % 2 == 0)
            evenNums.append(num).append(" ");

        return evenNums;
    }

    protected StringBuilder Odd (Long num) {
        StringBuilder oddNums = new StringBuilder();

        if (num % 2 == 1 || num % 2 == -1)
            oddNums.append(num).append(" ");

        return oddNums;
    }

}
