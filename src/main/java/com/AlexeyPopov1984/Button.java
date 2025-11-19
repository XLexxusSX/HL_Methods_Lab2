package com.AlexeyPopov1984;

public class Button {
    static int butPressed;

    Button() {
        butPressed++;
    }

    public int click(int butPressed) {
        //this.butPressed += butPressed;
        return butPressed;
    }
}