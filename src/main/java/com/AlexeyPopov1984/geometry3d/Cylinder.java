package com.AlexeyPopov1984.geometry3d;

import com.AlexeyPopov1984.geometry2d.Figure;
import com.AlexeyPopov1984.exceptions.InvalidWidthOrLengthException;


public class Cylinder {
    private Figure osnovanie;
    private double height;

    public Cylinder(Figure base, double height) throws InvalidWidthOrLengthException {
        if (height <= 0) {
            throw new InvalidWidthOrLengthException("Vysota dolzhna byt' >= 0");
        }
        this.osnovanie = base;
        this.height = height;
    }

    public double PlosOsn() {
        return osnovanie.area() * height;
    }

    @Override
    public String toString() {
        return "Tsilindr s osnovaniem " + osnovanie.toString() + " i vysotoy " + height;
    }
}
