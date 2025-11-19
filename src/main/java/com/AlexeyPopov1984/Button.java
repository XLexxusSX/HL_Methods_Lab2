package com.AlexeyPopov1984;

public class Button {
    static int butPressed = 0;

    public void click() {
        butPressed++;
        System.out.print("\nKnoka nazhata " + butPressed + " raz\n");
    }
}